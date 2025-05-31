class EncapCar {
    private final String make;               
    private final String model;              
    private double rentalPricePerDay;
    private boolean isAvailable;

    public EncapCar(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;  
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay >= 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        } else {
            System.out.println("Rental price cannot be negative.");
        }
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car Rented Successfully.");
        } else {
            System.out.println("Car is already rented.");
        }
    }

    public void returnCar() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Car Returned Successfully.");
        } else {
            System.out.println("Car is already available.");
        }
    }


    public void displayCarInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Rental Price per Day: " + rentalPricePerDay);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Rented"));
    }


    public static void main(String[] args) {
        EncapCar car = new EncapCar("BMW", "Sedan", 10000);

        car.displayCarInfo();

       
        car.rentCar();
        car.rentCar(); 

        
        car.returnCar();
        car.returnCar(); 

        System.out.println("\n... Final Car Status ...");
        car.displayCarInfo();
    }
}

