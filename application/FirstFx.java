package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class FirstFx extends Application {

	public static void main(String[] args) {
			launch(args);

		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			//Adding control(button)
			Button bt1 = new Button("Click me");
			Button bt2 = new Button("Click me");
			Button bt3 = new Button("Click me");
			Button bt4 = new Button("Click me");
			Button bt5 = new Button("Click me");
			//we need to define the layout
			//FlowPane root = new FlowPane();
			GridPane name = new GridPane();
			//root.setSpacing(20);
			//we need to add control to layout
			name.add(bt1, 0, 0);
			name.add(bt2, 1, 1);
			name.add(bt3, 2, 2);
			/*root.getChildren().add(bt1);
			root.getChildren().add(bt2);
			root.getChildren().add(bt3);
			root.getChildren().add(bt4);
			root.getChildren().add(bt5);*/
			//we need to add this layout to a scene
			Scene sc = new Scene(name);
			//we need to add this scene to a stage
			primaryStage.setScene(sc);
			primaryStage.setTitle("First FX");
			primaryStage.setWidth(500);
			primaryStage.setHeight(500);
			//primaryStage.setFullScreen(true);
			primaryStage.show();
			
			
		}
	}



