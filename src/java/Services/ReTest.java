/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Infrastructure.common.unilities.ReflectionUtil;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 *
 * @author Jayang
 */
public class ReTest {
    public void Test()
    {
//                   Type t = this.getClass().getDeclaredField("list1").getGenericType();  
//        if (ParameterizedType.class.isAssignableFrom(t.getClass())) {              
//            for (Type t1:((ParameterizedType)t).getActualTypeArguments()) {          
//                System.out.print(t1 + ",");          
//            }          
//            System.out.println();          
//        } 
//        
        
          //model.getClass()
//      Class<?> tttt=   ReflectionUtil.getClass(model.getClass());
//        Type superclassType = getClass().getGenericSuperclass();
//    if (!ParameterizedType.class.isAssignableFrom(superclassType.getClass())) {
//       
//    }
//        Type _type=((ParameterizedType)superclassType).getActualTypeArguments()[0];
//        ParameterizedType parameterizedType = (ParameterizedType)this.getClass().getGenericSuperclass(); 
//
//         model= (T)(parameterizedType.getActualTypeArguments()[0]); 
        
        
     Field[] fs = LogService.class.getDeclaredFields(); // 得到所有的fields  
  
     int i=0;
for(Field f : fs)   
{   
    Class fieldClazz = f.getType(); // 得到field的class及类型全路径  
  
    if(fieldClazz.isPrimitive())  continue;  //【1】 //判断是否为基本类型  
  
   /// if(fieldClazz.getName().startsWith("java.lang")) continue; //getName()返回field的类型全路径；  
  Type fc1 = f.getGenericType();
fc1.getClass().getName();
  if(i==2)
  {
       if(fc1 instanceof ParameterizedType) // 【3】如果是泛型参数的类型   
            { 
         ParameterizedType pt1 = (ParameterizedType) fc1;  
  
                   Class genericClazz1 = (Class)pt1.getActualTypeArguments()[0]; //【4】 得到泛型里的class类型对象。  
       }
  }
    i++;
    if(fieldClazz.isAssignableFrom(List.class)) //【2】  
    {   
             Type fc = f.getGenericType(); // 关键的地方，如果是List类型，得到其Generic的类型  
  
             if(fc == null) continue;  
  
             if(fc instanceof ParameterizedType) // 【3】如果是泛型参数的类型   
            {   
                   ParameterizedType pt = (ParameterizedType) fc;  
  
                   Class genericClazz = (Class)pt.getActualTypeArguments()[0]; //【4】 得到泛型里的class类型对象。  
  
                  // m.put(f.getName(), genericClazz);  
  
                  /// Map<String, Class> m1 = prepareMap(genericClazz);  
  
                  /// m.putAll(m1);   
             }   
      }   
}  
    }
}
