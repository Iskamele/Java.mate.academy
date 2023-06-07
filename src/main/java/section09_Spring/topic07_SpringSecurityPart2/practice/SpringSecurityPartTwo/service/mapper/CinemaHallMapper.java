package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.mapper;

import org.springframework.stereotype.Component;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.request.CinemaHallRequestDto;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.response.CinemaHallResponseDto;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.CinemaHall;

@Component
public class CinemaHallMapper implements RequestDtoMapper<CinemaHallRequestDto, CinemaHall>,
        ResponseDtoMapper<CinemaHallResponseDto, CinemaHall> {
    @Override
    public CinemaHall mapToModel(CinemaHallRequestDto dto) {
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.setDescription(dto.getDescription());
        cinemaHall.setCapacity(dto.getCapacity());
        return cinemaHall;
    }

    @Override
    public CinemaHallResponseDto mapToDto(CinemaHall cinemaHall) {
        CinemaHallResponseDto responseDto = new CinemaHallResponseDto();
        responseDto.setId(cinemaHall.getId());
        responseDto.setCapacity(cinemaHall.getCapacity());
        responseDto.setDescription(cinemaHall.getDescription());
        return responseDto;
    }
}
