
public class Panthera implements AnimalKingdom  {
	static String Genus="Panthera";
	String Subclass;
    String CommonName;
	String habitat;
    String lifeSpan;
	String populationStatus;
	String IUCNstatus;
	
	  public Panthera()
	    {
	        Genus="Panthera";
	        Subclass="default";
	        CommonName="default";
	        habitat="default";
	        lifeSpan = "0";
	        populationStatus = "0";
	        IUCNstatus="default";
	    } 

 public Panthera(String s1 , String s2, String s3, String d1, String d2 , String s4) {
		Subclass=s1;
		CommonName=s2;
		habitat=s3;
	    lifeSpan = d1;
		populationStatus = d2;
		IUCNstatus = s4;
	}

	public void Display() {
		System.out.println("Scientific Name:"+Genus+" "+Subclass);
		System.out.println("Common Name:"+CommonName);
		System.out.println("Habitat:"+habitat);
		System.out.println("Life Span:"+lifeSpan);
		System.out.println("Population Status:"+populationStatus);
		System.out.println("IUCN Status:"+IUCNstatus);

	}
	public void EditDetails(String s1, String s2, String s3, String d1, String d2 , String s4) {
		Subclass = s1;
		CommonName=s2;
	    habitat = s3;
		lifeSpan = d1;
		populationStatus = d2;
		IUCNstatus = s4;
		}
	public String toString() {
		return ( Subclass+" " +CommonName +" "+ habitat +" "+lifeSpan+" "+ populationStatus+" "+ IUCNstatus);
	}
}
