package application;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Calculadora_IMCController {

	@FXML
	private Label etiqueta;
	@FXML
	private Slider slider;
	@FXML
	private TextField peso;
	@FXML
	private Label altura;
	@FXML
	private Label cm;
	@FXML
	private TextField altura_dato;
	@FXML
	private Button calcular_imc;
	@FXML
	private TextField resultado;
	@FXML
	private Label porcentaje;
	//vamos a intentar que ocupe todo lo que esta dentro de ese VBox
	
}
