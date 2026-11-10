class Libro{
    String titulo;
    int paginas;
    void mostrarDatos(){
       System.out.println("titulo:"+ titulo);
       System.out.println("paginas:"+paginas);
    }
    boolean esLargo(){
        return paginas>300;
    }
}

public class Ejercicio3 {
    public static void main(String[]args){
        Libro libro1=new Libro();
        libro1.titulo="El Principito";
        libro1.paginas=100;
        Libro libro2=new Libro();
        libro2.titulo="Caperucita Roja";
        libro2.paginas=250;

        System.out.println("---Libro 1---");
        libro1.mostrarDatos();
        if(libro1.esLargo()){
           System.out.println("El libro es largo");
        } else{
            System.out.println("El libro es corto");
        }
        
        System.out.println("---Libro 2---");
        libro2.mostrarDatos();
        if(libro2.esLargo()){
           System.out.println("El libro es largo");
        } else{
            System.out.println("El libro es corto");
        }
    }
}