public class DoorTest {
    Door door1 = new Door(2, 2, 2);
    Door door2 = new Door();
    public static void main(String[] args) {
        DoorTest doorTest = new DoorTest();
        System.out.println(doorTest.door1);
        System.out.println(doorTest.door2);

        doorTest.door1.open_close();
        doorTest.door1.colorIT("Branco");

        doorTest.door2.open_close();
        doorTest.door2.colorIT("Verde");
        doorTest.door2.setDimensionX(3);
        doorTest.door2.setDimensionY(3);
        doorTest.door2.setDimensionZ(4);

        System.out.println(doorTest.door1);
        System.out.println(doorTest.door2);
    }
}
