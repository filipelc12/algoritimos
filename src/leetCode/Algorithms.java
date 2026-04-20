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

    public int[] getConcatenation(int[] nums){
        int lengthNovoArray = nums.length * 2;

        int[] retorno = new int[lengthNovoArray];

        for(int i = 0; i< nums.length; i++){
            int numero = nums[i];
            retorno[i] = numero;
            retorno[(lengthNovoArray /2) + i] = numero;
        }

        return retorno;


    }

    /**
     * Q2. Shuffle the Array
     * Easy
     * Topics
     * premium lock icon
     * Companies
     * Hint
     * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
     *
     * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,5,1,3,4,7], n = 3
     * Output: [2,3,5,4,1,7]
     * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
     * Example 2:
     *
     * Input: nums = [1,2,3,4,4,3,2,1], n = 4
     * Output: [1,4,2,3,3,2,4,1]
     * Example 3:
     *
     * Input: nums = [1,1,2,2], n = 2
     * Output: [1,2,1,2]
     */


    public int[] shuffle(int[] nums, int n){
        // a resposta é que dividir o array deica tudo melhot

        // i have to split the array. And make something like i did

        int[] numsDividido1 = new int [nums.length /2];
        int[] numsDividido2 = new int [nums.length /2];

        int[] retorno = new int[nums.length];

        for(int i = 0; i<nums.length/2; i++ ){
            numsDividido1[i] = nums[i];
            numsDividido2[i] = nums[i + n];
        }
        n = 0;

        for(int i = 0; i < retorno.length /2;i++){

            retorno[n] = numsDividido1[i];
            n++;
            retorno[n] = numsDividido2[i];
            n++;
        }

        return retorno;

    }

    /**
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
     * Example 2:
     *
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2
     */

    public int findMaxConsecutiveOnes(int[] nums){
        int maximoConsecutivos = 0;
        int maximoConsecutivosAtual = 0;

        for(int i = 0; i< nums.length ; i++){
            int atual = nums[i];
            if(atual == 1) {
                maximoConsecutivosAtual++;
            } else {
                maximoConsecutivosAtual = 0;
            }

            if(maximoConsecutivosAtual > maximoConsecutivos){
                maximoConsecutivos = maximoConsecutivosAtual;
            }

        }

        return maximoConsecutivos;
    }
    //d

}
