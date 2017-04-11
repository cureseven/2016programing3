interface iSet
{
	void add(int x);
}
class IntSet implements iSet
{
	private int[] a;
	private int n;

	IntSet(int k){
		a = new int[k];
		n=0;
	}

	public void add(int x) { //publicは必ず必要
		a[n++]=x;
	}
	void show(){
		for(int j=0;j<a.length;j++){
		System.out.println(a[j]+"\t");
		System.out.println("");
		}
	}

}
class Sample1 {

	public static void main(String[] args) {
		IntSet[] s = new IntSet[10];
		for(int i=0;i<10;i++)
		s.add((int)(Math.random()*10)+1);
		s.show();
	}

}
