package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.OBJ_ADAPTER;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.java_cup.internal.runtime.virtual_parse_stack;

import dao.CampaignDAO;
import dao.CampaignDAOImpl;
import dao.MaskDAO;
import dao.MaskDAOImpl;
import dao.ReservationDAO;
import pojo.Campaign;
import pojo.Reservation;

import java.util.Random;

/**
 * Servlet implementation class test
 */
@WebServlet("/out")
public class OutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OutServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	// 抽签，确定结果
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json;charset=utf-8");
		String times = request.getParameter("times");
		HttpSession session = request.getSession();
		session.setAttribute("flag", "end");
		CampaignDAO campaignDAO = new CampaignDAOImpl();
		int getnumber_n = campaignDAO.get().getTimes();// 当前轮数
		int times_n = Integer.parseInt(times);
		int ran1 = (int) (Math.random() * 3);
		String result = "fail";
		MaskDAO maskDAO = new MaskDAOImpl();
		Reservation[] rs = maskDAO.getList(times_n);
		if (maskDAO.query(id, getnumber_n)) {
			if (ran1 < 1) {
				ReservationDAO.update(id_n, "2");
				result = "success";
			} else {
				ReservationDAO.update(id_n, "1");
			}
		}
		request.setAttribute("status", result);
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
