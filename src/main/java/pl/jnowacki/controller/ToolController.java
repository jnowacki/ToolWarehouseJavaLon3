package pl.jnowacki.controller;

import pl.jnowacki.service.ToolService;
import pl.jnowacki.service.ToolServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class ToolController extends HttpServlet {

    private ToolService toolService = ToolServiceImpl.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tools", toolService.getAll());

        getServletContext().getRequestDispatcher("/toolsJsp.jsp").forward(req, resp);
    }
}
