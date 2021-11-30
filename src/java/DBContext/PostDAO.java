/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Post;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PostDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public ArrayList<Post> getAllPost() {
        ArrayList<Post> postList = new ArrayList<>();
        try {

            String query = "select * from Post  ";
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                postList.add(new Post(rs.getInt("ID"), rs.getString("Description"), rs.getInt("UserID"), rs.getString("date"), rs.getInt("CategoryID"), rs.getString("PostImgURL")));
            }
        } catch (SQLException e) {
        }
        DBcontext.close(conn, ps, rs);
        return postList;
    }
}
