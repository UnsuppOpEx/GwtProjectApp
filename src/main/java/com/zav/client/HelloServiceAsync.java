package com.zav.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.zav.shared.User;

public interface HelloServiceAsync {
    void sayHello(User user, AsyncCallback<String> async);
}
