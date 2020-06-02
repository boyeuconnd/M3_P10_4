import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@WebServlet(name = "CustomerServlet",urlPatterns = "/show")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> mylist = new ArrayList<>();
        Customer customer1 = new Customer("Phạm Hải Đăng","1993/7/14","Nam Định");
        Customer customer2 = new Customer("Nguyễn Hồng Đoàn","1997/6/25","Nghệ An");
        Customer customer3 = new Customer("Đào Xuân Đông","1997","Hà Nội");
        Customer customer4 = new Customer("Lê Văn Huân","1999","Hà Nội");
        mylist.add(customer1);
        mylist.add(customer2);
        mylist.add(customer3);
        mylist.add(customer4);
        request.setAttribute("list",mylist);
        request.setAttribute("name",mylist.get(0).getName());
        request.setAttribute("birthday",mylist.get(0).getBirthday());
        request.setAttribute("address",mylist.get(0).getAddress());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customerList.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
