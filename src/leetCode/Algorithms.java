package leetCode;

public class Algorithms{

    public static boolean isPalindrome(int n){ 
        String numero = String.valueOf(n);
        char[] numeroCharNormal = numero.toCharArray();

        int capacidadeArray = numeroCharNormal.length;

        char[] numeroCharInvertido = new char[capacidadeArray];

        int iNumeroCharInvertido = 0;

        // Cria array invertido
        for(int i = capacidadeArray-1; i > -1; i--){
            numeroCharInvertido[iNumeroCharInvertido] = numeroCharNormal[i];
            iNumeroCharInvertido++;
        }

        //Cria o comparador 
        for(int i = 0; i < capacidadeArray - 1; i++){
            if(numeroCharNormal[i] != numeroCharInvertido[i]){
                return false;
            }
        }


        return true;

    }

    /*
    Autoexplicativo, pega um romano e transforma e m numero
    "MCMXCIV"
     */

    public int romanToInt(String s) {
        int resultado = 0;

        String[] numerosRomanos = {"I", "V", "X", "L", "C", "D", "M"};
        //char[] romano = s.toCharArray();

        for (int i = 0; i < s.length() - 1; i++) {
            int atual = romano(s.charAt(i));
            int proximo = romano(s.charAt(i + 1));

            if (atual < proximo) {
                resultado -= atual; // Subtrai o menor que vem antes
            } else {
                resultado += atual; // Soma o maior (ou igual)
            }
        }
        return resultado + romano(s.charAt(s.length()-1));
    }

    private int romano(char c){
        switch (c){
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                throw new RuntimeException("Numero invalido");
        }
    }


}
