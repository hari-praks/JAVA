package javaprogram;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Setup extends Application{

	public static void main(String[] args) {

			launch(args);

		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			//Adding control(button)
			Button bt1 = new Button("Click me");
			//we need to define the layout
			HBox root = new HBox();
			//we need to add control to layout
			root.getChildren().add(bt1);
			//we need to add this layout to a scene
			Scene sc = new Scene(root);
			//we need to add this scene to a stage
			primaryStage.setScene(sc);
			primaryStage.show();
			
		}

	}

