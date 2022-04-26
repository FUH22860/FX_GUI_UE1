package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
	public void start(Stage primaryStage) {
		try {
			RootGridPane root = new RootGridPane();
			Scene scene = new Scene(root, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Erstes Fenster");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
