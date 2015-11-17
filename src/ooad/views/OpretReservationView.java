package ooad.views;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.ibm.icu.util.Calendar;

public class OpretReservationView extends Composite {
	
	private  VerticalPanel vP , vP2;
	private HorizontalPanel hP;
	
		
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
    private  DatePicker df ;
    private CheckBox cb;
    private ListBox antlVoksenLB, antalBørnLB;
	private TextBox nameBox, idBox, emailBox, startBox, endBox, voksBox, børnBox;
	private Button voksB, børnB;
	
	
	private FlexTable ft, ft2;
	
	
	public OpretReservationView (){
		
		hP = new HorizontalPanel();
	
	
		vP = new VerticalPanel(); 
		vP2 = new VerticalPanel();
		
		ft = new FlexTable();
		ft2 = new FlexTable();
		cb = new CheckBox();
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
		voksBox = new TextBox();
		børnBox = new TextBox();
		
		
	
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
//		ft.setWidget(5, 2, df);
		
		ft.setWidget(6, 0, antalPersone);
		
		ft.setWidget(7, 0, voksenL);
		ft.setWidget(7, 1, børnL);
	
		ft.setWidget(8, 0, antlVoksenLB);
		ft.setWidget(8, 1, antalBørnLB);
		
		ft.setWidget(9, 0, hundL);
		ft.setWidget(9, 1, cb);
		
		ft2.setWidget(0, 6, df);
	
		vP.add(createReservL);
		vP.add(ft);
		
		vP2.add(ft2);
		
		hP.add(vP);
		hP.add(vP2);
		
		
		initWidget(hP);
	
		
	}
	
	

}
