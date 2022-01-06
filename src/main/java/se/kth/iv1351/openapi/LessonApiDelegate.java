package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Lesson;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link LessonApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-06T11:50:22.869965+02:00[Europe/Mariehamn]")
public interface LessonApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /lesson/{lessonid}
     * Deletes a lesson
     *
     * @param lessonid  (required)
     * @return Successful delete (status code 200)
     * @see LessonApi#lessonLessonidDelete
     */
    default ResponseEntity<Void> lessonLessonidDelete(Integer lessonid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /lesson/{lessonid}
     * Returns a lesson
     *
     * @param lessonid  (required)
     * @return Successful response (status code 200)
     * @see LessonApi#lessonLessonidGet
     */
    default ResponseEntity<Lesson> lessonLessonidGet(Integer lessonid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"level\" : \"level\", \"name\" : \"name\", \"genre\" : \"genre\", \"description\" : \"description\", \"id\" : 0, \"type\" : \"type\", \"minParticipants\" : 6, \"maxParticipants\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /lesson/{lessonid}
     * updates a lesson
     *
     * @param lessonid  (required)
     * @param lesson  (required)
     * @return Successful response (status code 200)
     * @see LessonApi#lessonLessonidPut
     */
    default ResponseEntity<Lesson> lessonLessonidPut(Integer lessonid,
        Lesson lesson) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"level\" : \"level\", \"name\" : \"name\", \"genre\" : \"genre\", \"description\" : \"description\", \"id\" : 0, \"type\" : \"type\", \"minParticipants\" : 6, \"maxParticipants\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /lesson
     * Lets a user post a new lesson
     *
     * @param lesson  (required)
     * @return Successfully created a new lesson (status code 200)
     *         or Invalid request (status code 400)
     * @see LessonApi#lessonPost
     */
    default ResponseEntity<Lesson> lessonPost(Lesson lesson) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"level\" : \"level\", \"name\" : \"name\", \"genre\" : \"genre\", \"description\" : \"description\", \"id\" : 0, \"type\" : \"type\", \"minParticipants\" : 6, \"maxParticipants\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
