package section09_Spring.topic03_SpringWeb.theory.T07_HowToCreateDTO.model.dto;

public class ActorResponseDto {
    private String name;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
