public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
        //this.department = null;
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public boolean isManager() {
        return department != null && department.getManager() == this;
    }

    @Override
    public String toString() {
        if (department == null) {
            return name + " не работает в отделе";
        }

        if (isManager()) {
            return name + " начальник отдела " + department.getName();
        } else {
            String managerName = (department.getManager() != null)
                    ? department.getManager().getName()
                    : "не назначен";
            return name + " работает в отделе " + department.getName() +
                    ", начальник которого " + managerName;
        }
    }
}