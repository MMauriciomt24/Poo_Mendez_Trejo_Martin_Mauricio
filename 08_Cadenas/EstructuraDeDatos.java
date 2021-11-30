/*
Vamos a crear un programa que se encargue de realizar las siguientes operaciones
1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios
3.- Convertir temperaturas celcius, kelvine y rankine
4.- Numero de positivos y negativos segun una lista de numeros
5.- Tiendita peke
6.- Area y Perimetro de figuras geometricas
7.- Tabla
8.- Factorial
9.- Dibujitos de codigo
10.- Figuras huecas de codigo
11.- Patrones de codigos
12.- Diamante de codigo
13.- Calculadora
14.- Salir
*/ 

importar java.util.Scanner;
importar java.util.ArrayList;
importar java.lang.System;
importar java.lang.Math;




clase EstructuradeDatos{

    // Programa 1
    /*
    EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65, 
    AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. 
    SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
    SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 
    45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. 
 edad variable
    condiciones
    */ 

    public static void main(String[] args){

        //objetos
        Scanner entrada = nuevo Scanner(Sistema. en);
        // Scanner letras = nuevo Scanner(System.in);


        //variables
        int edad, opcion, socio, numbinario;
        doble precio, bono;
        char letras;
        Binario de cadenas = "";


        //cuerpo del programa

        //menú de las opciones de arriba

        hacer{

        Sistema. fuera. println("Bienvenido a tu primer programa de estructuras." );
        Sistema. fuera. println("Por favor elija la opcion deseada:" );
        Sistema. fuera. println("1.- Descuento por edad" );
        Sistema. fuera. println("2.- Convertir numero decimal a binario" );
        Sistema. fuera. println("3.- Conversiones de temperatura" );
        Sistema. fuera. println("4.- Numeros positivos y negativos" );
        Sistema. fuera. println("5.- Tienda" );
        Sistema. fuera. println("6.- Area y Perimetros" );
        Sistema. fuera. println("7.- Tabla" );
        Sistema. fuera. println("8.- Factorial" );
        Sistema. fuera. println("9.- Dibujos de codigo" );
        Sistema. fuera. println("10.- Figura Hueca" );
        Sistema. fuera. println("11.- Patrones de codigo" );
        Sistema. fuera. println("12.- Diamente" );
        Sistema. fuera. println("13.- Calculadora" );
        Sistema. fuera. println("14.- Salir" );

        //condicion switch para el menu

 opcion = entrada. nextInt();


        switch(opcion){

            caso 1:  //problema 1
                Sistema. fuera. println("Ingresa el Bono A cobrar" );
 bono = entrada. nextDouble();
                Sistema. fuera. println("Ingresa la edad" );
 edad = entrada. nextInt();
                //la estructura de condiciones
                // SI ÉSTA ES MAYOR DE 65, AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%.
                si(edad >= 65){
                    //proceso
                    bono = bono*.6;
                    Sistema. fuera. println("Su descuento es de 40%" );
                    Sistema. fuera. println("El total a pagar es de: "  + bono);
                }
                /*
                SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
                 SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 
                45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. 
                */ 
                si(edad <= 21){
                    Sistema. fuera. println("Si tus padres son socios ingresa 1, sino lo son ingresa 2" );
 socio = entrada. nextInt();

                    switch(socio){
                        caso 1: 
                            bono = bono*.55;
                            Sistema. fuera. println("Su descuento fue del 45%" );
                            Sistema. fuera. println("El total a pagar es de: "  +bono);
                            quebrar;
                        caso 2: 
                            bono = bono*.75;
                            Sistema. fuera. println("Su descuento fue del 25%" );
                            Sistema. fuera. println("El total a pagar es de: "  +bono);
                            quebrar;
                        por defecto:
                        //es el caso por defecto osea los demas casos
                            Sistema. fuera. println("Opcion no valida" );

                    }
                }
                Sistema. fuera. println("Tu edad es de: "  + edad);
                Sistema. fuera. println("El total a pagar es: "  + bono);
                quebrar;

                caso 2:

                    Sistema. fuera. println("Ingrese un numero positivo entero que desee convertir a binario" );
 numbinario = entrada. nextInt();
                    /*
                    Tengo que comprobar que sea positivo?
                    condicion donde numbinario > 0
                    entonces aplico el algoritmo de convertir a binario
                    sino no se puede convertir
                    */ 

                    si(numbinario > 0){
                        /*
                        Como el algoritmo para convertir un numero decimal en binario
                        aplicar al numbinario mod 2
                        */
                        mientras que(numbinario > 0){
                            if(numbinario % 2 == 0){
 binario =  "0"  + binario;
                            }más{
 binario =  "1"  + binario;
                            }
                            numbinario = (int)numbinario / 2;
                        }
                    }else if (numbinario == 0){
 binario =  "0" ;
                    }más{
 binario =  "No se pudo convertir el numero, ingrese solo positivos." ;
                    }
                    Sistema. fuera. println("El numero convertirdo a binario es: "  + binario);
                    quebrar;


                caso 3:
                int op=1;
                mientras que(op!=7){
                    Sistema. fuera. println("Que tipo de Conversion desea realizar: " );
                    Sistema. fuera. println("1) Celcius a Fahrenheit" );
                    Sistema. fuera. println("2) Fahrenhet a Celsuis" );
                    Sistema. fuera. println("3) Celsius a Kelvin" );
                    Sistema. fuera. println("4) Kelvin a Celsius" );
                    Sistema. fuera. println("5) Kelvin a Fahrenheit" );
                    Sistema. fuera. println("6) Fahrenheit a Kelvin" );
                    Sistema. fuera. println("7) Salir" );
 op=entrada. nextInt();
                    doble t,r;
                    switch(op){
                        caso 1:
                        Sistema. fuera. println("C E L S I U S A F A H R E N H E I T" );
                        Sistema. fuera. println("Ingrese la temperatura: " );
 t=entrada. nextFloat();
                        r=t*(9.0/5.0)+32;
                        Sistema. fuera. println(t+"\u00B0C son igual a "+r+" \u00B0F " );
                        Sistema. fuera. println("\u00BFDesea realizar otra conversi\u00F3n? Presione 7 para salir o 1 para continuar" );
 op=entrada. nextInt();
                        quebrar;
                        caso 2:
                        Sistema. fuera. println("F A H R E N H E I T A C E L S I U S" );
                        Sistema. fuera. println("Ingrese la temperatura: " );
 t=entrada. nextFloat();
                        r=(t-32)*(5.0/9.0);
                        Sistema. fuera. println(t+"\u00B0F son igual a "+r+" \u00B0C " );
                        Sistema. fuera. println("\u00BFDesea realizar otra conversi\u00F3n? Presione 7 para salir o 1 para continuar" );
 op=entrada. nextInt();
                        quebrar;
                        caso 3:
                        Sistema. fuera. println("C E L S I U S A K E L V I N " );
                        Sistema. fuera. println("Ingrese la temperatura: " );
 t=entrada. nextFloat();
 r=t+273,15;
                        Sistema. fuera. println(t+"\u00B0C son igual a "+r+" \u00B0K " );
                        Sistema. fuera. println("\u00BFDesea realizar otra conversi\u00F3n? Presione 7 para salir o 1 para continuar" );
 op=entrada. nextInt();
                        quebrar;
                        caso 4:
                        Sistema. fuera. println("K E L V I N A C E L S I U S" );
                        Sistema. fuera. println("Ingrese la temperatura: " );
 t=entrada. nextFloat();
 r=t-273,15;
                        Sistema. fuera. println(t+"\u00B0K son igual a "+r+" \u00B0C " );
                        Sistema. fuera. println("\u00BFDesea realizar otra conversi\u00F3n? Presione 7 para salir o 1 para continuar" );
 op=entrada. nextInt();
                        quebrar;
                        caso 5:
                        Sistema. fuera. println("K E L V I N A F A H R E N H E I T" );
                        Sistema. fuera. println("Ingrese la temperatura: " );
 t=entrada. nextFloat();
                        r=(t-273.15)*(9.0/5.0)+32;
                        Sistema. fuera. println(t+"\u00B0K son igual a "+r+" \u00B0F " );
                        Sistema. fuera. println("\u00BFDesea realizar otra conversi\u00F3n? Presione 7 para salir o 1 para continuar" );
 op=entrada. nextInt();
                        quebrar;
                        caso 6:
                        Sistema. fuera. println("F A H R E N H E I T A K E L V I N " );
                        Sistema. fuera. println("Ingrese la temperatura: " );
 t=entrada. nextFloat();
                        r=(t-32)*(5.0/9.0) + 273.15;
                        Sistema. fuera. println(t+"\u00B0F son igual a "+r+" \u00B0K " );
                        Sistema. fuera. println("\u00BFDesea realizar otra conversi\u00F3n? Presione 7 para salir o 1 para continuar" );
 op=entrada. nextInt();
                        quebrar;
                        por defecto:
                        Sistema. fuera. println("Saliendo de conversor de Temperatura" );
                        quebrar;
                    }

                }
                    quebrar;

                caso 4:
                Sistema. fuera. println("Cuantos numeros desea ingresar" );
                int n, countpositivo=0,countnegativo=0;
 n=entrada. nextInt();
                para(int i=1;i< =n;i++){
                    Sistema. fuera. println("Ingresa un numero" );
                    int num;
 num=entrada. nextInt();
                    if(num>0 && num != 0){
                        int positivo=num;
                        countpositivo=countpositivo+1;
                        Sistema. fuera. println("El numero positivo es: "+positivo);
                    }else if(num<0 && num!=0){
                        int negativo=num;
                        countnegativo=countnegativo+1;
                        Sistema. fuera. println("El numero negativos es: "+negativo);
                    }más{
                        Sistema. fuera. println("Cero no es positivo ni negativo" );
                    }
                }
                Sistema. fuera. println("Ingresaste "+countpositivo+" numeros positivos" );
                Sistema. fuera. println("Ingresaste "+countnegativo+" numeros positivos" );
                quebrar;
                

                caso 5:
                Cadena p;
                int o=1;
                ArrayList<String> articulos= new ArrayList<String>();
                Sistema. fuera. println("Desea Ingresar productos? S/N : " );
                char re=entrada. siguiente(). charAt(0);
                if(re=='s'  || re=='S' ){
                    Sistema. fuera. println("Presione 0 para terminar de ingresar" );
                    hacer{
                        Sistema. fuera. print("Ingrese el producto: " );
 p=entrada. nextLine();
                        probar {
 o=entrada. nextInt();
                        } captura (Excepción e) {
                            o=1;
                        }
 articulos. add(p+"......$10.00" );  
                        
                    }
                    mientras que(o!=0);
                    for( Cadena decuerdas :articulos){
                        Sistema. fuera. println(cadena);
                    }
                    int contador=articulos. tamaño();
                    suma doble =contador *10.00;
                    Sistema. fuera. println("El costo total de los articulos es de "  + sum);  // Devuelve resultado erroneo porque
                    //devuelve la linea del 0 como campo, no he logrado eliminarla.
                }
                quebrar;

                caso 6:
                Sistema. fuera. println("A R E A S Y P E R I M E T R O S" );
                Sistema. fuera. println("Seleccione que figura desea calcular: " );
                Sistema. fuera. println("1) Círculo" );
                Sistema. fuera. println("2) Cuadrado" );
                Sistema. fuera. println("3) Rectángulo" );
                Sistema. fuera. println("4) Triangulo" );
                Sistema. fuera. println("5) Salir" );
 op=entrada. nextInt();
                switch(op){
                    caso 1:
                    Sistema. fuera. println("C A L C U L O DEL C I R C U L O" );
                    Sistema. fuera. println("Ingrese el radio del circulo" );
                    doble r=entrada. nextFloat();
                    double ra=Matemáticas. PI*Matemáticas. pow(r, 2);
                    doble rp=2*Matemáticas. PI*r;
                    Sistema. fuera. println("El area del Circulo es : "+ra+"cm" );
                    Sistema. fuera. println("El Perimetro del Circulo es : "+rp+"cm" );
                    quebrar;
                    caso 2:
                    Sistema. fuera. println("C A L C U L O DEL C U A D R A D O" );
                    Sistema. fuera. println("Ingrese la medida de un lado del cuadrado" );
                    doble l=entrada. nextDouble();
                    ra=l*l;
                    rp=l*4;
                    Sistema. fuera. println("El area del Cuadrado es : "+ra+"cm^2" );
                    Sistema. fuera. println("El Perimetro del Cuadrado es : "+rp+"cm" );
                    quebrar;
                    caso 3:
                    Sistema. fuera. println("C A L C U L O DEL R E C T A N G U L O" );
                    Sistema. fuera. println("Ingrese la base del rectangulo" );
                    doble b=entrada. nextDouble();
                    Sistema. fuera. println("Ingrese la altura del rectangulo" );
                    doble h=entrada. nextDouble();
                    ra=b*h;
                    rp=(b*2)+(h*2);
                    Sistema. fuera. println("El area del Rectangulo es : "+ra+"cm" );
                    Sistema. fuera. println("El Perimetro del Rectangulo es : "+rp+"cm" );
                    quebrar;
                    caso 4:
                    Sistema. fuera. println("C A L C U L O DEL T R I A N G U L O" );
                    Sistema. fuera. println("Ingrese la medida del primer lado" );
                    doble l1=entrada. nextDouble();
                    Sistema. fuera. println("Ingrese la medida del segundo lado" );
                    doble l2=entrada. nextDouble();
                    Sistema. fuera. println("Ingrese la medida del tercer lado" );
                    doble l3=entrada. nextDouble();
                    Sistema. fuera. println("Ingrese la base del triangulo" );
 b=entrada. nextDouble();
                    Sistema. fuera. println("Ingrese la altura del triangulo" );
 h=entrada. nextDouble();
                    rp=l1+l2+l3;
                    ra=(b*h)/2;
                    Sistema. fuera. println("El area del Triangulo es : "+ra+"cm" );
                    Sistema. fuera. println("El Perimetro del Triangulo es : "+rp+"cm" );
                    quebrar;
                    caso 5:
                    por defecto:
                        Sistema. fuera. println("Saliendo del calculador de area y perimetro" );
                        quebrar;
                    
                }
                quebrar;


                caso 7: 
                para(n = 1; n< = 10; n++){
                    Sistema. fuera. println(n +  " "  + (n*10)+  " "  + (n*100) +  " "  + (n*1000));
                }
                quebrar;
                caso 8:
                Sistema. fuera. println("N U M E R O F A C T O R I A L " );
                Sistema. fuera. println("Ingrese el numero que desea obtener el factorial: " );
                int num=entrada. nextInt();
                int r=1;
                if(num!= 0){
                    para(int i=1;i< =num;i++){
                        r=r*i;
                    }
                    Sistema. fuera. println("El factorial de "  +num+" es igual a "+r);
                }más{
                    Sistema. fuera. println("El factorial de cero es igual a 1" );
                }
                quebrar;
                caso 9:
                Sistema. fuera. println("Cuadrado Mágico" );
                    Sistema. fuera. println("Inserta el num de lados: " );
 n = entrada. nextInt();

                    if( n> = 1 && n < =20){
                        //se puede imprimir
                        //aquí tengo las filas
                        para(int i = 1; i< =n; i++){
                            //columnas
                            para(int j = 1; j< =n; j++){
                                Sistema. fuera. imprimir("* ");

                            }
                        Sistema. fuera. println(" ");


                            
                        }
                    }más{
                        Sistema. fuera. println("Error, el rango debe de ser entre 1 y 20, intente de nuevo" );
                    }
                    quebrar;
                caso 10:
                Sistema. fuera. println("Cuadrado Mágico Hueco" );
                Sistema. fuera. println("Inserta el num de lados: " );
 n = entrada. nextInt();

                if( n> = 1 && n < =20){
                    //se puede imprimir

                    //imprima la linea superior
                    para(int i = 0; i < n; i++){
                        Sistema. fuera. imprimir(" * ");
                    }
                    Sistema. fuera. println();

                    //lo de enmedio solo quiero las esquinas
                    //cuadrado interno
                    //aquí tengo las filas
                    para(int i = 0; i < n-2; i++){
                        Sistema. fuera. imprimir(" * ");
                        //columnas
                        para(int j = 0; j < n-2; j++){
                            Sistema. fuera. imprimir("  ");

                        }
                    Sistema. fuera. println("   * ");


                        
                    }

                    //imprimir la linea inferior
                    para(int i = 0; i < n; i++){
                        Sistema. fuera. imprimir(" * ");
                    }
                    Sistema. fuera. println();
                }más{
                    Sistema. fuera. println("Error, el rango debe de ser entre 1 y 20, intente de nuevo" );
                }
                quebrar;
                caso 11:
                    //tarea

                caso 12:

                caso 13:

                Sistema. fuera. println("Calculadora maizsoro" );
                    Sistema. fuera. println("Ingresar un número" );
                    int a = entrada. nextInt();
                    Sistema. fuera. println("Ingresa un segundo número" );
                    int b = entrada. nextInt();
                    Sistema. fuera. println("Ingresa el tipo de operacion que deseas realizar : (+ , -, *, /)" );
                    char operacion = entrada. siguiente(). charAt(0);

                    switch(operacion){
                        caso  '+'  :
                            int resultado = a+b;
                            Sistema. fuera. println("La suma es de: "  + resultado);
                            quebrar;
                        caso  '-'  :
                            resultado = a-b;
                            Sistema. fuera. println("La resta es de: "  + resultado);
                            quebrar;
                        caso  '*'  :
                            resultado = a*b;
                            Sistema. fuera. println("La multiplicación es de: "  + resultado);
                            quebrar;
                        caso  '/'  :
                            si(b != 0){
 resultado = a /b;
                                Sistema. fuera. println("La división es de: "  + resultado);
                               
                            }más{
                                Sistema. fuera. println("No es posible dividir entre 0" );
                            }
                            quebrar;
                        por defecto :
                            Sistema. fuera. println("Operación no valida" );

                    }

                por defecto:
                    Sistema. fuera. println("Gracias por ver este hermoso programa :3" );



        }
    
        Sistema. fuera. println("\u00BFDeseas repetir el programa? Si lo desea escriba s" );
        /*
            para recibir la respuesta debo de obtener un caracter s
            para cuando se reciben char se utiliza ''
            para cuando se reciben String se utiliza ""
        */ 
    
 letras = entrada. siguiente(). charAt(0);
    
        //si el usuario ingresa si  solo detecto la s  es la posicion del caracter que queremos lee
    
    
    
    
    }mientras que(letras ==  's' );
    //aquí se cierra el do

   

    }

}