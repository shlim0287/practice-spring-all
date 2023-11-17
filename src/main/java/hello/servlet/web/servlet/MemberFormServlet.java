package hello.servlet.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(name="memberFormServlet",urlPatterns = "/servlet/members/new=form")
public class MemberFormServlet extends HttpServlet {
}
