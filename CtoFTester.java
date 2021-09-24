public class CtoFTester{
  public static void main(String[]args){
    celsiusToFahrenheit(0);
    celsiusToFahrenheit(-40);
    fahrenheitToCelsius(32);
    fahrenheitToCelsius(-40);
  }
  public static void celsiusToFahrenheit(int C){
    System.out.println(C * 9 / 5 +32);
  }
  public static void fahrenheitToCelsius(int F){
    System.out.println((F -32) *5 / 9);
  }
}
