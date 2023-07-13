class Student {
    private int id;
    private String name;
    private int admissionYear;
    private double gpa;

    public static void main(String[] args) {
        Student student = new Student(65022443, "sky", 2023, 2.50);
    }

    public Student(int id, String name, int admissionYear, double gpa) {
        this.id = id;
        this.name = name;
        this.admissionYear = admissionYear;
        this.gpa = gpa;
    }

    public void showDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("GPA: " + gpa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
