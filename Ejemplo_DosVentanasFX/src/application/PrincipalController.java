package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PrincipalController {

	@FXML
	private Button buttonPress;

	@FXML
	private void initialize(){
	}

	//Método cuando se aprieta el botón
	public void pressedButton(ActionEvent event) throws IOException{

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Secundaria.fxml"));
        GridPane ventanaDos = (GridPane) loader.load();
        Stage ventana = new Stage();
        ventana.setTitle("Venta Dos");
        Scene scene = new Scene(ventanaDos);
        ventana.setScene(scene);
        ventana.show();
	}
}
