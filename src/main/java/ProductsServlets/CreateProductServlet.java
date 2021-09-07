package ProductsServlets;

import dao.DoaFactory;
import dao.ProductsInterface;
import models.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateProductServlet", value = "/product/create")
public class CreateProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/product/create.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProductsInterface productDao = DoaFactory.getProductsDao();

        Product productToAdd = new Product();

        String productTitle = request.getParameter("title");
        String productDesc = request.getParameter("description");
        int productId = productDao.all().size();

        productToAdd.setTitle(productTitle);
        productToAdd.setDescription(productDesc);
        productToAdd.setId(productId);

//        Product differentWay = new Product(productId,productTitle,productDesc);

        productDao.insert(productToAdd);

        response.sendRedirect("/products/all");

    }
}
