package com.example.beanexample.BeanConfig;


import com.example.beanexample.BeanDto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    //proje açılır açılmaz her şey dahil olsun ise
    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    //beandto içerisinde bean initial methot adları, destroy bittikten sonra
    @Scope("singleton")
    //proje başlarken init veya dd olarak çalışır projeyle başlayıp biter
//    @Scope("request")
    //sadece istek boyunca çalışır
    //session oturum boyunca çalışır.

        public BeanDto beanDto(){
            return BeanDto.builder()
                    .id(0L).beanName("bean name")
                    .beanData("bean data")
                    .build();
            //id ye Long verildiği için 0l

        }
}
