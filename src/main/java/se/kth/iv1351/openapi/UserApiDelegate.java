package se.kth.iv1351.openapi;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-29T13:59:29.068483+02:00[Europe/Mariehamn]")
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
    default ResponseEntity<Void> userGet() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /user
     *
     * @return OK (status code 200)
     * @see UserApi#userPut
     */
    default ResponseEntity<Void> userPut() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
