package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.UserApplication;
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
 * A delegate to be called by the {@link UserapplicationApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T12:42:42.850804+02:00[Europe/Mariehamn]")
public interface UserapplicationApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /userapplication/{applicationid}
     * Returns a user application
     *
     * @param applicationid  (required)
     * @return Successful response (status code 200)
     * @see UserapplicationApi#userapplicationApplicationidGet
     */
    default ResponseEntity<UserApplication> userapplicationApplicationidGet(Integer applicationid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"letter\" : \"letter\", \"instrumentTypeId\" : 6, \"id\" : 0, \"userId\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
