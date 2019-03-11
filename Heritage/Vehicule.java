public abstract class Vehicule {

    private String brand;
    private int kilometers;

    //Constructors
    public Vehicule (String brand,int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getters and setters
    public String getBrand(){
        return this.brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }

    public abstract String doStuff();
}