public class Kata {
	public static String longToIP(long ip) {
    String[] ipAdd = new String[4];
    int octet  = 4;
    while (octet -- != 0) {
      ipAdd[octet ] = "" + (ip % 256);
      ip /= 256;
    }
    String ipv4 = ipAdd[0]+"."+ipAdd[1]+"."+ipAdd[2]+"."+ipAdd[3];
    return ipv4;
	}
}
