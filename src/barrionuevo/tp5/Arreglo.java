package barrionuevo.tp5;
/*
a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
enteros y muestre por pantalla la suma y promedio de los mismos.

b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.

c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
de vocales que tiene la cadena.

d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego
retorne la cantidad de veces que se repite en la cadena el carácter recibido.
*/
public class Arreglo {
    public static void sumarLista(int[] arreglo){
        float suma = 0, promedio;
        for(int indice: arreglo){
            suma += indice;
        }
        promedio = suma / arreglo.length;
        System.out.println("Suma: "+ suma + "\nPromedio: "+ promedio);
    }
    public static int buscarMayor(int[][] arreglo){
        int mayor = arreglo[0][0];
        for(int[] dim1: arreglo){
            for(int dim2: dim1){
                if(dim2 > mayor) mayor = dim2;
            }
        }
        //System.out.println("Mayor "+ mayor);
        return mayor;
    }
    public static int cuentaVocales(String cadena){
        //char[] vocales = {'a','e','i','o','u'};
        char[] vocales = "aeiou".toCharArray(), cadenaArray = cadena.toCharArray();
        int cantidadVocales = 0;
        for(char caracter:cadenaArray){
            for(char vocal:vocales){
                if(vocal == caracter)cantidadVocales++;
            }
        }
        //System.out.println(cantidadVocales);
        return cantidadVocales;
    }
    public static int cuentaCaracter(String cadena, char caracter){
        int cantidad = 0;
        for(int i = 0, j= cadena.length(); i<j; i++){
            if(caracter == cadena.charAt(i))cantidad++;
        }
        //System.out.println(cantidad);
        return cantidad;
    }
}
