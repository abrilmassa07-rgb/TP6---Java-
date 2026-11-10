class Libro{
    String titulo;
    int paginas;
    void mostrarDatos(){
       System.out.println("titulo:"+ titulo);
       System.out.println("paginas:"+paginas);
    }
}
public class Principal{
    public static void main(String[]args){
        Libro libro1=new Libro();
        libro1.titulo="El Principito";
        libro1.paginas=100;
        Libro libro2=new Libro();
        libro2.titulo="Caperucita Roja";
        libro2.paginas=250;

        System.out.println("---Libro 1---");
        libro1.mostrarDatos();
        System.out.println("---Libro 2---");
        libro2.mostrarDatos();
    }
}