public class GraduateStudent entends Student{
	private String  researchDirection;

	public GraduateStudent(String id,String name,Double score,String  researchDirection){
		super(id,name,score);
		this. researchDirection= researchDirection;
		
	}

	@Overrid
	public void showInfo(){
		super.showInfo();
		System.out.println("研究方向:"+researchDirection);
	}
}