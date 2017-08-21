
public abstract class Notepad implements INotepad {
	private int numberOfPages;
	private Page[] pages;
	private boolean isHardCover;
	Notepad(int numberOfPages, boolean isHardCover) {
		if(numberOfPages > 0) {
			this.numberOfPages = numberOfPages;
			this.pages = new Page[numberOfPages];
		} else {
			this.numberOfPages = 50;
			this.pages = new Page[50];
		}
		this.isHardCover = isHardCover;
	}
	public void setPages(Page[] page) {
		if(page != null) {
			this.pages = page;
		}
	}
	public Page[] getPages() {
		return pages;
	}
	public boolean getIsHardCovered() {
		return isHardCover;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}

	

}
