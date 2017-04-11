//dDQi-otd8
abstract interface iMatrix{
	abstract int get(int i,int j);
	abstract void set(int i,int j,int k);
	abstract iMatrix multiple(iMatrix B);
	abstract void show();
}
class Matrix implements iMatrix{
	private int[][] x;
	Matrix(int x11,int x12,int x21,int x22){
		x[0][0] = x11;
		x[0][1] = x12;
		x[1][0] = x21;
		x[1][1] = x22;
	}
	public void show(){
		System.out.println(x[0][1]+"\t"+x[0][1]);
		System.out.println(x[1][0]+"\t"+x[1][1]);
	}
	public int get(int i, int j) {
		return x[i][j];
	}

	public void set(int i, int j, int k) {
		x[i][j]=k;
	}

	public iMatrix multiple(iMatrix B) {
		iMatrix C;
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				C.x[i][j]= x[i][j]*B.x[j][i];
			}
		}
		return C;
	}
}
public class Sample1 {

	public static void main(String[] args) {
		Matrix a;
		Matrix b;
		a = new Matrix(1,2,3,4);
		b = new Matrix(5,6,7,8);
		iMatrix c = a.multiple(b);
		a.show();
		b.show();
		c.show();

	}

}
