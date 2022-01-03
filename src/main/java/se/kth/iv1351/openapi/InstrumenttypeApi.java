/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.InstrumentType;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T14:33:16.996938+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "instrumenttype", description = "the instrumenttype API")
public interface InstrumenttypeApi {

    default InstrumenttypeApiDelegate getDelegate() {
        return new InstrumenttypeApiDelegate() {};
    }

    /**
     * DELETE /instrumenttype/{instrumentid}
     * Deletes a instrument type
     *
     * @param instrumentid  (required)
     * @return Successful delete (status code 200)
     */
    @ApiOperation(value = "", nickname = "instrumenttypeInstrumentidDelete", notes = "Deletes a instrument type", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful delete") })
    @DeleteMapping(
        value = "/instrumenttype/{instrumentid}"
    )
    default ResponseEntity<Void> instrumenttypeInstrumentidDelete(@ApiParam(value = "",required=true) @PathVariable("instrumentid") Integer instrumentid) {
        return getDelegate().instrumenttypeInstrumentidDelete(instrumentid);
    }


    /**
     * GET /instrumenttype/{instrumentid}
     * Returns a instrument type
     *
     * @param instrumentid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "instrumenttypeInstrumentidGet", notes = "Returns a instrument type", response = InstrumentType.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = InstrumentType.class) })
    @GetMapping(
        value = "/instrumenttype/{instrumentid}",
        produces = { "application/json" }
    )
    default ResponseEntity<InstrumentType> instrumenttypeInstrumentidGet(@ApiParam(value = "",required=true) @PathVariable("instrumentid") Integer instrumentid) {
        return getDelegate().instrumenttypeInstrumentidGet(instrumentid);
    }


    /**
     * PUT /instrumenttype/{instrumentid}
     * Updates a instrument type
     *
     * @param instrumentid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "instrumenttypeInstrumentidPut", notes = "Updates a instrument type", response = InstrumentType.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = InstrumentType.class) })
    @PutMapping(
        value = "/instrumenttype/{instrumentid}",
        produces = { "application/json" }
    )
    default ResponseEntity<InstrumentType> instrumenttypeInstrumentidPut(@ApiParam(value = "",required=true) @PathVariable("instrumentid") Integer instrumentid) {
        return getDelegate().instrumenttypeInstrumentidPut(instrumentid);
    }


    /**
     * POST /instrumenttype
     * Lets a user post a new instrument type
     *
     * @param instrumentType  (required)
     * @return Successfully created a new instrument type (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "instrumenttypePost", notes = "Lets a user post a new instrument type", response = InstrumentType.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new instrument type", response = InstrumentType.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/instrumenttype",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InstrumentType> instrumenttypePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InstrumentType instrumentType) {
        return getDelegate().instrumenttypePost(instrumentType);
    }

}
