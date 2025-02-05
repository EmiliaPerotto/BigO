import java.util.Random;
import java.util.*;
import java.io.*;

public class Timing {
  static int[] arr;
  public static void main(String[] args) throws IOException{
    Random rand = new Random();
    int SIZE = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Input filename: ");
    String filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    int j = 0;
    while(fin.hasNextInt()){
      j++;
      System.out.println("while");
      fin.nextLine();
    }
    // System.out.println("after");
    fin = new Scanner(new File(filename));
    int[] arr1 = new int[j];               //putting text inputs into an array
    for (int i = 0; i < j; i++) {
      arr1[i] = fin.nextInt();
      // System.out.println("j");
      arr = new int[arr1[i]];
      for (int h = 0; h < arr1[i]; h++) {
        arr[h] = rand.nextInt();
        // System.out.println("h");
      } 
    // generate random numbers for array
    for (int p = 0; p < 10; p++) {
      // System.out.println("p");
      //int target = rand.nextInt();
    long start = System.currentTimeMillis();
    Util.selectionSort(arr);
    long end = System.currentTimeMillis();
    long diff = end - start;
    System.out.println("Size: " + arr1[i] + " trial: " + (p + 1) + " diff: " + diff);


    }
    System.out.println("end");
    }
  
    // // generate random numbers for array
    // long start = System.currentTimeMillis();
    // Util.bubbleSort(arr1);
    // long end = System.currentTimeMillis();
    // long diff = end - start;
    // System.out.println(diff);
  }
}