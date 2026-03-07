package neetcode.designdynamicarray;

// nao esquecer de remover esse public posteriormente
public class DynamicArray {


    private int size;
    private int capacity;
    private int[] meuArray;


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.meuArray = new int[capacity];
    }

    public int get(int i) {
//        int retorno = 0;
        try {
            return meuArray[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public void set(int i, int n) {
        this.meuArray[i] = n;

    }

    public void pushback(int n) {

        if(this.size >= this.capacity){
            this.resize();
        }
        this.meuArray[this.size] = n;
        this.size++;



    }

    public int popback() {
        int removido;
        int ultimoValor = this.size-1;
        removido = this.meuArray[ultimoValor];
        this.size --;
        set(ultimoValor,0);
        return removido;

    }

    public void resize() {
        this.capacity = this.capacity * 2;
        int[] arrayProvisorio = new int[this.capacity];
        for(int i = 0; i < this.size; i++){
            arrayProvisorio[i] = this.meuArray[i];
        }
        this.meuArray = new int[this.capacity];
        this.meuArray = arrayProvisorio;

    }

    /*
    RETORNA OS ELEMENTOS VALIDOS DO ARRAY
     */
    public int getSize() {
        return this.size;
    }

    /*
    RETORNA A CAPACIDADE DO ARRAY
     */
    public int getCapacity() {
        return this.capacity;
    }

    public void imprimeArray(){
        for(int i = 0; i< this.meuArray.length; i++ ){
            System.out.println(this.meuArray[i]);
        }
    }
}
