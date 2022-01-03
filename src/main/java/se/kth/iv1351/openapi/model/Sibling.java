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
 * Sibling
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T11:45:31.530365+02:00[Europe/Mariehamn]")
public class Sibling   {
  @JsonProperty("studentIdOne")
  private Integer studentIdOne;

  @JsonProperty("studentIdTwo")
  private Integer studentIdTwo;

  public Sibling studentIdOne(Integer studentIdOne) {
    this.studentIdOne = studentIdOne;
    return this;
  }

  /**
   * Get studentIdOne
   * @return studentIdOne
  */
  @ApiModelProperty(value = "")


  public Integer getStudentIdOne() {
    return studentIdOne;
  }

  public void setStudentIdOne(Integer studentIdOne) {
    this.studentIdOne = studentIdOne;
  }

  public Sibling studentIdTwo(Integer studentIdTwo) {
    this.studentIdTwo = studentIdTwo;
    return this;
  }

  /**
   * Get studentIdTwo
   * @return studentIdTwo
  */
  @ApiModelProperty(value = "")


  public Integer getStudentIdTwo() {
    return studentIdTwo;
  }

  public void setStudentIdTwo(Integer studentIdTwo) {
    this.studentIdTwo = studentIdTwo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sibling sibling = (Sibling) o;
    return Objects.equals(this.studentIdOne, sibling.studentIdOne) &&
        Objects.equals(this.studentIdTwo, sibling.studentIdTwo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentIdOne, studentIdTwo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sibling {\n");
    
    sb.append("    studentIdOne: ").append(toIndentedString(studentIdOne)).append("\n");
    sb.append("    studentIdTwo: ").append(toIndentedString(studentIdTwo)).append("\n");
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

