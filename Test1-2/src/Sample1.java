//dDQi-otd8
class Person{
	protected String name;
	Person(String n){
		name = n;
	}
	void show(){
		System.out.println(name);
	}
}

class Vegetarian extends Person{
	Vegetarian(String n){
		super(n);
	}
	void show(){
		System.out.println(name+":Vegetarian");
	}
}

class NonVegetarian extends Person{
	private String main_dish;
	NonVegetarian(String n,String m){
		super(n);
		main_dish = m;
	}
	void show(){
		System.out.println(name+":"+main_dish);
	}
}

class Sample1 {

	public static void main(String[] args) {
		Person[] p;
		p = new Person[3];

		p[0].NonVegetarian("Alice","fish");
		p[1].Vegetarian("Gupta");
		p[2].NonVegetarian("Tom","Meat");
		p[0].show();
		p[1].show();
		p[2].show();

	}

}
