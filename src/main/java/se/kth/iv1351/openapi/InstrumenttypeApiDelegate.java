package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.InstrumentType;
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
 * A delegate to be called by the {@link InstrumenttypeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T13:27:50.627258+02:00[Europe/Mariehamn]")
public interface InstrumenttypeApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /instrumenttype/{instrumentid}
     * Deletes a instrument type
     *
     * @param instrumentid  (required)
     * @return Successful delete (status code 200)
     * @see InstrumenttypeApi#instrumenttypeInstrumentidDelete
     */
    default ResponseEntity<Void> instrumenttypeInstrumentidDelete(Integer instrumentid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /instrumenttype/{instrumentid}
     * Returns a instrument type
     *
     * @param instrumentid  (required)
     * @return Successful response (status code 200)
     * @see InstrumenttypeApi#instrumenttypeInstrumentidGet
     */
    default ResponseEntity<InstrumentType> instrumenttypeInstrumentidGet(Integer instrumentid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /instrumenttype
     * Lets a user post a new instrument type
     *
     * @param instrumentType  (required)
     * @return Successfully created a new instrument type (status code 200)
     *         or Invalid request (status code 400)
     * @see InstrumenttypeApi#instrumenttypePost
     */
    default ResponseEntity<InstrumentType> instrumenttypePost(InstrumentType instrumentType) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
