package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
