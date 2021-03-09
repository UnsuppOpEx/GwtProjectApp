package com.zav.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.zav.client.objects.User;
import com.zav.client.objects.UserResult;

@RemoteServiceRelativePath("gwtAppService")
public interface GwtAppServiceIntf extends RemoteService {
    UserResult gwtAppCallServer(User data) throws IllegalArgumentException;
}
