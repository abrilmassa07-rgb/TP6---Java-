class Libro{
    String titulo;
    int paginas;
    void mostrarDatos(){
        System.out.println("titulo:"+ titulo);
        System.out.println("paginas:"+ paginas);
    }
    boolean esLargo(){
        return paginas>300;
    }
}

public class Ejercicio4 {
  public static void main(String[]args){
        Libro[] biblioteca =new Libro[2]; 
        biblioteca[0]=new Libro();
        biblioteca[0].titulo="titulo1";
  }   
}
