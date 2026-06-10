public class GraduateStudent extends Student{
	private String researchDirection;

	public GraduateStudent(String id,String name, double score,String researchDirection){
		super(id,name,score);
		this.researchDirection=researchDirection;
	}

	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("研究方向:"+researchDirection);
	}
}