/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Vishal Choday
 */
package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ourtodolist extends Application {

    public static void main(String[] the_array) {
        launch(the_array);
    }

    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            Parent the_origin_of_it = FXMLLoader.load(getClass().getResource("ourtodolist.fxml"));

            Scene its_location = new Scene(the_origin_of_it );

            primaryStage.setScene(its_location);
            primaryStage.show();
        } catch (IOException mbusa)
        {
            mbusa.printStackTrace();




        }
    }
}