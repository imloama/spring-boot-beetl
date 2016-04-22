package spring.boot.beetl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/{name}")
	public String index(@PathVariable String name,HttpServletRequest request){
		request.setAttribute("name", name);
		return "index";
	}
	
}
