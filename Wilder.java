public class Wilder{
	
	private String firstname;
	private boolean aware;

	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}

	public String getFirstName() {
		return this.firstname;
	}

	public boolean isAware() {
		return this.aware;
	}

	public void setFirstName(String firstname){
		this.firstname = firstname;
	}
	
	public void setAware(boolean aware) {
		this.aware = aware;
	}

	public String WhoAmI(){
		if (aware == true){ 
			return "je m'appelle " + this.getFirstName() + " et je suis aware";
		}
		else {
			return "je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
		}
	}
}
