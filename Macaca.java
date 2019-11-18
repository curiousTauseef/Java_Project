public class Macaca implements AnimalKingdom  {
	static String Genus="Macaca";
	String Subclass;
    String CommonName;
	String habitat;
    String lifeSpan;
	String populationStatus;
	String IUCNstatus;
	
	public Macaca(){
	    Genus="Macaca";
	    Subclass="default";
        CommonName="default";
        habitat="default";
	    lifeSpan = 0;
	    populationStatus = 0;
        IUCNstatus="default";
	} 

 	public Macaca(String s1 , String s2, String s3, String s4, String s5, String s6) {
		Subclass=s1;
		CommonName=s2;
		habitat=s3;
	    lifeSpan =s4;
		populationStatus = s5;
		IUCNstatus = s6;
	}

	public void Display() {
		System.out.println("Scientific Name:"+Genus+" "+Subclass);
		System.out.println("Common Name:"+CommonName);
		System.out.println("Habitat:"+habitat);
		System.out.println("Life Span:"+lifeSpan);
		System.out.println("Population Status:"+populationStatus);
		System.out.println("IUCN Status:"+IUCNstatus);
	}
	
	public void EditDetails(String s1, String s2, String s3, String s4, String s5 , String s6) {
		Subclass = s1;
		CommonName=s2;
	    habitat = s3;
		lifeSpan = s4;
		populationStatus = s5;
		IUCNstatus = s6;
		}
}
