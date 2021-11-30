importar java.util.Scanner;
 clase pública mayormenor {
    public static void main(String[] args){
        Scanner entrada = nuevo Scanner(Sistema. en);
        int a,b,c;
            Sistema. fuera. println("Ingrese el primer numero" );
 a=entrada. nextInt();
            Sistema. fuera. println("Ingrese el Segundo numero" );
 b=entrada. nextInt();
            mientras que(a ==b){
                Sistema. fuera. println("No puede ser el mismo numero, ingrese un numero diferente :" );
 b=entrada. nextInt(); 
            }    
            Sistema. fuera. println("Ingrese el Tercer numero" );
 c=entrada. nextInt();
            mientras que(c==b || c== a){
                Sistema. fuera. println("No puede ser el mismo numero, ingrese un numero diferente :" );
 c=entrada. nextInt(); 
            }
        if(a >b && a>c){
            Sistema. fuera. println( " El número mayor es "+ a);
        }más{
            if(b>c &&b >a){
                Sistema. fuera. println("El número mayor es "+b); 
            }más{
                    Sistema. fuera. println("El número mayor es "+c);
            }
        }
        
    }
    
}