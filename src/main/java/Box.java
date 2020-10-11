public class Box {
    final int NUMBER = 5;
    final int SLEEP = 3000;
    boolean isOpened = false;

    public void openBox() {
        try {
            for (int i = 0; i < NUMBER; i++) {
                Thread.sleep(SLEEP);
                if (!isOpened) {
                    System.out.println(Thread.currentThread().getName() + " открыл коробку");
                    isOpened = true;
                }
            }
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    public void closeBox() {
        while (!Thread.interrupted()) {
            if (isOpened) {
                System.out.println(Thread.currentThread().getName() + " закрыла коробку");
                isOpened = false;
            }
        }
    }
}
