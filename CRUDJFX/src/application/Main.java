package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Substituir esta linha por outra, para carregar o Main.fxml
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("/view/Main.fxml"));
			//AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/Main.fxml"));
			Scene scene = new Scene(root,820,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Projeto CRUD - JAVA UTD");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
