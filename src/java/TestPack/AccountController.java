/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPack;

import Infrastructure.Aspect.Service.User;
import Infrastructure.Aspect.Service.UserService;
import Infrastructure.Logs.LogAnnotation.SysLog;
import Infrastructure.web.auth.AuthPassport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/account")
@AuthPassport
public class AccountController {
    
    private final static Log log = LogFactory.getLog(AccountController.class);
//    @AuthPassport
    @RequestMapping(value="/login.do", method = {RequestMethod.GET})
    public String login(){
        UserService service = new UserService();
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
        
        return "login";
    }
    
}