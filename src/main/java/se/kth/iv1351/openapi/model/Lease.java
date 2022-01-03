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
 * Lease
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T09:29:07.750934+02:00[Europe/Mariehamn]")
public class Lease   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  @JsonProperty("rentalInstrumentId")
  private Integer rentalInstrumentId;

  @JsonProperty("studentId")
  private Integer studentId;

  public Lease id(Integer id) {
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

  public Lease startTime(String startTime) {
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

  public Lease endTime(String endTime) {
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

  public Lease rentalInstrumentId(Integer rentalInstrumentId) {
    this.rentalInstrumentId = rentalInstrumentId;
    return this;
  }

  /**
   * Get rentalInstrumentId
   * @return rentalInstrumentId
  */
  @ApiModelProperty(value = "")


  public Integer getRentalInstrumentId() {
    return rentalInstrumentId;
  }

  public void setRentalInstrumentId(Integer rentalInstrumentId) {
    this.rentalInstrumentId = rentalInstrumentId;
  }

  public Lease studentId(Integer studentId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lease lease = (Lease) o;
    return Objects.equals(this.id, lease.id) &&
        Objects.equals(this.startTime, lease.startTime) &&
        Objects.equals(this.endTime, lease.endTime) &&
        Objects.equals(this.rentalInstrumentId, lease.rentalInstrumentId) &&
        Objects.equals(this.studentId, lease.studentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTime, endTime, rentalInstrumentId, studentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lease {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    rentalInstrumentId: ").append(toIndentedString(rentalInstrumentId)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
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

