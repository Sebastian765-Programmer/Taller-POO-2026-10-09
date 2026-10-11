package main;
//Sexto punto: Punto 6

public class Veterinaria {
    public static void main(String[] args){
        Mascota[] paciente=new Mascota[4];

        paciente[0]=new Mascota("Luna","Perro", 28.5, 9);
        paciente[1]=new Mascota("Michi","Gato",4.2, 3);
        paciente[2]=new Mascota("Rocky","Perro",12.0, 5);
        paciente[3]=new Mascota("Pepa","Conejo",2.1, 1);
//Séptimo punto: Punto 7

        int totalRecaudado=0;
        for (int i = 0; i < paciente.length; i++){

            Mascota m=paciente[i];
            int valor= m.valorConsulta();
            System.out.println(m.descripcion()+"::::el valor de su consulta son: "+valor+" pesos:::: ");
            totalRecaudado=totalRecaudado+valor;
        }
        System.out.println("::::Total Recaudado: "+totalRecaudado+" pesos:::: ");
//Octavo punto: Punto 8

        System.out.println();
        System.out.println("::::Modificación del peso de Michi de 4.2kg a -3kg::::");
        paciente[1].setPeso(-3);
        System.out.println(paciente[1].descripcion());
    }

}
