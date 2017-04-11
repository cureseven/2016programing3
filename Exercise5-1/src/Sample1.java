class Balance
{
	private int left;
	private int right;
	Balance(int l,int r){
		left = l;
		right = r;
	}
	void left(int w){
		left = left + w;
	}
	void right(int w){
		right = right + w;
	}
	void show(){
		if(left > right){
			System.out.println("左の皿が重い");
		}
		if(left < right){
			System.out.println("右の皿が重い");
		}
		if(left == right){
			System.out.println("釣り合っている");
		}
	}
}
public class Sample1 {

	public static void main(String[] args) {
		Balance b = new Balance(0,0);
		b.left(5);
		b.show();
		b.right(10);
		b.show();
		b.left(5);
		b.show();
	}

}
