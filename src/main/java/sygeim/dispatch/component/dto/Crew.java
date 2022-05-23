package sygeim.dispatch.component.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Crew {
    private String id;

    private String name;

    private String position;

    private Boolean deleted;

    private String nationality;

    public Crew(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("delete") Boolean deleted,
            @JsonProperty("nationality") String nationality
    ) {
        setId(id);
        setDeleted(deleted);
        setName(name);
        setNationality(nationality);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", deleted=" + deleted +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
