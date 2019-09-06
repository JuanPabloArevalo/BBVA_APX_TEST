public class CountingDuplicates {
  public static int duplicateCount(String text) {
      text = text.toUpperCase();
	    int count = 0;
	    while(text.length()>1){
	    	if((text.substring(1)).contains(text.charAt(0)+"")){
	    		count++;
	    		text = text.replace(text.charAt(0)+"", "");
	    	}
        else{
           text = text.substring(1);
        }
	    }
		
		return count;
  }
}