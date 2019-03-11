public class Boat extends Vehicule {      
        
	public Boat(String brand, int kilometers) {  
	    super(brand,kilometers);    	    
	}
	 	
  
 	@Override
    public String doStuff(){
        return "Je suis " + this.getBrand() + " et je fais glou glou et j'ai " + this.getKilometers() + " de km à mon compteur";       
    }

}
