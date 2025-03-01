/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadsemanal01;

/**
 *
 * @author helmu
 */
public class Termometro {
    private double temperaturaCelsius;

    public Termometro(double temperaturaInicial) {
        this.temperaturaCelsius = temperaturaInicial;
    }
    
    public void setTemperatura(double temperatura) {
        this.temperaturaCelsius = temperatura;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public double convertirAFahrenheit() {
        return (temperaturaCelsius * 9/5) + 32;
    }

    public double convertirAKelvin() {
        return temperaturaCelsius + 273.15;
    }
}
