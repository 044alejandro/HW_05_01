package Handler;

public class XMLHandler extends AbstractHandler{
	@Override
	public void open() {
		System.out.println("XMLHandler opens a document");
	}

	@Override
	public void create() {
		System.out.println("XMLHandler create a document");
	}

	@Override
	public void change() {
		System.out.println("XMLHandler change a document");
	}

	@Override
	public void save() {
		System.out.println("XMLHandler save a document");
	}
}
