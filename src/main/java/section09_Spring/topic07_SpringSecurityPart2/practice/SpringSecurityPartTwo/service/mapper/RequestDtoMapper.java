package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.mapper;

public interface RequestDtoMapper<D, T> {
    T mapToModel(D dto);
}
