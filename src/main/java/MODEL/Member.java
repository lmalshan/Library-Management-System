/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Pushpitha Rukshan
 */
public class Member {

    private int MemberID;
    private String MemberName;
    private int Contact;
    private String Address;
    private String NIC;
    private String RegDate;
    private int BookID;

    public Member(int MemberID, String MemberName, int Contact, String Address, String NIC, String RegDate, int BookID) {
        this.MemberID = MemberID;
        this.MemberName = MemberName;
        this.Contact = Contact;
        this.Address = Address;
        this.NIC = NIC;
        this.RegDate = RegDate;
        this.BookID = BookID;
    }

    public int getMemberID() {
        return MemberID;
    }

    public void setMemberID(int MemberID) {
        this.MemberID = MemberID;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int Contact) {
        this.Contact = Contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getRegDate() {
        return RegDate;
    }

    public void setRegDate(String RegDate) {
        this.RegDate = RegDate;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }
    
}
