package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Sibling;
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
 * A delegate to be called by the {@link SiblingApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T09:29:07.750934+02:00[Europe/Mariehamn]")
public interface SiblingApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /sibling
     * Lets a user post a new sibling
     *
     * @param sibling  (required)
     * @return Successfully created a new sibling (status code 200)
     *         or Invalid request (status code 400)
     * @see SiblingApi#siblingPost
     */
    default ResponseEntity<Sibling> siblingPost(Sibling sibling) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"studentIdTwo\" : 6, \"studentIdOne\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /sibling/{siblingid}
     * Returns a sibling
     *
     * @param siblingid  (required)
     * @return Successful response (status code 200)
     * @see SiblingApi#siblingSiblingidGet
     */
    default ResponseEntity<Sibling> siblingSiblingidGet(Integer siblingid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"studentIdTwo\" : 6, \"studentIdOne\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
