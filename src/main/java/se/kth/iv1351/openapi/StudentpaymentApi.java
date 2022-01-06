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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-06T11:23:22.276765+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "studentpayment", description = "the studentpayment API")
public interface StudentpaymentApi {

    default StudentpaymentApiDelegate getDelegate() {
        return new StudentpaymentApiDelegate() {};
    }

    /**
     * POST /studentpayment
     * Lets a user post a new user payment
     *
     * @param userPayment  (required)
     * @return Successfully created a new user payment (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "studentpaymentPost", notes = "Lets a user post a new user payment", response = UserPayment.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new user payment", response = UserPayment.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/studentpayment",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserPayment> studentpaymentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserPayment userPayment) {
        return getDelegate().studentpaymentPost(userPayment);
    }

}
