public class Main{
	public static void main(String[] args){
		Worker[] workers= new Worker[3];
		workers[0]=new Chef();
		workers[1]=new Doctor();
		workers[2]=new Boxer();
		for(int i =0;i<workers.length;i++){
			workers[i].dowork();
		}
	}
}