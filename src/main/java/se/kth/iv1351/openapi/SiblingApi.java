/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Sibling;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-06T10:18:36.432578+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "sibling", description = "the sibling API")
public interface SiblingApi {

    default SiblingApiDelegate getDelegate() {
        return new SiblingApiDelegate() {};
    }

    /**
     * POST /sibling
     * Lets a user post a new sibling
     *
     * @param sibling  (required)
     * @return Successfully created a new sibling (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "siblingPost", notes = "Lets a user post a new sibling", response = Sibling.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new sibling", response = Sibling.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/sibling",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Sibling> siblingPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Sibling sibling) {
        return getDelegate().siblingPost(sibling);
    }


    /**
     * DELETE /sibling/{siblingid}
     * Deletes a sibling
     *
     * @param siblingid  (required)
     * @return Successful delete (status code 200)
     */
    @ApiOperation(value = "", nickname = "siblingSiblingidDelete", notes = "Deletes a sibling", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful delete") })
    @DeleteMapping(
        value = "/sibling/{siblingid}"
    )
    default ResponseEntity<Void> siblingSiblingidDelete(@ApiParam(value = "",required=true) @PathVariable("siblingid") Integer siblingid) {
        return getDelegate().siblingSiblingidDelete(siblingid);
    }


    /**
     * GET /sibling/{siblingid}
     * Returns a sibling
     *
     * @param siblingid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "siblingSiblingidGet", notes = "Returns a sibling", response = Sibling.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Sibling.class) })
    @GetMapping(
        value = "/sibling/{siblingid}",
        produces = { "application/json" }
    )
    default ResponseEntity<Sibling> siblingSiblingidGet(@ApiParam(value = "",required=true) @PathVariable("siblingid") Integer siblingid) {
        return getDelegate().siblingSiblingidGet(siblingid);
    }


    /**
     * PUT /sibling/{siblingid}
     * Updates a sibling
     *
     * @param siblingid  (required)
     * @param sibling  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "siblingSiblingidPut", notes = "Updates a sibling", response = Sibling.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Sibling.class) })
    @PutMapping(
        value = "/sibling/{siblingid}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Sibling> siblingSiblingidPut(@ApiParam(value = "",required=true) @PathVariable("siblingid") Integer siblingid,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Sibling sibling) {
        return getDelegate().siblingSiblingidPut(siblingid, sibling);
    }

}
