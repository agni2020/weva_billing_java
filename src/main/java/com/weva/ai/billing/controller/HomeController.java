package com.weva.ai.billing.controller;


import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
public class HomeController {



    @Hidden
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws  IOException {
        response.sendRedirect("/swagger-ui.html");
    }
}
