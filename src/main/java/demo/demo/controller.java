package demo.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class controller {
    
   @RequestMapping("m")
   public static String myMethod(){
    return "<h1>coding is fun</h1>";
   }

   @GetMapping("process-form")
   public static String getData(@RequestParam int n1,@RequestParam int n2) {
       int res=n1+n2;
       return "Result = " + res;

   }
   
    
    
}
