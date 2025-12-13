
package thread;

import manager.StudentManager;

public class AutoSaveTask implements Runnable {

    private StudentManager manager;

    public AutoSaveTask(StudentManager manager) {
        this.manager = manager;
    }

    @Override
    public void run() {
        while (true) {
            try {
                manager.saveAll();   // we will add this method next
                Thread.sleep(5000);  // wait 5 seconds
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}