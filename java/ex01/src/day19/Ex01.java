package day19;
class Data{
	
}
class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return "title:"+title+", author:"+author;
	}
	@Override
	public boolean equals(Object obj) {
		Book a = (Book)obj;
		if(this.title.equals(a.title) && this.author.equals(a.author)) {
			return true;
		}
		return false;
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Book book1=new Book("삼국지","나관중");
		Book book2=new Book("삼국지","나관중");		
		Book book3=new Book("삼국지","이문열");
		
		if(book1.equals(book2)) {
			System.out.println("동일 도서");
		}if(book1.equals(book3)) {
			System.out.println("동일 도서");
		}else {
			System.out.println("비동일 도서");
		}
//		System.out.println(book);
//		
//		String str=new String("hello");
//		System.out.println(str);
	}

}
