class Mascota{
    String nombre;
    String especie;
    int edad;
    double[]pesos=new double[3];

    public Mascota(String n, String e, int edad, double[]pesos){
        this.nombre=n;
        this.especie=e;
        this.edad=edad;
        this.pesos=pesos;
    }


    public void setNombre(String n){
        this.nombre=n;
    }
    
    public void setEspecie(String e){
        this.especie=e;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void modificarPeso(int posicion, double nuevoPeso){
    if(posicion>=0 && posicion<pesos.length){
        if(nuevoPeso>0){
            this.pesos[posicion]=nuevoPeso;
        } else{
        System.out.println("El peso debe ser mayor a cero");
      }
    } else{
        System.out.println("Posicion invalida");
    }
         
  }

public double promedioPesos(){
    double suma=0;
    int i;
    for(i=0; i<pesos.length; i++){
        suma+=pesos[i];
    }
    double promedio=suma/pesos.length;
    return promedio;
 }

public boolean esAdulto(){
    if(edad>=2){
        return true;
    } else{
        return false;
    }
}

public void mostrarDatos(){
    System.out.println("Nombre:" + nombre);
    System.out.println("Especie:" + especie);
    System.out.println("Edad:" + edad);
    System.out.println("Pesos:");
    for(int i=0; i<pesos.length; i++){
      System.out.println("Peso"+ (i+1)+":"+pesos[i]);
    }
  }
}

public class Ejercicio5 {
    public static void main(String[]arrgs){
        import java.util.Scanner;
        Scanner teclado=new Scanner(System.in);
        
    }
}
