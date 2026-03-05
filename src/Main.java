import leetCode.Solution;
import neetcode.designdynamicarray.DynamicArray;

void main() {
  IO.println("Hello and welcome!");

  // INPUT
  //int[] input = new int[4];
//  int[] input = {3,2,4};
//
//  Solution sol = new Solution();
//
//  int[] resultado = sol.twoSum(input, 6);
//
//  IO.println(Arrays.toString(resultado));

  DynamicArray d = new DynamicArray(1);
//  IO.println(d.getSize());
//  IO.println(d.getCapacity());
//  d.set(2,1);

  IO.println("TAMANHO DO ARRAY: " +d.getSize());
  IO.println("CAPACIDADE DO ARRAY: " +d.getCapacity());
  d.pushback(1);
  IO.println("TAMANHO DO ARRAY: " +d.getSize());
  IO.println("CAPACIDADE DO ARRAY: " +d.getCapacity());
  d.pushback(2);
  IO.println("TAMANHO DO ARRAY: " +d.getSize());
  IO.println("CAPACIDADE DO ARRAY: " +d.getCapacity());
  IO.println("get: " +d.get(1));
  d.set(1,3);
  IO.println("get: " +d.get(1)); // AQUI TA QUEBRANDO
  IO.println("REMOVIDO: " +d.popback());
  IO.println("TAMANHO DO ARRAY: " +d.getSize());
  IO.println("CAPACIDADE DO ARRAY: " +d.getCapacity());






//  d.pushback(3);
//  IO.println("TAMANHO DO ARRAY: " +d.getSize());
//  IO.println("CAPACIDADE DO ARRAY: " +d.getCapacity());
//  d.pushback(2);
//  IO.println("TAMANHO DO ARRAY: " +d.getSize());
//  IO.println("CAPACIDADE DO ARRAY: " +d.getCapacity());
//
//  d.resize();
//
//  IO.println("TAMANHO DO ARRAY: " +d.getSize());
//  IO.println("CAPACIDADE DO ARRAY: " +d.getCapacity());
//
//  d.imprimeArray();



}
