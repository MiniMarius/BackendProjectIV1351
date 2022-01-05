package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Lease;
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
 * A delegate to be called by the {@link LeaseApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-05T16:27:19.215204+02:00[Europe/Mariehamn]")
public interface LeaseApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /lease/{leaseid}
     * Deletes a lease
     *
     * @param leaseid  (required)
     * @return Successful delete (status code 200)
     * @see LeaseApi#leaseLeaseidDelete
     */
    default ResponseEntity<Void> leaseLeaseidDelete(Integer leaseid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /lease/{leaseid}
     * Returns a lease
     *
     * @param leaseid  (required)
     * @return Successful response (status code 200)
     * @see LeaseApi#leaseLeaseidGet
     */
    default ResponseEntity<Lease> leaseLeaseidGet(Integer leaseid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"studentId\" : 1, \"rentalInstrumentId\" : 6, \"startTime\" : \"startTime\", \"id\" : 0, \"endTime\" : \"endTime\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /lease/{leaseid}
     * updates a lease
     *
     * @param leaseid  (required)
     * @param lease  (required)
     * @return Successful response (status code 200)
     * @see LeaseApi#leaseLeaseidPut
     */
    default ResponseEntity<Lease> leaseLeaseidPut(Integer leaseid,
        Lease lease) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"studentId\" : 1, \"rentalInstrumentId\" : 6, \"startTime\" : \"startTime\", \"id\" : 0, \"endTime\" : \"endTime\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /lease
     * Lets a user post a new lease
     *
     * @param lease  (required)
     * @return Successfully created a new lease (status code 200)
     *         or Invalid request (status code 400)
     * @see LeaseApi#leasePost
     */
    default ResponseEntity<Lease> leasePost(Lease lease) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"studentId\" : 1, \"rentalInstrumentId\" : 6, \"startTime\" : \"startTime\", \"id\" : 0, \"endTime\" : \"endTime\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
