/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.RentalInstrument;
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
@Api(value = "rentalinstrument", description = "the rentalinstrument API")
public interface RentalinstrumentApi {

    default RentalinstrumentApiDelegate getDelegate() {
        return new RentalinstrumentApiDelegate() {};
    }

    /**
     * POST /rentalinstrument
     * Lets a user post a new rental instrument
     *
     * @param rentalInstrument  (required)
     * @return Successfully created a new rental instrument (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "rentalinstrumentPost", notes = "Lets a user post a new rental instrument", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new rental instrument"),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/rentalinstrument",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> rentalinstrumentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RentalInstrument rentalInstrument) {
        return getDelegate().rentalinstrumentPost(rentalInstrument);
    }


    /**
     * GET /rentalinstrument/{rentalid}
     * Returns a rental instrument
     *
     * @param rentalid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "rentalinstrumentRentalidGet", notes = "Returns a rental instrument", response = RentalInstrument.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RentalInstrument.class) })
    @GetMapping(
        value = "/rentalinstrument/{rentalid}",
        produces = { "application/json" }
    )
    default ResponseEntity<RentalInstrument> rentalinstrumentRentalidGet(@ApiParam(value = "",required=true) @PathVariable("rentalid") Integer rentalid) {
        return getDelegate().rentalinstrumentRentalidGet(rentalid);
    }

}
