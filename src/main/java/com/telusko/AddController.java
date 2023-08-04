package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.dao.AlienDao;
import com.telusko.model.Alien;
import com.telusko.service.AddService;

@Controller

public class AddController {
	@RequestMapping("/add")	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		int t1 = Integer.parseInt(request.getParameter("id"));
		String t2 = request.getParameter("nama");
		String t3 = request.getParameter("kelas");
		
		AlienDao dao = new AlienDao();
		Alien a1 = dao.getAlien(t1,t2,t3);
		
//		request.setAttribute("alien", a1);
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		
		
		
//		ModelAndView mv = new ModelAndView();// objek untuk dipanggil ke display.jsp
//		mv.setViewName("display"); // .jsp diilangin krn setting di telusko config
//		mv.addObject("resultt",result);

//		return mv;
	}
	
	
	
//	public ModelAndView add(@RequestParam("t1")int i, @RequestParam("t2") int j, HttpServletRequest request, HttpServletResponse response) {
////		int i = Integer.parseInt(request.getParameter("t1"));
////		int j = Integer.parseInt(request.getParameter("t2"));
//		
//		AddService as =new AddService();// call class service operation
//		int result = as.add(i, j);
//		
////		AlienDao mv = new AlienDao();
//		
//		
//		ModelAndView mv = new ModelAndView();// objek untuk dipanggil ke display.jsp
//		mv.setViewName("display"); // .jsp diilangin krn setting di telusko config
//		mv.addObject("resultt",result);
//
//		return mv;
//	}
	
}
