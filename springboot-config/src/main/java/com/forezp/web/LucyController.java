package com.forezp.web;

import com.forezp.bean.ConfigBean;
import com.forezp.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class LucyController {

    @Autowired
    ConfigBean configBean;
    @Autowired
    User user;

    @GetMapping("lucy")
    public String miya() {
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }
    @GetMapping("/user")
    public String user(){
        return user.getName()+user.getAge();
    }
}
