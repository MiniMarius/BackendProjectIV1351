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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-31T14:02:40.800669+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "parent", description = "the parent API")
public interface ParentApi {

    default ParentApiDelegate getDelegate() {
        return new ParentApiDelegate() {};
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

}
