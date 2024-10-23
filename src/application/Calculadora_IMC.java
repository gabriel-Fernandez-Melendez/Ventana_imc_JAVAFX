package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculadora_IMC extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		// Cargar el archivo FXML
		  FXMLLoader loader = new FXMLLoader(getClass().getResource("Calculadora_IMC.fxml"));
	        Parent root = loader.load();  // Cargamos el archivo FXML

	        primaryStage.setTitle("Calculadora IMC");
	        primaryStage.setScene(new Scene(root, 600, 200));
	        primaryStage.show();
    }
	
	
	public static void main(String[] args) {
		launch(args);
	}
}