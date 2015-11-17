package ooad.views;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

public class OpretReservationView extends Composite {
	
	private  VerticalPanel vP ;
		
    private Label createReservL, 
    			  kundeInfoL,
    			  customerNameL,
    			  costumerEmailL ,
    			  IDcustomerL,
    			  datoL ,
    			  startDatoL ,
    			  endDatoL ,
    			  antalPersone,
    			  voksenL,
    			  børnL,
    			  hundL
    			  ;
    DatePicker df ;
	private ListBox antlVoksenLB, antalBørnLB;
	private TextBox nameBox, idBox, emailBox, startBox, endBox;
	
	private FlexTable ft;
	
	public OpretReservationView (){
		
		vP = new VerticalPanel(); 
		
		ft = new FlexTable();
		
		df = new DatePicker();
		
		antlVoksenLB = new ListBox();
		antalBørnLB = new ListBox();
		
		createReservL = new Label("Opret reservation");
		kundeInfoL = new Label ("Information om kunden");
		customerNameL = new Label ("Navn");
		costumerEmailL = new Label( "email");
//		IDcustomerL = new Label ("ID");
		datoL = new Label("reservation dato");
		startDatoL = new Label("Start");
		endDatoL = new Label ("slut");
		antalPersone = new Label("antal personer:");
		voksenL = new Label("Voksen");
		børnL = new Label(" Børn");
		hundL = new Label("Pet");
		
		nameBox = new TextBox();
//		idBox = new TextBox();
		emailBox = new TextBox();
		startBox = new TextBox();
		endBox = new TextBox();
		
	
		createReservL.setStyleName("caption");
		
		ft.setWidget(0, 0, kundeInfoL);
		
//		ft.setWidget(1, 0, IDcustomerL);
		ft.setWidget(1, 0, customerNameL);
		ft.setWidget(1, 1, costumerEmailL);
		
//		ft.setWidget(2, 0, idBox);
		ft.setWidget(2, 0, nameBox);
		ft.setWidget(2, 1, emailBox);
		
		ft.setWidget(3, 0, datoL);
		
		ft.setWidget(4, 0, startDatoL);
		ft.setWidget(4, 1, endDatoL);
		
		ft.setWidget(5, 0, startBox);
		ft.setWidget(5, 1, endBox);
		ft.setWidget(5, 2, df);
		
		
		
		
		vP.add(createReservL);
		vP.add(ft);
		
		initWidget(vP);
	
		
	}
	
	

}
