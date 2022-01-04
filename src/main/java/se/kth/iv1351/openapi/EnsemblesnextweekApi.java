/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package se.kth.iv1351.openapi;

import se.kth.iv1351.openapi.model.Lesson;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-04T16:00:29.942806+02:00[Europe/Mariehamn]")
@Validated
@Api(value = "ensemblesnextweek", description = "the ensemblesnextweek API")
public interface EnsemblesnextweekApi {

    default EnsemblesnextweekApiDelegate getDelegate() {
        return new EnsemblesnextweekApiDelegate() {};
    }

    /**
     * GET /ensemblesnextweek
     * Returns a report of ensembles next week etc, more analytical data.
     *
     * @return Successful response (status code 200)
     */
    @ApiOperation(value = "", nickname = "ensemblesnextweekGet", notes = "Returns a report of ensembles next week etc, more analytical data.", response = Lesson.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Lesson.class, responseContainer = "List") })
    @GetMapping(
        value = "/ensemblesnextweek",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Lesson>> ensemblesnextweekGet() {
        return getDelegate().ensemblesnextweekGet();
    }

}
