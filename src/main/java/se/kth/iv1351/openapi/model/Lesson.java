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
 * Lesson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T16:10:02.180128+02:00[Europe/Mariehamn]")
public class Lesson   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("level")
  private String level;

  @JsonProperty("minParticipants")
  private Integer minParticipants;

  @JsonProperty("maxParticipants")
  private Integer maxParticipants;

  @JsonProperty("type")
  private String type;

  @JsonProperty("genre")
  private String genre;

  public Lesson id(Integer id) {
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

  public Lesson name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Lesson description(String description) {
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

  public Lesson level(String level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @ApiModelProperty(value = "")


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public Lesson minParticipants(Integer minParticipants) {
    this.minParticipants = minParticipants;
    return this;
  }

  /**
   * Get minParticipants
   * @return minParticipants
  */
  @ApiModelProperty(value = "")


  public Integer getMinParticipants() {
    return minParticipants;
  }

  public void setMinParticipants(Integer minParticipants) {
    this.minParticipants = minParticipants;
  }

  public Lesson maxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
    return this;
  }

  /**
   * Get maxParticipants
   * @return maxParticipants
  */
  @ApiModelProperty(value = "")


  public Integer getMaxParticipants() {
    return maxParticipants;
  }

  public void setMaxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
  }

  public Lesson type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Lesson genre(String genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Get genre
   * @return genre
  */
  @ApiModelProperty(value = "")


  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lesson lesson = (Lesson) o;
    return Objects.equals(this.id, lesson.id) &&
        Objects.equals(this.name, lesson.name) &&
        Objects.equals(this.description, lesson.description) &&
        Objects.equals(this.level, lesson.level) &&
        Objects.equals(this.minParticipants, lesson.minParticipants) &&
        Objects.equals(this.maxParticipants, lesson.maxParticipants) &&
        Objects.equals(this.type, lesson.type) &&
        Objects.equals(this.genre, lesson.genre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, level, minParticipants, maxParticipants, type, genre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lesson {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    minParticipants: ").append(toIndentedString(minParticipants)).append("\n");
    sb.append("    maxParticipants: ").append(toIndentedString(maxParticipants)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
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

