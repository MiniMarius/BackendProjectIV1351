package se.kth.iv1351.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Booking
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T13:27:50.627258+02:00[Europe/Mariehamn]")
public class Booking   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  @JsonProperty("lessonId")
  private Integer lessonId;

  @JsonProperty("studentId")
  private Integer studentId;

  @JsonProperty("instructorId")
  private Integer instructorId;

  public Booking id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Booking startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  @ApiModelProperty(value = "")


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Booking endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  */
  @ApiModelProperty(value = "")


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public Booking lessonId(Integer lessonId) {
    this.lessonId = lessonId;
    return this;
  }

  /**
   * Get lessonId
   * @return lessonId
  */
  @ApiModelProperty(value = "")


  public Integer getLessonId() {
    return lessonId;
  }

  public void setLessonId(Integer lessonId) {
    this.lessonId = lessonId;
  }

  public Booking studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

  /**
   * Get studentId
   * @return studentId
  */
  @ApiModelProperty(value = "")


  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public Booking instructorId(Integer instructorId) {
    this.instructorId = instructorId;
    return this;
  }

  /**
   * Get instructorId
   * @return instructorId
  */
  @ApiModelProperty(value = "")


  public Integer getInstructorId() {
    return instructorId;
  }

  public void setInstructorId(Integer instructorId) {
    this.instructorId = instructorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Booking booking = (Booking) o;
    return Objects.equals(this.id, booking.id) &&
        Objects.equals(this.startTime, booking.startTime) &&
        Objects.equals(this.endTime, booking.endTime) &&
        Objects.equals(this.lessonId, booking.lessonId) &&
        Objects.equals(this.studentId, booking.studentId) &&
        Objects.equals(this.instructorId, booking.instructorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTime, endTime, lessonId, studentId, instructorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Booking {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    lessonId: ").append(toIndentedString(lessonId)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    instructorId: ").append(toIndentedString(instructorId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

