import java.util.Scanner;

public class SecuredNotepad extends Notepad {
	private final String password;

	SecuredNotepad(int numberOfPages, boolean isHardCover, String password) {
		super(numberOfPages, isHardCover);
		if(checkHardPassword(password)) {
			this.password = password;
		} else {
			this.password = "Ivo1234";
		}

	}

	String getPass() {
		return this.password;
	}
	@Override
	public void addTextOnPage(int number, String text) {
		System.out.println("Please, enter the password:");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next())) {
			number--;
			if (number >= 0 && number < this.getPages().length && text != null && !text.isEmpty()) {
				this.getPages()[number].addText(text);
			} else {
				System.out.println("No text has been added!");
			}
		} else {
			System.out.println("Wrong password!");
		}

	}

	@Override
	public void replaceTextOnPage(int number, String text) {
		System.out.println("Please, enter the password!");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next())) {
			number--;
			if (number >= 0 && number < this.getPages().length && text != null && !text.isEmpty()) {
				this.getPages()[number].setText(text);
			} else {
				System.out.println("No text has been replaced!");
			}
		} else {
			System.out.println("Wrong password!");
		}

	}

	@Override
	public void deleteTextOnPage(int number) {
		System.out.println("Please, enter the password!");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next())) {
			number--;
			if (number >= 0 && number < this.getPages().length) {
				this.getPages()[number].setText("");
			}
		} else {
			System.out.println("Wrong password!");
		}

	}

	boolean checkPassword(String password) {
		return this.password.equals(password) ? true : false;
	}

	@Override
	public void printAllPages() {
		System.out.println("Please, enter the password!");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next())) {
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
			System.out.println("Wrong password!");
		}

	}

	@Override
	public void addPage(Page page) {
		System.out.println("Enter the password: ");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next())) {
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
			System.out.println("Wrong password!");
		}

	}

	@Override
	public boolean searchWord(String word) {
		System.out.println("Enter the password: ");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next())) {
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
		System.out.println("Wrong passowrd!");
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println("Enter the password: ");
		Scanner sc = new Scanner(System.in);
		if (checkPassword(sc.next())) {
			if (this.getPages() != null) {
				for (int i = 0; i < this.getPages().length; i++) {
					if (this.getPages()[i] != null && this.getPages()[i].containsDigits()) {
						this.getPages()[i].showPage();
					}
				}
			}

		} else {
			System.out.println("Wrong password!");
		}
	}

	boolean checkHardPassword(String pass) {
		if(pass.length() < 5) {
			return false;
		} else {
			int count = 0;
			for(int i = 0; i < pass.length(); i++) {
				int ascii = (int) pass.charAt(i);
				if(ascii >= 48 && ascii <= 57) {
					count++;
					break;
				}
				
			}
			for(int i = 0; i < pass.length(); i++) {
				int ascii = (int) pass.charAt(i);
				if(ascii >= 65 && ascii <= 90) {
					count++;
					break;
				}
			}
			for(int i = 0; i < pass.length(); i++) {
				int ascii = (int) pass.charAt(i);
				if(ascii >= 97 && ascii <= 122) {
					count++;
					break;
				}
			}
			return count == 3 ? true : false;
		}
	}
}
