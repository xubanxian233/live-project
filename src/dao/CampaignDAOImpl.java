package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.Campaign;
import util.DBUtil;

public class CampaignDAOImpl implements CampaignDAO {

	@Override
	public void add(Campaign c) {
		// TODO Auto-generated method stub
		String sql = "insert into appointment values(? ,?)";
		try (Connection conn = DBUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, c.getTimes());
			ps.setInt(2, c.getTotal());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Campaign get() {
		// TODO Auto-generated method stub
		String sql = "select * from appointment order by times desc";
		Campaign c=new Campaign();
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setTimes(rs.getInt("times"));
				c.setTotal(rs.getInt("number"));
			}
			DBUtil.close(rs, ps, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public void update(Campaign c) {
		// TODO Auto-generated method stub
		String sql = "update appointment set number=? where times=?";
        try (Connection con = DBUtil.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
        	ps.setInt(1, c.getTotal());
        	ps.setInt(2, c.getTimes());
        	ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public int getTimes() {
		// TODO Auto-generated method stub
		int total = 0;
        try (Connection c = DBUtil.getConnection(); Statement s = c.createStatement()) {
            String sql = "select * from appointment";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                total = rs.getInt("times");
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
	}
}
