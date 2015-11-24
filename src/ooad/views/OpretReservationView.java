package ooad.views;

import java.util.Date;

import ooad.client.Ooad;

import com.google.gwt.aria.client.AlertRole;
import com.google.gwt.aria.client.AlertdialogRole;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DatePicker;



public class OpretReservationView extends Composite {

	private  VerticalPanel vPanel1 , vPanel2;
	private HorizontalPanel hPanel;

	boolean nameboxCheck = false, emailBoxCheck = false, startBoxCheck = false;
	private Label createReservL,kundeInfoL, customerNameL, costumerEmailL, produktL, datoL, startDatoL, endDatoL,antalPersone,voksenL,børnL,ekstraPersonL;
	private final DatePicker calendar1, calendar2 ;
	private ListBox antlVoksenLB, antalBørnLB, produktList, proType, Xman;
	private TextBox nameBox, emailBox, startBox, endBox;
	private Button voksB, børnB, okBtn, cancelBtn;
	private Image icon;




	private FlexTable ft, ft2;
	private Ooad ooad;


	public OpretReservationView (){

		hPanel = new HorizontalPanel();
		vPanel1 = new VerticalPanel(); 
		vPanel2 = new VerticalPanel();

		ft = new FlexTable();
		ft2 = new FlexTable();
		calendar1 = new DatePicker();
		calendar2 = new DatePicker();


		icon = new Image();
//		icon.getElement().getStyle().setBackgroundImage("http://icons.iconarchive.com/icons/custom-icon-design/pretty-office-7/48/Calendar-icon.png");
		


		antlVoksenLB = new ListBox();
		antalBørnLB = new ListBox();
		produktList = new ListBox();
		proType = new ListBox();
		Xman = new ListBox();
		


		okBtn = new Button("OK");
		cancelBtn = new Button("Annuller");

		createReservL = new Label("Opret reservation");
		kundeInfoL = new Label ("Information om kunden");
		customerNameL = new Label ("Navn");
		costumerEmailL = new Label( "email");
		datoL = new Label("reservation dato (dd-mm-åå)");
		startDatoL = new Label("Start");
		endDatoL = new Label ("slut");
		antalPersone = new Label("antal personer:");
		voksenL = new Label("Voksen");
		børnL = new Label(" Børn");
		ekstraPersonL = new Label("pr. ekstra person 100,00kr/døgen");
		produktL = new Label("valg campingpladsen: ");


		nameBox  = new TextBox();
		emailBox = new TextBox();
		startBox = new TextBox();
		endBox   = new TextBox();

		for ( int i =0 ;  i <=10;  i++){
			antlVoksenLB.addItem("" + i);
			antalBørnLB.addItem("" + i);
		}
		Xman.addItem("0");
		Xman.addItem("1");
		Xman.addItem("2");


		produktList.addItem("Camping Vogn");
		produktList.addItem("Telt");
		produktList.addItem("Hytter");

		ft.setWidget(0, 0, kundeInfoL);
		kundeInfoL.setStyleName("input-text");

		ft.setWidget(1, 0, customerNameL);
		ft.setWidget(1, 1, costumerEmailL);

		ft.setWidget(2, 0, nameBox);
		ft.setWidget(2, 1, emailBox);

		ft.setWidget(3, 0, datoL);
		datoL.setStyleName("input-text");

		ft.setWidget(4, 0, startDatoL);
		ft.setWidget(4, 1, endDatoL);

		ft.setWidget(5, 0, startBox);
		ft.setWidget(5, 1, endBox);
		ft.setWidget(5, 3, icon);

		ft.setWidget(6, 0, calendar1);

		calendar1.addValueChangeHandler(new ValueChangeHandler<Date>(){

			@Override
			public void onValueChange(ValueChangeEvent<Date> event) {

				DateTimeFormat fmt = DateTimeFormat.getFormat( "dd-MM-yyyy");
				Date date = event.getValue();

				String dateString = fmt.format(date);

				startBox.setText(dateString);
				calendar1.setVisible(false);
			}

		});

		calendar1.setVisible(false);

		ft.setWidget(6, 1, calendar2);

		calendar2.addValueChangeHandler(new ValueChangeHandler<Date>(){

			@Override
			public void onValueChange(ValueChangeEvent<Date> event) {

				DateTimeFormat fmt = DateTimeFormat.getFormat( "dd-MM-yyyy");
				Date date = event.getValue();

				String dateString = fmt.format(date);

				endBox.setText(dateString);
				calendar2.setVisible(false);
			}

		});
		calendar2.setVisible(false);

		icon.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				calendar1.setVisible(true);
				calendar2.setVisible(true);

			}
		});

		ft.setWidget(7, 0, antalPersone);
		antalPersone.setStyleName("input-text");

		ft.setWidget(8, 0, voksenL);
		ft.setWidget(8, 1, børnL);

		ft.setWidget(9, 0, antlVoksenLB);
		ft.setWidget(9, 1, antalBørnLB);

		ft.setWidget(11, 0, produktL);
		produktL.setStyleName("input-text");
		ft.setWidget(12, 0, produktList);

		produktList.addClickHandler((ClickHandler) new listnerCheckList());


		ft.setWidget(12, 1, proType);
		
		ft.setWidget(13, 0, ekstraPersonL);
		ft.setWidget(13, 1, Xman);
		Xman.setEnabled(false);
		proType.addClickHandler((ClickHandler) new listnerProdType());
		
		ft.setWidget(14, 0, cancelBtn);
		cancelBtn.setEnabled(true);

		cancelBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("menu").clear();
				RootPanel.get("main").clear();
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

		createReservL.setStyleName("caption");
		vPanel1.add(createReservL);

		createReservL.getAbsoluteTop();

		//
		//
		//		ft.getCellFormatter().setWidth(0, 0, "50px");
		//		ft.getCellFormatter().setWidth(0, 1, "50px");
		//		ft.getCellFormatter().setWidth(10,1, "10px");

		vPanel1.add(ft);

