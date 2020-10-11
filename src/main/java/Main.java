public class Main {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();

        Thread user = new Thread(null, box::openBox, "Пользователь");
        Thread toy = new Thread(null, box::closeBox, "Игрушка");

        user.start();
        toy.start();

        user.join();
        toy.interrupt();
    }
}
