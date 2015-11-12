package ooad.views;



import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {
	
	
	
	public MainView()
	{
	
		VerticalPanel panel = new VerticalPanel();
		
		Anchor addUser				= new Anchor("Opret bruger");
		Anchor updateUser			= new Anchor("Se og rediger brugere");
		Anchor addIngredient		= new Anchor("Opret ny råvare");
		Anchor updateIngredient		= new Anchor("Se og rediger råvarer");
		Anchor addProductBatch		= new Anchor("Opret ny produktbatch");
		Anchor listProductBatch		= new Anchor("Se alle produktbatches");
		Anchor listProductBatchComp = new Anchor("Se alle produktbatch komponenter");
		Anchor addRecept			= new Anchor("Opret recept");
		Anchor listRecepts			= new Anchor("Se alle recepter");
		Anchor addIngredientBatch 	= new Anchor("Opret råvarebatch");
		Anchor listIngredientBatch 	= new Anchor("Se alle råvarebatches");
		
		Label userCaption 		  	  = new Label("Brugeradministration");
		Label ingredientCaption	  	  = new Label("Råvare/ingredienser");
		Label productBatchCaption	  = new Label("Produktbatches");
		Label productBatchCompCaption = new Label("Produktbatch komponenter");
		Label receptCaption		  	  = new Label("Recepter");
		Label ingredientBatchCaption  = new Label("Råvarebatches");
		
		panel.add(addUser);
		ClickHandler addUserHandler = new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
							
			}
		};
		
		
		initWidget(panel);
		
	}
	
	
}
