import java.util.concurrent.atomic.AtomicInteger;

public class WaterTank {
    static AtomicInteger level = new AtomicInteger(50);
    static final int MAX_CAPACITY = 100;

    public static void main(String[] args) {
        InletThread inlet = new InletThread();
        OutletThread outlet = new OutletThread();
        ControllerThread controller = new ControllerThread();

        inlet.start();
        outlet.start();
        controller.start();
    }

    static class InletThread extends Thread {
        public void run() {
            while (true) {
                if (level.get() < 80 && level.get() + 10 <= MAX_CAPACITY) {
                    level.addAndGet(10);
                    System.out.println("Inlet: Water added, level = " + level.get());
                }
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        }
    }

    static class OutletThread extends Thread {
        public void run() {
            while (true) {
                if (level.get() > 80 && level.get() - 10 >= 0) {
                    level.addAndGet(-10);
                    System.out.println("Outlet: Water removed, level = " + level.get());
                }
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        }
    }

    static class ControllerThread extends Thread {
        public void run() {
            int count = 0;
            while (count < 5) {
                System.out.println("Controller: Current level = " + level.get());
                count++;
                try { Thread.sleep(1000); } catch (Exception e) {}
            }
            System.out.println("Controller: Finished monitoring 5 times.");
        }
    }
}

