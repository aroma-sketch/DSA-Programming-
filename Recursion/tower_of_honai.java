package Recursion;
// You are required to enter the number of discs and the integer id's for all 3 towers.
// Rules of game :

// You can move only 1 disc at a time.
// A larger disc can never be placed under a smaller disc.
// You can move only the top-most disc.
import java.util.*;

public class tower_of_honai
{
  public static void toh(int n, int t1, int t2, int t3)
  {
    if (n == 0)
      return;
    toh(n - 1, t1, t3, t2);
    System.out.println(n + "[" + t1 + " -> " + t2 + "]");
    toh(n - 1, t3, t2, t1);
  }
  public static void main(String[] args) throws Exception
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int t1 = scn.nextInt();
    int t2 = scn.nextInt();
    int t3 = scn.nextInt();
    toh(n, t1, t2, t3);
  }
}
