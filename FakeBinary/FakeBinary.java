public class FakeBinary {
    public static String fakeBin(String numberString) {
        String newString = "";
        for(int i=0; i<numberString.length(); i++){
          if(Integer.parseInt(""+numberString.charAt(i))<5){
            newString = newString+"0";
          }
          else{
            newString = newString+"1";
          }
          
        }
        return newString;
    }
}