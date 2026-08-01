public class TestMain{
	public static void main(String[] args){
		System.out.println("你传入了"+args.length+"个参数");
		for(int i =0;i<=args.length;i++){
			System.out.println("第"+(i+1)+"个是："+args[i]);
		}
	}
}