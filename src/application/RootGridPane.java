package application;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class RootGridPane extends GridPane {

	Button btButton1, btLaden, btSpeichern; // Main Buttons
	Button btButton4, btButton5, btButton6, btButtonSieben, btButtonAcht; // FlowPane
	
	public RootGridPane() {
		initComponents();
		addComponents();
	}

	public void initComponents() {
		btButton1 = new Button("Button1");
			btButton1.setPrefSize(200, 200);
		btLaden = new Button("Laden-Button");
			btLaden.setPrefSize(200, 200);
		btSpeichern = new Button("Speichern-Button");
			btSpeichern.setPrefSize(200, 200);
	}
	
	public void addComponents() {
		add(btButton1, 0, 0);
		add(btSpeichern, 0, 1);
		add(btLaden, 1, 0);
	}

}
