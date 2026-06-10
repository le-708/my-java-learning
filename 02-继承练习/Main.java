public class Main{
	public static void main (String[] args){
		Student stu=new Student("2021001","张三",85.5);
		GraduateStudent gradStu=new GraduateStudent("2021002","李四",92.0,"机器学习");

		stu.showInfo();
		System.out.println("---");
		gradStu.showInfo();
	}
}