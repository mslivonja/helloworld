package org.homelinux.slivonja;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class TestHelloService {

    private HelloService service;

    @Before
    public void setup(){
        service = new HelloServiceImpl();
    }

    @Test
    public void testEmptyHello(){
        assertThat(service.sayHello(null), is(equalTo("Hello World!")));
    }

    public void testHelloWithName(){
        assertThat(service.sayHello("John"), is(equalTo("Hello John!")));
    }
}
