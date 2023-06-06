package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper;

public interface RequestDtoMapper<D, T> {
    T mapToModel(D dto);
}
