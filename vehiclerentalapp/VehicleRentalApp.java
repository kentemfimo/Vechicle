/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class VehicleRentalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     public class Vechicle{
         
    private String Vechicle;
    private String brand;
    private String model;
    private int year;
    private int Rentaldays;
    private final String Brand;
    private final String Model;

    public Vechicle(String Vechicle, String Brand, String Model, double score) {
        this.Vechicle = Vechicle;
        this.Brand = Brand;
        this.Model = Model;
        this.year = year ;
        this.Rentaldays =Rentaldays;
    }

    public String getPlayerId() {
        return Vechicle;
    }

    public String getName() {
        return brand;
    }

    public String getTeamName() {
        return model;
    }

    public double getScore() {
        return year;
    }

    public void setScore(double score) {
        this.Rentaldays = Rentaldays;
    }
    
    
    @Override
    public String toString() {
        return String.format("%-8s %-15s %-15s %.2f", Vechicle, brand, model, year);
    }
}
}