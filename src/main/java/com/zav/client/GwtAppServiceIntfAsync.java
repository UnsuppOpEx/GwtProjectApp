package com.zav.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.zav.client.objects.User;
import com.zav.client.objects.UserResult;

public interface GwtAppServiceIntfAsync {
    void gwtAppCallServer(User data, AsyncCallback<UserResult> async);
}
