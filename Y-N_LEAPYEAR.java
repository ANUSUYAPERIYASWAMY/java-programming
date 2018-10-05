import java.util.Scanner;
class Y-N_LEAPYEAR {
  public static void main(String[] args) {
  int Year;
  System.out.println("Enter the year");
  Scanner in = new Scanner(System.in);   
      Year = in.nextInt();
      if(Year%4==0)
      System.out.println("Yes");
      else
      System.out.println("No");

  }
}
