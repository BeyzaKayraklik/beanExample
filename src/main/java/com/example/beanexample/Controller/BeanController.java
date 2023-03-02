package com.example.beanexample.Controller;


import com.example.beanexample.BeanConfig.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class BeanController {
//beanconfig inject edilir.
    //spring frameworkde @inject springde autowired yapısı
    // çağırıyo
    @Autowired
    BeanConfig beanConfig;


    //////////////////////
//    @Autowired
//    Logger LOG;
//    public BeanController() {
//        LOG.info("LOG İNFO METHOD!!");
//    }
/////////////////////////
    @GetMapping("/bean/beanDto")
    //url yapısı localhost/bean/beanDto
    @ResponseBody
    //html olmadan direkt ekranda göster
    public String getBeanDto(){
        return beanConfig.beanDto().toString();
        //.toString() == + " " konulduğunda da stringe cast eder
     }

    public static void main(String[] args) {
        BeanController beanController = new BeanController();
        System.out.println(beanController);

    }


}
