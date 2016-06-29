/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPack;
import Infrastructure.Aspect.Service.User;
import java.util.Map;
//import org.apache.commons.fileupload.FileUploadException;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import Infrastructure.Logs.LogAnnotation.Log;
import Infrastructure.Logs.LogAnnotation.SysLog;

/**
 *
 * @author Jayang
 */
@Controller
@RequestMapping(value = "/Train")
public class TestController {

    private final static Log log = LogFactory.getLog(TestController.class);

// 
    @RequestMapping(value = {"/index.do"}, method = {RequestMethod.GET})
    public ModelAndView GetProjects() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index");
        return modelAndView;
    }

    @RequestMapping("/greeting.do")
    @SysLog(IsRecord = true)
    public ModelAndView greeting() {
        System.out.println("Hello ");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userName", "3");
           Services.UserService service = new   Services.UserService();
		//以普通的方式调用UserService对象的三个方法
		User user = service.get(1L);
		service.save(user);
		try {
			service.delete(1L);
		} catch (Exception e) {
			if(log.isWarnEnabled()){
				log.warn("Delete user : " + e.getMessage());
			}
		}
        return new ModelAndView("/Hello", map);
    }
}
