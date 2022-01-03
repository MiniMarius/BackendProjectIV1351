package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T09:29:07.750934+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class UserapplicationApiController implements UserapplicationApi {

    private final UserapplicationApiDelegate delegate;

    public UserapplicationApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) UserapplicationApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UserapplicationApiDelegate() {});
    }

    @Override
    public UserapplicationApiDelegate getDelegate() {
        return delegate;
    }

}
