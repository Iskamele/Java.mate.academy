package section09_Spring.topic04_REST.practice.SpringRest.service.mapper;

import section09_Spring.topic04_REST.practice.SpringRest.dto.request.RequestMovieSession;
import section09_Spring.topic04_REST.practice.SpringRest.dto.response.ResponseMovieSession;
import section09_Spring.topic04_REST.practice.SpringRest.model.CinemaHall;
import section09_Spring.topic04_REST.practice.SpringRest.model.Movie;
import section09_Spring.topic04_REST.practice.SpringRest.model.MovieSession;
import section09_Spring.topic04_REST.practice.SpringRest.service.Mapper;
import org.springframework.stereotype.Component;

@Component
public class MovieSessionMapper implements Mapper
        <MovieSession, ResponseMovieSession, RequestMovieSession> {

    @Override
    public ResponseMovieSession toDto(MovieSession movieSession) {
        ResponseMovieSession responseMovieSessionDto = new ResponseMovieSession();
        responseMovieSessionDto.setId(movieSession.getId());
        responseMovieSessionDto.setShowTime(movieSession.getShowTime());
        responseMovieSessionDto.setMovieId(movieSession.getMovie().getId());
        responseMovieSessionDto.setCinemaHallId(movieSession.getCinemaHall().getId());
        return responseMovieSessionDto;
    }

    @Override
    public MovieSession toModel(RequestMovieSession requestDto) {
        MovieSession movieSession = new MovieSession();
        movieSession.setShowTime(requestDto.getShowTime());
        movieSession.setMovie(new Movie(requestDto.getMovieId()));
        movieSession.setCinemaHall(new CinemaHall(requestDto.getCinemaHallId()));
        return movieSession;
    }
}
