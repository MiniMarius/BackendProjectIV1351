/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-29T13:59:29.068483+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default UserApiDelegate getDelegate() {
        return new UserApiDelegate() {};
    }

    /**
     * GET /user
     * Returns a list of stuff
     *
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "userGet", notes = "Returns a list of stuff", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response") })
    @GetMapping(
        value = "/user"
    )
    default ResponseEntity<Void> userGet() {
        return getDelegate().userGet();
    }


    /**
     * PUT /user
     *
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "userPut", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @PutMapping(
        value = "/user"
    )
    default ResponseEntity<Void> userPut() {
        return getDelegate().userPut();
    }

}
