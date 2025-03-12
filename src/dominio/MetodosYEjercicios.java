package dominio;
import java.util.*;
import java.util.Arrays.*;



public class MetodosYEjercicios {


    /*
    Ejercicio 34: ¿Qué es un algoritmo?

    Un algoritmo es una secuencia de instrucciones diseñadas para resolver un problema.

    Ejercicio 35. Escriba dos algoritmos en Java y esos mismos dos algoritmos
    en C para resolver el mismo problema. Por ejemplo, puede escribir un algo-
    ritmo recursivo y otro iterativo (con un bucle) para resolver el problema de
    la suma de los n primeros números naturales.
     */

    public static int metodoSumaHastaNIterativo(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int metodoSumaHastaNRecursivo(int n) {
        int suma = 0;
        if (n == 0) {
            return suma;
        } else {
            return metodoSumaHastaNRecursivo(n - 1) + n;
        }
    }

    /*
    Ejercicio 36: defina O(n) en términos de un límite de cociente de funciones:

    Sean dos funciones f(n) y g(n), podemos decir que f(n) es O(g(n)) si el límite superior cuando n tiende a infinito
    del cociente f(n)/g(n) resulta en un número menor que infinito, de tal forma que f(n) puede crecer, como máximo, a
    la misma velocidad que g(n) cuando ambas tienden al infinito.

    Ejercicio 37: La fórmula para calcular el espacio recorrido por un móvil
    que se deja caer al vacío (suponiendo v0 = 0) es e = 1/2 gt^2, donde g es la
    aceleración de la gravedad en la superficie de la tierra, y t el tiempo que
    está cayendo el móvil. ¿Cuál es la complejidad temporal de este cálculo en
    función de t?

    Para calcular la complejidad temporal de la fórmula, tenemos que evaluar todas las operaciones efectuadas:

    t^2 es una multiplicación t*t, cuya complejidad sería de O(1).
    g*t^2 es igual que el caso anterior, por lo que O(1).
    1/2 * g*t^2 también es otra multiplicación, así que es O(1).

    O(1) + O(1) + O(1) = O(1).

    t, por tanto, no influye en el cálculo de la complejidad temporal.

    Ejercicio 38. Indique la complejidad temporal asintótica de los siguientes
    métodos:

        public static String primero(ArrayList<String> lista)
        {
        return lista.get(0);
        }

        Para el cálculo de la complejidad de este primer método, vemos las operaciones que se ejecutan:
        1. Acceso al primer valor de la lista: O(1)

        O(1)

        public static String nEsimo(ArrayList<String> lista, int n)
        {
        return lista.get(n);
        }

        Para el cálculo de la complejidad de este segundo método, vemos las operaciones que se ejecutan:
        1. Acceso al valor n de la lista: O(1)

        O(1)

        Ejercicio 39. Calcule la complejidad temporal de los algoritmos del ejercicio 35.

        Iterativo:
            Operaciones:

            1. Creación de variable y asignación de valor inicial: O(1)
            2. Bucle for, que en el "peor" de los casos se repite n+1 veces: O(n)
                2.1. Suma: O(1)

            O(n)

        Recursivo:
            Operaciones:

            1. Creación de variable y asignación de valor inicial: O(1)
            2. if: como solo realiza un retorno, este no cuenta en la complejidad temporal. Sería O(1).
            3. else: efectua una suma tantas veces como se ejecute el método recursivo: O(n).
                3.1 Suma: O(1)

            Elegimos el "peor" caso entre el if y el else, por lo que nos quedamos con O(n).

            O(n)

            Ejercicio 40. Resuelva cualquiera de los apartados del ejercicio 11 y calcule
            su complejidad temporal.
            /*

                 */
                public static int potenciaEnesima(int n, int m) {
                    if (m == 0) {
                        return 1;
                        }
                    else {
                        return potenciaEnesima(n, m - 1) * n;
                        }
                }
            /*

            Operaciones:
                1. if: O(1) en comparación + O(1) en retorno
                2. else: O(m) en recursividad y O(1) en multiplicación

            Resultado: O(m)


            Ejercicio 41. Calcule la complejidad temporal y espacial de cualquiera de
            los algoritmos (recursivos) del ejercicio 2 (salvo los referentes a la serie de
            Fibonacci). Compare dichas complejidades con el algoritmo iterativo para
            resolver el mismo problema.

            Cogemos el del 40 como ejemplo recursivo; de iterativo sería:

            /*

             */

            public static int potenciaEnesimaIterativo(int n, int m){
                int potencia = 1;
                for (int i = 0; i < m; i++){
                    potencia*=n;
                }
                return potencia;
            }

            /*

            Operaciones:
                1. Inicialización de variable: O(1)
                2. Bucle que se repite m veces: O(m)
                    2.1. Multiplicación: O(1)
                3. Retorno: O(1)

            Resultado: O(m)

            Ejercicio 42. Sea un conjunto A con cardinalidad n, y sea l un algoritmo
            que ejecuta una instrucción para cada elemento del producto cartesiano de
            A × A. Calcule la complejidad temporal de l en función de n.

            En un producto cartesiano, de producto siempre tenemos una cantidad m de tuplas que se puede calcular como
            la cardinalidad del primer conjunto por la del segundo. De tal forma que, por lo menos, hay que acceder n^2 veces.
            La complejidad temporal de l es O(n^2)

            Ejercicio 43. Calcule la complejidad temporal del siguiente método:

                public static double sumaEltosMatriz(double matriz[][]) {
                    double suma = 0;
                    for(int i = 0; i < matriz.length; i++) {
                        for(int j = 0; j < matriz[i].length; j++) {
                            suma+=matriz[i][j];
                        }
                    }
                    return suma;
                 }

            Operaciones:
                1. Inicialización variable: O(1)
                2. Bucle que se repite n veces (sea n = matriz.length): O(n)
                    2.1. Bucle for que se repite m veces (sea m = matriz[i].length): O(m)
                        2.1.1. Suma: O(1)
                3. Retorno: O(1)

                Resultado: O(n)*O(m)-->O(nm) Si fuera cuadrada, podríamos decir que O(l^2)


            Ejercicio 44. Escriba un algoritmo que busque un número en un array de
            enteros. Calcule su complejidad temporal en el caso peor, en el caso mejor y
            en el caso promedio. Su cabecera será la siguiente:

            /*

             */
            public static boolean buscar(int e, int[] array){
                for (int i = 0; i < array.length; i++){
                    if (e == array[i]){
                        return true;
                    }
                }
                return false;
            }

            /*
            En el caso peor, se tiene que recorrer el array entero, cuya longitud es n; por lo tanto: O(n)
            En el caso mejor, se lo encuentra en la primera posición del array, por lo que: O(1)
            Como caso promedio, que se lo encuentre a la mitad: O(n/2) --> O(n)


            Ejercicio 45. Escriba un algoritmo recursivo para buscar un número en un
            array ordenado de enteros. Su cabecerá será la misma que la del ejercicio 43.
            Calcule su complejidad en el caso peor.
             */

            public static boolean buscarRecursivo(int e, int[] array){
                if (e==array[0]){
                    return true;
                }
                else{
                    int[] arraySinPrimero = Arrays.copyOfRange(array, 1, array.length);
                    if (arraySinPrimero.length==0){
                        return false;
                    }
                    return buscarRecursivo(e, arraySinPrimero);
                }
            }

            /*
           Operaciones:
                1. if: O(1)
                2. else: O(1)
                    2.1. Creación array: una operación por cada acceso y otra por cada guardado: O(n-1)-->O(n)
                    2.2. if: O(1)
                    2.3. Llamada recursiva: como en el peor de los casos tiene que crear un array por cada vez que prueba,
                         sabiendo que se va a volver a dar el caso else (seguimos asumiendo el peor de los casos), tenemos
                         una complejidad O(n)*O(n)=O(n^2)



            Ejercicio 46. Calcule las complejidades temporal y espacial del algoritmo
            recursivo para calcular el elemento n-ésimo de la sucesión de Fibonacci.

            El algoritmo es:

            public static int fibonacci(int n){
                if (n==0){              O(1)
                    return 0;}          O(1)
                else if (n==1){         O(1)
                    return 1;}          O(1)
                else{                   O(1)
                    return fibonacci(n-1)+fibonacci(n-2);  T(n-1) + T(n-2)

            Resolvemos: recurrencia T(n) = T(n-1) + T(n-2) + O(1) --> r^n = r^(n-1) + r^(n-2) --> r = número de Oro

            Ejercicio 47. Se tiene el siguiente método:

                public static int sumaNPrimeros(int n) {
                    int suma = 0;   O(1)
                    for (int i = 1; i <= n; i++) {   O(n)
                        suma += i;                   O(1)
                     }
                   return suma;                      O(1)
                }

                Resultado: O(n)

                Utilizando el profiler de Netbeans se han medido los tiempos de ejecución
                de diferentes llamadas al método (véase el cuadro 1). Explique los resultados.

                Cuadro 1: Tiempos de ejecución del método del ejercicio 47

                    Llamada Tiempo de ejecución
                    sumaNPrimeros(100) 0,003 ms
                    sumaNPrimeros(1000) 0,013 ms
                    sumaNPrimeros(10000) 0,131 ms
                    sumaNPrimeros(100000) 1,20 ms
                    sumaNPrimeros(1000000) 3,27 ms
                    sumaNPrimeros(10000000) 6,19 ms
                    sumaNPrimeros(100000000) 36 ms
                    sumaNPrimeros(1000000000) 325 ms


                Los resultados se corresponden con O(n), porque son muy similares al comportamiento lineal.


            Ejercicio 48. Se tiene el siguiente método:

                public static int sumaNMPrimeros(int n) {
                    int suma = 0;                      O(1)
                    for (int i = 1; i <= n; i++) {     O(n)
                        for(int j = 1; j <= i; j++)    O(n)
                        suma += j;                     O(1)
                     }
                    return suma;                       O(1)

                    }

                Resultado: O(n^2)

            Utilizando el profiler de Netbeans se han medido los tiempos de ejecución
            de diferentes llamadas al método (véase el cuadro 2). Explique los resultados.
            Cuadro 2: Tiempos de ejecución del método del ejercicio 48

                Llamada Tiempo de ejecución

                sumaNPrimeros(100) 0,085 ms
                sumaNPrimeros(1000) 2,16 ms
                sumaNPrimeros(10000) 18,1 ms
                sumaNPrimeros(100000) 1531 ms

            Si graficamos los datos, se corresponden con n^2.


            

             */








            /*





     */


}
