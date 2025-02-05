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
    String filename = in.next();
    Scanner fin = new Scanner(new File(filename));
    int j = 0;
    while(fin.hasNextLine()){
      j++;
    }
    int[] arr1 = new int[j];               //putting text inputs into an array
    for (int i = 0; i < j - 1; i++) {
      arr1[i] = fin.nextInt();
    arr = new int[arr1[i]];
    for (int h = 0; h < arr1[i]; h++) {
      arr[h] = rand.nextInt();
    }  
    }   //
    for (int i = 0; i < j - 1; i++) {
      arr1[i] = fin.nextInt();
    }
  
    // generate random numbers for array
    long start = System.currentTimeMillis();
    Util.bubbleSort(arr1);
    long end = System.currentTimeMillis();
    long diff = end - start;
    System.out.println(diff);
  }
}