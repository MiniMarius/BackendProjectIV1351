package se.kth.iv1351.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ReportData {

    private Integer lessonId;

    private String genre;

    private String weekday;

    private Integer seatsLeft;

    @Override
    public String toString() {
        return "ReportData{" +
                "lessonId=" + lessonId +
                ", genre='" + genre + '\'' +
                ", weekday='" + weekday + '\'' +
                ", seatsLeft=" + seatsLeft +
                '}';
    }
}
