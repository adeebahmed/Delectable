/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable.model;


/**
 *
 * @author adeeb
 */
public class Report {
    private int reportId;
    private String reportName;
    private Order [] orders;

    public Report(int reportId, String reportName, Order[] orders) {
        this.reportId = reportId;
        this.reportName = reportName;
        this.orders = orders;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Report{" + "reportId=" + reportId + ", reportName=" + reportName + ", orders=" + orders + '}';
    }
}
