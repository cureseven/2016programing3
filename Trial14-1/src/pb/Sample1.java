package pb;
import pa.MyMath;

public class Sample1 {

	public static void main(String[] args) {
		MyMath pi = new MyMath();
		for(int i=0;i<9;i++){
			double rad=0.0;
			float rad2=0;
			double a=0.0;
			a = (i*45.0)/180.0;
			rad = a*pi.PI;
			System.out.println(i*45+"°"+"\t"+":"+rad+"\t"+rad);
		}
	}

}
