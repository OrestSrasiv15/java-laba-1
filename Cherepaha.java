package Cherepaha;

public class Cherepaha {

    public String name;
	public int speed;
	public int vaga;
	private int size;
	private int price;
	protected int type;
	protected String color;
	static int location = 0;
	
	
	void SetName(String Name1) {
		name= Name1;
	}
	void SetSpeed(int Speed1) {
		speed=Speed1;
	}
	
	void SetVaga(int Vaga1) {
		vaga= Vaga1;
	}
	void SetSize(int Size1) {
		size=Size1;
	}
		void SetPrice(int Price1) {
			price=Price1;
	}
		void SetType(int type1) {
			type=type1;
	}
		void SetColor(String color1) {
			color=color1;
		}
		
		
	String GetName() {
		return name;
	}
	int GetSpeed() {
		return speed;
	}
	int GetVaga() {
		return vaga;
	}
	int GetSize() {
		return size;
		}
	int GetPrice() {
		return price;
	}
	int GetType() {
		return type;
	}
	String GetColor() {
		return color;
	}
	public Cherepaha(String name , int speed , int vaga) {
		SetName(name);
		SetSpeed(speed);
		SetVaga(vaga);
		
	}
	public Cherepaha (String name , int speed , int vaga , int size , int price ,int type , String color ) {
		SetName(name);
		SetSpeed(speed);
		SetVaga(vaga);
		SetSize(size);
		SetPrice(price);
		SetType(type);
		SetColor(color);
	}
		void printStaticLocation() {
			System.out.println("Location - " + location);
		
			
		
	}
		void printLocation() {
			System.out.println("Location - " + location);
		}
		
		 @Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	
	public static void main(String[] args) {
		Cherepaha A = new Cherepaha("   Аха",50 ,25);
	   System.out.println("Name -" + A.GetName());
	   System.out.println("Weight -" + A.GetVaga()+ "    " + "gr");
	   System.out.println("Speed -" + A.GetSpeed() + "    " + "km/h");
	   System.out.println("Location" +A.toString());
	   
	   Cherepaha B = new Cherepaha("   back",55 ,30);
	   System.out.println("Name -" + B.GetName());
	   System.out.println("Weight -" + B.GetVaga()+ "    " + "gr");
	   System.out.println("Speed -" + B.GetSpeed() + "    " + "km/h");
	   
	   Cherepaha C = new Cherepaha("   Up",60,35);
	   System.out.println("Name -" + C.GetName());
	   System.out.println("Weight -" + C.GetVaga()+ "    " + "gr");
	   System.out.println("Speed -" + C.GetSpeed() + "    " + "km/h");
	   
	   Cherepaha G = new Cherepaha("   Jorik",65 ,40);
	   System.out.println("Name -" + G.GetName());
	   System.out.println("Weight -" + G.GetVaga()+ "    " + "gr");
	   System.out.println("Speed -" + G.GetSpeed() + "    " + "km/h");
	   
	   Cherepaha F = new Cherepaha("   Jessi",70 ,45);
	   System.out.println("Name -" + F.GetName());
	   System.out.println("Weight -" + F.GetVaga()+ "    " + "gr");
	   System.out.println("Speed -" + F.GetSpeed() + "    " + "km/h");
	   
	  
	}
	

}
