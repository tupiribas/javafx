package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {

	@FXML
	private Button btTeste;
	@FXML
	private Label lbTeste;

	@FXML
	public void onbtTesteAction() {
		if (lbTeste.getText() == "Ol� JavaFX!") {
			lbTeste.setText("Ol� mundo!");
		} else {
			lbTeste.setText("Ol� JavaFX!");
		}
	}
}
