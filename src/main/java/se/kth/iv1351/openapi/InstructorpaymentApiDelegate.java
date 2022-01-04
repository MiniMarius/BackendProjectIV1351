package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.UserPayment;
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
 * A delegate to be called by the {@link InstructorpaymentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-04T16:00:29.942806+02:00[Europe/Mariehamn]")
public interface InstructorpaymentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /instructorpayment
     * Lets a user post a new user payment
     *
     * @param userPayment  (required)
     * @return Successfully created a new user payment (status code 200)
     *         or Invalid request (status code 400)
     * @see InstructorpaymentApi#instructorpaymentPost
     */
    default ResponseEntity<UserPayment> instructorpaymentPost(UserPayment userPayment) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"startTime\" : \"startTime\", \"endTime\" : \"endTime\", \"userid\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
