package Handler;

public class DOCHandler extends AbstractHandler{
	@Override
	public void open() {
		System.out.println("DOCHandler opens a document");
	}

	@Override
	public void create() {
		System.out.println("DOCHandler create a document");
	}

	@Override
	public void change() {
		System.out.println("DOCHandler change a document");
	}

	@Override
	public void save() {
		System.out.println("DOCHandler save a document");
	}
}
