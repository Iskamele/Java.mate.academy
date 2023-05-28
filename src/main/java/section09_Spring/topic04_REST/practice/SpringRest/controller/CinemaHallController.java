package section09_Spring.topic04_REST.practice.SpringRest.controller;

import java.util.List;
import java.util.stream.Collectors;
import section09_Spring.topic04_REST.practice.SpringRest.dto.request.RequestCinemaHall;
import section09_Spring.topic04_REST.practice.SpringRest.dto.response.ResponseCinemaHall;
import section09_Spring.topic04_REST.practice.SpringRest.service.CinemaHallService;
import section09_Spring.topic04_REST.practice.SpringRest.service.mapper.CinemaHallMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema-halls")
public class CinemaHallController {
    private final CinemaHallService cinemaHallService;
    private final CinemaHallMapper cinemaHallMapper;

    public CinemaHallController(CinemaHallService cinemaHallService,
                                CinemaHallMapper cinemaHallMapper) {
        this.cinemaHallService = cinemaHallService;
        this.cinemaHallMapper = cinemaHallMapper;
    }

    @PostMapping
    public ResponseCinemaHall create(@RequestBody RequestCinemaHall requestCinemaHallDto) {
        return cinemaHallMapper.toDto(
                cinemaHallService.add(cinemaHallMapper.toModel(requestCinemaHallDto)));
    }

    @GetMapping
    public List<ResponseCinemaHall> getAll() {
        return cinemaHallService.getAll()
                .stream()
                .map(cinemaHallMapper::toDto)
                .collect(Collectors.toList());
    }
}
