
import java.util.Scanner;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yazak
 */
public class MainClass {
    public static void main(String args[]){
        
        Apartment manager = new Apartment();
        
        int ApartmentCounter = 0;
        
        ArrayList<String> datacheat = new ArrayList<String>();
        
        List DataStorer = new ArrayList();
        
        boolean run = true;
        
        String ApartmentType = "Basic";
        String ApartmentType2 = "Premimum";
        
        System.out.println("\n-------------------------");
        System.out.println("Apartment Renting System");
        System.out.println("-------------------------\n");

        
        
        while(run){
            System.out.println("Add an Apartment [1]\n");
            System.out.println("Delete an Apartment [2]\n");
            System.out.println("Apartment Details [3]\n");
            
            try{
                Scanner choiceGetter = new Scanner(System.in);
                int choice = choiceGetter.nextInt();
                
                //adding an apartment
                if(choice == 1){
                    //getting apartment number
                    System.out.println("\nEnter Apartment Number: ");
                    Scanner apartmentnumberGetter = new Scanner(System.in);
                    manager.ApartmentNumber = apartmentnumberGetter.nextInt();
                    
                    String cheatANum = Integer.toString(manager.ApartmentNumber);
                    
                    datacheat.add(cheatANum);
                    
                    //getting apartment price
                    System.out.println("\nEnter Apartment Price: ");
                    Scanner apartmentpriceGetter = new Scanner(System.in);
                    manager.Price = apartmentpriceGetter.nextDouble();
                     
                    
                    String cheatAPrice = Double.toString(manager.Price);
                    
                    datacheat.add(cheatAPrice);
                    
                    //getting apartment type
                    System.out.println("\nEnter Apartment Type: ");
                    System.out.println("Basic [1]\n");
                    System.out.println("Premium [2]\n");
        
                    try{
                        Scanner choiceGetter2 = new Scanner(System.in);
                        int choice2 = choiceGetter2.nextInt();
                        if(choice2 == 1){
                            manager.IsBasic = true;
                            
                            String ApartmentNumber = Integer.toString(manager.ApartmentNumber);
                            String ApartmentPrice = Double.toString(manager.Price);
                            
                            //adding data to the dataGetter array
                            manager.AddApartment(ApartmentNumber, ApartmentPrice, "Basic");
                            
                            System.out.println("\nSUCCESSFULLY ADDED AN APARTMENT!\n");
                            
                            
                            //adding data to the storeArray
                            
                            DataStorer.add(manager.AddedApartment);
                            manager.AddedApartment.clear();
                            System.out.println("\nSUCCESSFULLY STORED THE ADDED APARTMENT!\n\n");
                            
                            
                            ApartmentCounter++;

                        }
                        else if(choice2 == 2){
                            manager.IsBasic = false;
                            
                            String ApartmentNumber = Integer.toString(manager.ApartmentNumber);
                            String ApartmentPrice = Double.toString(manager.Price);
                            
                            //adding data to the dataGetter array
                            manager.AddApartment(ApartmentNumber, ApartmentPrice, "Premium");
                            
                            
                            System.out.println("\nSUCCESSFULLY ADDED AN APARTMENT!\n");
                            
                            //adding data to the storeArray
                            
                            DataStorer.add(manager.AddedApartment);
                            manager.AddedApartment.clear();
                            System.out.println("\nSUCCESSFULLY STORED THE ADDED APARTMENT!\n\n");
                            ApartmentCounter++;
                        }
                        
                       
                        else{
                            System.out.println("\nPLEASE ENTER A VALID CHOICE! (try again)\n\n");
                
                        }

              
            
                    }//try
                    catch(Exception e){
                        System.out.println("\nPLEASE ENTER A VALID CHOICE! (enter your choice from the [])\n");
                    }//catch
                  
              
                }//end of adding apartment
                
                //deleting an apartment
                else if(choice == 2){
                    System.out.println("\nThere are "+ApartmentCounter+" apartments that can be deleted\n");
                    if(ApartmentCounter!=0){
                        System.out.println("Which apartment do you want to delete?\n");
                            for(int i = 1;i<=ApartmentCounter;i++){
                                System.out.println("Apartment: "+i+"\n");
                            }
                    
                            
                        try{
                            Scanner DeleteChoiceGetter = new Scanner(System.in);
                    
                            int DeleteChoice = DeleteChoiceGetter.nextInt();
                    
                            int remover = DeleteChoice -1;
                    
                            DataStorer.remove(remover);
                            
                            for(int i =0; i<2; i++){
                                datacheat.remove(remover);
                            }
                            


                            
                            System.out.println("\nSUCCESSFULLY REMOVED THE APARTMENT!\n\n");
                            ApartmentCounter--;
                        
                        }//try
                        catch(Exception e){
                            System.out.println("\nPLEASE ENTER A VALID CHOICE!\n");
                            
                        }//catch
                        
                    }
                    
                    else{
                        System.out.println("There are no apartments for you to delete!\n");
                    }

                }//end of deleting apartment
                
                //searching an apartment
                else if(choice == 3){
                    System.out.println("\nThere are "+ApartmentCounter+" apartments that can be Viewed\n");
                    if(ApartmentCounter != 0){
                        System.out.println("Which apartment do you want to view?\n");
                            for(int i = 1;i<=ApartmentCounter;i++){
                                System.out.println("Apartment: "+i+"\n");
                            }
                            try{
                                Scanner ViewChoiceGetter = new Scanner(System.in);
                    
                                int ViewChoice = ViewChoiceGetter.nextInt();
                            
                                if(ViewChoice ==1){
                                    int ViewValue = ViewChoice -1;
                                    String Anum = datacheat.get(ViewValue);
                                    String Aprice = datacheat.get(ViewValue +1);
                                    System.out.println("Apartment number: "+Anum+"\nApartment price: "+Aprice+"\nApartment type: Basic\n");
                                    
                                    
                                }
                                else{
                                    String Anum = datacheat.get(ViewChoice);
                                    String Aprice = datacheat.get(ViewChoice +1);
                                    
                                    if(ViewChoice%2==0){
                                        System.out.println("Apartment number: "+Anum+"\nApartment price: "+Aprice+"\nApartment type: Basic\n");
                                    
                                    }
                                    else{
                                        System.out.println("Apartment number: "+Anum+"\nApartment price: "+Aprice+"\nApartment type: Premium\n");
                                    }
                                    
                                }
                                
                            
                                
 
                            }//try
                            catch(Exception e){
                                System.out.println("\nPLEASE ENTER A VALID CHOICE!\n"+e);
                            
                            }//catch
                       
                    }
                    else{
                        System.out.println("There are no apartments for you to view!\n");
                    }
                            

                    
                }//end of searching apartment
                
                else{
                    System.out.println("\nPLEASE ENTER A VALID CHOICE!\n");
                
                }
            
            }//try
            catch(Exception e){
                System.out.println("\nPLEASE ENTER A VALID CHOICE! (enter your choice from the [])\n");
            }//catch
            
            
        }//whileloop
        
    }//main function
    
}//class
