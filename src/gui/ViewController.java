package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Person> comboBoxPerson;

	private ObservableList<Person> obsListPerson;

	@FXML
	private Button btAll;

	@FXML
	public void onBtAllAction() {
		for (Person person : obsListPerson) {
			System.out.println(person);
		}
	}

	@FXML
	public void onComboBoxPersonalization() {
		System.out.println(comboBoxPerson.getValue());
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(new Person(1, "Tupi", "tupi@hotmail.com"));
		listPerson.add(new Person(2, "Lara Guedes Ribas", "laraguedes@gmail.com"));
		listPerson.add(new Person(3, "Edânia Guedes Ribas", "edivaniaRi@outlook.com"));
		listPerson.add(new Person(4, "Tupiraci de Andrade Ribas", "tupiracyRibas@hotmail.com"));
		obsListPerson = FXCollections.observableArrayList(listPerson);
		comboBoxPerson.setItems(obsListPerson);

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			};
		};
		comboBoxPerson.setCellFactory(factory);
		comboBoxPerson.setButtonCell(factory.call(null));

	}

}