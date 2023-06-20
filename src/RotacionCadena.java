public class RotacionCadena {

    // TODO

     /*Una rotacion de cadenas es cuando movemos hacia la derecha o a la izquierda los caracteres de una cadena un numero determinado de veces,
    si la cadena llega hasta el final, los caracter dan vuelta hasta el principio de la cadena. Ejemplo:

            "México" --> rotar 3 posiciones --> "icoMéx"
            "Accenture" --> rotar 5 posiciones --> "ntureAcce"

    Escribir un método que me regrese verdadero si una cadena es rotacion de otra:

    sonRotacion("México", "icoMéx") ---> true
    sonRotacion("ntureAcce", "Accenture") ---> true
    sonRotacion("México", "Accenture") ---> false

    */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("México");
        StringBuilder stringBuilder2 = new StringBuilder("icoMéx");

        System.out.println(stringBuilder.indexOf("M"));
        System.out.println(stringBuilder2.indexOf("M"));
        System.out.println(stringBuilder.length());
      /*  System.out.println("\n-------------- indexOf() ----------------");
        System.out.println(stringBuilder);
        System.out.println("Index of \"y\": "+ stringBuilder.indexOf("y"));
        System.out.println("Index of \"Itzel\": "+ stringBuilder.indexOf("Itzel"));

        System.out.println("Index of \"y\": "+ stringBuilder2.indexOf("y"));
        System.out.println("Index of \"Itzel\": "+ stringBuilder2.indexOf("Itzel"));
 */
        System.out.println(sonRotacion("México", "icoMéx"));
    }

    static boolean sonRotacion (String original, String rotada) {
        StringBuilder originalBuild = new StringBuilder(original);
        StringBuilder rotadaBuild = new StringBuilder(rotada);

        int[] letras = new int[255];

        int contadorLetraCambiadas;
        int contadorLetraIgual;
        char c;

        if (originalBuild.length() == rotadaBuild.length()) {

            for (int i = 0; i < originalBuild.length(); i++) {

                // llenaos el banco de letras ASCCI, para poder usar el
                // indexOf que pide el string de la letra para comparar indexes entre las dos cadenas
                letras[originalBuild.charAt(i)]++;
                c = (char) letras[i];
                System.out.println(c);
            }

        return true;

        }
        else
            return false;


    }

    /*
    static boolean sonRotacion (StringBuilder original, StringBuilder rotada){
        String[] originalSplit = original.toString().split(" ");
        System.out.println(arrayToString(originalSplit));
        if(original.length() == rotada.length()){
            int length = original.length();
            char original1 ;
            char rotada1;
            String[] splitOriginal = original.toString().split(" ");

            for(int i = 0 ; i < length ; i ++){
                original1= original.charAt(i);
                rotada1 = rotada.charAt(i);

                if(original.indexOf(originalSplit[i]) != rotada.indexOf(originalSplit[i])){
                    System.out.println("infex of: "+ splitOriginal[i] + " en el original esta en el index " + original.indexOf(splitOriginal[i]) + " y en la rotada en el: " + rotada.indexOf(splitOriginal[i])) ;
                }

            }


            return true;
        }else{
            return false;
        }

    }*/

    static String arrayToString(String[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        java.lang.StringBuilder b = new java.lang.StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }

    }

}
