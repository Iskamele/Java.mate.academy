package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
