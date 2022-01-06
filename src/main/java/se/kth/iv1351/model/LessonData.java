package se.kth.iv1351.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LessonData {

    private Integer id;

    private String name;

    private String description;

    private String level;

    private Integer minParticipants;

    private Integer maxParticipants;

    private String type;

    private String genre;

    @Override
    public String toString() {
        return "LessonData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", minParticipants=" + minParticipants +
                ", maxParticipants=" + maxParticipants +
                ", type='" + type + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
