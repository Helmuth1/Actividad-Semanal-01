/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadsemanal01;

/**
 *
 * @author helmu
 */
public class Temporizador {
    private int tiempoActual;
    private Alarma alarma;

    public Temporizador() {
        this.tiempoActual = 0;
    }

    public int getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(int tiempoActual) {
        this.tiempoActual = tiempoActual;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }
    
    public void iniciar(int tiempoLimite) {
        for (int i = 0; i <= tiempoLimite; i++) {
            tiempoActual = i;
            if (alarma != null && alarma.verificarAlarma(tiempoActual)) {
                System.out.println("¡Alarma activada!");
                break;
            }
        }
    }

    public void asociarAlarma(Alarma alarma) {
        this.alarma = alarma;
    }
}
