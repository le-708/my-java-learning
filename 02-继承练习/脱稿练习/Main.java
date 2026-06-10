public class Main{
	public static void main(String[] args){
		Student stu=new Student("211"+"张三"+"85.0");
		GraduateStudent gra= new GraduateStudent("985"+"李四"+"96.0"+"机器学习");

		stu.showInfo();
		System.out.println("---");
		gra.showInfo();
	}
}

	
	