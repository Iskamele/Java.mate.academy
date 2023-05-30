package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.impl.request;

import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.DtoRequestMapper;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.CinemaHall;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.dto.request.CinemaHallRequestDto;
import org.springframework.stereotype.Component;

@Component
public class CinemaHallRequestMapper implements DtoRequestMapper<CinemaHallRequestDto, CinemaHall> {
    @Override
    public CinemaHall fromDto(CinemaHallRequestDto dto) {
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.setCapacity(dto.getCapacity());
        cinemaHall.setDescription(dto.getDescription());
        return cinemaHall;
    }
}
