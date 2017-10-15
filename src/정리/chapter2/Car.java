package 정리.chapter2;

public class Car {
    public float FuelEfficiency;
    public float FuelAmount ;
    private float currentpoint;


    public Car (float fuelEfficiency) {
        this.FuelAmount = 0;
        this.FuelEfficiency = fuelEfficiency;
        this.currentpoint = 0;
    }
    public void Drive ( float mile ) {
        this.currentpoint = this.currentpoint + mile;
        this.FuelAmount = this.FuelAmount - mile/this.FuelEfficiency;

    }

    public void Fuel ( float amount ) {
        this.FuelAmount = this.FuelAmount + amount;

    }

    public float CalDistance ( float destination) {
        float Distance = destination - this.currentpoint;
        float GallonNeeded = Distance / this.FuelEfficiency;
        return GallonNeeded;
    }

    public float printFuel (){
        return this.FuelAmount;
    }

    public float printcurrentpoint() {
        return this.currentpoint;
    }

}
