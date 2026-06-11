public class Main{
	public static void main(String[] args){
        USB[] devices = new USB[2];
		devices[0]=new Mouse();
		devices[1]=new Keyboard();

		for (int i=0;i<devices.length;i++){
			devices[i].connect();
	    }

		System.out.println("---");

		for(int i =0;i<devices.length;i++){
			devices[i].disconnect();
		}
	}
}