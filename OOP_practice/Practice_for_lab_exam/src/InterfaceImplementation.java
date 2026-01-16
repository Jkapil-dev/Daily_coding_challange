//Design and develop a context for given case study and implement an interface for Vehicles
// Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
// functionalities such as Gear Change, Speed up and apply brakes. Make an interface and put all
// these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
// functionalities in their own class in their own way.
interface  Vehicle {
     void changeGear();
     void speedUp();
     void applyBrakes();
}
class Bike implements Vehicle{
    void changeGear(){
        System.out.println("Bike is changing gear"...);
    }
}
