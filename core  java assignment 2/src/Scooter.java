
class Scooter extends Vehicle{

void start()
{
System.out.println("scooter start with kick");
}

public static void main(String[]args) {
Scooter s = new Scooter ();
s.start();
Car c = new Car ();
c.start();
}
}

