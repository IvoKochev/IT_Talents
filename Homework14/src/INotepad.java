
public interface INotepad {
	void addTextOnPage(int number, String text);
	void replaceTextOnPage(int number, String text);
	void deleteTextOnPage(int number);
	void printAllPages();
	void addPage(Page page);
	boolean searchWord(String word);
	void printAllPagesWithDigits();
	

}
