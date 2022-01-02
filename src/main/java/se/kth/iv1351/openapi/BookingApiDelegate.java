package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Booking;
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
 * A delegate to be called by the {@link BookingApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-31T14:02:40.800669+02:00[Europe/Mariehamn]")
public interface BookingApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /booking/{bookingid}
     * Returns a booking
     *
     * @param bookingid  (required)
     * @return Successful response (status code 200)
     * @see BookingApi#bookingBookingidGet
     */
    default ResponseEntity<Booking> bookingBookingidGet(Integer bookingid) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"studentId\" : 1, \"lessonId\" : 6, \"startTime\" : \"startTime\", \"id\" : 0, \"endTime\" : \"endTime\", \"instructorId\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}