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


}