package com.zav.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.zav.shared.User;

@RemoteServiceRelativePath("hello")
public interface HelloService extends RemoteService {
    String sayHello(User user);
}
