package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.impl.request;

import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.DtoRequestMapper;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.CinemaHall;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Movie;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.MovieSession;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.dto.request.MovieSessionRequestDto;
import org.springframework.stereotype.Component;

@Component
public class MovieSessionRequestMapper implements DtoRequestMapper<MovieSessionRequestDto,
                                                                   MovieSession> {
    @Override
    public MovieSession fromDto(MovieSessionRequestDto dto) {
        MovieSession movieSession = new MovieSession();
        Movie movie = new Movie();
        movie.setId(dto.getMovieId());
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.setId(dto.getCinemaHallId());
        movieSession.setMovie(movie);
        movieSession.setShowTime(dto.getShowTime());
        movieSession.setCinemaHall(cinemaHall);
        return movieSession;
    }
}
