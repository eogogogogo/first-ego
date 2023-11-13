package day12;

public class Board {
	// 필드
	private String id;
	private int bno; // 책번호
	private String title; 
	private String contents;
	private int cnt; // 조회수
	private boolean like; // 좋아요
	
	static int num = 100;
	
	// 생성자
	public Board(String title, String contents, String id) {
		bno = num++;
		this.title = title;
		this.contents = contents;
		this.id = id;
	}
	
	// 메서드
	public String getId() {
		return id;
	}
	public int getBno() {
		return bno;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void cntUp() {
		cnt++;
	}
	public void likeToggle() {
		like = !like;
	}
	public boolean getLike() {
		return like;
	}

	
	
	
	
	
	
	
	
	
	
	public void print() {
		System.out.printf("%-15s     %s%3d\n", "["+bno+":"+title+"]",
				like ? "🖤" : "🤍", cnt);
		System.out.printf("┏━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n");
		System.out.printf("┃%-26s┃\n", "");
		System.out.printf("┃%-26s┃\n", 
				contents.length()<=26 ? contents : contents.substring(0,23)+"...");
		System.out.printf("┗━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
	}
}