/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploventanas;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author vmuodum
 */
public class Ventana2 {
    private Scene scene;
    
   private GridPane grid;
   private Text scenetitle;
    
   private Label name;
   private TextField nameTF;
    
   private Label lastNameLB;
   private TextField lastNameTF;
    
   private Text messageT;
    
   private Button Boton;
   private Button addBtn;
   private HBox hbBtn;
    
      Ventana2(){
      // Layout
      grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));
 
      // Ueberschrift
      scenetitle = new Text("Laura es fea");
      scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
      grid.add(scenetitle, 0, 0, 2, 1);
 
      // Vorname
      name = new Label("Usuario:");
      grid.add(name, 0, 1);
 
      nameTF = new TextField();
      grid.add(nameTF, 1, 1);
       
      // Nachname
      lastNameLB = new Label("Contraseña:");
      grid.add(lastNameLB, 0, 2);
 
      lastNameTF = new TextField();
      grid.add(lastNameTF, 1, 2);
 
      // Buttons
      addBtn = new Button("No hacer ni mierda");
      Boton = new Button("Ir a ventana 3");
 
      // Buttongruppe
      hbBtn = new HBox(10);
      hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
      hbBtn.getChildren().add(addBtn);
      hbBtn.getChildren().add(Boton);
      grid.add(hbBtn, 1, 4);
 
      // Meldung
      messageT = new Text();
      grid.add(messageT, 1, 6);
 
      scene = new Scene(grid, 300, 300);
   }
 
  public void mostrar(Stage stage){
stage.setTitle("Ventana2");
stage.setScene(scene);
stage.show();
}
 
   //solo crea getters de elementos que son modificados y / o dinámicos
   public TextField getNameTF() {
      return nameTF;
   }
 
 
   public TextField getNachnameTF() {
      return lastNameTF;
   }
 
 
   public Text getMessageT() {
      return messageT;
   }
 
   public Button getBoton() {
      return Boton;
   }
 
 
   public Button getAddBtn() {
      return addBtn;
   }
}
