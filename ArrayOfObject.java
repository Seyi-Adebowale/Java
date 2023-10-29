class Employee {
    private String name;
    private String dept;
    private String relg;
    private int nin;
    private String course;

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getRelg() {
        return relg;
    }

    public int getNin() {
        return nin;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setDept(String newDept) {
        dept = newDept;
    }

    public void setRelg(String newRelg) {
        relg = newRelg;
    }

    public void setNin(int newNin) {
        nin = newNin;
    }

    public void setCourse(String newCourse) {
        course = newCourse;
    }
}

class ObjArray {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        e1.setName("John");
        e1.setDept("HR");
        e1.setRelg("Christian");
        e1.setNin(419);
        e1.setCourse("Engineering");

        e2.setName("Joshua");
        e2.setDept("Admin");
        e2.setRelg("Christian");
        e2.setNin(312);
        e2.setCourse("Business Admin");

        e3.setName("Halimat");
        e3.setDept("Accounts");
        e3.setRelg("Muslim");
        e3.setNin(411);
        e3.setCourse("Accounting");

        e4.setName("Charles");
        e4.setDept("IT");
        e4.setRelg("Christian");
        e4.setNin(666);
        e4.setCourse("Computer Science");

        e5.setName("Sola");
        e5.setDept("Welfare");
        e5.setRelg("Muslim");
        e5.setNin(449);
        e5.setCourse("Hospitality");

        Employee emp[] = new Employee[5];
        emp[0] = e1;
        emp[1] = e2;
        emp[2] = e3;
        emp[3] = e4;
        emp[4] = e5;

        for (Employee i : emp) {
            System.out.println("Employee Details --- Name: " + i.getName() +
                    "     Department: " + i.getDept() +
                    "     Religion: " + i.getRelg() +
                    "     NIN: " + i.getNin() +
                    "     Course of Study: " + i.getCourse());
        }
    }
}