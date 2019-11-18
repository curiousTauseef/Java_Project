
public class Panthera implements AnimalKingdom  {
	static String Genus="Panthera";
	String Subclass="";
	String habitat="";
    double lifeSpan = 0;
	double populationStatus = 0;
	String IUCNstatus="";

 public Panthera(String s1, String s2, double d1, double d2 , String s3) {
		super();
		Subclass=s1;
		habitat=s2;
	    lifeSpan = d1;
		populationStatus = d2;
		IUCNstatus = s3;
	}

	public void Display() {
		System.out.println("Scientific Name:"+Genus+" "+Subclass);
		System.out.println("Habitat:"+habitat);
		System.out.println("Life Span:"+lifeSpan);
		System.out.println("Population Status:"+populationStatus);
		System.out.println("IUCN Status:"+IUCNstatus);

	}
}
