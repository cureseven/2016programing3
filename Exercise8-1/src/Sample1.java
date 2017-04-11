abstract class Shape{
	abstract int calArea();
}
class Oval extends Shape{
	private int a;
	private int b;
	Oval(int x,int y){

	}
	int calArea(){
		return (int) ((a*b*3.14)/4);
	}
}
public class Sample1 {

	public static void main(String[] args) {
	Oval[][] t=new Oval[5][5];
	t[0][0]=t.calArea(10,10);
	
	for(int i=0;i<t.length;i++){
		for(int j=0;j<t.length;j++){
			System.out.println(t[i][j]+"\t");
		}
	}

	}

}
