package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T13:51:34.529189+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.soundgood.base-path:}")
public class SiblingApiController implements SiblingApi {

    private final SiblingApiDelegate delegate;

    public SiblingApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) SiblingApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new SiblingApiDelegate() {});
    }

    @Override
    public SiblingApiDelegate getDelegate() {
        return delegate;
    }

}
