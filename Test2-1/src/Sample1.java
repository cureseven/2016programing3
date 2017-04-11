//zxXeK5Df
abstract class Publication{

	private String title;
	abstract Publication(String t){
		title =t;
	}

	 String getTitle();
	 void show();
}



class Book extends Publication{
	private long isbn;
	Book(String t,long i){
		title = t;
		isbn = i;
	}
	@Override
	void show() {
		System.out.println(title+","+isbn);

	}
}


class Magazine extends Publication{
	private int issue;
	Magazine(String t,int i){
		title = t;
		issue = i;
	}
	void show(){
		System.out.println(title+",第"+issue+"号");
	}
}




public class Sample1 {

	public static void main(String[] args) {
		Publication[] p ;
		p[0] = new Book("やさしいJava第５版",4797374764);
		p[1] = new Magazine("Java Magazine",18);
		p[2] = new Magazine("Java Magazine",19);
		p[0].show();
		p[1].show();
		p[2].show();

	}

}
