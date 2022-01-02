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
 * Parent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T16:10:02.180128+02:00[Europe/Mariehamn]")
public class Parent   {
  @JsonProperty("studentId")
  private Integer studentId;

  @JsonProperty("parentId")
  private Integer parentId;

  public Parent studentId(Integer studentId) {
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

  public Parent parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  */
  @ApiModelProperty(value = "")


  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parent parent = (Parent) o;
    return Objects.equals(this.studentId, parent.studentId) &&
        Objects.equals(this.parentId, parent.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parent {\n");
    
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

