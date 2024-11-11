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
@WebServlet("/EmptyBinServlet")
public class EmptyBinServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        WasteCollector wasteCollector = (WasteCollector) session.getAttribute("wasteCollector");

        String action = request.getParameter("action");

        String message = "";

        if (wasteCollector != null) {
            if ("emptyAll".equals(action)) {
                message = wasteCollector.emptyAllBins();
            } else if ("emptyOrganic".equals(action)) {
                message = wasteCollector.emptyOrganicWaste();
            } else if ("emptyRecyclable".equals(action)) {
                message = wasteCollector.emptyRecyclableWaste();
            } else if ("emptyHazardous".equals(action)) {
                message = wasteCollector.emptyHazardousWaste();
            }
        } else {
            message = "No waste data available.";
        }

        request.setAttribute("message", message);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
