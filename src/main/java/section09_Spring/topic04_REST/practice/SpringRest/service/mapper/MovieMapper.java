package section09_Spring.topic04_REST.practice.SpringRest.service.mapper;

import section09_Spring.topic04_REST.practice.SpringRest.dto.request.RequestMovie;
import section09_Spring.topic04_REST.practice.SpringRest.dto.response.ResponseMovie;
import section09_Spring.topic04_REST.practice.SpringRest.model.Movie;
import section09_Spring.topic04_REST.practice.SpringRest.service.Mapper;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper implements Mapper
        <Movie, ResponseMovie, RequestMovie> {

    @Override
    public ResponseMovie toDto(Movie movie) {
        ResponseMovie responseMovieDto = new ResponseMovie();
        responseMovieDto.setId(movie.getId());
        responseMovieDto.setDescription(movie.getDescription());
        responseMovieDto.setTitle(movie.getTitle());
        return responseMovieDto;
    }

    @Override
    public Movie toModel(RequestMovie requestDto) {
        Movie movie = new Movie();
        movie.setDescription(requestDto.getDescription());
        movie.setTitle(requestDto.getTitle());
        return movie;
    }
}
