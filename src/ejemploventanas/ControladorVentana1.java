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
public class ControladorVentana1 {
    private Ventana1 ventana;
    private Modelo modelo;

    public ControladorVentana1( Modelo modelo) {
        this.ventana = new Ventana1();
        this.modelo = modelo;
        this.ventana.getBoton().setOnAction(new EventoBoton());
    }
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.ventana.mostrar(singleton.getStage());
    }
    class EventoBoton implements
            EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
           ControladorVentana2 controlador=new ControladorVentana2(modelo);
           controlador.mostrarVista();
        }
        
    }
}
