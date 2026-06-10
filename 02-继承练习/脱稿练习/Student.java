public class Student{
	private String id;
	private String name;
	private Double score;


	public Student(String id,String name,Double score){
		this.id=id;
		this.name=name;
		this.score=score;
	}

	public void showInfo(){
		System.out.println("学号:"+id+"姓名:"+name+"分数"+score);
	}
}