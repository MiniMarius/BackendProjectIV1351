/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Parent;
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
@Api(value = "parent", description = "the parent API")
public interface ParentApi {

    default ParentApiDelegate getDelegate() {
        return new ParentApiDelegate() {};
    }

    /**
     * DELETE /parent/{parentid}
     * Deletes a parent
     *
     * @param parentid  (required)
     * @return Successful delete (status code 200)
     */
    @ApiOperation(value = "", nickname = "parentParentidDelete", notes = "Deletes a parent", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful delete") })
    @DeleteMapping(
        value = "/parent/{parentid}"
    )
    default ResponseEntity<Void> parentParentidDelete(@ApiParam(value = "",required=true) @PathVariable("parentid") Integer parentid) {
        return getDelegate().parentParentidDelete(parentid);
    }


    /**
     * GET /parent/{parentid}
     * Returns a parent
     *
     * @param parentid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "parentParentidGet", notes = "Returns a parent", response = Parent.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Parent.class) })
    @GetMapping(
        value = "/parent/{parentid}",
        produces = { "application/json" }
    )
    default ResponseEntity<Parent> parentParentidGet(@ApiParam(value = "",required=true) @PathVariable("parentid") Integer parentid) {
        return getDelegate().parentParentidGet(parentid);
    }


    /**
     * PUT /parent/{parentid}
     * Updates a parent
     *
     * @param parentid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "parentParentidPut", notes = "Updates a parent", response = Parent.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Parent.class) })
    @PutMapping(
        value = "/parent/{parentid}",
        produces = { "application/json" }
    )
    default ResponseEntity<Parent> parentParentidPut(@ApiParam(value = "",required=true) @PathVariable("parentid") Integer parentid) {
        return getDelegate().parentParentidPut(parentid);
    }


    /**
     * POST /parent
     * Lets a user post a new parent
     *
     * @param parent  (required)
     * @return Successfully created a new parent (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "parentPost", notes = "Lets a user post a new parent", response = Parent.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new parent", response = Parent.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/parent",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Parent> parentPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Parent parent) {
        return getDelegate().parentPost(parent);
    }

}
