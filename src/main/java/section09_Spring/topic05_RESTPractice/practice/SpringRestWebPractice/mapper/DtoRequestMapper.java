package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper;

public interface DtoRequestMapper<D, C> {
    C fromDto(D dto);
}
