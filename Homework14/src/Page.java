
public class Page {
	private String title;
	private String text;

	Page(String title, String text) {
		if (title != null && !title.isEmpty()) {
			this.title = title;
		} else {
			this.title = "No title";
		}
		if (text != null && !text.isEmpty()) {
			this.text = text;
		} else {
			this.text = "No text";
		}
	}

	public void setTitle(String title) {
		if (title != null) {
			this.title = title;
		}
	}

	void addText(String text) {
		if (text != null && !text.isEmpty()) {
			if (this.text != null) {
				this.text += text;
			} else {
				this.text = text;
			}
		} else {
			System.out.println("No text has been added!");
		}
	}

	void deleteText() {
		this.text = "";
	}

	void showPage() {
		System.out.println("Title: " + this.getTitle() + "\nText: " + this.getText());
	}

	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text != null) {
			this.text = text;
		}
	}

	boolean searchWord(String word) {
		if(this.getText() != null) {
			return this.getText().contains(word);
		}
		return false;
	}

	boolean containsDigits() {
		if (this.getText() != null) {
			for (int i = 0; i < this.getText().length(); i++) {
				int ascii = (int) this.getText().charAt(i);
				if (ascii >= 48 && ascii <= 57) {
					return true;
				}
			}
		}
		return false;
	}
}
