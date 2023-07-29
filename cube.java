class Cube 
{
	static int a;
	static int ans;

	Cube (int val){
	a=val;
	}

	static void change(){
	int ans = a*a*a;
	System.out.println(ans);
	}	

	void display(){
	System.out.println("the value of "+a+" is "+ans);
	}
	public static void main(String [] args){
	Cube.change();
	Cube c = new Cube(3);
	c.display();
	}
}
