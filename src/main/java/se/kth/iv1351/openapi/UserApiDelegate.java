package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link UserApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-30T16:22:33.219973+02:00[Europe/Mariehamn]")
public interface UserApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user
     * Returns a list of stuff
     *
     * @return Successful response (status code 200)
     * @see UserApi#userGet
     */
    default ResponseEntity<User> userGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"personNumber\" : \"personNumber\", \"age\" : 6, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /user
     * Lets a user post a new user
     *
     * @param user  (required)
     * @return Successfully created a new user (status code 200)
     *         or Invalid request (status code 400)
     * @see UserApi#userPost
     */
    default ResponseEntity<Void> userPost(User user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
