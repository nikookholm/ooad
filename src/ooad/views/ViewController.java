package ooad.views;

import ooad.client.CampingServiceAsync;
import ooad.views.MainView;
import ooad.views.TopMenu;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class ViewController {
	
	CampingServiceAsync async;
	
	public ViewController(CampingServiceAsync async){
		this.async = async;
	}
	
	public ViewController(){
	}
	
	public void show(Widget widget){
		RootPanel.get("main").clear();
		RootPanel.get("menu").clear();
		
		RootPanel.get("menu").add(new TopMenu(this));
		RootPanel.get("main").add(widget);
		
	}
	
	
	public CampingServiceAsync getAsync(){
		return async;
	}

}
