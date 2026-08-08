import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		ArrayList<Student> list=new ArrayList<>();

		list.add(new Student("001","张三",85.5));
		list.add(new Student("002","李四",92.0));
		list.add(new Student("003","王五",78.0));

		System.out.println("=== 当前学生名单===");
		showAll(list);

		System.out.println("\n=== 删除学号02===");
		deleteById(list,"002");

		System.out.println("\n===删除后的名单===");
		showAll(list);
	}

	public static void showAll(ArrayList<Student> list){
		for(int i=0;i<list.size();i++){
			list.get(i).showInfo();
		}
	}

	public static void deleteById(ArrayList<Student>list,String id){
		for(int i =0;i<list.size();i++){
			if(list.get(i).getId().equals(id)){
				list.remove(i);
				System.out.println("已删除学号:"+id);
				return;
			}
		}
		System.out.println("未找到学号:"+id);
	}
}
