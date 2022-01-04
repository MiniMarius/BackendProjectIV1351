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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-04T15:52:37.143243+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default UserApiDelegate getDelegate() {
        return new UserApiDelegate() {};
    }

    /**
     * POST /user
     * Lets a user post a new user
     *
     * @param user  (required)
     * @return Successfully created a new user (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "userPost", notes = "Lets a user post a new user", response = User.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new user", response = User.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/user",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<User> userPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        return getDelegate().userPost(user);
    }


    /**
     * DELETE /user/{userid}
     * Deletes a user
     *
     * @param userid  (required)
     * @return Successful delete (status code 200)
     */
    @ApiOperation(value = "", nickname = "userUseridDelete", notes = "Deletes a user", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful delete") })
    @DeleteMapping(
        value = "/user/{userid}"
    )
    default ResponseEntity<Void> userUseridDelete(@ApiParam(value = "",required=true) @PathVariable("userid") Integer userid) {
        return getDelegate().userUseridDelete(userid);
    }


    /**
     * GET /user/{userid}
     * Returns a user
     *
     * @param userid  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "userUseridGet", notes = "Returns a user", response = User.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = User.class) })
    @GetMapping(
        value = "/user/{userid}",
        produces = { "application/json" }
    )
    default ResponseEntity<User> userUseridGet(@ApiParam(value = "",required=true) @PathVariable("userid") Integer userid) {
        return getDelegate().userUseridGet(userid);
    }


    /**
     * PUT /user/{userid}
     * updates a user
     *
     * @param userid  (required)
     * @param user  (required)
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "userUseridPut", notes = "updates a user", response = User.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = User.class) })
    @PutMapping(
        value = "/user/{userid}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<User> userUseridPut(@ApiParam(value = "",required=true) @PathVariable("userid") Integer userid,@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        return getDelegate().userUseridPut(userid, user);
    }

}
