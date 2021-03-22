package com.server.impl;

import com.server.TestServer;
import org.springframework.stereotype.Service;

@Service("testServer")
public class testImpl implements TestServer {

    @Override
    public String test() {
        return "Hello,IOC";
    }
}
