package com.spring.web;
import com.spring.domain.Type;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/types")
@Controller
@RooWebScaffold(path = "types", formBackingObject = Type.class)
public class TypeController {
}
