public class Mouse implements USB{
	@Override
	public void connect(){
		System.out.println("鼠标连接，灯光亮起");
	}

	@Override
	public void disconnect(){
		System.out.println("鼠标断开，灯光熄灭");
	}
}