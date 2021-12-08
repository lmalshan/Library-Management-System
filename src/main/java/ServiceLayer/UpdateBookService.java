/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import DB.DB_Connection;
import MODEL.Item;

/**
 *
 * @author Pushpitha Rukshan
 */
public class UpdateBookService {
            public void UpadateBook(Item item, int ItemID) {

        DB_Connection conn = new DB_Connection();
        String query = "Update itemtable set ID='"+item.getItemID()+"',BookName='"+item.getISBN()+"',AuthorName='"+item.getAuthorName()+"',ISBN='"+item.getISBN()+"',Price='"+item.getPrice()+"',NoCopies='"+item.getNoCopies()+"' where ID="+ItemID;
        conn.Insert(query);
    }
}
