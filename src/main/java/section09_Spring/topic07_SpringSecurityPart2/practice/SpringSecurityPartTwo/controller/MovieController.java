package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.request.MovieRequestDto;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.response.MovieResponseDto;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Movie;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.MovieService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.mapper.RequestDtoMapper;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.mapper.ResponseDtoMapper;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;
    private final RequestDtoMapper<MovieRequestDto, Movie> movieRequestDtoMapper;
    private final ResponseDtoMapper<MovieResponseDto, Movie> movieResponseDtoMapper;

    public MovieController(MovieService movieService,
                           RequestDtoMapper<MovieRequestDto, Movie> movieRequestDtoMapper,
                           ResponseDtoMapper<MovieResponseDto, Movie> movieResponseDtoMapper) {
        this.movieService = movieService;
        this.movieRequestDtoMapper = movieRequestDtoMapper;
        this.movieResponseDtoMapper = movieResponseDtoMapper;
    }

    @PostMapping
    public MovieResponseDto add(@RequestBody @Valid MovieRequestDto requestDto) {
        Movie movie = movieService.add(movieRequestDtoMapper.mapToModel(requestDto));
        return movieResponseDtoMapper.mapToDto(movie);
    }

    @GetMapping
    public List<MovieResponseDto> getAll() {
        return movieService.getAll()
                .stream()
                .map(movieResponseDtoMapper::mapToDto)
                .toList();
    }
}
