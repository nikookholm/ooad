package ooad.views;

import ooad.client.Ooad;

import com.gargoylesoftware.htmlunit.javascript.host.Text;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.sun.java_cup.internal.runtime.Scanner;

public class OpretReservationView extends Composite {
	
	private  VerticalPanel vP , vP2;
	private HorizontalPanel hP;
	
		
    private Label createReservL,kundeInfoL, customerNameL, costumerEmailL, IDcustomerL, datoL, startDatoL, endDatoL,antalPersone,voksenL,børnL,hundL;
    private  DatePicker df, df2, calendar ;
    private CheckBox cb;
    private ListBox antlVoksenLB, antalBørnLB;
	private TextBox nameBox, idBox, emailBox, startBox, endBox, voksBox, børnBox;
	private Button voksB, børnB, okBtn, cancelBtn;
	private PopupPanel pup;
	private Text info;
	
	private Scanner scn;

	private FlexTable ft, ft2;
	
	private Ooad ooad;
	
	
	public OpretReservationView (){
		
		hP = new HorizontalPanel();
		vP = new VerticalPanel(); 
		vP2 = new VerticalPanel();
		
		ft = new FlexTable();
		ft2 = new FlexTable();
		cb = new CheckBox();
		df = new DatePicker();
		df2 = new DatePicker();
		calendar = new DatePicker();
		
		Image icon = new Image();
		pup = new PopupPanel();
		
		antlVoksenLB = new ListBox();
		antalBørnLB = new ListBox();
		okBtn = new Button("OK");
		cancelBtn = new Button("Annuller");
		
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
		
		nameBox  = new TextBox();
//		idBox = new TextBox();
		emailBox = new TextBox();
		startBox = new TextBox();
		endBox   = new TextBox();
		voksBox  = new TextBox();
		børnBox  = new TextBox();
		
		for ( int i =0 ;  i <=10;  i++){
			
			antlVoksenLB.addItem("" + i);
			antalBørnLB.addItem("" + i);
			
		}

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
		
		ft.setWidget(6, 0, df);
		
	
		ft.setWidget(6, 1, df2);
		
		
		ft.setWidget(7, 0, antalPersone);
		antalPersone.setStyleName("input-text");
		
		ft.setWidget(8, 0, voksenL);
		ft.setWidget(8, 1, børnL);
	
		ft.setWidget(9, 0, antlVoksenLB);
		ft.setWidget(9, 1, antalBørnLB);
		
		ft.setWidget(10, 0, hundL);
		ft.setWidget(10, 1, cb);
		
//		ft2.setWidget(0, 6, df);
		
		ft.setWidget(14, 0, cancelBtn);
		cancelBtn.setEnabled(true);
		cancelBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				
				ooad.onModuleLoad();
			}
		});
		
		ft.setWidget(14, 1, okBtn);
		okBtn.setEnabled(false);
		okBtn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				// her skal være en funktion som gammer alle kunde info og ønsker reservatione date i oadReservation
				
				
			}
		});
		
		
		vP.add(createReservL);
		vP.add(ft);
		
		vP2.add(ft2);
		
		hP.add(vP);
		hP.add(vP2);
		
		
		initWidget(hP);
	
		
	}
	
	

}
