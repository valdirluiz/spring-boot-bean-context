package com.valdirluiz.app.interactors;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ServiceOne {

    public void execute(){
        ApplicationContext springContext = ApplicationContextUtils.getApplicationContext();
        ServiceTwo bean = springContext.getBean(ServiceTwo.class);
        bean.execute();
    }

}
