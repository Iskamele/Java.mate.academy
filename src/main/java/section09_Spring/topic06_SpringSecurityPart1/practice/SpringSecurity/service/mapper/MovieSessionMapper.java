package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper;

import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.request.MovieSessionRequestDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.response.MovieSessionResponseDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.MovieSession;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.CinemaHallService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.MovieService;
import org.springframework.stereotype.Component;

@Component
public class MovieSessionMapper implements RequestDtoMapper<MovieSessionRequestDto, MovieSession>,
        ResponseDtoMapper<MovieSessionResponseDto, MovieSession> {
    private final CinemaHallService cinemaHallService;
    private final MovieService movieService;

    public MovieSessionMapper(CinemaHallService cinemaHallService, MovieService movieService) {
        this.cinemaHallService = cinemaHallService;
        this.movieService = movieService;
    }

    @Override
    public MovieSession mapToModel(MovieSessionRequestDto dto) {
        MovieSession movieSession = new MovieSession();
        movieSession.setMovie(movieService.get(dto.getMovieId()));
        movieSession.setCinemaHall(cinemaHallService.get(dto.getCinemaHallId()));
        movieSession.setShowTime(dto.getShowTime());
        return movieSession;
    }

    @Override
    public MovieSessionResponseDto mapToDto(MovieSession movieSession) {
        MovieSessionResponseDto responseDto = new MovieSessionResponseDto();
        responseDto.setMovieSessionId(movieSession.getId());
        responseDto.setCinemaHallId(movieSession.getCinemaHall().getId());
        responseDto.setMovieId(movieSession.getMovie().getId());
        responseDto.setMovieTitle(movieSession.getMovie().getTitle());
        responseDto.setShowTime(movieSession.getShowTime());
        return responseDto;
    }
}
