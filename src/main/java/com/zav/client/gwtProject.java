package com.zav.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;


public class gwtProject implements EntryPoint {

  public void onModuleLoad() {
      VerticalPanel verticalPanel = new VerticalPanel();
      HorizontalPanel mainPanel = new HorizontalPanel();
      Button sendButton = new Button("Send");
      Label label = new Label("Label");
      verticalPanel.add(sendButton);
      verticalPanel.add(label);
      mainPanel.add(verticalPanel);
        RootPanel.get("mainPanel").add(mainPanel);

        sendButton.addClickHandler(clickEvent -> label.setText("new Text"));

  }
}