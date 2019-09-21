package com.aragoj.ui;

import com.aragoj.utils.Translator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//import org.opencv.core.Core;

public class MainApplication extends Application {

    private static Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  throws Exception {
        StackPane root = FXMLLoader.load(getClass().getResource("/fmxl/MainDialog.fxml"), Translator.getBundle());
        //Scene scene = new Scene(root,800,600);
        //final ObservableList<String> stylesheets = scene.getStylesheets();
        //stylesheets.addAll(getClass().getResource("/css/MainApplication.css").toExternalForm());
        //stage = primaryStage;
        //stage.getIcons().add(new Image(MainApplication.class.getResourceAsStream("/images/icon.png")));
        //primaryStage.setTitle("AragoJ");
        //primaryStage.setScene(scene);
        //primaryStage.show();
    }

    public static void setStageName(String name){
        stage.setTitle(name);
    }
}
