public class SinglyLinkedList {
    Nodo cabeza;
    
    public SinglyLinkedList(){
        this.cabeza = null;
    }

    public void insertar(Integer dato){
        // Crear un Nodo
        Nodo nuevoNodo = new Nodo(dato);

        // Verificar si la lista esta vacia
        if (cabeza == null) {
            // Coloca el nodo nuevo como la cabeza
            cabeza=nuevoNodo;
        } else {
            Nodo temp = cabeza; // Iniciamos desde la cabeza (El primero ps)
            // Recorremos todos los nodos hasta encontrar un null en las referencias 
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente=nuevoNodo;
        }
    }

    public void mostrar(){
        Nodo temp = cabeza; // Comenzamos desde la cabeza(inicio)

        // Mientra temp no sea nulo
        while (temp != null) {
            System.out.print(temp.dato + "->");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    public boolean buscar(Integer valor){
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return false;
        } else {
            Nodo temp = cabeza; // Comenzamos desde la cabeza(inicio)
            // Mientrar temp no sea nulo            
            while (temp != null) {
                if (temp.dato == valor) {
                    System.out.println("Se ha encontrado el nodo con el valor: " + valor);
                    return true;
                } 
                temp = temp.siguiente;     
            }

            System.out.println("EL nodo con el valor buscado no esta en la lista: " + valor);   
        }
        return false;
    }

    public void eliminar(Integer valor){
        if(cabeza == null){
            System.out.println("No se puede eliminar, por que la lista esta vacia");
        } 
        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo temp = cabeza;
        Nodo anterior = null;
        while (temp != null && temp.dato != valor) { // Recorrer hasta encontrar el nodo con el valor
            anterior=temp;
            temp=temp.siguiente;
        }

        if (temp == null) {
            System.out.println("No se encontro el valor");
            return;
        }
        anterior.siguiente = temp.siguiente;
        System.out.println("Se elimino correctamente" + valor);
    }
}
