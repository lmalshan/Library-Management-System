/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLayer;

import DB.DB_Connection;
import MODEL.Member;

/**
 *
 * @author Pushpitha Rukshan
 */
public class MemberService {

    public void AddMember(Member member) {

        DB_Connection conn = new DB_Connection();
        String query = "Insert into member(MemberName,Contact,Address,NIC,RegDate)values('" + member.getMemberName() + "','" + member.getContact() + "','" + member.getAddress() + "','" + member.getNIC() + "','" + member.getRegDate() + "')";
        conn.Insert(query);
    }
}
