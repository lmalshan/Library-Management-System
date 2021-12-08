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
public class Borrowed {

    private int BorrowBID;
    private int MemberID;
    private int BookID;
    private String MemberName;
    private String BookName;
    private String BorrowingDate;
    private String ReturningDate;

    public Borrowed(int BorrowBID, int MemberID, int BookID, String MemberName, String BookName, String BorrowingDate, String ReturningDate) {
        this.BorrowBID = BorrowBID;
        this.MemberID = MemberID;
        this.BookID = BookID;
        this.MemberName = MemberName;
        this.BookName = BookName;
        this.BorrowingDate = BorrowingDate;
        this.ReturningDate = ReturningDate;
    }

    public int getBorrowBID() {
        return BorrowBID;
    }

    public void setBorrowBID(int BorrowBID) {
        this.BorrowBID = BorrowBID;
    }

    public int getMemberID() {
        return MemberID;
    }

    public void setMemberID(int MemberID) {
        this.MemberID = MemberID;
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

    public String getBorrowingDate() {
        return BorrowingDate;
    }

    public void setBorrowingDate(String BorrowingDate) {
        this.BorrowingDate = BorrowingDate;
    }

    public String getReturningDate() {
        return ReturningDate;
    }

    public void setReturningDate(String ReturningDate) {
        this.ReturningDate = ReturningDate;
    }

}
