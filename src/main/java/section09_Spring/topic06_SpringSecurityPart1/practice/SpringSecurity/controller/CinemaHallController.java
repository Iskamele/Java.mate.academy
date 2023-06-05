package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.request.CinemaHallRequestDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.response.CinemaHallResponseDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.CinemaHall;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.CinemaHallService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper.RequestDtoMapper;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper.ResponseDtoMapper;

@RestController
@RequestMapping("/cinema-halls")
public class CinemaHallController {
    private final CinemaHallService cinemaHallService;
    private final RequestDtoMapper<CinemaHallRequestDto, CinemaHall> cinemaHallRequestDtoMapper;
    private final ResponseDtoMapper<CinemaHallResponseDto, CinemaHall> cinemaHallResponseDtoMapper;

    public CinemaHallController(CinemaHallService cinemaHallService,
            RequestDtoMapper<CinemaHallRequestDto, CinemaHall> cinemaHallRequestDtoMapper,
            ResponseDtoMapper<CinemaHallResponseDto, CinemaHall> cinemaHallResponseDtoMapper) {
        this.cinemaHallService = cinemaHallService;
        this.cinemaHallRequestDtoMapper = cinemaHallRequestDtoMapper;
        this.cinemaHallResponseDtoMapper = cinemaHallResponseDtoMapper;
    }

    @PostMapping
    public CinemaHallResponseDto add(@RequestBody CinemaHallRequestDto requestDto) {
        CinemaHall cinemaHall = cinemaHallService.add(
                    cinemaHallRequestDtoMapper.mapToModel(requestDto));
        return cinemaHallResponseDtoMapper.mapToDto(cinemaHall);
    }

    @GetMapping
    public List<CinemaHallResponseDto> getAll() {
        return cinemaHallService.getAll()
                .stream()
                .map(cinemaHallResponseDtoMapper::mapToDto)
                .toList();
    }
}
