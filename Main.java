import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = myObj.nextLine(); 
    System.out.println("wpisz liczbe");
    int liczba=myObj.nextInt();
    System.out.println("wpisz double");
    double liczba2=myObj.nextDouble();
    System.out.println("wpisz bool");
    boolean liczba3=myObj.nextBoolean();
  }
}