package ooad.views;

import org.w3c.dom.events.MouseEvent;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class testView extends Composite{

	VerticalPanel vp = new VerticalPanel();
	Label lb = new Label("Dette er et test view");
	Button bt = new Button("Tryk mig");
	
	public testView(){
		vp.add(lb);
		vp.add(bt);
		
	initWidget(vp);
	
	
	bt.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			lb.setText("Hey Amal, Views virker nu!, ARBEEEEJD");
			
		}
	});
	}
}
