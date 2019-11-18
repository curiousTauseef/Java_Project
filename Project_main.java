import java.util.*;

class Project_main
{
    public static void main(String[] args)
    {
        ArrayList<Panthera> Panthera=new ArrayList<Panthera>();
        ArrayList<Macaca> Macaca=new ArrayList<Macaca>();
        ArrayList<Canis> Canis=new ArrayList<Canis>();
        ArrayList<Ursus> Ursus=new ArrayList<Ursus>();
        ArrayList<Bos> Bos=new ArrayList<Bos>();

        Scanner in=new Scanner(System.in);

        System.out.println("Choose an option: ");
        System.out.println("1.Add new");
        System.out.println("2.Edit");
        System.out.println("3.Delete");
        System.out.println("4.Display");
        
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
                
                int o2=in.nextInt();
                switch (o2) 
                { 
                    case 1: 
                        System.out.println("Enter the Scientific Name: ");
                        String p1=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String p2=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        double p3=in.nextLine()
                        System.out.println("Enter its Population Status:");
                        double p4=in.nextLine()
                        System.out.println("Enter its IUCN Status:");
                        String p5=in.nextLine()
                        Panthera.add(new Panthera(p1,p2,p3,p4,p5));
                        break; 
                    case 2: 
                        System.out.println("Enter the Scientific Name: ");
                        String m1=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String m2=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        double m3=in.nextLine();
                        System.out.println("Enter its Population Status:");
                        double m4=in.nextLine();
                        System.out.println("Enter its IUCN Status:");
                        String m5=in.nextLine();
                        Macaca.add(new Macaca(m1,m2,m3,m4,m5));
                        break; 
                    case 3:
                        System.out.println("Enter the Scientific Name: ");
                        String c1=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String c2=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        double c3=in.nextLine();
                        System.out.println("Enter its Population Status:");
                        double c4=in.nextLine();
                        System.out.println("Enter its IUCN Status:");
                        String c5=in.nextLine();
                        Canis.add(new Canis(c1,c2,c3,c4,c5)); 
                        break; 
                    case 4:
                        System.out.println("Enter the Scientific Name: ");
                        String u1=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String u2=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        double u3=in.nextLine();
                        System.out.println("Enter its Population Status:");
                        double u4=in.nextLine();
                        System.out.println("Enter its IUCN Status:");
                        String u5=in.nextLine();
                        Ursus.add(new Ursus(u1,u2,u3,u4,u5));  
                        break;
                    case 5: 
                        System.out.println("Enter the Scientific Name: ");
                        String b1=in.nextLine();
                        System.out.println("Enter its habitat:");
                        String b2=in.nextLine();
                        System.out.println("Enter its Life Span:");
                        double b3=in.nextLine();
                        System.out.println("Enter its Population Status:");
                        double b4=in.nextLine();
                        System.out.println("Enter its IUCN Status:");
                        String b5   =in.nextLine();
                        Bos.add(new Bos(b1,b2,b3,b4,b5)); 
                        break; 
                    default: 
                        System.out.println("Choose a valid option please."); 
                        break; 
                } 
                
                break; 
            case 2: //EDIT
                edit
                break; 
            case 3: //DELETE
                dayString = "Wednesday"; 
                break; 
            case 4: //DISPLAY
                
                break; 
            default: 
                System.out.println("Choose a valid option please."); 
                break; 
        } 
    }
}