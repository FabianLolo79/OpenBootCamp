public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //Ejercicio 1 - TEMA 4 "if"

        var numeroIf= -2;

        if (numeroIf > 0){

            System.out.println("Es un número POSITIVO este ciclo if");
        } else if (numeroIf == 0){

            System.out.println("El número es CERO este ciclo if");
        } else {

            System.out.println("El número es NEGATIVO este ciclo if");

        }

        // Ejercicio 2 - TEMA 4 "while"

        var numeroWhile = 0;

        while (numeroWhile < 3 ){

            System.out.println("vuelta de while n° " + numeroWhile);
            numeroWhile++;
        }

        // Ejercicio 3 - TEMA 4 "do while"

        var numeroDoWhile = 0;

        do {

            System.out.println("vuelta de Do While n° " +  numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 1);


        // Ejercicio 3 -TEMA 4 "for"

        for (var numeroFor = 0; numeroFor <= 3; numeroFor++) {

            System.out.println("vuelta de for n° " + numeroFor);
        }

        // Ejercicio 3 - TEMA 4 "Switch"

        var estacion = "PRIMAVERA";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estación");
                break;
            }
    }
}