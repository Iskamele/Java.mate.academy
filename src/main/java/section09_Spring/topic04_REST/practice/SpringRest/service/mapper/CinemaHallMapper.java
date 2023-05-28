package section09_Spring.topic04_REST.practice.SpringRest.service.mapper;

import section09_Spring.topic04_REST.practice.SpringRest.dto.request.RequestCinemaHall;
import section09_Spring.topic04_REST.practice.SpringRest.dto.response.ResponseCinemaHall;
import section09_Spring.topic04_REST.practice.SpringRest.model.CinemaHall;
import section09_Spring.topic04_REST.practice.SpringRest.service.Mapper;
import org.springframework.stereotype.Component;

@Component
public class CinemaHallMapper implements
        Mapper<CinemaHall, ResponseCinemaHall, RequestCinemaHall> {

    @Override
    public ResponseCinemaHall toDto(CinemaHall cinemaHall) {
        ResponseCinemaHall responseCinemaHallDto = new ResponseCinemaHall();
        responseCinemaHallDto.setId(cinemaHall.getId());
        responseCinemaHallDto.setDescription(cinemaHall.getDescription());
        responseCinemaHallDto.setCapacity(cinemaHall.getCapacity());
        return responseCinemaHallDto;
    }

    @Override
    public CinemaHall toModel(RequestCinemaHall requestDto) {
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.setCapacity(requestDto.getCapacity());
        cinemaHall.setDescription(requestDto.getDescription());
        return cinemaHall;
    }
}
