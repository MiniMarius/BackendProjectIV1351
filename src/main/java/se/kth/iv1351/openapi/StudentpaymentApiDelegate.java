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
 * A delegate to be called by the {@link StudentpaymentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-06T11:23:22.276765+02:00[Europe/Mariehamn]")
public interface StudentpaymentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /studentpayment
     * Lets a user post a new user payment
     *
     * @param userPayment  (required)
     * @return Successfully created a new user payment (status code 200)
     *         or Invalid request (status code 400)
     * @see StudentpaymentApi#studentpaymentPost
     */
    default ResponseEntity<UserPayment> studentpaymentPost(UserPayment userPayment) {
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
