package cn.itcast.web;

import cn.itcast.domain.User;
import cn.itcast.service.ServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@WebServlet("/ajaxServlet")
public class AjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        User u = new User();
        u.setUsername(username);
        ServiceImp s = new ServiceImp();
        User login = s.login(u);
        if (login == null) {
            PrintWriter out = response.getWriter();
            out.write("success");
        } else {
            PrintWriter out = response.getWriter();
            out.write("erro");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request, response);
    }
}
