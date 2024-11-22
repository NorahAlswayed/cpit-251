package project.group.cpit251;

public class Admin {
    
    private String adminID;
    private String adminPassword;

    // Constructor
    public Admin(String adminID, String adminPassword) {
        this.adminID = adminID;
        this.adminPassword = adminPassword;
    }

    // Check if the user is an admin
    public boolean isAdmin(String inputID, String inputPassword) {
        return this.adminID.equals(inputID) && this.adminPassword.equals(inputPassword);
    }
}
