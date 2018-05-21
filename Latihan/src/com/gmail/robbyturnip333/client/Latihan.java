package com.gmail.robbyturnip333.client;

import com.gmail.robbyturnip333.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class Latihan implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Image iconUser=new Image("Images/user.png");
		Image iconPass=new Image("Images/pass.png");
		iconUser.setWidth("30px");
		iconPass.setWidth("30px");
			Button in=new Button("Login");
			Button write=new Button("Logout");
			in.setStyleName("aku");
		TextBox tuser=new TextBox();
		PasswordTextBox tpass=new PasswordTextBox();
		tuser.getElement().setPropertyString("placeholder", "Username");
		tpass.getElement().setPropertyString("placeholder", "Password");
		RootPanel.get("icon_user").add(iconUser);
		RootPanel.get("icon_pass").add(iconPass);
		RootPanel.get("user").add(tuser);
		RootPanel.get("pass").add(tpass);
		RootPanel.get("login").add(in);
		in.addClickHandler(new ClickHandler() {
	        @Override
	        public void onClick(ClickEvent event) {
	        	if(tuser.getValue()=="Robby") {
	            Window.alert("Hubla");
	        	}
	        	else {
	        		Window.alert("Jancuk");
	        	}

	        }
	    });
		
	}
  
}
