class Student {
    private int rollNo;     // private variable
    private String name;

    // Setter methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

public class encap {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        s.setName("Dwarak");

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
}
}