public class App {
    public static void main(String[] args) throws Exception {

        SinglyLinkedList lista = new SinglyLinkedList();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);
        lista.insertar(50);
        lista.mostrar();

        lista.buscar(15);
        lista.buscar(20);

        lista.eliminar(50);
        lista.mostrar();
    }
}
