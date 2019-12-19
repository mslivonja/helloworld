package org.homelinux.slivonja;

import static org.apache.commons.lang3.StringUtils.isEmpty;

public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name) {
        String value = isEmpty(name)?"World":name;
        return "Hello " + value + "!";
    }
}
