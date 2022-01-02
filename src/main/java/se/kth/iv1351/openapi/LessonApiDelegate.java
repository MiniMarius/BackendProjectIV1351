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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T12:42:42.850804+02:00[Europe/Mariehamn]")
public interface LessonApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
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

}
