/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Infrastructure.Aspect.Service.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
/**
 * 用户服务模型
 * @author Shenghany
 * @date 2013-5-28
 */
public class UserService {

	private final static Log log = LogFactory.getLog(UserService.class);
	
	public User get(long id){
		if(log.isInfoEnabled()){
			log.info("getUser method . . .");
		}
		return new User();
	}
	
	public void save(User user){
		if(log.isInfoEnabled()){
			log.info("saveUser method . . .");
		}
	}
	
	public boolean delete(long id) throws Exception{
		if(log.isInfoEnabled()){
			log.info("delete method . . .");
			throw new Exception("spring aop ThrowAdvice演示");
		}
		return false;
	}
	
}