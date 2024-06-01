import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
    @Override 
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World JavaFXApplication");
        Label label= new Label("Hello, World!");
        Button button= new Button("Click Me!");
        button.setOnAction(e->label.setText("Hello, JavaFX!"));
        VBox vbox= new VBox(10, label, button);
        vbox.setStyle("-fx-padding: 10; -fx-alignment: center;");
        Scene scene= new Scene(vbox, 300, 200);primaryStage.setScene(scene);primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}