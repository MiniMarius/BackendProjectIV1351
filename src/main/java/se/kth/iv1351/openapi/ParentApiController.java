package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-04T21:37:54.247611+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.soundgood.base-path:}")
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
