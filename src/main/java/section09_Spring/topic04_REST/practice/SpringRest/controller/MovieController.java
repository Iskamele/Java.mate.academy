package section09_Spring.topic04_REST.practice.SpringRest.controller;

import java.util.List;
import java.util.stream.Collectors;
import section09_Spring.topic04_REST.practice.SpringRest.dto.request.RequestMovie;
import section09_Spring.topic04_REST.practice.SpringRest.dto.response.ResponseMovie;
import section09_Spring.topic04_REST.practice.SpringRest.service.MovieService;
import section09_Spring.topic04_REST.practice.SpringRest.service.mapper.MovieMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;
    private final MovieMapper movieMapper;

    public MovieController(MovieService movieService, MovieMapper movieMapper) {
        this.movieService = movieService;
        this.movieMapper = movieMapper;
    }

    @PostMapping
    public ResponseMovie create(@RequestBody RequestMovie movieDto) {
        return movieMapper.toDto(movieService.add(movieMapper.toModel(movieDto)));
    }

    @GetMapping
    public List<ResponseMovie> getAll() {
        return movieService.getAll()
                .stream()
                .map(movieMapper::toDto)
                .collect(Collectors.toList());
    }
}
