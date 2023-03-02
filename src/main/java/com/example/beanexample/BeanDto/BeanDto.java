package com.example.beanexample.BeanDto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
//lombok logger field oluşturur
//valid classlar ve enumlarda kullanılabilir.

@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;

    public void initialBeanMethod(){
        log.info("before bean!!");
    }

    public void destroyBeanMethod(){
        log.info("after bean !! ") ;
        System.err.println("bean bitikten sonra çalışıcak methot");
    }
}
