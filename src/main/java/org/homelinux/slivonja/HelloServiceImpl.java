package org.homelinux.slivonja;

import static org.apache.commons.lang3.StringUtils.isEmpty;

public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name) {
        String value = name;

        if(name==null)
            value = "...";
        else if(isEmpty(name))
            value = "World";

        return "Hello " + value + "!";
    }
}
