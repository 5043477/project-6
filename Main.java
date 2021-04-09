import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String[] firstNames = {"Bryson", "Dylan", "Abdulah", "jay", "connor", "chase", "shrek"};
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your full name? ");
    String fullName = scan.nextLine();
    int index;
    index = fullName.indexOf(" ");
    System.out.println(index);
    String firstName = (fullName.substring(0, index));
    System.out.println(firstName);
    if (fullName.equals(firstNames)) {
    System.out.println("welcome back to class" + firstName);
    }else{
      System.out.println("sorry, i think you are in the wrong class");
    }

  }
}