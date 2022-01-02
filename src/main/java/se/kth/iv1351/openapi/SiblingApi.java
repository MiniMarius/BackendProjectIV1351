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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T12:42:42.850804+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "sibling", description = "the sibling API")
public interface SiblingApi {

    default SiblingApiDelegate getDelegate() {
        return new SiblingApiDelegate() {};
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

}
