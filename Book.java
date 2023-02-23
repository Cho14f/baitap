
import java.util.Scanner;

public class Book extends Athor {
	private String nameE;
	private float price;
	
	
	public Book() {
		super();
	}
	public Book(String name,float price) {
		super();
		
		this.nameE= name;
		this.price= price;
		
	}
	
	public String getName() {
		return nameE;
	}
	public void setName(String name) {
		this.nameE = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + nameE + ", price=" + price + ", author=" + "]";
	}
	public void nhap() {
		System.out.println("Nhập số tên tác giả: ");
		int n; 
		
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
    	Athor[] author = new Athor[n];
    	System.out.println("Nhập thông tin các tác giả: ");
    	for(int  i= 0; i<author.length; i++) {
    		System.out.println(i+1);
    	
		author[i] = new Athor();
		author[i].setName(sc.nextLine());
		author[i].setEmail(sc.nextLine());

	}
    	System.out.println("Nhập tên sach: ");
    	nameE = sc.nextLine();
    	System.out.println("Nhap gia ban: ");
    	price = sc.nextFloat();
	}
	public void xuat(Athor[] authors) {
		System.out.println("là");
		for(int  i= 0; i<authors.length; i++) {
    		System.out.println(i+1);
    		System.out.println("tên tác giả"+ authors[i].getName());
    		System.out.println("Email"+ authors[i].getEmail());
    		System.out.println(i+1);
	}
	}
	public static void main(String[] args) {
    	
      int n;
      int dem = 0;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhâp số đau sach ");
      n = sc.nextInt();
      System.out.println("Nhập thông tin các cuốn sách ");
      Book[] books= new Book[n];
      for(int  i= 0; i<books.length; i++) {
  		System.out.println("nhâp thong tin dau sach thu "+(i+1));
  	
		books[i] = new Book();
		books[i] .nhap();
}
      System.out.println("sô đau sach co gia từ 200k tro lên");
      for(int  i= 0; i<books.length; i++) {

    		if(books[i].getPrice() >= 200000);
    		dem++;
    
	}
  	System.out.println(dem);
  	sc.close();
}
}


