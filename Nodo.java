package enunciado01;

public class Nodo {

  private Nodo Siguiente;
  private String Persona;

    public Nodo(Nodo siguiente, String Persona) {
        this.Siguiente = siguiente;
        this.Persona = Persona;
    }
    
    public Nodo (){
        Persona = "";
        Siguiente = null;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.Siguiente = siguiente;
    }

    public String getPersona() {
        return Persona;
    }

    public void setPersona(String Persona) {
        this.Persona = Persona;
    }
}
