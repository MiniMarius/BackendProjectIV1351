/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Lesson;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T15:31:39.797165+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "lesson", description = "the lesson API")
public interface LessonApi {

    default LessonApiDelegate getDelegate() {
        return new LessonApiDelegate() {};
    }

    /**
     * GET /lesson/{lessonid}
     * Returns a lesson
     *
     * @param lessonid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "lessonLessonidGet", notes = "Returns a lesson", response = Lesson.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Lesson.class) })
    @GetMapping(
        value = "/lesson/{lessonid}",
        produces = { "application/json" }
    )
    default ResponseEntity<Lesson> lessonLessonidGet(@ApiParam(value = "",required=true) @PathVariable("lessonid") Integer lessonid) {
        return getDelegate().lessonLessonidGet(lessonid);
    }


    /**
     * POST /lesson
     * Lets a user post a new lesson
     *
     * @param lesson  (required)
     * @return Successfully created a new lesson (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "lessonPost", notes = "Lets a user post a new lesson", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new lesson"),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/lesson",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> lessonPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Lesson lesson) {
        return getDelegate().lessonPost(lesson);
    }

}
