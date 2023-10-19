class Employee{
    String name;
    String dept;
    String relg;
    int nin;
    String course;
}

class ObjArray{
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
    
        e1.name = "John";
        e1.dept = "HR";
        e1.relg = "Christian";
        e1.nin = 419;
        e1.course = "Engineering";

        e2.name = "Joshua";
        e2.dept = "Admin";
        e2.relg = "Christian";
        e2.nin = 312;
        e2.course = "Business Admin";

        e3.name = "Halimat";
        e3.dept = "Accounts";
        e3.relg = "Muslim";
        e3.nin = 411;
        e3.course = "Accounting";

        e4.name = "Charles";
        e4.dept = "IT";
        e4.relg = "Christian";
        e4.nin = 666;
        e4.course = "Computer Science";

        e5.name = "Sola";
        e5.dept = "Welfare";
        e5.relg = "Muslim";
        e5.nin = 444;
        e5.course = "Hospitality";


        Employee emp[] = new Employee[5];
        emp[0] = e1;
        emp[1] = e2;
        emp[2] = e3;
        emp[3] = e4;
        emp[4] = e5;

        for(Employee i : emp){
            System.out.println("Employee Details --- Name: " +i.name+ "     Department: " +i.dept+ "     Religion: " +i.relg+ "     NIN: " +i.nin+ "     Course of Study: " +i.course);
        }
    }
}