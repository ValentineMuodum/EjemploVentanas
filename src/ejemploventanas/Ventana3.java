/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploventanas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author vmuodum
 */
public class Ventana3 {
  private Scene scene;
    private VBox layout;
   private Button ira1=new Button();
     private Button ira2=new Button();
    public Ventana3() {
  

layout.getChildren().add(ira1);
layout.getChildren().add(ira2);
   scene=new Scene(layout,300,300);
   
    }

    

    public VBox getLayout() {
        return layout;
    }

    public Button getIra1() {
        return ira1;
    }

    public Button getIra2() {
        return ira2;
    }
   public void mostrar(Stage stage){
       stage.setTitle("Ventana 3");
       stage.setScene(scene);
       stage.show();
   }
}
