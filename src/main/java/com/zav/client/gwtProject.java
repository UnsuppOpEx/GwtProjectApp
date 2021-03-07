package com.zav.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.zav.shared.Sex;
import com.zav.shared.User;


public class gwtProject implements EntryPoint {
    private HelloServiceAsync helloService = GWT.create(HelloService.class);

  public void onModuleLoad() {
      Button sendButton = new Button("Send");
      Label label = new Label("my label");
      sendButton.addStyleName("newStyle");

        RootPanel.get("mainPanel").add(sendButton);
        RootPanel.get("mainPanel").add(label);

        sendButton.addClickHandler(clickEvent -> {
            helloService.sayHello(new User("Anton", Sex.MALE), new AsyncCallback<String>() {
                @Override
                public void onFailure(Throwable throwable) {
                    label.setText("error");
                }

                @Override
                public void onSuccess(String s) {
                    label.setText(s);
                }
       });
    });
  }
}