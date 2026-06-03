package models;

public class Par <K, V> {
    private K clave;
    private V valor;

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public void setClave(K clave) {
        this.clave = clave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Par [clave=" + clave + ", valor=" + valor + "]";
    }

    public void establecerClave(K clave) {
        this.clave = clave;
    }

    public K obtenerClave() {
        return this.clave;
    }

    public void establecerValor(V valor) {
        this.valor = valor;
    }

    public V obtenerValor() {
        return this.valor;
    }

}
