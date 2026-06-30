public class lecturer extends employee {
    private String subject;
    private String department;

    public lecturer(String id, String name, String subject, String department) {
        super(id, name); // Calls the parent constructor
        this.subject = subject;
        this.department = department;
    }

    
    public void displayInfo() {
        super.displayInfo(); // Calls the parent's method to print ID and Name
        System.out.println("Subject: " + subject);      // Matches expected output
        System.out.println("Department: " + department);
    }
}