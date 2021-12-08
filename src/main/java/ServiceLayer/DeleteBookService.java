/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import DB.DB_Connection;

/**
 *
 * @author Pushpitha Rukshan
 */
public class DeleteBookService {
        public void DeleteItem(int BookID){
        
        DB_Connection conn=new DB_Connection();
        String query="delete from ItemTable where ID="+BookID;
        conn.Insert(query);
    }
}
