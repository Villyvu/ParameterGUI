package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.util.Scanner;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample1.fxml"));
        primaryStage.setTitle("GUI");
        Scene scene = new Scene(root, 600, 600);
        root.requestFocus();
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void load(String[] args) {
        launch();

    }
}
