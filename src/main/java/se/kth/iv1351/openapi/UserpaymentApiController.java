package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-31T14:02:40.800669+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class UserpaymentApiController implements UserpaymentApi {

    private final UserpaymentApiDelegate delegate;

    public UserpaymentApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) UserpaymentApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UserpaymentApiDelegate() {});
    }

    @Override
    public UserpaymentApiDelegate getDelegate() {
        return delegate;
    }

}