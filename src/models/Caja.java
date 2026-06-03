package models;

public class Caja<T> {
    private T objeto;

    public Caja(T objeto) {
        this.objeto = objeto;
    }

    public T getContenido() {
        return objeto;
    }

    public void setContenido(T objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {
        return "Caja [objeto=" + objeto + "]";
    }
    
    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T obtener() {
        return this.objeto;
    }
}
