
public class BoxPractice1 {
	public static void main(String[] args){
		for(int i = 0; i < 3; i++){
			box(); 
		}
	}
	public static void horizontal(){
		System.out.println("+--------+");
	}
	public static void vertical(){
		System.out.println("|        |");
	}
	public static void line(){
		System.out.println();
	}
	public static void box(){
		horizontal();
		vertical();
		vertical();
		horizontal();
		line();
	}
}
