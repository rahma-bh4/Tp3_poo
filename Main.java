import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
 MaDate d1=new MaDate(2024);
 MaDate d2=new MaDate(31,12,2024);
 MaDate d3=new MaDate(28,2,2023);
 Scanner s =new Scanner(System.in);

 System.out.println(d1);
 System.out.println(d2);
  System.out.println(d3);
  System.out.println("choisir l'une des operations ");
    System.out.println("ajout d un jour  ");
  System.out.println("ou ajout de plusieurs jours");
    System.out.println("ajout d un mois");
      System.out.println("ajout d une année");
      int n=s.nextInt();
      System.out.println("donner le jour");
 int j=s.nextInt();
 System.out.println("donner le mois");
 int m=s.nextInt();
 d1.setJour(j);
 d1.setMois(m);
    switch (n)
    {
        case 1: d1.ajouterUnJour();
             System.out.println(d1);break; 
        case 2:
            System.out.println("donner le nombre de jour a ajouter");
            int nb=s.nextInt();
            d1.ajouterPlusieursJours(nb);
            System.out.println(d1);break;
        case 3: 
        d1.ajouterUnMois();
            System.out.println(d1);
            break;
        case 4:
            d1.ajouterUnAn();
            System.out.println(d1);
            break;
        default:
              System.out.println("donner un choix valide !!!"); 
        
    }
    s.close();}
    

}