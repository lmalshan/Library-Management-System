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
public class Item {
    
    
    private int ItemID;
    private String BookName;
    private String AuthorName;
    private String ISBN;
    private float Price;
    private int NoCopies;

    public Item(int ItemID, String BookName, String AuthorName, String ISBN, float Price, int NoCopies) {
        this.ItemID = ItemID;
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.ISBN = ISBN;
        this.Price = Price;
        this.NoCopies = NoCopies;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getNoCopies() {
        return NoCopies;
    }

    public void setNoCopies(int NoCopies) {
        this.NoCopies = NoCopies;
    }
    
    
}
