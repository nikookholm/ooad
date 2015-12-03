package ooad.views;

import ooad.client.CampingServiceAsync;
import ooad.views.ViewController;

import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {

	
	
	ViewController vc;

	public MainView(final ViewController vc)
	{
		this.vc = vc;

		VerticalPanel panel = new VerticalPanel();

		Anchor createReservation	= new Anchor("Opret Reservation");
		Anchor findReservation      = new Anchor("Find Reservation");
		Anchor deleteReservation	= new Anchor("Slet Reservation");




		ClickHandler createHandler = new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				vc.show(new OpretReservationView(null));		
			}
		};

//  Handlers til views der ikke er implementerede
		
//		ClickHandler findHandler = new ClickHandler() {
//			@Override
//			public void onClick(ClickEvent event) {
//				vc.loadFindView();		
//			}
//		};
//		ClickHandler deleteHandler = new ClickHandler() {
//			@Override
//			public void onClick(ClickEvent event) {
//				vc.loadDeleteView();		
//			}
//		};

	


		panel.add(createReservation);
		createReservation.setStyleName("caption");
		createReservation.addClickHandler(createHandler);
		panel.add(findReservation);
		findReservation.setStyleName("caption");
//		findReservation.addClickHandler(findHandler);
		panel.add(deleteReservation);
		deleteReservation.setStyleName("caption");
//		deleteReservation.addClickHandler(deleteHandler);
		panel.add(new HTML("<br />"));

		


	initWidget(panel);

}


}
