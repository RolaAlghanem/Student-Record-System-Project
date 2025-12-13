
package report;

import manager.StudentManager;

public abstract class Report {

    private String name;

    public Report(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void generate(StudentManager manager);
}
