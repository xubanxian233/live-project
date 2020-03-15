package servlet;
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.OBJ_ADAPTER;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.java_cup.internal.runtime.virtual_parse_stack;


 import dao.ReservationDAO;
// import dao.ProvinceDAOImpl;
 import pojo.Reservation;
// import util.DateUtil;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class ProvinceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProvinceServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json;charset=utf-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String tel = request.getParameter("tel");
		String number = request.getParameter("number");
        Integer getnumber_n=getTimes();
        Integer id_n= Integer.parseInt(id);
        boolean fl=true;
        String result="fail";
        //前三天的状况
        if(id_n>0){
            if(query(id,getnumber_n-1))
            {
                String s1=ReservationDAO.list(id_n-1).getStatus();
                if(!s1.equals("2")) {
                    fl=false;
                }
            }
            if(query(id,getnumber_n-2))
            {
                String s1=ReservationDAO.list(id_n-2).getStatus();
                if(!s1.equals("2")) {
                    fl=false;
                }
            }
            if(query(id,getnumber_n-3))
            {
                String s1=ReservationDAO.list(id_n-3).getStatus();
                if(!s1.equals("2")) {
                    fl=false;
                }
            }
            
        }
        //预约成功
        if(!query(id,getnumber_n)&&fl){
            if(Times_n >=times_n){
                    getnumber_n++;
                    times_n++;
                    String in = String.valueOf(getnumber_n);
                    String intT = String.valueOf(times_n);
                    Reservation Order_=new Reservation(in,id,tel,number);
                    ReservationDAO.add(Order_);
                    result="success";
                }
        }

        else {
            result="fail";
        }
        //是否预约成功
        request.setAttribute("status",result);
		
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
