import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here


        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder("success");

        int stringLength = stringBuilder.length();
        //1- identificar cuantas letras diferntes tiene la palabra.
        //Dentro de la tabla ASCII, exiten en total 255 caracteres,
        // se busca que usando el index como numero de tabla ASCCI, incremente ya sea 1 o 2 la cantidad de veces que ese caracter se ha usado


        int [] letras = new int [255];

        //banco de letras,
        // letras =[0,0,0,0,0,0,0]
        //          A,B,C,D,E,F,G

        for (int i = 0 ; i < stringBuilder.length() ; i++) {
            // La variable

            letras[stringBuilder.charAt(i)]++;
            //System.out.println(stringBuilder.charAt(i));
            //System.out.println(letras[stringBuilder.charAt(i)]);
           // System.out.println("letra recorrida = " + stringBuilder.charAt(i));

        }

        //System.out.println(arrayToString(letras));
        //System.out.println("stringBuilder = " + stringBuilder);
        segundoMasGrand(letras);

    }

    static String arrayToString(int[] a) {
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

    static void segundoMasGrand (int [] a){
        /*int masGrande =0;
        int indiceMasGrande = 0 ;
        int segundoMasGrande = 0;
        int indiceSegundoGrande = 0 ;

            for (int i = 0; i < a.length; i ++) {
                if (a[i] > masGrande) {
                 masGrande = a[i];
                    indiceMasGrande = i;
                 } else {
                    if (a[i] > segundoMasGrande) {
                        segundoMasGrande = a[i];
                        indiceSegundoGrande = i;
                    }
                }
             }
            System.out.println("indiceSegundoGrande = " + segundoMasGrande);
            System.out.println("indiceMasGrande = " + masGrande);
            */

        int masGrande = 0;
        int segMasGrande = 0;
        int indiceMasGrande = 0 ;
        int indiceSegundoGrande = 0 ;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > masGrande ) {
                segMasGrande = masGrande ;
                indiceSegundoGrande = indiceMasGrande;
                masGrande = a[i];
                indiceMasGrande = i ;
            } else {
                if (a[i] > segMasGrande) {
                    segMasGrande= a[i];
                    indiceSegundoGrande = i;
                }
            }
        }

        char c = (char)indiceSegundoGrande;
        System.out.println("La segunda letra de mayor repeticion es:  " + c);
        }


}

