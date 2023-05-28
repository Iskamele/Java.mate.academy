package section09_Spring.topic04_REST.practice.SpringRest.service;

public interface Mapper<M, R, Q> {
    R toDto(M model);

    M toModel(Q dto);
}
