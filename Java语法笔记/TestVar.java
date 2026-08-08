public class TestVar{
	public static void main(String[] args){
		//实验1：基本类型——独立复制
		int a=5;
		int b=a;
		b=10;
		System.out.println("a="+a);
		System.out.println("b="+b);
	
		//实验2：引用类型——共享同一份数据
		int[] arr1={1,2,3};
		int[] arr2=arr1;
		arr2[0]=999;
		System.out.println("arr1[0]="+arr1[0]);

		//实验3：String --不可变
		String s1="hello";
		String s2=s1;
		s2="world";
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
	}
}

		