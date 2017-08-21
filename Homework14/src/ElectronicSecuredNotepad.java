import java.util.Scanner;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean isStarted;
	ElectronicSecuredNotepad(int numberOfPages, boolean isHardCover, String password, boolean isStarted) {
		super(numberOfPages, isHardCover, password);
		this.isStarted = isStarted;
		
	}
	@Override
	public void start() {
		this.isStarted = true;
		
	}
	@Override
	public void stop() {
		this.isStarted = false;
	}
	@Override
	public boolean isStarted() {
		return this.isStarted;
	}
	
	

	public void addTextOnPage(int number, String text) {
		System.out.println("Please, enter the password:");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next()) && this.isStarted()) {
			number--;
			if (number >= 0 && number < this.getPages().length && text != null && !text.isEmpty()) {
				this.getPages()[number].addText(text);
			} else {
				System.out.println("No text has been added!");
			}
		} else {
			System.out.println("Wrong password or not turned on!");
		}

	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}
	@Override
	public void replaceTextOnPage(int number, String text) {
		System.out.println("Please, enter the password!");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next()) && this.isStarted()) {
			number--;
			if (number >= 0 && number < this.getPages().length && text != null && !text.isEmpty()) {
				this.getPages()[number].setText(text);
			} else {
				System.out.println("No text has been replaced!");
			}
		} else {
			System.out.println("Wrong password or not turned on!");;
		}

	}

	@Override
	public void deleteTextOnPage(int number) {
		System.out.println("Please, enter the password!");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next()) && this.isStarted()) {
			number--;
			if (number >= 0 && number < this.getPages().length) {
				this.getPages()[number].setText("");
			}
		} else {
			System.out.println("Wrong password or not turned on!");
		}

	}


	@Override
	public void printAllPages() {
		System.out.println("Please, enter the password!");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next()) && this.isStarted()) {
			if (this.getPages() != null) {
				for (int i = 0; i < this.getPages().length; i++) {
					if (this.getPages()[i] != null) {
						System.out.println(
								"Title: " + this.getPages()[i].getTitle() + "\nText: " + this.getPages()[i].getText());
					}
				}
			} else {
				System.out.println("This notepad is empty!");
			}
		} else {
			System.out.println("Wrong password or not turned on!");
		}

	}

	@Override
	public void addPage(Page page) {
		System.out.println("Enter the password: ");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next()) && this.isStarted()) {
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
		} else {
			System.out.println("Wrong password or not turned on!");
		}

	}

	@Override
	public boolean searchWord(String word) {
		System.out.println("Enter the password: ");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next()) && this.isStarted()) {
			if (this.getPages() != null) {
				for (int i = 0; i < this.getPages().length; i++) {
					if (this.getPages()[i] != null) {
						if (this.getPages()[i].searchWord(word)) {
							return true;
						}
					} else {
						return false;
					}
				}
			}
			return false;
		}
		System.out.println("Wrong password or not turned on!");
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println("Enter the password: ");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next()) && this.isStarted()) {
			if (this.getPages() != null) {
				for (int i = 0; i < this.getPages().length; i++) {
					if (this.getPages()[i] != null && this.getPages()[i].containsDigits()) {
						this.getPages()[i].showPage();
					}
				}
			}

		} else {
			System.out.println("Wrong password or not turned on!");
		}
	}
}
