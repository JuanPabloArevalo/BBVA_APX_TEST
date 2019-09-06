public class Printer {
    
    public static String printerError(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
          if((""+s.charAt(i)).matches("[^a-m]")){
            count++;
          }
        }
        return count+"/"+s.length();
    }
}