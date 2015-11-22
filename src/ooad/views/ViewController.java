package ooad.views;

import ooad.views.MainView;
import ooad.views.TopMenu;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class ViewController {

	
	public void show(Widget widget){
		RootPanel.get("main").clear();
		RootPanel.get("menu").clear();
		
		RootPanel.get("menu").add(new TopMenu(this));
		RootPanel.get("main").add(widget);
		
	}

}
