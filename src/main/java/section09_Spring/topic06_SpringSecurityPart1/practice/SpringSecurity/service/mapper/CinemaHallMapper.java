package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper;

import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.request.CinemaHallRequestDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.response.CinemaHallResponseDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.CinemaHall;
import org.springframework.stereotype.Component;

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
