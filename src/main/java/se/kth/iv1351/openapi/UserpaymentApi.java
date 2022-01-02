/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.UserPayment;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T14:46:14.705685+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "userpayment", description = "the userpayment API")
public interface UserpaymentApi {

    default UserpaymentApiDelegate getDelegate() {
        return new UserpaymentApiDelegate() {};
    }

    /**
     * GET /userpayment/{paymentid}
     * Returns a user payment
     *
     * @param paymentid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "userpaymentPaymentidGet", notes = "Returns a user payment", response = UserPayment.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = UserPayment.class) })
    @GetMapping(
        value = "/userpayment/{paymentid}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserPayment> userpaymentPaymentidGet(@ApiParam(value = "",required=true) @PathVariable("paymentid") Integer paymentid) {
        return getDelegate().userpaymentPaymentidGet(paymentid);
    }


    /**
     * POST /userpayment
     * Lets a user post a new user payment
     *
     * @param userPayment  (required)
     * @return Successfully created a new user payment (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "userpaymentPost", notes = "Lets a user post a new user payment", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new user payment"),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/userpayment",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> userpaymentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserPayment userPayment) {
        return getDelegate().userpaymentPost(userPayment);
    }

}
