/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadsemanal01;

/**
 *
 * @author helmu
 */
public class ActividadSemanal01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 1
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1500.00);
        CuentaBancaria cuenta2 = new CuentaBancaria("12345", 1000);
        
        cuenta1.depositar(500);
        cuenta1.retirar(300);
        System.out.println("Saldo actual: " + cuenta1.consultarSaldo());
        
        //Ejercicio 2
        Termometro termometro = new Termometro(25);
        System.out.println("Temperatura en Fahrenheit: " + termometro.convertirAFahrenheit());
        System.out.println("Temperatura en Kelvin: " + termometro.convertirAKelvin());
        
        //Ejercicio 3
        Inventario producto = new Inventario("producto 1", "Leche", 6.50);
        System.out.println("Precio inicial: " + producto.getPrecio());
        producto.setPrecio(8.00);
        System.out.println("Nuevo precio: " + producto.getPrecio());
        
        //Ejercicio 4
        Temporizador temporizador = new Temporizador();
        Alarma alarma = new Alarma(5);
        temporizador.asociarAlarma(alarma);
        temporizador.iniciar(10);
        
        //Ejercicio 5
        Curso curso = new Curso();
        curso.agregarEstudiante(new Estudiante("Juan", "7590-24-12312", 85));
        curso.agregarEstudiante(new Estudiante("Ana", "7590-23-78567", 75));
        curso.agregarEstudiante(new Estudiante("Pedro", "7590-24-34566", 82));
        System.out.println("Promedio del curso: " + curso.calcularPromedio());
    }    
}
