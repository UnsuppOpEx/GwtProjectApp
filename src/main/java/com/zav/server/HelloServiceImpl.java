package com.zav.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.zav.client.HelloService;
import com.zav.shared.User;

public class HelloServiceImpl extends RemoteServiceServlet implements HelloService {
    @Override
    public String sayHello(User user) {
        return "hello" + user.getName();
    }
}
