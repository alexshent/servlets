package ua.alexshent;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/hello-jsp")
public class HelloServlet extends HttpServlet {
    private final List<RequestItem> list = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var ipAddress = request.getRemoteAddr();
        var userAgent = request.getHeader("User-Agent");
        var now = LocalDateTime.now();

        var item = new RequestItem(ipAddress, userAgent, now);
        list.add(item);

        request.setAttribute("list", list);
        request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
    }
}
