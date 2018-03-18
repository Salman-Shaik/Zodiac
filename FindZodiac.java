import java.util.Scanner;
class FindZodiac{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Date Of Birth In (\"DD-MM-YYYY\")Format:");
    Zodiac zodiac = new Zodiac(scan.next());
    String sign=zodiac.getSign();
    if(sign.contains("Invalid")) {
      System.out.println(sign);
      return;
    }
    System.out.println("Your Zodiac Sign Is: "+sign);
  }
}
