/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploventanas;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author vmuodum
 */
public class ControladorVentana2 {
      private Ventana2 ventana;
    private Modelo modelo;

    public ControladorVentana2( Modelo modelo) {
        this.ventana = new Ventana2();
        this.modelo = modelo;
        this.ventana.getBoton().setOnAction(new EventoBoton());
    } public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.ventana.mostrar(singleton.getStage());
    }
    class EventoBoton implements
            EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorVentana1 c=new ControladorVentana1(modelo);
            c.mostrarVista();
        }
        
    }
}
