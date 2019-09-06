class Persist {
	public static int persistence(long n) {
      int count = 0;
	    while(n > 9){
	      count++;
	      String[] cantidad = (n+"").split("");
	      long multip = 1;
		    for(int i=0; i<cantidad.length; i++ ){
		      multip = Integer.parseInt(cantidad[i]) * multip;
		    }
		    n = multip;
	    }
	    return count;
	}
}