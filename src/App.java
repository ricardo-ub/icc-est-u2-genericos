import models.Caja;
import models.Par;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaDeTexto = new Caja<>("Hola Mundo");
        Caja<Integer> cajaDeEntero = new Caja<>(100);
        Caja<Double> cajaDeDecimal = new Caja<>(9.75);
        Caja<Boolean> cajaDeBooleano = new Caja<>(false);

        Par<Integer, String> parIntString = new Par<>(1, "Juan Perez");
        Par<String, Integer> parStringInt = new Par<>("Edad", 20);
        Par<String, Double> parDoubleBoolean = new Par<>("Promedio", 8.75);

        System.out.println("--- Uso de Caja<T> ---");
        System.out.println("Caja de texto: " + cajaDeTexto.getContenido());
        System.out.println("Caja de entero: " + cajaDeEntero.getContenido());
        System.out.println("Caja de decimal: " + cajaDeDecimal.getContenido());
        System.out.println("¿La caja de texto está vacía?: " + cajaDeBooleano.getContenido());
        System.out.println();
        System.out.println("--- Uso de Par<K, V> ---");
        System.out.println("Clave: " + parIntString.getClave() + " | Valor: " + parIntString.getValor());
        System.out.println("Clave: " + parStringInt.getClave() + " | Valor: " + parStringInt.getValor());
        System.out.println("Clave: " + parDoubleBoolean.getClave() + " | Valor: " + parDoubleBoolean.getValor());
    }
}
