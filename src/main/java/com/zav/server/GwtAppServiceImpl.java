package com.zav.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.zav.client.GwtAppServiceIntf;
import com.zav.client.objects.User;
import com.zav.client.objects.UserResult;
import com.zav.shared.FieldValidator;


public class GwtAppServiceImpl extends RemoteServiceServlet implements GwtAppServiceIntf {

    public UserResult gwtAppCallServer(User user) throws IllegalArgumentException {
        if (!FieldValidator.isValidData(user.getName()) || !FieldValidator.isValidData(user.getPassword())) {
            throw new IllegalArgumentException("Имя должно быть больше трех символов");
        }

        UserResult userResult = new UserResult();
        userResult.setName(user.getName() + " server reply");
        userResult.setPassword(user.getPassword() + " server reply");

        return userResult;
    }
}
