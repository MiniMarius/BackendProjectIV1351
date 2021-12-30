/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.User;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-30T16:22:33.219973+02:00[Europe/Mariehamn]")
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
    @ApiOperation(value = "", nickname = "userGet", notes = "Returns a list of stuff", response = User.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = User.class) })
    @GetMapping(
        value = "/user",
        produces = { "application/json" }
    )
    default ResponseEntity<User> userGet() {
        return getDelegate().userGet();
    }


    /**
     * POST /user
     * Lets a user post a new user
     *
     * @param user  (required)
     * @return Successfully created a new user (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "userPost", notes = "Lets a user post a new user", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new user"),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/user",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> userPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        return getDelegate().userPost(user);
    }

}