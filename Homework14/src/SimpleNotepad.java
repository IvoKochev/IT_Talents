
public class SimpleNotepad extends Notepad {
	
	SimpleNotepad(int numberOfPages, boolean isHardCover) {
		super(numberOfPages, isHardCover);
	}

	@Override
	public void addTextOnPage(int number, String text) {
		number--; // pages start from 0 in the array
		if(number >= 0 && number < this.getPages().length && text != null && !text.isEmpty()) {
			this.getPages()[number].addText(text);;
		} else {
			System.out.println("No text has been added!");
		}
		
	}

	@Override
	public void replaceTextOnPage(int number, String text) {
		number--;
		if(number >= 0 && number < this.getPages().length && text != null && !text.isEmpty()) {
			this.getPages()[number].setText(text);
		} else {
			System.out.println("No text has been replaced!");
		}
		
	}

	@Override
	public void deleteTextOnPage(int number) {
		number--;
		if(number >= 0 && number < this.getPages().length) {
			this.getPages()[number].setText("");
		}
		
	}

	@Override
	public void printAllPages() {
		if(this.getPages() != null) {
			for(int i = 0; i < this.getPages().length; i++) {
				if(this.getPages()[i] != null) {
					System.out.println("Title: " + this.getPages()[i].getTitle() + "\nText: " + this.getPages()[i].getText());
				}
			}
		} else {
			System.out.println("This notepad is empty!");
		}
		
	}

	@Override
	public void addPage(Page page) {
		if(page != null) {
			int index = -1;
			for(int i = 0; i < this.getPages().length; i++) {
				if(this.getPages()[i] == null) {
					index = i;
					break;
				}
			}
			if(index != -1) {
				this.getPages()[index] = page;
			} else {
				System.out.println("There are no free pages!");
			}
		}
		
	}

	@Override
	public boolean searchWord(String word) {
		if(this.getPages() != null) {
			for(int i = 0; i < this.getPages().length; i++) {
				if(this.getPages()[i] != null) {
					if(this.getPages()[i].searchWord(word)) {
						return true;
					}
				} else {
					return false;
				}
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if(this.getPages() != null) {
			for(int i = 0; i < this.getPages().length; i++) {
				if(this.getPages()[i] != null && this.getPages()[i].containsDigits()) {
					this.getPages()[i].showPage();
				}
			}
		}
		
	}

	
	
	
	

}
