package Handler;

public class TXTHandler extends AbstractHandler{
	@Override
	public void open() {
		System.out.println("TXTHandler opens a document");
	}

	@Override
	public void create() {
		System.out.println("TXTHandler create a document");
	}

	@Override
	public void change() {
		System.out.println("TXTHandler change a document");
	}

	@Override
	public void save() {
		System.out.println("TXTHandler save a document");
	}
}
