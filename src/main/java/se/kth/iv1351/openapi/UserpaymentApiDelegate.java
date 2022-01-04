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
 * A delegate to be called by the {@link UserpaymentApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-04T16:00:29.942806+02:00[Europe/Mariehamn]")
public interface UserpaymentApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /userpayment/{paymentid}
     * Deletes a user payment
     *
     * @param paymentid  (required)
     * @return Successful delete (status code 200)
     * @see UserpaymentApi#userpaymentPaymentidDelete
     */
    default ResponseEntity<Void> userpaymentPaymentidDelete(Integer paymentid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /userpayment/{paymentid}
     * Returns a user payment
     *
     * @param paymentid  (required)
     * @return Successful response (status code 200)
     * @see UserpaymentApi#userpaymentPaymentidGet
     */
    default ResponseEntity<UserPayment> userpaymentPaymentidGet(Integer paymentid) {
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

    /**
     * PUT /userpayment/{paymentid}
     * Updates a user payment
     *
     * @param paymentid  (required)
     * @param userPayment  (required)
     * @return Successful response (status code 200)
     * @see UserpaymentApi#userpaymentPaymentidPut
     */
    default ResponseEntity<UserPayment> userpaymentPaymentidPut(Integer paymentid,
        UserPayment userPayment) {
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
