package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
public class UIControls extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage arg) throws Exception {
		Label lb = new Label("Enter your name");//created label
		//lb.setText("Something");
		lb.setTextFill(Color.RED);
		lb.setFont(new Font("Times New Roman",32));
		lb.setTextAlignment(TextAlignment.RIGHT);
		//we need add it to layout
		HBox root = new HBox();
		root.getChildren().add(lb);
		Scene sc = new Scene(root);
		arg.setScene(sc);
		arg.setWidth(500);
		arg.setHeight(500);
		arg.show();
		
		
	}

}
