/****Main****/

import java.util.*;
import java.util.Scanner.*;
public class Main {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the country name");
        String name = sc.nextLine();
        System.out.println("Enter the country code");
        String countryCode = sc.nextLine();
        System.out.println("Enter the isd code");
        String isdCode = sc.nextLine();
        Country c = new Country(name,countryCode,isdCode);
        c.display();
        sc.close();
	}

}

/****Country****/

import java.util.*;

public class Country{
    public String name;
    public String countryCode;
    public String isdCode;
  	Country(String name, String countryCode, String isdCode){
		  this.name = name;
		  this.countryCode = countryCode;
		  this.isdCode = isdCode;
	}
    
    public String getName(){
        return this.name;
    }
	
    public String getcountryCode(){
        return this.countryCode;
    }

    public String getisdCode(){
        return this.isdCode;
    }

    public void display(){
        System.out.println("Country Name:"+name);
        System.out.println("Country Code:"+countryCode);
        System.out.println("ISD Code:"+isdCode);
    }
}
