package com.wastemanagement.controller;

import com.wastemanagement.model.WasteCollector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/WasteCollectionServlet")
public class WasteCollectionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String wasteType = request.getParameter("wasteType");
        double weight = Double.parseDouble(request.getParameter("weight"));

        HttpSession session = request.getSession();
        WasteCollector wasteCollector = (WasteCollector) session.getAttribute("wasteCollector");

        if (wasteCollector == null) {
            wasteCollector = new WasteCollector();
            session.setAttribute("wasteCollector", wasteCollector);
        }

        try {
            wasteCollector.addWaste(wasteType, weight);
            request.setAttribute("message", "Waste added successfully!");
        } catch (IllegalStateException e) {
            request.setAttribute("message", e.getMessage());
        } catch (Exception e) {
            request.setAttribute("message", "Error adding waste: " + e.getMessage());
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
