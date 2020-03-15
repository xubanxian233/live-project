package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.*;
import util.DBUtil;


/**
 * testDemo
 */
public class testDemo {
    private Connection con;
	private ResultSet rs;
	private Statement st;

    @Test
    public void testEnquiey() {
        try {
            Connection con = DBUtil.getConnection();
            st = con.createStatement();
            String sql = "select * from registration";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String tel = rs.getString(2);
                String name = rs.getString(3);
                String number = rs.getString(4);
                String times = rs.getString(5);
                String getnumber = rs.getString(6);
                String status = rs.getString(7);
                
				System.out.println(id + " " + tel + " " + name + " " + 
					number + " " + times + " " + getnumber + " " + status);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
			DBUtil.close(rs, st, con);
		}
    }

    @Test
    public void testInsert() {
        try {
			con = DBUtil.getConnection();
			st = con.createStatement();
            
            String sql = "insert registration values('13','1312323898','xxx', 2, 1, null, 1)";
			int result = st.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("插入成功！");
			}else {
				System.out.println("插入失败！");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
        } finally {
			DBUtil.close(rs, st, con);
		}
    }

    @Test
    public void testUpdate() {  
		try {
			con = DBUtil.getConnection();
			st = con.createStatement();
			String sql = "update registration set tel = 13919347896 where name = 'xxx'";
			int result = st.executeUpdate(sql);
			if (result > 0) {
				System.out.println("修改成功");
			} else {
				System.out.println("修改失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, st, con);
		}
    }   
    
    @Test
    public void testDelete() {
		
		try {
			con = DBUtil.getConnection();
			st = con.createStatement();
			String line2 = "delete from registration where id='12'";
			int result = st.executeUpdate(line2);
			
			if(result > 0) {
				System.out.println("删除成功！");
			}else {
				System.out.println("删除失败！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, st, con);
        }
	}

}