//		Image icon2 = new Image("ooad.image/calendar23.png");


//		ft2.setWidget(0, 0, icon2 );

		vPanel2.add(ft2);

		hPanel.add(vPanel1);
		hPanel.add(vPanel2);

		nameBox.addKeyUpHandler(new custmerName());
		emailBox.addKeyUpHandler(new emailBox());
		startBox.addKeyUpHandler(new date());
		endBox.addKeyUpHandler(new date());
		initWidget(hPanel);

	}

	private class custmerName implements KeyUpHandler{
		public void onKeyUp(KeyUpEvent event) {

			if(!check.kundeName(nameBox.getText())){
				nameBox.setStyleName("gwt-TextBox-invalidEntry");
				nameboxCheck = false;

			}
			else{
				nameBox.removeStyleName("gwt-TextBox-invalidEntry");
				nameboxCheck = true;
				okButtonEnabler();
			}

		}
	}

	private class date implements KeyUpHandler{

		@Override
		public void onKeyUp(KeyUpEvent event) {
			if (!check.dateFormate(startBox.getText())){

				startBox.setStyleName("gwt-TextBox-invalidEntry");
				startBoxCheck = false;
			}
			else {
				startBox.removeStyleName("gwt-TextBox-invalidEntry");
				startBoxCheck = true;
				okButtonEnabler();
			}
			if (!check.dateFormate(endBox.getText())){

				endBox.setStyleName("gwt-TextBox-invalidEntry");
				startBoxCheck = false;
			}
			else {
				endBox.removeStyleName("gwt-TextBox-invalidEntry");
				startBoxCheck = true;
				okButtonEnabler();
			}



		}


	}
	private class emailBox implements KeyUpHandler{

		public void onKeyUp(KeyUpEvent event) {

			if (!check.emailsSnabelAandDot(emailBox.getText())){

				emailBox.setStyleName("gwt-TextBox-invalidEntry");
				emailBoxCheck = false;
			}
			else {
				emailBox.removeStyleName("gwt-TextBox-invalidEntry");
				emailBoxCheck = true;
				okButtonEnabler();
			}


		}

	}
	public void okButtonEnabler(){
		if(nameboxCheck){
			okBtn.setEnabled(true);
		}
		else okBtn.setEnabled(false);

	}

	private class  listnerCheckList implements ClickHandler{


		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			if(produktList.isItemSelected(0) == true){
				proType.clear();
				proType.addItem(" plads <= 110m\u00B2");
				proType.addItem("plads > 110\u00B2");
			} else if ( produktList.isItemSelected(1) == true){
				proType.clear();
				proType.addItem("hund tillad");
				proType.addItem("hund ikke tillad");


			}else if ( produktList.isItemSelected(2) == true){
				proType.clear();
				proType.addItem("lille hytter til 2 personer");
				proType.addItem("stor hytter til 2 personer");
				proType.addItem("hytter til 4 personer");
				proType.addItem("luksus hytter til 4 personer (max.6 personer)");
				proType.addItem("luksus hytter med tagtrrasen til 4 personer"
						+ "(max.6 personer)");
				
			}

		}


	}
	private class listnerProdType implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			if ((proType.isItemSelected(3) == true) | (proType.isItemSelected(4) == true)){
				Xman.setEnabled(true);
				
			}
		}
		
	}


}
