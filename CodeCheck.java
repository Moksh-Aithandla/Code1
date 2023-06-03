import java.util.*;
/**
A program to Display the categories and select items then
getting bill.
*/
public class Paints1
{
int choice, ch, nextcus, t=0, billno=1,contine;
double price, cost=0.0, tax, tamt, amt=0.0, tot=0.0, dis,quantity,tdamt;
String title, cname, cph, add;
Scanner in = new Scanner(System.in);
public void Welcome_Purchace()
{
  System.out.println("\t\t\t\t\t VENKATESHWARA PAINTS AND HARDWARE");
  System.out.println("************************************************************************************************");
  System.out.println("\t\tWELCOME TO VENKATESHWARA PAINTS AND HARDWARE");
  System.out.println("****************************************************************************************");
  System.out.println();
  System.out.println("Enter your Name");
  cname=in.nextLine();
  cname=in.nextLine();
  System.out.println("Enter your Phone Number");
  cph=in.nextLine();
  System.out.println("Enter your Address");
   add=in.nextLine();
  tot=0.0;
  Main_Menu();
}//end of welcome_purchase()
public void Main_Menu()
{
System.out.println();
System.out.println();
System.out.println("\t\t\t\t MENU");
System.out.println("\t\t\t 1.Paints");
System.out.println("\t\t\t 2.Nails");
System.out.println("\t\t\t 3.Cement");
System.out.println("\t\t\t 4.Brushes");
System.out.println("\t\t\t 5.Oil paints");
System.out.println("\t\t\t 6.Bill");

System.out.println();
System.out.println("Enter Your Choice");
choice = in.nextInt();
switch (choice)
{
  case 1:paints();
  break;
  case 2:nails();
  break;
  case 3:cement();
  break;
  case 4:brushes();
  break;
  case 5:oil_paints();
  break;
  case 6:bill();
  break;
  default:System.out.println("You have entered a wrong choice");
  break;
 
}//end of switch
if (choice!=9)
{
  System.out.println();
  System.out.println();
  System.out.println("============================================================================");
  System.out.println();
  System.out.println("Purchased Item Is "+title);
  System.out.println("Purchased Item price"+price*quantity);
  System.out.println();
  System.out.println("=================================================================================");
  System.out.println();
  System.out.println();
  amt=price*quantity;
  tot=tot+amt;
} 
   System.out.println();
   System.out.println("Do you want to continue with your purchase?\n 1 for MAIN MENU /n 2for Exit");
   contine=in.nextInt();
   if(contine==1)
   Main_Menu();
   else
   bill();
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println("Do you want to continue with the next customer? \n 1 for YES & 2 for no");
   nextcus=in.nextInt();
   if(nextcus==1)
   {
       Welcome_Purchace();
       billno++;
    }
       else
       System.exit(0);
    }//end of main menu

public void paints()
{
    Scanner in=new Scanner(System.in);
    System.out.println();
    System.out.println("Select the required category");
    System.out.println();
    System.out.println("1.Wall primer");
    System.out.println("2.Metal primer");
    System.out.println("3.Exterior emulsion");
    System.out.println("4.Interior emulsion");
    System.out.println("5.Stainers");
    System.out.println("6.Return to main_menu");
    System.out.println("Enter your choice");
    ch=in.nextInt();
   switch(ch)
   {
    case 1:wall_primer();
    break;
    case 2:metal_primer();
    break;
    case 3:exterior_emulsion();
     break;
    case 4:interior_emulsion();
    break;
    case 5:stainers();
    break;
    case 6:Main_Menu();
    default:System.out.println("You have entered a wrong choice");
            System.out.println("please enter a nymber between 1-6");
    break;
}
}



public void wall_primer()
{
    Scanner in=new Scanner(System.in);
   System.out.println("1.Intreior wall primer");
   System.out.println("2.exterior wall primer");
   System.out.println("3.Return to main_menu");
   System.out.println("Enter your choice");
   choice=in.nextInt();
   System.out.println("Enter number of liters");
   quantity=in.nextDouble();
   switch(ch)
   {
       case 1:title="Interior wall primer";
       price=140;
       break;
       case 2:title="Exterior wall primer";
       price=150;
       break;
       case 3:Main_Menu();
       break;
       default:System.out.println("You have enetred a wrong choice");
               System.out.println("please enter a nymber between 1-3");
       break;
    }
}
public void metal_primer()
{
    Scanner in=new Scanner(System.in);
    System.out.println("Enter number of liters reqired");
    quantity=in.nextInt();
    price=250;
}
public void exterior_emulsion()
{
    Scanner in=new Scanner(System.in);
    System.out.println("1.Ivary");
    System.out.println("2.Blue");
    System.out.println("3.gray");
    System.out.println("4.Return to main menu");
    System.out.println("Enter your choice");
    choice=in.nextInt();
    
    switch(choice)
    {
        case 1:title="Ivary";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=200;
        break;
        case 2:title="Blue";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=210;
        break;
        case 3:title="Gray";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=230;
        break;
        case 4:Main_Menu();
        break;
        default:System.out.println("You have entered a wrong choice");
                System.out.println("please enter a nymber between 1-4");
        break;
    }


public void interior_emulsion()
{
    
    
    Scanner in=new Scanner(System.in);
    System.out.println("1.Candy");
    System.out.println("2.Aquamarine");
    System.out.println("3.Light green");
    System.out.println("4.Light brown");
    System.out.println("5.Light red");
    System.out.println("6.Light orange"); 
    System.out.println("7.Return to main menu");
    System.out.println("Entre your choice");
    choice=in.nextInt();
    switch(choice)
    {
        case 1:title="Candy";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=180;
        break;
        case 2:title="Aquamarine";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=180;
        break;
        case 3:title="Light green";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=180;
        break;
        case 4:title="light brown";
        System.out.println("Enter number of liters require");
        quantity=in.nextDouble();
        price=190;
        break;
        case 5:title="light red";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=200;
        break;
        case 6:title="Light orange";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=190;
        break;
        case 7:Main_Menu();
        break;
        default:System.out.println("You have entered a wrong choice");
                System.out.println("please enter a nymber between 1 - 7");
        break;
    }
}


public void stainers()
{
    System.out.println("1.Fast red");
    System.out.println("2.Violet");
    System.out.println("3.Yellow");
    System.out.println("4.Fy green");
    System.out.println("5.Fast blue");
    System.out.println("6.Fast brown");
    System.out.println("Enetr your choice");
    choice=in.nextInt();
    switch(choice)
    {
        case 1:title="Fast red";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=45;
        break;
        case 2:title="Violet";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=30;
        break;
        case 3:title="Yellow";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=35;
        break;
        case 4:title="Fy green";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=40;
        break;
        case 5:title="fast blue";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=35;
        break;
        case 6:title="fast brown";
        System.out.println("Enter number of liters required");
        quantity=in.nextDouble();
        price=40;
        break;
        case 7:Main_Menu();
        break;
        default:System.out.println("You have entered a wrong choice");
                System.out.println("please enter a nymber between 1 - 7");
        break;
    }
}


public void nails()
{
    
    
    Scanner in=new Scanner(System.in);
    System.out.println("1.      2inch");
    System.out.println("2.      2.5inch");
    System.out.println("3.      3inch");
    System.out.println("4.      4inch");
    System.out.println("        Enter your choice");
    choice=in.nextInt();
    switch(choice)
    {
        case 1:title="2 Inch nail";
        System.out.println("Enter number of kilograms you wish to buy");
        quantity=in.nextDouble();
        price=60;
        break;
        case 2:title="2.5 Inch nail";
        System.out.println("Enter number of kilograms you wish to buy");
        quantity=in.nextDouble();
        price=65;
        break;
        case 3:title="3 Inch nail";
        System.out.println("Enter number of kilograms you wish to buy");
        quantity=in.nextDouble();
        price=70;
        break;
        case 4:title="4 Inch nail";
        System.out.println("Enter number of kilograms you wish to buy");
        quantity=in.nextDouble();
        price=75;
        break;
        case 5:Main_Menu();
        break;
        default:System.out.println("You have entered a wrong choice");
                System.out.println("please enter a nymber between 1-5");
        break;
    }
}


public void cement()
{
    
    
    Scanner in=new Scanner(System.in);
    System.out.println("1.Ultratech cement");
    System.out.println("2.ACC cement");
    System.out.println("3.Priya cement");
    System.out.println("4.Ambuja cement");
    System.out.println("5.Return to main_menu");
    System.out.println("Enter your choice");
    switch(choice)
    {
        case 1:title="Ultratech";
        System.out.println("Enter number of kilograms you wish to buy");
        quantity=in.nextDouble();
        price=170;
        break;
        case 2:title="ACC cement";
        System.out.println("Enter number of kilograms you wish to buy");
        quantity=in.nextDouble();
        price=175;
        break;
        case 3:title="Priya";
        System.out.println("Enter number of kilograms you wish to buy");
        quantity=in.nextDouble();
        price=180;
        break;
        case 4:title="Ambuja";
        System.out.println("Enter number of kilograms you wish to buy");
        quantity=in.nextDouble();
        price=150;
        break;
        case 5:Main_Menu();
        break;
        default:System.out.println("You have entered a wrong choice");
                System.out.println("please enter a nymber between 1-5");
        break;
    }
}
public void brushes()
{ 
    
    
   Scanner in=new Scanner(System.in);
    System.out.println("1.  1inch");
    System.out.println("2.  2inch");
    System.out.println("3.  3inch");
    System.out.println("Enetr your choice");
    choice=in.nextInt();
    switch(choice)
    {
        case 1:title="1 inch";
        System.out.println("Enter number of brushes reqired");
        quantity=in.nextDouble();
        price=60;
        break;
        case 2:title="2 inch";
        System.out.println("Enter number of brushes reqired");
        quantity=in.nextDouble();
        price=70;
        break;
        case 3:title="3 inch";
        System.out.println("Enter number of brushes reqired");
        quantity=in.nextDouble();
        price=80;
        break;
        case 4:Main_Menu();
        break;
        default:System.out.println("You have entered a wrong choice");
                System.out.println("please enter a nymber between 1-4");
        break;

    }
}


public void oil_paints()
{
    Scanner in=new Scanner(System.in);
    System.out.println("1.Golden brown");
    System.out.println("2.Dawn");
    System.out.println("3.Brown");
    System.out.println("4.Feroza");
    System.out.println("5.Sky blue");
    System.out.println("6.White");
    System.out.println("7.Green");
    System.out.println("8.Return to main_menu");
    System.out.println("Enter your choice");

    choice=in.nextInt();
    switch(choice)
    {
        case 1:title="Golden brown";
        System.out.println("Enter number of liters reqiured");
        quantity=in.nextInt();
        price=250;
        break;
        case 2:title="Dawn";
        System.out.println("Enter number of liters reqiured");
        quantity=in.nextInt();
        price=280;
        break;
        case 3:title=" brown";
        System.out.println("Enter number of liters reqiured");
        quantity=in.nextInt();
        price=250;
        break;
        case 4:title="Feroza";
        System.out.println("Enter number of liters reqiured");
        quantity=in.nextInt();
        price=260;
        break;
        case 5:title="Sky blue";
        System.out.println("Enter number of liters reqiured");
        quantity=in.nextInt();
        price=250;
        break;
        case 6:title="White";
        System.out.println("Enter number of liters reqiured");
        quantity=in.nextInt();
        price=230;
        break;
        case 7:title="Green";
        System.out.println("Enter number of liters reqiured");
        quantity=in.nextInt();
        price=280;
        break;
        case 8:Main_Menu();
        break;
        default:System.out.println("You have entered a wrong choice");
                System.out.println("please enter a nymber between 1-8");
        break;


    }
} 
public void bill()
{
    Scanner in=new Scanner(System.in);
    {
        System.out.println();
        System.out.println();
        System.out.println(); 
        System.out.println();
        System.out.println("\t\t\t VENKATESHWARA PAINTS AND HARDWARE");
        System.out.println();
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Address:Opp to santhe gate");
        System.out.println("MB Road, Kolar-563101");
        System.out.println("Conatct Number: 9241102233");
        System.out.println();
        System.out.println();
        tax=tot*(18/100.0);
        tamt=tot+tax;
        if (tamt<2500)
        dis=3.0;
        else if(tamt<5000)
        dis=4.0;
        else
        dis=5.0;
        dis=tamt*(dis/100.0);
        tdamt=tamt-dis;
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        System.out.println("Customer details");
        System.out.println("Name="+cname);
        System.out.println("Conatct number"+cph);
        System.out.println("Address="+add);
        System.out.println("Bill number="+billno);  
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("\t Price of all the purcg=hased item in Rs="+tot);
        System.out.println("\t Tax on ur purchase ="+tax);
        System.out.println("\t Discount on your purchase="+dis);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        System.out.println("Final Amount to be paid on your purchase"+tdamt);
    }
}
}
