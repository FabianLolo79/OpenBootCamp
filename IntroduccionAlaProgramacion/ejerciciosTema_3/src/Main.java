import com.sun.source.util.SourcePositions;


//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.

public class Main {
    public static void main(String[] args) {
        suma (25, 25, 25 );

        // Crear un objeto miCoche en el main y añadirle una puerta
        //mostrar el numero de puertas que tiene el objeto
        Coche miCoche = new Coche();
        miCoche.colocarPuerta();
        System.out.println("Mi coche tiene " + miCoche.puertas + " puertas.");
    }

    // Función suma
    public static void suma (int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        System.out.println("El resaultado de la suma es " + resultado);
    }
}

//Segunda Parte
//Crear Clase Coche
//Dentro de la clase coche, una variable numerica que almacene el numero de puertas que tiene
//Una funcion que incremente el numero de puertas que tiene el coche
    class Coche{
        public int puertas = 4;

        public void colocarPuerta() {
            this.puertas++;
        }
    }

    