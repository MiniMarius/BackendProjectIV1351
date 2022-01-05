package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.UserInstrument;
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
 * A delegate to be called by the {@link UserinstrumentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-05T16:27:19.215204+02:00[Europe/Mariehamn]")
public interface UserinstrumentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /userinstrument/{instrumentid}
     * Deletes a user instrument
     *
     * @param instrumentid  (required)
     * @return Successful delete (status code 200)
     * @see UserinstrumentApi#userinstrumentInstrumentidDelete
     */
    default ResponseEntity<Void> userinstrumentInstrumentidDelete(Integer instrumentid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /userinstrument/{instrumentid}
     * Returns a user instrument
     *
     * @param instrumentid  (required)
     * @return Successful response (status code 200)
     * @see UserinstrumentApi#userinstrumentInstrumentidGet
     */
    default ResponseEntity<UserInstrument> userinstrumentInstrumentidGet(Integer instrumentid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instrumentTypeId\" : 6, \"userId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /userinstrument/{instrumentid}
     * Updates a user instrument
     *
     * @param instrumentid  (required)
     * @param userInstrument  (required)
     * @return Successful response (status code 200)
     * @see UserinstrumentApi#userinstrumentInstrumentidPut
     */
    default ResponseEntity<UserInstrument> userinstrumentInstrumentidPut(Integer instrumentid,
        UserInstrument userInstrument) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instrumentTypeId\" : 6, \"userId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /userinstrument
     * Lets a user post a new user instrument
     *
     * @param userInstrument  (required)
     * @return Successfully created a new user instrument (status code 200)
     *         or Invalid request (status code 400)
     * @see UserinstrumentApi#userinstrumentPost
     */
    default ResponseEntity<UserInstrument> userinstrumentPost(UserInstrument userInstrument) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instrumentTypeId\" : 6, \"userId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
