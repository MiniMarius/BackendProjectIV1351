/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.UserInstrument;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T10:39:04.369983+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "userinstrument", description = "the userinstrument API")
public interface UserinstrumentApi {

    default UserinstrumentApiDelegate getDelegate() {
        return new UserinstrumentApiDelegate() {};
    }

    /**
     * GET /userinstrument/{instrumentid}
     * Returns a user instrument
     *
     * @param instrumentid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "userinstrumentInstrumentidGet", notes = "Returns a user instrument", response = UserInstrument.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = UserInstrument.class) })
    @GetMapping(
        value = "/userinstrument/{instrumentid}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserInstrument> userinstrumentInstrumentidGet(@ApiParam(value = "",required=true) @PathVariable("instrumentid") Integer instrumentid) {
        return getDelegate().userinstrumentInstrumentidGet(instrumentid);
    }


    /**
     * POST /userinstrument
     * Lets a user post a new user instrument
     *
     * @param userInstrument  (required)
     * @return Successfully created a new user instrument (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "userinstrumentPost", notes = "Lets a user post a new user instrument", response = UserInstrument.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new user instrument", response = UserInstrument.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/userinstrument",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserInstrument> userinstrumentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserInstrument userInstrument) {
        return getDelegate().userinstrumentPost(userInstrument);
    }

}
