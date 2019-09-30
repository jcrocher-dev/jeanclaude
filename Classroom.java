public class Classroom {


	public static void main(String[] args) {

	Wilder jeanclaude = new Wilder("Jean-Claude", true);
	System.out.println(jeanclaude.WhoAmI());
	
	Wilder henri = new Wilder("Henri", false);
	System.out.println(henri.WhoAmI());
	

	jeanclaude.setAware(false);
	System.out.println("maintenant " + jeanclaude.WhoAmI());
	

	jeanclaude.setFirstName("Pierre");
	System.out.println("et maintenant je ne m'appelle plus Jean-Claude" + " mais " + jeanclaude.getFirstName());

	}
}
