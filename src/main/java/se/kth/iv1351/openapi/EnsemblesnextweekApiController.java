package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-04T16:15:38.621562+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.soundgood.base-path:}")
public class EnsemblesnextweekApiController implements EnsemblesnextweekApi {

    private final EnsemblesnextweekApiDelegate delegate;

    public EnsemblesnextweekApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) EnsemblesnextweekApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new EnsemblesnextweekApiDelegate() {});
    }

    @Override
    public EnsemblesnextweekApiDelegate getDelegate() {
        return delegate;
    }

}