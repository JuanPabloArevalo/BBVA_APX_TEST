public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String typeNum = "Odd";
        if(number % 2 == 0){
          typeNum = "Even";
        }
        return typeNum;
    }
}