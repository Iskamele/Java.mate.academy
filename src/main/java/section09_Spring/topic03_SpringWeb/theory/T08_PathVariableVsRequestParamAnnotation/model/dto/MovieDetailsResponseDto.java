package section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.dto;

import java.util.List;

public class MovieDetailsResponseDto {
    private Long movieId;
    private String movieDescription;
    private List<ActorResponseDto> actors;
    private List<Long> actorsIds;
}
