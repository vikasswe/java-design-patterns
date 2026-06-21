package opps;

public class Composition {
    public static void main(String[] args) {
        House house = new House();

        house.showHouse();
    }
}


class Room {
    void display() {
        System.out.println("Room Available");
    }
}

class House {
    private Room room;

    House() {
        this.room = new Room();
    }

    void showHouse() {
        System.out.println("House Created");
        room.display();
    }
}