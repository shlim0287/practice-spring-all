package hello.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.servlet.basic.HelloDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseJsonServlet",urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {
    ObjectMapper objectMapper=new ObjectMapper();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type", "application/json");
        resp.setCharacterEncoding("utf-8");

        HelloDate helloDate=new HelloDate();
        helloDate.setUsername("kim");
        helloDate.setAge(6);

        String result = objectMapper.writeValueAsString(helloDate);
        PrintWriter writer = resp.getWriter();
        writer.write(result);
    }
}
