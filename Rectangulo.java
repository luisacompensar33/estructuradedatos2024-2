public class Rectangulo {
    // Atributos de la clase
    private double ancho;
    private double altura;
/*En este caso Rectangulo es la clase que se debe definir al principio 
  primero se define la clase, luego se define los objetos de la clase
    
  */  
    // Constructor por defecto
    public Rectangulo() {
        this.ancho = 1.0;
        this.altura = 1.0;
    }

    // Constructor con parámetros
    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return ancho * altura;
    }

    // Método para mostrar las dimensiones y el área del rectángulo
    public void mostrarInfo() {
        System.out.println("Ancho: " + ancho);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
    }

    public static void main(String[] args) {
        // Crear un objeto Rectangulo usando el constructor por defecto
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("Información del primer rectángulo:");
        rectangulo1.mostrarInfo();

        // Crear un objeto Rectangulo usando el constructor con parámetros
        Rectangulo rectangulo2 = new Rectangulo (5.0, 3.0);
        System.out.println("Información del segundo rectángulo:");
        rectangulo2.mostrarInfo();
    }
}
/*
Este programa define una clase llamada Rectangulo que representa un rectángulo. 
La clase tiene dos constructores: uno sin parámetros (constructor por defecto) y 
otro con parámetros para inicializar el ancho y la altura del rectángulo. Además, 
incluye un método para calcular el área del rectángulo.
 */