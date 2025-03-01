/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadsemanal01;

/**
 *
 * @author helmu
 */
public class Alarma {
    private int tiempoObjetivo;

    public Alarma(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }

    public int getTiempoObjetivo() {
        return tiempoObjetivo;
    }

    public void setTiempoObjetivo(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }

    
    public boolean verificarAlarma(int tiempoActual) {
        return tiempoActual >= tiempoObjetivo;
    }
}

