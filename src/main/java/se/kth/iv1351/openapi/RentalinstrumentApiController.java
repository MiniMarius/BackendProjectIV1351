package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-31T14:02:40.800669+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class RentalinstrumentApiController implements RentalinstrumentApi {

    private final RentalinstrumentApiDelegate delegate;

    public RentalinstrumentApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) RentalinstrumentApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new RentalinstrumentApiDelegate() {});
    }

    @Override
    public RentalinstrumentApiDelegate getDelegate() {
        return delegate;
    }

}