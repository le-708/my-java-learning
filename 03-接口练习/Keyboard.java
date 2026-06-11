public class Keyboard implements USB{
	
	@Override
	public void connect(){
		System.out.println("键盘链接，开始打字");
	}

	@Override
	public void disconnect(){
		System.out.println("键盘断开，停止输入");
	}
}