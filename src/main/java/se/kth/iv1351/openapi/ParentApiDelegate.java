package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Parent;
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
 * A delegate to be called by the {@link ParentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T14:27:28.397731+02:00[Europe/Mariehamn]")
public interface ParentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /parent/{parentid}
     * Returns a parent
     *
     * @param parentid  (required)
     * @return Successful response (status code 200)
     * @see ParentApi#parentParentidGet
     */
    default ResponseEntity<Parent> parentParentidGet(Integer parentid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"studentId\" : 0, \"parentId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /parent
     * Lets a user post a new parent
     *
     * @param parent  (required)
     * @return Successfully created a new parent (status code 200)
     *         or Invalid request (status code 400)
     * @see ParentApi#parentPost
     */
    default ResponseEntity<Void> parentPost(Parent parent) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
