/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Lease;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-04T16:15:38.621562+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "lease", description = "the lease API")
public interface LeaseApi {

    default LeaseApiDelegate getDelegate() {
        return new LeaseApiDelegate() {};
    }

    /**
     * DELETE /lease/{leaseid}
     * Deletes a lease
     *
     * @param leaseid  (required)
     * @return Successful delete (status code 200)
     */
    @ApiOperation(value = "", nickname = "leaseLeaseidDelete", notes = "Deletes a lease", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful delete") })
    @DeleteMapping(
        value = "/lease/{leaseid}"
    )
    default ResponseEntity<Void> leaseLeaseidDelete(@ApiParam(value = "",required=true) @PathVariable("leaseid") Integer leaseid) {
        return getDelegate().leaseLeaseidDelete(leaseid);
    }


    /**
     * GET /lease/{leaseid}
     * Returns a lease
     *
     * @param leaseid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "leaseLeaseidGet", notes = "Returns a lease", response = Lease.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Lease.class) })
    @GetMapping(
        value = "/lease/{leaseid}",
        produces = { "application/json" }
    )
    default ResponseEntity<Lease> leaseLeaseidGet(@ApiParam(value = "",required=true) @PathVariable("leaseid") Integer leaseid) {
        return getDelegate().leaseLeaseidGet(leaseid);
    }


    /**
     * PUT /lease/{leaseid}
     * updates a lease
     *
     * @param leaseid  (required)
     * @param lease  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "leaseLeaseidPut", notes = "updates a lease", response = Lease.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Lease.class) })
    @PutMapping(
        value = "/lease/{leaseid}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Lease> leaseLeaseidPut(@ApiParam(value = "",required=true) @PathVariable("leaseid") Integer leaseid,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Lease lease) {
        return getDelegate().leaseLeaseidPut(leaseid, lease);
    }


    /**
     * POST /lease
     * Lets a user post a new lease
     *
     * @param lease  (required)
     * @return Successfully created a new lease (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "leasePost", notes = "Lets a user post a new lease", response = Lease.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new lease", response = Lease.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/lease",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Lease> leasePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Lease lease) {
        return getDelegate().leasePost(lease);
    }

}
