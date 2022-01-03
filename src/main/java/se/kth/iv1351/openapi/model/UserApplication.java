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
 * UserApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T09:36:47.388902+02:00[Europe/Mariehamn]")
public class UserApplication   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("letter")
  private String letter;

  @JsonProperty("instrumentTypeId")
  private Integer instrumentTypeId;

  @JsonProperty("userId")
  private Integer userId;

  public UserApplication id(Integer id) {
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

  public UserApplication letter(String letter) {
    this.letter = letter;
    return this;
  }

  /**
   * Get letter
   * @return letter
  */
  @ApiModelProperty(value = "")


  public String getLetter() {
    return letter;
  }

  public void setLetter(String letter) {
    this.letter = letter;
  }

  public UserApplication instrumentTypeId(Integer instrumentTypeId) {
    this.instrumentTypeId = instrumentTypeId;
    return this;
  }

  /**
   * Get instrumentTypeId
   * @return instrumentTypeId
  */
  @ApiModelProperty(value = "")


  public Integer getInstrumentTypeId() {
    return instrumentTypeId;
  }

  public void setInstrumentTypeId(Integer instrumentTypeId) {
    this.instrumentTypeId = instrumentTypeId;
  }

  public UserApplication userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserApplication userApplication = (UserApplication) o;
    return Objects.equals(this.id, userApplication.id) &&
        Objects.equals(this.letter, userApplication.letter) &&
        Objects.equals(this.instrumentTypeId, userApplication.instrumentTypeId) &&
        Objects.equals(this.userId, userApplication.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, letter, instrumentTypeId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserApplication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    letter: ").append(toIndentedString(letter)).append("\n");
    sb.append("    instrumentTypeId: ").append(toIndentedString(instrumentTypeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

