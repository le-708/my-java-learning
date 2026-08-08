public class Student{
	private String id;
	private String name;
	private double score;

	public Student(String id,String name,double score){
		this.id=id;
		this.name=name;
		this.score=score;
	}
	public String getid(){
		return id;
	}
	public void showInfo(){
		System.out.println("学号:"+id+",姓名："+name+"，成绩:"+score);
	}
}
		