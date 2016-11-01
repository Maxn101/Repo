public class Shrimda {
	
	public static void main(String[] args){
		String name = "Shrimad";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.indexOf('i'));
		char[] letters = name.toCharArray();
		System.out.println(letters[0]);
		name = name.replace("S", "Reproducti");
		System.out.println(name);

		for (int i = 0; i < 5; i++){
			System.out.println(i + " " + "hiya");
		}
	}
}