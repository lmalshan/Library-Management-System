/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import MODEL.Item;
import DB.DB_Connection;

/**
 *
 * @author Pushpitha Rukshan
 */
public class ItemService {
        public void AddItem(Item item) {

        DB_Connection conn = new DB_Connection();
        String query = "Insert into ItemTable(BookName,AuthorName,ISBN,Price,NoCopies)values('" + item.getBookName()+ "','" + item.getAuthorName()+ "','" + item.getISBN()+ "','" + item.getPrice()+ "','"+item.getNoCopies()+"')";
        conn.Insert(query);
    }    
}
