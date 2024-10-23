package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EjemploFX extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		// Cargar el archivo FXML
		  FXMLLoader loader = new FXMLLoader(getClass().getResource("ejemplo.fxml"));
	        Parent root = loader.load();  // Cargamos el archivo FXML

	        primaryStage.setTitle("Ejemplo de ChoiceBox en JavaFX 21");
	        primaryStage.setScene(new Scene(root, 475, 625));
	        primaryStage.show();
    }
	
	
	public static void main(String[] args) {
		launch(args);
	}
}