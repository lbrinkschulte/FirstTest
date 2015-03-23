package hallo;

public class hallo1 {
	public static void main(String[] args){
		System.out.println("Hallo");
		System.out.println(new hallo1("Hallo")+" Welt");
		System.out.println("hallo");
		System.out.println("hallo");
		System.out.println("Hallo von Lulu");
	}
	String hallo;
	public hallo1(String hallo){
		this.hallo=hallo;
	}
	
	@Override
	public String toString(){
		return hallo;
		
	}
}
