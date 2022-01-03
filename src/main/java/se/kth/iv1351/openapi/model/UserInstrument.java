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
 * UserInstrument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T10:39:04.369983+02:00[Europe/Mariehamn]")
public class UserInstrument   {
  @JsonProperty("userId")
  private Integer userId;

  @JsonProperty("instrumentTypeId")
  private Integer instrumentTypeId;

  public UserInstrument userId(Integer userId) {
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

  public UserInstrument instrumentTypeId(Integer instrumentTypeId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInstrument userInstrument = (UserInstrument) o;
    return Objects.equals(this.userId, userInstrument.userId) &&
        Objects.equals(this.instrumentTypeId, userInstrument.instrumentTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, instrumentTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInstrument {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    instrumentTypeId: ").append(toIndentedString(instrumentTypeId)).append("\n");
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

