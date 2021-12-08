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
public class DeleteMemberService {

    public void DeleteStock(int MemberID) {

        DB_Connection conn = new DB_Connection();

        conn.Insert("delete from member where MemberID='" + MemberID + "'");
        
    }

}
