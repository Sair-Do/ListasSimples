package enunciado01;

import static enunciado01.AplicaPersona.teclado;

public class Lista {

    private Nodo inicio;
    private int tamanio;

    public Lista() {
        inicio = null;
        tamanio = 100;

    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void agregarInicio(String nom) {
        Nodo nuevo = new Nodo();
        nuevo.setPersona(nom);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

    public void mostrar() {
        if (!esVacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                System.out.print("[ " + aux.getPersona() + " ]" + "--> ");
                aux = aux.getSiguiente();
            }
        } else {
            System.out.println("");
        }
    }

    public void eliminar(int pos) {
        System.out.println("Ingrese posicion a Eliminar: ");
        pos = teclado.nextInt();
        if (pos >= 0 && pos < tamanio) {
            if (pos == 0) {
                inicio = inicio.getSiguiente();
            } 
            else {
                Nodo aux = inicio;
                for (int i = 0; i < pos - 1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamanio--;
        }
    }
}


