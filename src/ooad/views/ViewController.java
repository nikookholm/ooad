package ooad.views;

import java.util.Date;

import ooad.client.CampingService;
import ooad.client.CampingServiceAsync;
import ooad.database.DALException;
import ooad.views.MainView;
import ooad.views.TopMenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class ViewController {
	
	 final CampingServiceAsync async = GWT
			.create(CampingService.class);
	
	public ViewController(){
		
	}
	
	
	public void show(Widget widget){
		RootPanel.get("main").clear();
		RootPanel.get("menu").clear();
		
		RootPanel.get("menu").add(new TopMenu(this));
		RootPanel.get("main").add(widget);
		
	}
	
	
	

}
