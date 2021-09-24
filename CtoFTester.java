//parameters should be 0 and 32 for celsius and fahrenheit respectively as 0 celsius should be equal to 32 fahrenheit
//parameters should also be -40 as both celsius and fahrenheit are equal at -40
//the type of parameter should be integers and the functions should return integers 



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
