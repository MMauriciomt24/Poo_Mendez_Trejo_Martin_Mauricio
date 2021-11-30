public class Hipotenusa {
    importar java.util.Scanner;
importar java.lang.Math;  //libreria para funciones matematicas
clase calculahipotenusa{
    public static void main(String[] args){
        doble co,ca,r;
        char o='s' ;
        Scanner entrada = nuevo Scanner(Sistema. en);
        mientras que(o=='S'  || o ==  's' ){
            Sistema. fuera. println("Ingrese la medida del cateto opuesto: " );
 co=entrada. nextFloat();
            Sistema. fuera. println("Ingrese la medida del cateto adyacente: " );
 ca=entrada. nextFloat();
 r=Matemáticas. sqrt(Matemáticas. pow(ca,2)+Matemáticas. pow(co,2));  //sqrt obtiene la raiz cuadrada mientras que pow eleva el numero
            Sistema. fuera. println("La medida de la Hipotenusa es igual a : "+r);
            // El siguiente metodo lanza una espera de 5 segundos antes de continuar la ejecucion
            probar {
                Hilo. dormir(5000);
          } catch (InterruptedException e) {
          }//termina la espera
            Sistema. fuera. println("Desea realizar otro calculo? S/N"  );
 o=entrada. siguiente(). charAt(0);
        }
    }
}
    
}
