
package com.mycompany.mavenproject1;

/**
 *
 * @author HOUSSEMX9
 */
public class Account {
    private String email;
    private String phoneNumber;
    private boolean archived;

    public Account(String email, String phoneNumber, boolean archived) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.archived = archived;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }
    
    
}
