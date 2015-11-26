package ooad.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import ooad.views.MainView;
import ooad.views.ViewController;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Ooad implements EntryPoint {
	
	private final CampingServiceAsync greetingService = GWT
			.create(CampingService.class);

	ViewController vc;
	
	public void onModuleLoad() {
		
		vc = new ViewController();
		vc.show(new MainView(vc));
	
	}
}
