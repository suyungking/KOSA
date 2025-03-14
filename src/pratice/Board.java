package pratice;

public class Board {
	private String name;
	private String title;
	private String qwer;

	public Board(String name, String title, String qwer) {
		this.name = name;
		this.qwer = qwer;
		this.title = title;
		
	}

	public String getName() {
		return name;
	}

	public String getQwer() {
		return qwer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQwer(String qwer) {
		this.qwer = qwer;
	}
	
	
}
