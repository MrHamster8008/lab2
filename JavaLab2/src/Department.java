public class Department {
    private String name;
    private Employee manager;

    public Department(String name) {
        this.name = name;
        //this.manager = null;
    }

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        if (manager != null) {
            return name + " (начальник: " + manager + ")";
        }
        else {
            return name + " (начальник не назначен)";
        }
    }
}