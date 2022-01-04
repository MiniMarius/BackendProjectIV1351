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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-04T09:29:48.826888+02:00[Europe/Mariehamn]")
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
                    String exampleString = "{ \"amount\" : 6, \"currency\" : \"currency\", \"id\" : 0, \"type\" : \"type\", \"userid\" : 1 }";
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
                    String exampleString = "{ \"amount\" : 6, \"currency\" : \"currency\", \"id\" : 0, \"type\" : \"type\", \"userid\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /userpayment
     * Lets a user post a new user payment
     *
     * @param userPayment  (required)
     * @return Successfully created a new user payment (status code 200)
     *         or Invalid request (status code 400)
     * @see UserpaymentApi#userpaymentPost
     */
    default ResponseEntity<UserPayment> userpaymentPost(UserPayment userPayment) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"amount\" : 6, \"currency\" : \"currency\", \"id\" : 0, \"type\" : \"type\", \"userid\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
