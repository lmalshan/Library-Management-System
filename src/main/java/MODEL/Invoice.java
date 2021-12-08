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
public class Invoice {
    private int BookID;
    private String MemberName;
    private String BookName;
    private float Fine;
    private float TotalFine; 

    public Invoice(int BookID, String MemberName, String BookName, float Fine, float TotalFine) {
        this.BookID = BookID;
        this.MemberName = MemberName;
        this.BookName = BookName;
        this.Fine = Fine;
        this.TotalFine = TotalFine;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public float getFine() {
        return Fine;
    }

    public void setFine(float Fine) {
        this.Fine = Fine;
    }

    public float getTotalFine() {
        return TotalFine;
    }

    public void setTotalFine(float TotalFine) {
        this.TotalFine = TotalFine;
    }
    
    
}
