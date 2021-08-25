package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;

	@FXML
	private Label labelResult;

	@FXML
	private Button btSun;
	
	@FXML
	private Button btSub;
	
	@FXML
	private Button btMult;

	@FXML
	private Button btDiv;
	
	public void calculateSum() {
		try {
			Locale.setDefault(Locale.US);
			double value1 = Double.parseDouble(txtNumber1.getText());
			double value2 = Double.parseDouble(txtNumber2.getText());
			double sum = value1 + value2;
			labelResult.setText(String.format("%.2f", sum));
		}
		catch (NumberFormatException e) {
			labelResult.setText("ERROR");
			Alerts.showAlert("Error cod.:01", null, "Try typing a number like: -3, -2, -1, 0, 1, 2, 3"
					, AlertType.ERROR);
		}
	}
	
	public void calculateSub() {
		try {
			Locale.setDefault(Locale.US);
			double value1 = Double.parseDouble(txtNumber1.getText());
			double value2 = Double.parseDouble(txtNumber2.getText());
			double sub = value1 - value2;
			labelResult.setText(String.format("%.2f", sub));
		}
		catch (NumberFormatException e) {
			labelResult.setText("ERROR");
			Alerts.showAlert("Error cod.:02", null, "Try typing a number like: -3, -2, -1, 0, 1, 2, 3"
					, AlertType.ERROR);
		}
	}
	
	public void calculateMult() {
		try {
			Locale.setDefault(Locale.US);
			double value1 = Double.parseDouble(txtNumber1.getText());
			double value2 = Double.parseDouble(txtNumber2.getText());
			double mult = value1 * value2;
			labelResult.setText(String.format("%.2f", mult));
		}
		catch (NumberFormatException e) {
			labelResult.setText("ERROR");
			Alerts.showAlert("Error cod.:03", null, "Try typing a number like: -3, -2, -1, 0, 1, 2, 3"
					, AlertType.ERROR);
		}
	}
	
	public void calculateDiv() {
		try {
			Locale.setDefault(Locale.US);
			double value1 = Double.parseDouble(txtNumber1.getText());
			double value2 = Double.parseDouble(txtNumber2.getText());
			double div = value1 / value2;
			labelResult.setText(String.format("%.2f", div));
		}
		catch (NumberFormatException e) {
			labelResult.setText("ERROR");
			Alerts.showAlert("Error cod.:04", null, "Try typing a number like: -3, -2, -1, 0, 1, 2, 3"
					, AlertType.ERROR);
		}
	}

}