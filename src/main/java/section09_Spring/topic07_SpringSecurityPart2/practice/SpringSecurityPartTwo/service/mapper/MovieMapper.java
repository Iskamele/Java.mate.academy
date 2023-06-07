package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.mapper;

import org.springframework.stereotype.Component;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.request.MovieRequestDto;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.response.MovieResponseDto;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Movie;

@Component
public class MovieMapper implements RequestDtoMapper<MovieRequestDto, Movie>,
        ResponseDtoMapper<MovieResponseDto, Movie> {
    @Override
    public Movie mapToModel(MovieRequestDto dto) {
        Movie movie = new Movie();
        movie.setTitle(dto.getTitle());
        movie.setDescription(dto.getDescription());
        return movie;
    }

    @Override
    public MovieResponseDto mapToDto(Movie movie) {
        MovieResponseDto responseDto = new MovieResponseDto();
        responseDto.setId(movie.getId());
        responseDto.setTitle(movie.getTitle());
        responseDto.setDescription(movie.getDescription());
        return responseDto;
    }
}
