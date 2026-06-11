public class Keyboard implements USB{
	@Override
	public void connect(){
		System.out.println("连接键盘");
	}

	@Override
	public void disconnect(){
		System.out.println("断开键盘连接");
	}
}
	