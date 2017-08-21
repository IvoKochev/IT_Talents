
public class NotepadDemo {

	public static void main(String[] args) {
		Page page1 = new Page("Page", "Text");
		Page page2 = new Page("Page2", "Text2");
		Page page3 = new Page("Page3", "Text3");
		Page page4 = new Page("Page4", "Text4");
		SimpleNotepad simpleNotepad = new SimpleNotepad(25, true);
		SecuredNotepad securedNotepad = new SecuredNotepad(30, true, "asd123");
//		simpleNotepad.addPage(page1);
//		simpleNotepad.addPage(page2);
//		//securedNotepad.addPage(page3);
//		//securedNotepad.addPage(page4);
//		//simpleNotepad.getPages()[1].setText("9ivo");
//		//simpleNotepad.getPages()[1].deleteText();
//		//System.out.println(simpleNotepad.getPages()[1].getText());
//		//System.out.println(simpleNotepad.getPages()[1].searchWord("ivo"));
//		//System.out.println(simpleNotepad.getPages()[1].containsDigits());
//		simpleNotepad.printAllPagesWithDigits();
//		ElectronicSecuredNotepad esn = new ElectronicSecuredNotepad(20, true, "123", false);
//		esn.setStarted(true);
//		esn.addPage(page4);
//		System.out.println(esn.getPages()[0].getText());
		SecuredNotepad sn = new SecuredNotepad(5, true, "ivo123A");
		System.out.println(sn.getPass());

		

	}


}
