package ooad.views;

import java.util.Date;

import ooad.client.Ooad;
import sun.font.TextLabel;

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
	private Label børn2L,voksen2L,endDato2L,startDato2L,email2L,name2L, createReservL,kundeInfoL, customerNameL, costumerEmailL, produktL, datoL, startDatoL, endDatoL,antalPersone,voksenL,børnL,ekstraPersonL;
	private final DatePicker calendar1, calendar2 ;
	private ListBox antlVoksenLB, antalBørnLB, produktList, proType, Xman;
	private TextBox nameBox, emailBox, startBox, endBox;
	private Button voksB, børnB, okBtn, cancelBtn;
	private Label beløb1, beløb2, name2TL, email2TL,startDato2TL,endDato2TL,voksen2TL, børn2TL, camp2TL1, camp2LT2,camp2LT3;





	private FlexTable ft, ft2;
	private Ooad ooad;
	private ViewController vc;




	public OpretReservationView (){

		hPanel = new HorizontalPanel();
		vPanel1 = new VerticalPanel(); 
		vPanel2 = new VerticalPanel();
		ooad = new Ooad();
		vc = new ViewController();

		ft = new FlexTable();
		ft2 = new FlexTable();
		
		calendar1 = new DatePicker();
		calendar2 = new DatePicker();


		Image icon = new Image("http://icons.iconarchive.com/icons/custom-icon-design/pretty-office-7/48/Calendar-icon.png");		


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
		name2L = new Label("Navn: ");
		name2TL = new Label();
		email2TL =  new Label();
		startDato2TL =  new Label();
		endDato2TL = new Label();
		voksen2TL  = new Label();
		børn2TL  = new Label();
		camp2TL1  = new Label();
		camp2LT2  = new Label();
		camp2LT3  = new Label();
		børn2L  = new Label("antal af børne");
		voksen2L  = new Label("antl af voksne");
		endDato2L  = new Label("slut dato:");
		startDato2L  = new Label("start dato:");
		email2L  = new Label("email");
		beløb1 = new Label("Beløb:");
		beløb2  = new Label();
		

		
		


		nameBox  = new TextBox();
		emailBox = new TextBox();
		startBox = new TextBox();
		endBox   = new TextBox();

		for ( int i = 0 ;  i <= 10;  i++){
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
				startDato2TL.setText(dateString);
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
				endDato2TL.setText(dateString);
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
//				RootPanel.get("menu").clear();
//				RootPanel.get("main").clear();
				vc.show(new OpretReservationView());
				
//				ooad.onModuleLoad();
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


		vPanel1.add(ft);
		
		
		
		
//		################################################
//		alt som tilknyt til tabel 2
		
		
		
		Image icon2 = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Kalundborgs_v%C3%A5ben.png/115px-Kalundborgs_v%C3%A5ben.png");
		ft2.setWidget(0, 0, icon2);
		
		ft2.setWidget(1, 0, name2L);
		ft2.setWidget(1, 1, name2TL);
		
		ft2.setWidget(2, 0, email2L);
		ft2.setWidget(2, 1, email2TL);
		
		ft2.setWidget(3, 0, startDato2L);
		ft2.setWidget(3, 1, startDato2TL);
		
		ft2.setWidget(4, 0, endDato2L);
		ft2.setWidget(4, 1, endDato2TL);
		
		ft2.setWidget(5, 0, voksen2L);
		ft2.setWidget(5, 1, voksen2TL);
		
		ft2.setWidget(6, 0, børn2L);
		ft2.setWidget(6, 1, børn2TL);
		
		ft2.setWidget(7, 0, camp2TL1);
		ft2.setWidget(7, 0, camp2LT2);
		ft2.setWidget(7, 0, camp2LT3);
		
		
		
		

		vPanel2.add(ft2);

		hPanel.add(vPanel1);
		hPanel.add(vPanel2);

		nameBox.addKeyUpHandler(new custmerName());
		emailBox.addKeyUpHandler(new emailBox());
		emailBox.addKeyUpHandler(new custmerName());
		
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
			
			name2TL.setText(nameBox.getText());
			email2TL.setText(emailBox.getText());
			
			

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
				proType.addItem("lille hytte til 2 personer");
				proType.addItem("stor hytte til 2 personer");
				proType.addItem("hytte til 4 personer");
				proType.addItem("luksus hytte (4 per.)");
				proType.addItem("luksus hytte m/tagterasse (4 per.)");
				
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
