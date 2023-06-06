package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper;

import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.request.MovieRequestDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.response.MovieResponseDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.Movie;
import org.springframework.stereotype.Component;

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
        responseDto.setMovieId(movie.getId());
        responseDto.setMovieTitle(movie.getTitle());
        responseDto.setMovieDescription(movie.getDescription());
        return responseDto;
    }
}
