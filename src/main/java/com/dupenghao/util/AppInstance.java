package com.dupenghao.util;

import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by 杜鹏豪 on 2022/8/25.
 */
public class AppInstance {
    private static ApplicationContext context;

    public static void setContext(ApplicationContext acontext){
        context=acontext;
    }

    public static ApplicationContext getContext(){
        ClassPathResource resource = new ClassPathResource("");
        return context;
    }
}
