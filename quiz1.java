class quiz1 {
    public static void main(String[] args) {
        Student student1 = new Student(65022443, "sky", 2, 2.50);
        student1.ShowDetails();
    }
}

class Student {

    private int ID;
    private String Name;
    private int AddmissionYear;
    private double GPA;

    Student(int ID, String Name, int AddmissionYear, double GPA) {
        this.ID = ID;
        this.Name = Name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA;
    }

    public void ShowDetails() {
        System.out.println("ID : " + this.ID);
        System.out.println("Name : " + this.Name);
        System.out.println("Addmission Year : " + this.AddmissionYear);
        System.out.println("GPA : " + this.GPA);
    }

}
