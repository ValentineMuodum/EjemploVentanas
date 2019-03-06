/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploventanas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author vmuodum
 */
public class EjemploVentanas extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Registrar la variable en el singleton
        Singleton singleton=Singleton.getSingleton();
        singleton.setStage(primaryStage);
        
        Modelo modelo=new Modelo();
        ControladorVentana1 ventana1=new ControladorVentana1(modelo);
        ventana1.mostrarVista();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
