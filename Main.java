import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ksiazki ksiazka1 = new ksiazki("Władca pierścieni");
    ksiazki ksiazka2 = new ksiazki("Hobbit");
    ksiazki ksiazka3 = new ksiazki("Gra o Tron");
    ksiazki ksiazka4 = new ksiazki("Fairy Tale");

    
    ArrayList lista = new ArrayList();
    lista.add(ksiazka1);
    lista.add(ksiazka2);
    lista.add(ksiazka3);
    lista.add(ksiazka4);

    System.out.println("___________________"); 
    System.out.println("Książki wypożyczone : ");
      for(Object k : lista){
         System.out.println(((ksiazki)k).nazwa);
      }
     System.out.println("__________________");

  System.out.println("Liczba wypożyczonych książek : " + lista.size());
  
     System.out.println("Czy ksiazka Władcy Pierścieni jest wypożyczona : " + lista.contains(ksiazka1));
    lista.remove(ksiazka2);
    
 System.out.println("________________");
    System.out.println("Lista książek po zwróceniu Hobbita : ");
      for(Object k : lista){
         System.out.println(((ksiazki)k).nazwa);
      }
  }
}