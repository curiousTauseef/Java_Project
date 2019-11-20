import java.util.*;
import java.io.*;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Paths;


class Work
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Panthera> Panthera=new ArrayList<Panthera>();
        ArrayList<Macaca> Macaca=new ArrayList<Macaca>();
        ArrayList<Canis> Canis=new ArrayList<Canis>();
        ArrayList<Ursus> Ursus=new ArrayList<Ursus>();
        ArrayList<Bos> Bos=new ArrayList<Bos>();
        
        //OBJECTS:
        //PANTHERA:
        Panthera Tiger=new Panthera (" Tigirs","Tiger","tropical forests","16-18 years","3,062 and 3,948","protected"); 
        Panthera Lion=new Panthera (" Leo","Lion","grassland","10-14 years","523","Threatend");
        Panthera Jaguar=new Panthera (" onca","Jaguar","wet lowland","12-15","15000","near threatend");
        Panthera Leopard=new Panthera("pardus","Leopard","rainforest","12-17","7900","vulnerable");
        Panthera SnowLeopard=new Panthera("unius","Snow Leopard","snow","12-17","5000","vulnerable");
        //MACACA
        Macaca Mandrill=new Macaca("sphinx","Mandrill","Tropical forest","20","unknown","unknown");
        Macaca BarbaryMacaque=new Macaca("sylvanus","Barbary Macaque","Hill areas","20","9000","abudant");
        Macaca LionTailedMacaque=new Macaca("silenus","Lion-Tailed Macaque","Hill  areas","20","3000","vulnerable");
        Macaca JapaneseMacaque =new Macaca("fuscata","Japanese Macaque","subtropical forest","27","114,431","abudent");
        Macaca HamdryansMonkey =new Macaca("Papio Hamadriyans","Hamdryans Monkey","sarwat region","30","unknown","unknown");
        //CANIS
        Canis Dog =new Canis("lupus familiaris","dog","Highly adaptive anywhere","15-16","85million","unknown");
        Canis Wolf=new Canis ("lupus","Wolf","tundra to woodlands, forests, grasslands and deserts","6-8","10000","comfortable");
        Canis DireWolf=new Canis("dirus","Dire Wolf","Tropic","5-7","nill","extinct");
        Canis GoldenJackal= new Canis("auerus","Golden Jackal","tropic","5-7","10000","comfortable");
        Canis Redwolf =new Canis("rufus","red wolf","tropic","6-7","unknown","unknown");
        //URSUS

		Ursus BrownBear=new Ursus("Arctos","Brown Bear","high mountain forest","20-25","2000000","Status threatend species");
		Ursus PolarBear= new Ursus("Martimus","Polar Bear","Artic","20-30","22000-30000","vulnerable");
		Ursus AmericanBlackBear =new Ursus("americanus","American Black Bear","Swamps","29-33","600000","Endagered");
		Ursus AsianBlackBear =new Ursus("Thibetnaus","Asian Black Bear","Forest","29-33","600000","Vulnerable");
		Ursus CaveBear =new Ursus("Speleaus","Cave Bear","Tropic","15-20","240000","Vulnerable");
		        
	
		//BOS
		Bos Gaur= new Bos ("Saurus","Gaur","Decidious Forest","25-30","30000","Redlist");
		Bos Domesticyak=new Bos ("Grunniens","Domestic Yak","Tundra","20","15000","Vulnerbale");
		Bos DomesticWildyak=new Bos ("Mutus","Wild Yak","Tundra","20","15000","Endagered");
		Bos Banteng= new Bos("Javancius","Bantega","Evergreen Forest","20","5000-8000","Endangered");
		Bos Gayal=new Bos("Frontalis","Gayal","Forest","15-16","21000","Threatend");        
        
       
        
        Scanner in=new Scanner(System.in);

		System.out.println("=========================");
		System.out.println("ENCYCLOPEDIA OF BIOLOGY");
		System.out.println("=========================");

        System.out.println("Choose an option: ");
        System.out.println("1.Add new");
        System.out.println("2.Search ");
        System.out.println("3.Delete");
        System.out.println("4.Read file");
        System.out.println("5.Edit");
        
        int o=in.nextInt();
        switch (o) 
        { 
            case 1: //ADD
                System.out.println("Choose the genus: ");
                System.out.println("1.Panthera");
                System.out.println("2.Macaca");
                System.out.println("3.Canis");
                System.out.println("4.Ursus");
                System.out.println("5.Bos");
                
                int o1=in.nextInt();
                switch (o1) 
                 { 
                    case 1:
                        System.out.println("Enter the Scientific Name: ");
                        String p1=in.nextLine();
                        System.out.println("Enter the Common Name:");
                        String p2=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String p3=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        String p4=in.nextLine();
                        System.out.println("Enter its Population Status:");
                        String p5=in.nextLine();
                        System.out.println("Enter its IUCN Status:");
                        String p6=in.nextLine();
                        Panthera.add(new Panthera(p1,p2,p3,p4,p5,p6));
                        try {
                        	FileWriter myWriter = new FileWriter("AnimalKingdom.txt");
                        	for(Panthera s:Panthera) {
                        		myWriter.write(s+System.lineSeparator());
                        	}
                        	myWriter.close();
                        }catch(IOException e) {
                        	System.out.println("An error occured");
                        	e.printStackTrace();
                        }
                        break;
                    case 2:
                        System.out.println("Enter the Scientific Name: ");
                        String m1=in.nextLine();
                        System.out.println("Enter the CommonName: ");
                        String m2=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String m3=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        String m4=in.nextLine();
                        System.out.println("Enter its Population Status:");
                        String m5=in.nextLine();
                        System.out.println("Enter its IUCN Status:");
                        String m6=in.nextLine();
                        Macaca.add(new Macaca(m1,m2,m3,m4,m5,m6));
                        try {
                        	FileWriter myWriter = new FileWriter("AnimalKingdom.txt");
                        	for(Macaca s:Macaca) {
                        		myWriter.write(s+System.lineSeparator());
                        	}
                        	myWriter.close();
                        }catch(IOException e) {
                        	System.out.println("An error occured");
                        	e.printStackTrace();
                        }
                        break; 
                    case 3:
                        System.out.println("Enter the Scientific Name: ");
                        String c1=in.nextLine();
                        System.out.println("Enter the Common Name: ");
                        String c2=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String c3=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        String c4=in.nextLine();
                        System.out.println("Enter its Population Status:");
                        String c5=in.nextLine();
                        System.out.println("Enter its IUCN Status:");
                        String c6=in.nextLine();
                        Canis.add(new Canis(c1,c2,c3,c4,c5,c6)); 
                        try {
                        	FileWriter myWriter = new FileWriter("AnimalKingdom.txt");
                        	for(Canis s:Canis) {
                        		myWriter.write(s+System.lineSeparator());
                        	}
                        	myWriter.close();
                        }catch(IOException e) {
                        	System.out.println("An error occured");
                        	e.printStackTrace();
                        }
                        break; 
                    case 4:
                        System.out.println("Enter the Scientific Name: ");
                        String u1=in.nextLine();
                        System.out.println("Enter the Common Name: ");
                        String u2=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String u3=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        String u4=in.nextLine();
                        System.out.println("Enter its Population Status:");
                        String u5=in.nextLine();
                        System.out.println("Enter its IUCN Status:");
                        String u6=in.nextLine();
                        Ursus.add(new Ursus(u1,u2,u3,u4,u5,u6));  
                        try {
                        	FileWriter myWriter = new FileWriter("AnimalKingdom.txt");
                        	for(Ursus s:Ursus) {
                        		myWriter.write(s+System.lineSeparator());
                        	}
                        	 myWriter.close();
                        }catch(IOException e) {
                        	System.out.println("An error occured");
                        	e.printStackTrace();
                        }
                        break;
                    case 5:
                        System.out.println("Enter the Scientific Name: ");
                        String b1=in.nextLine();
                        System.out.println("Enter the Common Name: ");
                        String b2=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String b3=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        String b4=in.nextLine();
                        System.out.println("Enter its Population Status:");
                        String b5=in.nextLine();
                        System.out.println("Enter its IUCN Status:");
                        String b6   =in.nextLine();
                        Bos.add(new Bos(b1,b2,b3,b4,b5,b6)); 
                        try {
                        	FileWriter myWriter = new FileWriter("AnimalKingdom.txt");
                        	for(Bos s:Bos) {
                        		myWriter.write(s+System.lineSeparator());
                        	}
                        	myWriter.close();
                        }catch(IOException e) {
                        	System.out.println("An error occured");
                        	e.printStackTrace();
                        }
                        break; 
                    default: 
                        System.out.println("Choose a valid option please."); 
                        break; 
                 } 
                
            break; 
            case 2://SEARCH STRING 
     
                System.out.println(" enter the common name");
                String name = in.nextLine();
                
                List<String>lines= Files.readAllLines(Paths.get("AnimalKingdom.txt"));
               
			for(String line : lines) 
			{
			    if (line.contains(name))  {
			        System.out.println("Animal Found");
			        break;
			    }
			}
                break;
             
                
            case 3: //DELETE
                System.out.println("Choose the genus: ");
                System.out.println("1.Panthera");
                System.out.println("2.Macaca");
                System.out.println("3.Canis");
                System.out.println("4.Ursus");
                System.out.println("5.Bos");
                
                int o3=in.nextInt();
                switch (o3) 
                 { 
                case 1:
                	System.out.println("Enter the index to be deleted");
                	int i1 = in.nextInt();
                	Panthera.remove(i1);
                	break;
                case 2:
                	System.out.println("Enter the index to be deleted");
                	int i2 = in.nextInt();
                	Macaca.remove(i2);
                	break;
                case 3:
                	System.out.println("Enter the index to be deleted");
                	int i3 = in.nextInt();
                	Canis.remove(i3);
                	break;
                case 4:
                	System.out.println("Enter the index to be deleted");
                	int i4 = in.nextInt();
                	Ursus.remove(i4);
                	break;
                case 5:
                	System.out.println("Enter the index to be deleted");
                	int i5 = in.nextInt();
                	Bos.remove(i5);
                	break; 
                default: 
                    System.out.println("Choose a valid option please."); 
                    break; 
                 } 
                break;  
           
            
            
            
            case 4://READ FILE
           try {
        	   File myObj= new File("AnimalKingdom.txt");
        	   Scanner myReader = new Scanner(myObj);
        	   while (myReader.hasNextLine()) {
        		   String data = myReader.nextLine();
        		   System.out.println(data);
        	   }
        	   myReader.close();
           }catch(FileNotFoundException e) {
        	   System.out.println("File not found");
        	   e.printStackTrace();
        	    }
           break;
                
            default: 
                System.out.println("Choose a valid option please."); 
                break; 
            case 5:
            	 System.out.println("Choose the genus: ");
                 System.out.println("1.Panthera");
                 System.out.println("2.Macaca");
                 System.out.println("3.Canis");
                 System.out.println("4.Ursus");
                 System.out.println("5.Bos");
                 
                 int o4=in.nextInt();
                 switch (o4)
                 {
                 case 1:
	                 System.out.println("Choose object:");
	                 System.out.println("1.Tiger");
	                 System.out.println("2.Lion");
	                 System.out.println("3.Jaguar");
	                 System.out.println("4.Leopard");
	                 System.out.println("5.SnowLeopard");
	                 int o5=in.nextInt();
	                 switch(o5)
	                 {
	                 case 1:
	                	 System.out.println("Enter details:");
	                	 System.out.println("Enter the Scientific Name: ");
	                     String t1=in.nextLine();
	                     System.out.println("Enter the Common Name:");
		                 String t2=in.nextLine();
		                 System.out.println("Enter its habitat:");
		                 String t3=in.nextLine();
		                 System.out.println("Enter its Life Span:");
		                 String t4=in.nextLine();
		                 System.out.println("Enter its Population Status:");
		                 String t5=in.nextLine();
		                 System.out.println("Enter its IUCN Status:");
		                 String t6=in.nextLine();
		                 Tiger.EditDetails(t1,t2,t3,t4,t5,t6);
		                 Tiger.Display();
		                 break;
	                 case 2:
	                	 System.out.println("Enter details:");
	                     System.out.println("Enter the Scientific Name: ");
	                     String l1=in.nextLine();
	                     System.out.println("Enter the Common Name:");
	                     String l2=in.nextLine();
	                     System.out.println("Enter its habitat:");
	                     String l3=in.nextLine();
	                     System.out.println("Enter its Life Span:");
	                     String l4=in.nextLine();
	                     System.out.println("Enter its Population Status:");
	                     String l5=in.nextLine();
	                     System.out.println("Enter its IUCN Status:");
	                     String l6=in.nextLine();
	                     Lion.EditDetails(l1,l2,l3,l4,l5,l6);
	                     Lion.Display();
	                     break;
	                 case 3:
	                	 System.out.println("Enter details:");
	                     System.out.println("Enter the Scientific Name: ");
	                     String j1=in.nextLine();
	                     System.out.println("Enter the Common Name:");
	                     String j2=in.nextLine();
	                     System.out.println("Enter its habitat:");
	                     String j3=in.nextLine();
	                     System.out.println("Enter its Life Span:");
	                     String j4=in.nextLine();
	                     System.out.println("Enter its Population Status:");
	                     String j5=in.nextLine();
	                     System.out.println("Enter its IUCN Status:");
	                     String j6=in.nextLine();
	                     Jaguar.EditDetails(j1,j2,j3,j4,j5,j6);
	                     Jaguar.Display();
	                     break;
	                 case 4:
	                	 System.out.println("Enter details:");
	                     System.out.println("Enter the Scientific Name: ");
	                     String le1=in.nextLine();
	                     System.out.println("Enter the Common Name:");
	                     String le2=in.nextLine();
	                     System.out.println("Enter its habitat:");
	                     String le3=in.nextLine();
	                     System.out.println("Enter its Life Span:");
	                     String le4=in.nextLine();
	                     System.out.println("Enter its Population Status:");
	                     String le5=in.nextLine();
	                     System.out.println("Enter its IUCN Status:");
	                     String le6=in.nextLine();
	                     Leopard.EditDetails(le1,le2,le3,le4,le5,le6);
	                     Leopard.Display();
	                     break;
	                 case 5:
	                	 System.out.println("Enter details:");
	                     System.out.println("Enter the Scientific Name: ");
	                     String s1=in.nextLine();
	                     System.out.println("Enter the Common Name:");
	                     String s2=in.nextLine();
	                     System.out.println("Enter its habitat:");
	                     String s3=in.nextLine();
	                     System.out.println("Enter its Life Span:");
	                     String s4=in.nextLine();
	                     System.out.println("Enter its Population Status:");
	                     String s5=in.nextLine();
	                     System.out.println("Enter its IUCN Status:");
	                     String s6=in.nextLine();
	                     SnowLeopard.EditDetails(s1,s2,s3,s4,s5,s6);
	                     SnowLeopard.Display();
	                     break;
	                 default: 
	                     System.out.println("Choose a valid option please."); 
	                     break; 
                	 }
	                 break;
                 case 2:
                	 System.out.println("Choose object:");
                     System.out.println("1.Mandrill");
                     System.out.println("2.Barbary Macaque");
                     System.out.println("3.Lion-Tailed Macaque");
                     System.out.println("4.Japanese Macaque");
                     System.out.println("5.Hamdryans Monkey");
                     int p5=in.nextInt();
                     switch(p5)
    	                 {
    	                 case 1:
    	                	 System.out.println("Enter details:");
    	                	 System.out.println("Enter the Scientific Name: ");
    	                     String t1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    		                 String t2=in.nextLine();
    		                 System.out.println("Enter its habitat:");
    		                 String t3=in.nextLine();
    		                 System.out.println("Enter its Life Span:");
    		                 String t4=in.nextLine();
    		                 System.out.println("Enter its Population Status:");
    		                 String t5=in.nextLine();
    		                 System.out.println("Enter its IUCN Status:");
    		                 String t6=in.nextLine();
    		                 Mandrill.EditDetails(t1,t2,t3,t4,t5,t6);
    		                 Mandrill.Display();
    		                 break;
    	                 case 2:
    	                	 System.out.println("Enter details:");
    	                     System.out.println("Enter the Scientific Name: ");
    	                     String l1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    	                     String l2=in.nextLine();
    	                     System.out.println("Enter its habitat:");
    	                     String l3=in.nextLine();
    	                     System.out.println("Enter its Life Span:");
    	                     String l4=in.nextLine();
    	                     System.out.println("Enter its Population Status:");
    	                     String l5=in.nextLine();
    	                     System.out.println("Enter its IUCN Status:");
    	                     String l6=in.nextLine();
    	                     BarbaryMacaque.EditDetails(l1,l2,l3,l4,l5,l6);
    	                     BarbaryMacaque.Display();
    	                     break;
    	                 case 3:
    	                	 System.out.println("Enter details:");
    	                     System.out.println("Enter the Scientific Name: ");
    	                     String j1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    	                     String j2=in.nextLine();
    	                     System.out.println("Enter its habitat:");
    	                     String j3=in.nextLine();
    	                     System.out.println("Enter its Life Span:");
    	                     String j4=in.nextLine();
    	                     System.out.println("Enter its Population Status:");
    	                     String j5=in.nextLine();
    	                     System.out.println("Enter its IUCN Status:");
    	                     String j6=in.nextLine();
    	                     LionTailedMacaque.EditDetails(j1,j2,j3,j4,j5,j6);
    	                     LionTailedMacaque.Display();
    	                       break;
    	                 case 4:
    	                	 System.out.println("Enter details:");
    	                     System.out.println("Enter the Scientific Name: ");
    	                     String le1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    	                     String le2=in.nextLine();
    	                     System.out.println("Enter its habitat:");
    	                     String le3=in.nextLine();
    	                     System.out.println("Enter its Life Span:");
    	                     String le4=in.nextLine();
    	                     System.out.println("Enter its Population Status:");
    	                     String le5=in.nextLine();
    	                     System.out.println("Enter its IUCN Status:");
    	                     String le6=in.nextLine();
    	                     JapaneseMacaque.EditDetails(le1,le2,le3,le4,le5,le6);
    	                     JapaneseMacaque.Display();
    	                     break;
    	                 case 5:
    	                	 System.out.println("Enter details:");
    	                     System.out.println("Enter the Scientific Name: ");
    	                     String s1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    	                     String s2=in.nextLine();
    	                     System.out.println("Enter its habitat:");
    	                     String s3=in.nextLine();
    	                     System.out.println("Enter its Life Span:");
    	                     String s4=in.nextLine();
    	                     System.out.println("Enter its Population Status:");
    	                     String s5=in.nextLine();
    	                     System.out.println("Enter its IUCN Status:");
    	                     String s6=in.nextLine();
    	                     HamdryansMonkey.EditDetails(s1,s2,s3,s4,s5,s6);
    	                     HamdryansMonkey.Display();
    	                     break;
    	                 default: 
    	                     System.out.println("Choose a valid option please."); 
    	                     break; 
                    	 }
                     break;
                
                
                     
                 case 3:
                	 System.out.println("Choose object:");
                     System.out.println("1.Dog");
                     System.out.println("2.Wolf");
                     System.out.println("3.Dire Wolf");
                     System.out.println("4.Golden Jackal");
                     System.out.println("5.Red Wolf");
                     int o8=in.nextInt();
                     switch(o8)
    	                 {
    	                 case 1:
    	                	 System.out.println("Enter details:");
    	                	 System.out.println("Enter the Scientific Name: ");
    	                     String t1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    		                 String t2=in.nextLine();
    		                 System.out.println("Enter its habitat:");
    		                 String t3=in.nextLine();
    		                 System.out.println("Enter its Life Span:");
    		                 String t4=in.nextLine();
    		                 System.out.println("Enter its Population Status:");
    		                 String t5=in.nextLine();
    		                 System.out.println("Enter its IUCN Status:");
    		                 String t6=in.nextLine();
    		                 Dog.EditDetails(t1,t2,t3,t4,t5,t6);
    		                 Dog.Display();
    		                 break;
    	                 case 2:
    	                	 System.out.println("Enter details:");
    	                     System.out.println("Enter the Scientific Name: ");
    	                     String l1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    	                     String l2=in.nextLine();
    	                     System.out.println("Enter its habitat:");
    	                     String l3=in.nextLine();
    	                     System.out.println("Enter its Life Span:");
    	                     String l4=in.nextLine();
    	                     System.out.println("Enter its Population Status:");
    	                     String l5=in.nextLine();
    	                     System.out.println("Enter its IUCN Status:");
    	                     String l6=in.nextLine();
    	                     Wolf.EditDetails(l1,l2,l3,l4,l5,l6);
    	                     Wolf.Display();
    	                     break;
    	                 case 3:
    	                	 System.out.println("Enter details:");
    	                     System.out.println("Enter the Scientific Name: ");
    	                     String j1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    	                     String j2=in.nextLine();
    	                     System.out.println("Enter its habitat:");
    	                     String j3=in.nextLine();
    	                     System.out.println("Enter its Life Span:");
    	                     String j4=in.nextLine();
    	                     System.out.println("Enter its Population Status:");
    	                     String j5=in.nextLine();
    	                     System.out.println("Enter its IUCN Status:");
    	                     String j6=in.nextLine();
    	                     DireWolf.EditDetails(j1,j2,j3,j4,j5,j6);
    	                     DireWolf.Display();
    	                     break;
    	                 case 4:
    	                	 System.out.println("Enter details:");
    	                     System.out.println("Enter the Scientific Name: ");
    	                     String le1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    	                     String le2=in.nextLine();
    	                     System.out.println("Enter its habitat:");
    	                     String le3=in.nextLine();
    	                     System.out.println("Enter its Life Span:");
    	                     String le4=in.nextLine();
    	                     System.out.println("Enter its Population Status:");
    	                     String le5=in.nextLine();
    	                     System.out.println("Enter its IUCN Status:");
    	                     String le6=in.nextLine();
    	                     GoldenJackal.EditDetails(le1,le2,le3,le4,le5,le6);
    	                     GoldenJackal.Display();
    	                     break;
    	                 case 5:
    	                	 System.out.println("Enter details:");
    	                     System.out.println("Enter the Scientific Name: ");
    	                     String s1=in.nextLine();
    	                     System.out.println("Enter the Common Name:");
    	                     String s2=in.nextLine();
    	                     System.out.println("Enter its habitat:");
    	                     String s3=in.nextLine();
    	                     System.out.println("Enter its Life Span:");
    	                     String s4=in.nextLine();
    	                     System.out.println("Enter its Population Status:");
    	                     String s5=in.nextLine();
    	                     System.out.println("Enter its IUCN Status:");
    	                     String s6=in.nextLine();
    	                     Redwolf.EditDetails(s1,s2,s3,s4,s5,s6);
    	                     Redwolf.Display();
    	                     break;
    	                 default: 
    	                     System.out.println("Choose a valid option please."); 
    	                     break; 
                    	 }
                 case 4:
                     System.out.println("Choose object:");
                     System.out.println("1.BrownBear");
                     System.out.println("2.PolarBear");
                     System.out.println("3.AmericanBlackBear");
                     System.out.println("4.AsianBlackBear");
                     System.out.println("5.CaveBear");
                     int o9=in.nextInt();
                     switch(o9)
                         {
                         case 1:
                             System.out.println("Enter details:");
                             System.out.println("Enter the Scientific Name: ");
                             String t1=in.nextLine();
                             System.out.println("Enter the Common Name:");
                             String t2=in.nextLine();
                             System.out.println("Enter its habitat:");
                             String t3=in.nextLine();
                             System.out.println("Enter its Life Span:");
                             String t4=in.nextLine();
                             System.out.println("Enter its Population Status:");
                             String t5=in.nextLine();
                             System.out.println("Enter its IUCN Status:");
                             String t6=in.nextLine();
                             BrownBear.EditDetails(t1,t2,t3,t4,t5,t6);
                             BrownBear.Display();
                             break;
                         case 2:
                             System.out.println("Enter details:");
                             System.out.println("Enter the Scientific Name: ");
                             String l1=in.nextLine();
                             System.out.println("Enter the Common Name:");
                             String l2=in.nextLine();
                             System.out.println("Enter its habitat:");
                             String l3=in.nextLine();
                             System.out.println("Enter its Life Span:");
                             String l4=in.nextLine();
                             System.out.println("Enter its Population Status:");
                             String l5=in.nextLine();
                             System.out.println("Enter its IUCN Status:");
                             String l6=in.nextLine();
                             PolarBear.EditDetails(l1,l2,l3,l4,l5,l6);
                             PolarBear.Display();
                             break;
                         case 3:
                             System.out.println("Enter details:");
                             System.out.println("Enter the Scientific Name: ");
                             String j1=in.nextLine();
                             System.out.println("Enter the Common Name:");
                             String j2=in.nextLine();
                             System.out.println("Enter its habitat:");
                             String j3=in.nextLine();
                             System.out.println("Enter its Life Span:");
                             String j4=in.nextLine();
                             System.out.println("Enter its Population Status:");
                             String j5=in.nextLine();
                             System.out.println("Enter its IUCN Status:");
                             String j6=in.nextLine();
                             DireWolf.EditDetails(j1,j2,j3,j4,j5,j6);
                             DireWolf.Display();
                             break;
                         case 4:
                             System.out.println("Enter details:");
                             System.out.println("Enter the Scientific Name: ");
                             String le1=in.nextLine();
                             System.out.println("Enter the Common Name:");
                             String le2=in.nextLine();
                             System.out.println("Enter its habitat:");
                             String le3=in.nextLine();
                             System.out.println("Enter its Life Span:");
                             String le4=in.nextLine();
                             System.out.println("Enter its Population Status:");
                             String le5=in.nextLine();
                             System.out.println("Enter its IUCN Status:");
                             String le6=in.nextLine();
                             AmericanBlackBear.EditDetails(le1,le2,le3,le4,le5,le6);
                             AmericanBlackBear.Display();
                             break;
                         case 5:
                             System.out.println("Enter details:");
                             System.out.println("Enter the Scientific Name: ");
                             String s1=in.nextLine();
                             System.out.println("Enter the Common Name:");
                             String s2=in.nextLine();
                             System.out.println("Enter its habitat:");
                             String s3=in.nextLine();
                             System.out.println("Enter its Life Span:");
                             String s4=in.nextLine();
                             System.out.println("Enter its Population Status:");
                             String s5=in.nextLine();
                             System.out.println("Enter its IUCN Status:");
                             String s6=in.nextLine();
                             CaveBear.EditDetails(s1,s2,s3,s4,s5,s6);
                             CaveBear.Display();
                             break;
                     
                	 
                 }
        } 
    
    }
    }
}
 


