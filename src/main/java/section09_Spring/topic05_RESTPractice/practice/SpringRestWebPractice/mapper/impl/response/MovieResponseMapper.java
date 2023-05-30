package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.impl.response;

import org.springframework.stereotype.Component;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.DtoResponseMapper;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Movie;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.dto.response.MovieResponseDto;

@Component
public class MovieResponseMapper implements DtoResponseMapper<MovieResponseDto, Movie> {
    @Override
    public MovieResponseDto toDto(Movie movie) {
        MovieResponseDto movieResponseDto = new MovieResponseDto();
        movieResponseDto.setId(movie.getId());
        movieResponseDto.setTitle(movie.getTitle());
        movieResponseDto.setDescription(movie.getDescription());
        return movieResponseDto;
    }
}
