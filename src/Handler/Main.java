package Handler;

public class Main {
	public static void main(String[] args) {
		System.out.println("DOC");
		workWithDOCHandler();
		System.out.print("\n");

		System.out.println("TXT");
		workWithTXTHandler();
		System.out.print("\n");

		System.out.println("XML");
		workWithXMLHandler();
		System.out.print("\n");
	}

	public static void workWithDOCHandler(){
		DOCHandler docHandler = new DOCHandler();

		docHandler.create();
		docHandler.open();
		docHandler.change();
		docHandler.save();
	}

	public static void workWithTXTHandler(){
		TXTHandler txtHandler = new TXTHandler();

		txtHandler.create();
		txtHandler.open();
		txtHandler.change();
		txtHandler.save();
	}

	public static void workWithXMLHandler(){
		XMLHandler xmlHandler = new XMLHandler();

		xmlHandler.create();
		xmlHandler.open();
		xmlHandler.change();
		xmlHandler.save();
	}
}