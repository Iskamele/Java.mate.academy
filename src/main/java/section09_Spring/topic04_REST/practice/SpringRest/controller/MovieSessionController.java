package section09_Spring.topic04_REST.practice.SpringRest.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import section09_Spring.topic04_REST.practice.SpringRest.dto.request.RequestMovieSession;
import section09_Spring.topic04_REST.practice.SpringRest.dto.response.ResponseMovieSession;
import section09_Spring.topic04_REST.practice.SpringRest.model.MovieSession;
import section09_Spring.topic04_REST.practice.SpringRest.service.MovieSessionService;
import section09_Spring.topic04_REST.practice.SpringRest.service.mapper.MovieSessionMapper;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-sessions")
public class MovieSessionController {
    private final MovieSessionService movieSessionService;
    private final MovieSessionMapper movieSessionMapper;

    public MovieSessionController(MovieSessionService movieService,
                                  MovieSessionMapper movieMapper) {
        this.movieSessionService = movieService;
        this.movieSessionMapper = movieMapper;
    }

    @PostMapping
    public ResponseMovieSession create(
            @RequestBody RequestMovieSession movieSessionDto) {
        return movieSessionMapper.toDto(
                movieSessionService.add(movieSessionMapper.toModel(movieSessionDto)));
    }

    @GetMapping("/available")
    public List<ResponseMovieSession> findAvailable(
            @RequestParam Long movieId,
            @RequestParam @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate date) {
        return movieSessionService.findAvailableSessions(movieId, date)
                .stream()
                .map(movieSessionMapper::toDto)
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public ResponseMovieSession update(
            @PathVariable Long id,
            @RequestBody RequestMovieSession requestDto) {
        MovieSession movieSession = movieSessionMapper.toModel(requestDto);
        movieSession.setId(id);
        MovieSession updatedMovieSession = movieSessionService.update(movieSession);
        return movieSessionMapper.toDto(updatedMovieSession);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        movieSessionService.delete(id);
    }
}
