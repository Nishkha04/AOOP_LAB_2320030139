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
@WebServlet("/WasteStatisticsServlet")
public class WasteStatisticsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        WasteCollector wasteCollector = (WasteCollector) session.getAttribute("wasteCollector");

        if (wasteCollector != null) {
            double totalCollectedWeight = wasteCollector.getTotalCollectedWeight();
            double organicWaste = wasteCollector.getOrganicWaste();
            double recyclableWaste = wasteCollector.getRecyclableWaste();
            double hazardousWaste = wasteCollector.getHazardousWaste();

            request.setAttribute("totalCollectedWeight", totalCollectedWeight);
            request.setAttribute("organicWaste", organicWaste);
            request.setAttribute("recyclableWaste", recyclableWaste);
            request.setAttribute("hazardousWaste", hazardousWaste);
        } else {
            request.setAttribute("message", "No waste data available.");
        }

        request.getRequestDispatcher("wasteStatistics.jsp").forward(request, response);
    }
}
