public class CtoFTester{
  public static void main(String[]args){
    celsiusToFahrenheit(0);
    celsiusToFahrenheit(-40);
  }
  public static void celsiusToFahrenheit(int C){
    System.out.println(C * 9 / 5 +32);
  }
}
