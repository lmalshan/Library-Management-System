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
public class UpdateMemberService {
        public void UpdateMember(Member member, int MemberID) {

        DB_Connection conn = new DB_Connection();
        String query = "Update member set MemberID='"+member.getMemberID()+"',MemberName='"+member.getMemberName()+"',Contact='"+member.getContact()+"',Address='"+member.getAddress()+"',NIC='"+member.getNIC()+"',RegDate='"+member.getRegDate()+"' where MemberID="+MemberID;
        conn.Insert(query);
    }
}
