package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper;

public interface DtoResponseMapper<D, C> {
    D toDto(C object);
}
