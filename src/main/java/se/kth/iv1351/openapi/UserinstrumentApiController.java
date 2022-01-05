package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-05T12:59:06.928993+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.soundgood.base-path:}")
public class UserinstrumentApiController implements UserinstrumentApi {

    private final UserinstrumentApiDelegate delegate;

    public UserinstrumentApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) UserinstrumentApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UserinstrumentApiDelegate() {});
    }

    @Override
    public UserinstrumentApiDelegate getDelegate() {
        return delegate;
    }

}
