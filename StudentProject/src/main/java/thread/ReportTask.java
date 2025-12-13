
package thread;

import manager.StudentManager;
import report.Report;

public class ReportTask implements Runnable {

    private StudentManager manager;
    private Report report;

    public ReportTask(StudentManager manager, Report report) {
        this.manager = manager;
        this.report = report;
    }

    @Override
    public void run() {
        System.out.println("Running: " + report.getName());
        report.generate(manager);
    }
}
