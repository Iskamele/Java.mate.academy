package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.impl.request;

import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.DtoRequestMapper;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Movie;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.dto.request.MovieRequestDto;
import org.springframework.stereotype.Component;

@Component
public class MovieRequestMapper implements DtoRequestMapper<MovieRequestDto, Movie> {
    @Override
    public Movie fromDto(MovieRequestDto dto) {
        Movie movie = new Movie();
        movie.setTitle(dto.getTitle());
        movie.setDescription(dto.getDescription());
        return movie;
    }
}
