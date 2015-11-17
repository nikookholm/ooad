package ooad.views;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class OpretReservationView extends Composite {
	
	private VerticalPanel vP = new VerticalPanel();
		
	private Label createReservL = new Label("Opret reservation");
	
	private Label kundeInfoL = new Label ("Information om kunden");
	private Label customerNameL = new Label ("Navn");
	private Label costumerEmailL = new Label( "email");
	private Label IDcustomerL = new Label ("ID");
	
	private Label datoL = new Label("reservation dato");
	private Label startDatoL = new Label("Start");
	private Label endDatoL = new Label ("slut");
		
	private TextBox nameBox = new TextBox();
	private TextBox idBox = new TextBox();
	private TextBox emailBox = new TextBox();
	
	private TextBox startBox = new TextBox();
	private TextBox endBox = new TextBox();
	
	FlexTable ft; 
	
	public OpretReservationView (){
			
		
		 
		vP.add(createReservL);
		
		createReservL.setStyleName("caption");
		
		ft.setWidget(0, 0, kundeInfoL);
		
		ft.setWidget(1, 0, IDcustomerL);
		ft.setWidget(1, 1, customerNameL);
		ft.setWidget(1, 2, costumerEmailL);
		
		ft.setWidget(2, 0, idBox);
		ft.setWidget(2, 1, nameBox);
		ft.setWidget(2, 2, emailBox);
		
		ft.setWidget(3, 0, datoL);
		
		ft.setWidget(4, 0, startDatoL);
		ft.setWidget(4, 1, endDatoL);
		
		ft.setWidget(5, 0, startBox);
		ft.setWidget(5, 1, endBox);
		
		vP.add(ft);
		initWidget(vP);
	
		
	}
	
	

}
