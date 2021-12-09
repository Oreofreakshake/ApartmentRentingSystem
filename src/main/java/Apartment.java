
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yazak
 */
public class Apartment {
    protected int ApartmentNumber;
    protected double Price;
    protected boolean IsBasic;
    public List<String> AddedApartment = new ArrayList<String>();
   
    public void AddApartment(String apartmentNO, String price, String isBasic){
        
        AddedApartment.add(apartmentNO);
        AddedApartment.add(price);
        AddedApartment.add(isBasic);
    }
    
       
    
}
