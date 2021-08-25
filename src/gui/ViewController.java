package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {

	@FXML
	private Button btTeste;
	@FXML
	private Label lbTeste;

	@FXML
	public void onbtTesteAction() {
		if (lbTeste.getText() == "Olá JavaFX!") {
			lbTeste.setText("Olá mundo!");
		} 
		else {
			lbTeste.setText("Olá JavaFX!");
		}
	}
	
	@FXML
	public void onbtTestActionAlert() {
		Alerts.showAlert("Alert!", null, "Bom dia sol!", AlertType.INFORMATION);
	}
}
