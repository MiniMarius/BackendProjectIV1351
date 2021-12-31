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

    private Integer min_participants;

    private Integer max_participants;

    private String type;

    private String genre;
}
