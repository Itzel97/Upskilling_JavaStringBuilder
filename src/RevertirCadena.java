public class RevertirCadena {

    public static void main(String[] args) {
            StringBuilder stringBuilder = new StringBuilder("Hola como estas");
           System.out.println("Cadena recibida: " + stringBuilder);



            // -split() -- nos ayuda a usar los espacios como separadores de cadena
            // y los poademos almacenar en un array
            System.out.println("-------------- split() ----------------");
           // System.out.println(stringBuilder);
            String[] splits = stringBuilder.toString().split(" ");

            invertirCadena(splits);
    }

    static void invertirCadena (String [] a){
        int indexEnd = a.length;
        String [] newSplit = new String[a.length];

        int indexStart = 0;
        String cadenaRevertida = "";
        String auxiliar = "";

        for (int i = a.length - 1 ;  i >= 0  ; i--){
            //System.out.println(i);
            auxiliar = a[i];
            newSplit[indexStart] = auxiliar;
            indexStart++;

        }
       // cadenaRevertida = newSplit[0] + " " + newSplit[1]  +" " +newSplit[2];
       //System.out.println(cadenaRevertida);
        System.out.println("Cadena invertida: " + arrayToCadena(newSplit));
    }

    static String arrayToString(String[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    static String arrayToCadena (String []a){
        if (a == null)
            return "null";

        int iMax =a.length -1;
        if(iMax == -1)
            return " ";
        StringBuilder b = new StringBuilder();
        for( int i = 0; ;i ++){
            b.append(a[i]);
            if(i == iMax)
                return b.toString();
            b.append(" ");

        }

    }
}
