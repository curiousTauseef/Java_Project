public class ursus implements AnimalKingdom  {
	static String Genus="ursus";
	String Subclass="";
	String habitat="";
    double lifeSpan = 0;
	double populationStatus = 0;
	String IUCNstatus="";

 public ursus(String s1, String s2, String s3, double d1, double d2 , String s4) {
		super();
	    Genus= s1;
		Subclass=s2;
		habitat=s3;
	    lifeSpan = d1;
		populationStatus = d2;
		IUCNstatus = s4;
	}

	public void Display() {
		System.out.println("Scientific Name:"+Genus+" "+Subclass);
		System.out.println("Habitat:"+habitat);
		System.out.println("Life Span:"+lifeSpan);
		System.out.println("Population Status:"+populationStatus);
		System.out.println("IUCN Status:"+IUCNstatus);

    }
    public void EditDetails(String s1, String s2, String s3, double d1, double d2 , String s4){
        Subclass=s2;
		habitat=s3;
	  lifeSpan = d1;
		populationStatus = d2;
		IUCNstatus = s4;   
    }
}
