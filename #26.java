import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the first array");
    int n = sc.nextInt();
    System.out.println("Enter the elements in the first array");
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
    a[i] = sc.nextInt();
    System.out.println("Enter the number of elements in the second array");
    int m = sc.nextInt();
    System.out.println("Enter the elements in the second array");
    int[] b = new int[m];
    for (int i = 0; i < m; i++)
    b[i] = sc.nextInt();
    int u = abc.getSumOfIntersection(a, b);
    if (u == -1)
      System.out.println("No common elements");
    else
      System.out.println("Sum of common elements is:"+u);
  }
  }
  // Method...................
class abc
{
static int getSumOfIntersection(int[] a,int[] b) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j])
          sum = sum + a[i];
      }
    }
    if (sum == 0)
      return -1;
    else
      return sum;
  }
}
