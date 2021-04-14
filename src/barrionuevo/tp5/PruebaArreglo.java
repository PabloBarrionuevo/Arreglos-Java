package barrionuevo.tp5;

public class PruebaArreglo {
    public static void main(String[] args) {
        int[] pruebasumarLista = {1,2,3,4,5,6,7,8,9,0}; // 45, 45/10
        int[][] pruebabuscarMayor = {
            {1,2,3,4,5}
            ,{0,6,7,8,9}
            ,{21,34}
            ,{9,8887,98}
            ,{9,8,7,6,5,4,3,2}
            ,{65,43,23,67,8}
            ,{109,5,6,45,6,7,8,6,4}
            ,{654,4565,32465,65,6874,684,6341}//mayor[7][2]
            ,{55,93,3,3,3453,3,48,99,56,4}
            ,{44,78,78,78,79,79,7856,43,21}};
        String pruebacuentaVocales = "Lorem ipsum dolor sit amet" //9
                + ", consectetur adipiscing elit" //10
                + ", sed do eiusmod tempor incididunt ut labore et dolore magna aliqua" //25
                + ". Ut enim ad minim veniam" //9
                + ", quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"; //33 + 9 + 25 + 10 + 9 = 86
        char pruebaCaracter = 'd'; //11
        
        System.out.println("Sumar lista: \n"+ (java.util.Arrays.toString(pruebasumarLista)).replaceAll(",", " +"));
        Arreglo.sumarLista(pruebasumarLista);
        
        System.out.println("\n\nBuscar mayor: \n"+ (java.util.Arrays.deepToString(pruebabuscarMayor).replace("], [", "],\n[")));
        Arreglo.buscarMayor(pruebabuscarMayor);
        
        System.out.println("\n\nCuenta Vocales: \n"+ pruebacuentaVocales);
        Arreglo.cuentaVocales(pruebacuentaVocales);
        
        System.out.println("\n\nCuenta Caracter: \n"+ pruebaCaracter);
        Arreglo.cuentaCaracter(pruebacuentaVocales, pruebaCaracter);
    }
}