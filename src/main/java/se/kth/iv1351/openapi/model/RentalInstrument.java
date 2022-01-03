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
 * RentalInstrument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T11:45:31.530365+02:00[Europe/Mariehamn]")
public class RentalInstrument   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("description")
  private String description;

  @JsonProperty("serialNumber")
  private String serialNumber;

  @JsonProperty("instrumentTypeId")
  private Integer instrumentTypeId;

  public RentalInstrument id(Integer id) {
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

  public RentalInstrument description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RentalInstrument serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
  */
  @ApiModelProperty(value = "")


  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public RentalInstrument instrumentTypeId(Integer instrumentTypeId) {
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
    RentalInstrument rentalInstrument = (RentalInstrument) o;
    return Objects.equals(this.id, rentalInstrument.id) &&
        Objects.equals(this.description, rentalInstrument.description) &&
        Objects.equals(this.serialNumber, rentalInstrument.serialNumber) &&
        Objects.equals(this.instrumentTypeId, rentalInstrument.instrumentTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, serialNumber, instrumentTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RentalInstrument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

