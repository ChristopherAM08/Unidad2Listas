public class Nodo {

    private Integer dato;
    private Nodo siguiente;
    
    public Nodo(Integer dato){
        this.dato = dato;
    }

    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    

}
