import java.util.Random;

public class Timing {
  public static void main(String[] args) {
    Random rand = new Random();
    int SIZE = 1024;
    int[] arr = new int[SIZE];
    Scanner in = new Scanner(System.in);
    System.out.println("Input filename: ");
    String filename = in.next();
    Scanner fin = new Scanner(new File(filename));
    int lines = 0;
    int j = 0;
    while(fin.hasNextLine()){
      arr1[j] = fin.nextInt();
      j++;
      lines++;
      
    }
    int[] arr1 = new int[lines];
    // generate random numbers for array
    for (int i = 0; i < SIZE; i++) {
      arr[i] = rand.nextInt();
    }
    long start = System.currentTimeMillis();
    Util.bubbleSort(arr);
    long end = System.currentTimeMillis();
    long diff = end - start;
    System.out.println(diff);
  }
}