public class Main {
  public static void main(String[] args) {
      Cliente cliente = new Cliente();
      cliente.edad = 42;
      cliente.nombre = "Fabián";
      cliente.telefono = 351315;
      cliente.credito = 2940;
      System.out.println("Nombre: " + cliente.nombre);
      System.out.println("Edad: " + cliente.edad);
      System.out.println("Teléfono: " + cliente.telefono);
      System.out.println("Crédito: " + cliente.credito);


      Trabajador trabajador = new Trabajador();
      trabajador.edad = 33;
      trabajador.nombre = "Paloma";
      trabajador.telefono = 351315;
      trabajador.salario = 130000;
      System.out.println("Nombre: " + trabajador.nombre);
      System.out.println("Edad: " + trabajador.edad);
      System.out.println("Teléfono: " + trabajador.telefono);
      System.out.println("Salario: " + trabajador.salario);
  }
}



class Persona {
  int edad;
  String nombre;
  int telefono;
}

class Cliente extends Persona {
  int credito;
}

class Trabajador extends Persona {
  int salario;
}