package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-03T13:51:34.529189+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.soundgood.base-path:}")
public class BookingApiController implements BookingApi {

    private final BookingApiDelegate delegate;

    public BookingApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) BookingApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BookingApiDelegate() {});
    }

    @Override
    public BookingApiDelegate getDelegate() {
        return delegate;
    }

}
