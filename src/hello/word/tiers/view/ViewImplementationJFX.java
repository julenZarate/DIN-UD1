/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.word.tiers.view;

import hello.word.tiers.controller.FXMLDocumentController;
import hello.word.tiers.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Julen Zarate
 */
public class ViewImplementationJFX extends Application implements View{

    /**
     * Static method
     */
    private static String greeting;

    @Override
    public void start(Stage stage) throws Exception {
        //Load FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        //Get Controller
        FXMLDocumentController fxController = loader.getController();
        //Pasar el greeting al controlador
        fxController.setGreeting(greeting);
        //Create Scene
        Scene scene = new Scene(root);
        //Set scene in Stage
        stage.setScene(scene);
        //Show Scene
        stage.show();
    }
    /**
     * Method show
     * @param greeting 
     */
    @Override
    public void showGreeting(String greeting) {
        ViewImplementationJFX.greeting = greeting;    
        launch(greeting);
    }
    @Override
    public void init(){
        this.greeting= getParameters().getRaw().get(0);
    }
   
    public void setGreeting(String greeting){
        this.greeting = greeting;
    }
}
