package main;
//Primer punto: Punto 1

public class Mascota {
    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    public Mascota(String nombre, String especie, double peso, int edad) {
        this.nombre=nombre;
        this.especie=especie;
        this.peso=peso;
        this.edad=edad;
    }
//Segundo punto: Punto 2

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }
//Terser punto: Punto 3

    public void setPeso(double peso) {
        if (peso<=0){
            System.out.println("::::RECHAZADO: " + "no es posible que " + nombre + " pese "+ peso + "kg::::" );
            return;
        }
        this.peso = peso;
    }

    public void setEdad(int edad) {
        if (edad<0){
            System.out.println("::::RECHAZADO: " + "no es posible que " + nombre + "tenga" + edad + "años::::");
        }
        this.edad = edad;
    }
//Cuarto punto: Punto 4

    public int valorConsulta(){
        int valor=35000;

        if (peso>25){
            valor=55000;
        } else if (peso>10) {
            valor=45000;
        }

        if (edad>=8){
            valor=valor+12000;
        }
        return valor;
    }
//Quinto punto: Punto 5

    public String descripcion(){
        return nombre+" ("+especie+", "+peso+"kg, "+edad+" anios) ";
    }
}
