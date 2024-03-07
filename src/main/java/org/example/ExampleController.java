package org.example;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.example.models.FirstObjectModel;
import org.example.models.ResponseModel;
import org.example.models.SecondObjectModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;

@Controller
public class ExampleController {
    @GetMapping("/")
    @Operation(summary = "Test Controller")
    public ResponseModel hello() {
        return new ResponseModel(
                Collections.singletonList(new FirstObjectModel("name", "description")),
                new SecondObjectModel("name", "description")
        );
    }
}
