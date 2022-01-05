/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.UserApplication;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-05T16:27:19.215204+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "userapplication", description = "the userapplication API")
public interface UserapplicationApi {

    default UserapplicationApiDelegate getDelegate() {
        return new UserapplicationApiDelegate() {};
    }

    /**
     * DELETE /userapplication/{applicationid}
     * Deletes a user application
     *
     * @param applicationid  (required)
     * @return Successful delete (status code 200)
     */
    @ApiOperation(value = "", nickname = "userapplicationApplicationidDelete", notes = "Deletes a user application", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful delete") })
    @DeleteMapping(
        value = "/userapplication/{applicationid}"
    )
    default ResponseEntity<Void> userapplicationApplicationidDelete(@ApiParam(value = "",required=true) @PathVariable("applicationid") Integer applicationid) {
        return getDelegate().userapplicationApplicationidDelete(applicationid);
    }


    /**
     * GET /userapplication/{applicationid}
     * Returns a user application
     *
     * @param applicationid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "userapplicationApplicationidGet", notes = "Returns a user application", response = UserApplication.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = UserApplication.class) })
    @GetMapping(
        value = "/userapplication/{applicationid}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserApplication> userapplicationApplicationidGet(@ApiParam(value = "",required=true) @PathVariable("applicationid") Integer applicationid) {
        return getDelegate().userapplicationApplicationidGet(applicationid);
    }


    /**
     * PUT /userapplication/{applicationid}
     * Updates a user application
     *
     * @param applicationid  (required)
     * @param userApplication  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "userapplicationApplicationidPut", notes = "Updates a user application", response = UserApplication.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = UserApplication.class) })
    @PutMapping(
        value = "/userapplication/{applicationid}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserApplication> userapplicationApplicationidPut(@ApiParam(value = "",required=true) @PathVariable("applicationid") Integer applicationid,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserApplication userApplication) {
        return getDelegate().userapplicationApplicationidPut(applicationid, userApplication);
    }


    /**
     * POST /userapplication
     * Lets a user post a new user application
     *
     * @param userApplication  (required)
     * @return Successfully created a new user application (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "userapplicationPost", notes = "Lets a user post a new user application", response = UserApplication.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new user application", response = UserApplication.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/userapplication",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserApplication> userapplicationPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserApplication userApplication) {
        return getDelegate().userapplicationPost(userApplication);
    }

}
