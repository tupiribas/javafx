package gui;

import java.util.Locale;

import javafx.fxml.FXML;
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
		Locale.setDefault(Locale.US);
		double value1 = Double.parseDouble(txtNumber1.getText());
		double value2 = Double.parseDouble(txtNumber2.getText());
		double sum = value1 + value2;
		labelResult.setText(String.format("%.2f", sum));;
	}
	
	public void calculateSub() {
		Locale.setDefault(Locale.US);
		double value1 = Double.parseDouble(txtNumber1.getText());
		double value2 = Double.parseDouble(txtNumber2.getText());
		double sub = value1 - value2;
		labelResult.setText(String.format("%.2f", sub));
	}
	
	public void calculateMult() {
		Locale.setDefault(Locale.US);
		double value1 = Double.parseDouble(txtNumber1.getText());
		double value2 = Double.parseDouble(txtNumber2.getText());
		double mult = value1 * value2;
		labelResult.setText(String.format("%.2f", mult));
	}
	
	public void calculateDiv() {
		Locale.setDefault(Locale.US);
		double value1 = Double.parseDouble(txtNumber1.getText());
		double value2 = Double.parseDouble(txtNumber2.getText());
		double div = value1 / value2;
		labelResult.setText(String.format("%.2f", div));
	}

}