
public class Sample1 {	//private

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				System.out.println("iは"+i+":jは"+j);	//2重for
			}
		}

	}

}

//String str = br.readLine();
//test[i]=Integer.parseInt(str);

//文字列をdoubleに変換するとき
//double num = Double.parseDouble(str);

//文字列をintに変換するとき
//int res = Integer.parseInt(str);


//switch文
//switch(res){
//case 1:
//	System.out.println("1が入力されました。");
//	break;
//default:
//	System.out.println("1か2を入力してください。");
//	break;
//}


//配列の宣言
//int test;
//test= new int[5];
//int[] test = new int[5];
//int[] test ={,,,,};

//いれかえ
//for(int s=0;s<test.length;s++){
//for(int t=s+1;t<test.length;t++){
//	if(test[t]>test[s]){
//		int tmp = test[t];
//		test[t] = test[s];
//		test[s] = tmp;
//	}
//}
//}

//フィールド:クラスの状態、性質
//メソッド:クラスの機能(オーバーロード可)
//クラスのフィールドやメソッドをメンバ
//クラスに関連付けられているフィールドをクラス変数、メソッドをクラスメソッド(static).
//クラス全体で扱うデータを格納しておくフィールドがクラス変数
//クラスメソッドはクラス名をつけて呼び出す。Car.showSum();
//コンストラクタはクラス名と同じ。戻り値を指定することはできない。初期値の設定をする役割(オーバーロード可)

//System.out.println("");

//Stringクラスの主なメソッド
//・char charAt(int index)		引数の位置にある文字を返す		char ch1 = str.charAt(0);
//boolean endsWith(String suffix)		引数の文字列で終わるかどうかを判断する
//boolean equals(Object anObject)		引数の文字列かどうかを判断する
//boolean equalslgnoreCase(String anotherString)		引数の文字列かどうかを大文字・小文字の区別なしに判断する
//int indexOf(int ch)		引数の文字が最初に出現する位置を返す
//・int indexOf(String str)		引数の文字列が最初に出現する位置を返す		int num = str1.indexOf(ch);
//int lastIndexOf(int ch)		引数の文字が最後に出現する位置を返す
//int lastIndexOf(String str)		引数の文字列が最後に出現する位置を返す
//int length()		文字列の長さを返す
//String substring(int beginIndex)		引数の位置から最後までの部分文字列を返す
//String substring(int beginIndex,int endIndex)		引数の開始位置から最終位置までの部分文字列を返す
//boolean startsWith(String prefix)		引数の文字列で始まるかどうかを判断する
//・String toLowerCase()		文字列を小文字に変換した結果を返す		String stru = str.toUpperCase();
//String toUpperCase()		文字列を大文字に変換した結果を返す


//StringBufferクラスの主なメソッド
//StringBuffer append(char c)		引数の文字を追加する
//StringBuffer append(String str)		引数の文字列を追加する
//StringBuffer deleteCharAt(int index)		引数の位置の文字を削除する
//StringBuffer insert(int offset,char c)		引数の位置に文字を追加する
//StringBuffer insert(int offset,String str)		引数の位置に文字列を追加する
//int length()		文字数を返す
//StringBuffer replace(int start,int end,String str)		引数の位置の文字列を引数の文字列で置換する
//StringBuffer reverse()		文字順を逆にする
//void setCharAt(int index,char ch)		引数の位置の文字を引数の文字にする
//String toString()		Stringクラスのオブジェクトに変換する

//Integerクラスの主なクラスメソッド
//static int parseInt(String s)		引数の文字列を整数にして返す
//static Integer valueOf(String s)		引数の文字列の値で初期化されたIntegerオブジェクトを返す

//Mathクラスの主なクラスメソッド
//static double abs(double a)		double型の引数の絶対値を返す
//static int abs(int a)		int型の引数の絶対値を返す
//static double ceil(double a)		double型の引数以上で最も小さい整数値をdouble型で返す
//static double cos(double a)		引数の角度のコサイン値をかえす
//static double floor(double a)		double型の引数以下で最も大きい整数値をdouble型で返す
//static double max(double a,double b)		2つのdouble型の引数のうち大きい値を返す
//・static int max(int a,int b)		2つのint型の引数のうち大きい値を返す		int ans = Math.max(num1,num2);
//static double min(double a,double b)	2つのdouble型の引数のうち小さい値を返す
//static int min(int a,int b)		2つのint型の引数のうち小さい値を返す
//static double pow(double a,double b)		1番目の引数を2番目の引数で累乗した結果を表す
//static double random()		0.0～1.0未満の乱数を返す
//static double rint(double a)		double型の引数に最も近い整数値を返す
//static double sin(double a)		引数の角度のサイン値を返す
//static double sqrt(double a)		double型の引数の平方根を返す
//static double tan(double a)		引数の角度のタンジェント値を返す
/*

Checkbox cb1;
public void init(){
	cb1 = new Checbox("mon",true);
	add(cb1);
	cb1.addItemListener(this);
}
public void itemStateChanged(ItemEvent evt){
	cb1.getLabel();
}
Choice c;
c = new Choice;
c.addItem("sun");
add(c);
c.addItemListener(this); //チョイスオブジェクトから選択肢を選ぶイベントを受け取り

}
public void itemStateChanged(ItemEvent evt){
	cb1.getSelectedFile();
}
TextArea
*/