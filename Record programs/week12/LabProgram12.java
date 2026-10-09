// Week 12 - Multithreading: seat reservation using synchronized method

class Reservation {
    private int availableSeats;

    Reservation(int seats) {
        this.availableSeats = seats;
    }

    // synchronized => only ONE person thread can run this method at a time
    public synchronized void reserve(String name, int requested) {
        System.out.println(name + " entered.");
        System.out.println("Available seats: " + availableSeats + " Requested seats: " + requested);

        try {
            Thread.sleep(300);          // simulate time taken to book
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (requested <= availableSeats) {
            System.out.println("Seat Available. Reserve now :-)");
            availableSeats -= requested;
            System.out.println(requested + " seats reserved.");
        } else {
            System.out.println("Requested seats not available :-)");
        }
        System.out.println(name + " leaving.");
        System.out.println("----------------------------------------------");
    }
}

class Person extends Thread {
    private final Reservation reservation;
    private final int seats;

    Person(String name, Reservation reservation, int seats) {
        super(name);                    // thread name = person name
        this.reservation = reservation;
        this.seats = seats;
    }

    @Override
    public void run() {
        reservation.reserve(getName(), seats);
    }
}

public class LabProgram12 {
    public static void main(String[] args) throws InterruptedException {
        Reservation r = new Reservation(10);   // change to 100 for 100 seats

        Person p1 = new Person("Person-1", r, 5);
        Person p2 = new Person("Person-2", r, 2);
        Person p3 = new Person("Person-3", r, 4);

        p1.setPriority(Thread.MAX_PRIORITY);    // 10
        p2.setPriority(Thread.NORM_PRIORITY);   // 5
        p3.setPriority(Thread.MIN_PRIORITY);    // 1

        p1.start();
        Thread.sleep(400);  // gap so threads arrive one after another (in order)
        p2.start();
        Thread.sleep(400);
        p3.start();
    }
}