package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T15:31:39.797165+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class ParentApiController implements ParentApi {

    private final ParentApiDelegate delegate;

    public ParentApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ParentApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ParentApiDelegate() {});
    }

    @Override
    public ParentApiDelegate getDelegate() {
        return delegate;
    }

}
