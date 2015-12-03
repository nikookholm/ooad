package ooad.views;



import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import ooad.views.ViewController;


public class TopMenu extends Composite {

	ViewController vc;

	public TopMenu(final ViewController vc)
	{
		this.vc = vc;

		HorizontalPanel panel = new HorizontalPanel();

		Anchor createReservation	= new Anchor("Opret Reservation");
		Anchor findReservation      = new Anchor("Find Reservation");
		Anchor deleteReservation	= new Anchor("Slet Reservation");



		// Handler til at oprette reservationer
		ClickHandler createHandler = new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				vc.show(new OpretReservationView(null));		
			}
		};

		//  handlers til ikke implementerede views

		//			ClickHandler findHandler = new ClickHandler() {
		//				@Override
		//				public void onClick(ClickEvent event) {
		//					vc.show(new FindReservationView();		
		//				}
		//			};
		//			ClickHandler deleteHandler = new ClickHandler() {
		//				@Override
		//				public void onClick(ClickEvent event) {
		//					vc.show(new deleteReservationView();		
		//				}
		//			};




		panel.add(createReservation);
		createReservation.setStyleName("caption");
		createReservation.addClickHandler(createHandler);
		panel.add(findReservation);
		findReservation.setStyleName("caption");
		//			findReservation.addClickHandler(findHandler);
		panel.add(deleteReservation);
		deleteReservation.setStyleName("caption");
		//	deleteReservation.addClickHandler(deleteHandler);
		panel.add(new HTML("<br />"));




		initWidget(panel);

	}




}
