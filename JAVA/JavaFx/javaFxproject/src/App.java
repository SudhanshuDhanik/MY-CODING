import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

   

    @Override
    public void start(Stage primaryStage) {
        Parent root=FXMLLoader.load(getClass().getResource("images1.fxml"));
        Scene scene=new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}

