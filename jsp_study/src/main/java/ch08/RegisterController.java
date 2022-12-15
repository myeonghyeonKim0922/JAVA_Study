package ch08;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/rcontrol")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    RegistService service;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	service = new RegistService();
    }
    
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		String view = "";
		
		if(action == null) {
			getServletContext().getRequestDispatcher("/rcontrol?action=list").forward(req, resp);
		} else {
			switch(action) {
			case "list":view = list(req,resp); break;
			case "info":view = info(req,resp); break;
			}
			getServletContext().getRequestDispatcher("/ch08/"+view).forward(req, resp);
		}
	}
    private String info(HttpServletRequest req, HttpServletResponse resp) {
    	Regist r =service.find(req.getParameter("id"));
    	req.setAttribute("r", r);
    	return "registInfo.jsp";
   	
    }
	
    private String list(HttpServletRequest req, HttpServletResponse resp) {
    	List<Regist> rlist = service.findAll();
    	req.setAttribute("regists", rlist);
    	return "registList.jsp";
    	
    }
	}


