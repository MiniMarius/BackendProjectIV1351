package se.kth.iv1351.openapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-02T17:40:04.139260+02:00[Europe/Mariehamn]")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class LessonApiController implements LessonApi {

    private final LessonApiDelegate delegate;

    public LessonApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) LessonApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new LessonApiDelegate() {});
    }

    @Override
    public LessonApiDelegate getDelegate() {
        return delegate;
    }

}
