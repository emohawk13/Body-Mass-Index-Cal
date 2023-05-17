/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author capps
 */
public class HealthProfile {
    //Attributes
    private String name;
    private int age;
    private double weight;
    private double height;
    
    //Constructors
    public HealthProfile() {
        name = "unknown";
        age = 0;
        weight = 0.0;
        height = 0.0;
    }
    // over load constructor
    public HealthProfile( String name, int age, double weight, double height) {
        this.setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }
        public HealthProfile( String name, int age, double weight, int feet, double inches) {
        this.setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(feet, inches);
    }
    //Behaviors
    public double calculateBMI(){
        //double bmi = (weight * 703) / (Math.pow(height, 2) );
        //return bmi;
        return (weight * 703) / (Math.pow(height, 2) );
    }
    public String calculateCategory() {
        double bmi = calculateBMI();
        if ( bmi< 18.5)
            return "Underweight";
        else if ( bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
    public int calculateMaxHR() {
        return 220 - age;
    }
    //Getters & Setters
    public String getName() {
        return name;
    }
    public void setName( String newName ){
        if ( newName.length() > 0)
            this.name = newName;
        else
            this.name = "unknown";
    }
    public int getAge() {
        return age;
    }
    public void setAge( int age) {
        if(age > 0)
            this.age = age;
        else
            this.age = 0;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight( double weight){
        if(weight > 0.0)
            this.weight = weight;
        else
            this.weight = 0.0;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double inches){
        if( inches > 0.0)
            this.height = inches;
        else 
            this.height = 0.0;      
    }
    public void setHeight(int feet, double inches){
        double total = feet * 12 + inches;
        if (total > 0.0)
            this.height = total;
        else
            this.height = 0.0;
    }
}
