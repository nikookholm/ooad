package ooad.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

import ooad.shared.FieldVerifier;
import ooad.views.MainView;
import ooad.views.OpretReservationView;
import ooad.views.testView;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Ooad implements EntryPoint {
	
	private final CampingServiceAsync greetingService = GWT
			.create(CampingService.class);

	
	public void onModuleLoad() {
		
		
		
		RootPanel.get("main").add(new OpretReservationView() );
	
	}
}
