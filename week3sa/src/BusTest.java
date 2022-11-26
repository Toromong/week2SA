public class BusTest {
    public static void main(String[] args) {
        bus bus1 = new bus(5,100,100);
        bus1.take(3);
        bus1.changeStatus();
        bus1.showInfo();
    }
}
