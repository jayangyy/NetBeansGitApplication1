/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jayang
 */
public class LogService {

    ///实例化日志类
  ///  private static Logger logger = LogManager.getLogger(LogService.class);
   private static Log log = LogFactory.getLog(LogService.class);
   
    public static Log getLog(Class type) {
       /// log = LogFactory.getLog(type);
        return log;
    }
    public static Log getLog() {
        log = LogFactory.getLog(LogService.class);
        return log;
    }
    public static void addLogToDb(Log log) {
    }
//
//    public static void main(String[] args) {
//        log.error("ERROR3333333");
//        log.debug("DEBUG");
//        log.warn("WARN");
//        log.info("INFO");
//        log.trace("TRACE");
//       System.out.println(log.getClass());
//    }
}
