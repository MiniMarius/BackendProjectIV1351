package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-31T14:02:40.800669+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class InstrumenttypeApiController implements InstrumenttypeApi {

    private final InstrumenttypeApiDelegate delegate;

    public InstrumenttypeApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) InstrumenttypeApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new InstrumenttypeApiDelegate() {});
    }

    @Override
    public InstrumenttypeApiDelegate getDelegate() {
        return delegate;
    }

}