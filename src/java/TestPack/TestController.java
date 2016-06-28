/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPack;
import java.util.Map;

//import org.apache.commons.fileupload.FileUploadException;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
/**
 *
 * @author Jayang
 */
@Controller
@RequestMapping(value = "/Train")
public class TestController {
         // 
	@RequestMapping(value = { "/index.do" }, method = { RequestMethod.GET })
	public ModelAndView GetProjects() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/index");
		return modelAndView;
	}
         @RequestMapping("/greeting.do")
    public ModelAndView greeting() {
         System.out.println("Hello ");
         Map<String, Object> map = new HashMap<String, Object>();
         map.put("userName", "3");
         return new ModelAndView("/Hello",map);
    }
}
