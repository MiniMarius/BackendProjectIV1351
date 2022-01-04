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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-04T09:29:48.826888+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "userpayment", description = "the userpayment API")
public interface UserpaymentApi {

    default UserpaymentApiDelegate getDelegate() {
        return new UserpaymentApiDelegate() {};
    }

    /**
     * DELETE /userpayment/{paymentid}
     * Deletes a user payment
     *
     * @param paymentid  (required)
     * @return Successful delete (status code 200)
     */
    @ApiOperation(value = "", nickname = "userpaymentPaymentidDelete", notes = "Deletes a user payment", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful delete") })
    @DeleteMapping(
        value = "/userpayment/{paymentid}"
    )
    default ResponseEntity<Void> userpaymentPaymentidDelete(@ApiParam(value = "",required=true) @PathVariable("paymentid") Integer paymentid) {
        return getDelegate().userpaymentPaymentidDelete(paymentid);
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
     * PUT /userpayment/{paymentid}
     * Updates a user payment
     *
     * @param paymentid  (required)
     * @param userPayment  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "userpaymentPaymentidPut", notes = "Updates a user payment", response = UserPayment.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = UserPayment.class) })
    @PutMapping(
        value = "/userpayment/{paymentid}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserPayment> userpaymentPaymentidPut(@ApiParam(value = "",required=true) @PathVariable("paymentid") Integer paymentid,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserPayment userPayment) {
        return getDelegate().userpaymentPaymentidPut(paymentid, userPayment);
    }


    /**
     * POST /userpayment
     * Lets a user post a new user payment
     *
     * @param userPayment  (required)
     * @return Successfully created a new user payment (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "userpaymentPost", notes = "Lets a user post a new user payment", response = UserPayment.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new user payment", response = UserPayment.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/userpayment",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserPayment> userpaymentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserPayment userPayment) {
        return getDelegate().userpaymentPost(userPayment);
    }

}
