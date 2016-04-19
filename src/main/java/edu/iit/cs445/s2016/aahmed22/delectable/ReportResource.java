/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.cs445.s2016.aahmed22.delectable;

import edu.iit.cs445.s2016.aahmed22.delectable.model.Report;
import edu.iit.cs445.s2016.aahmed22.delectable.repository.ReportRepository;
import edu.iit.cs445.s2016.aahmed22.delectable.repository.ReportRepositoryStub;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author adeeb
 */
@Path("/report")
public class ReportResource {
    
    private ReportRepository rr = new ReportRepositoryStub();
    private List<Report> reports = rr.getReports();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getReports(){
        return Response.ok(reports).build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{rid : .+}")
    public Response getReportsById(@PathParam("rid") int reportid){
        for(int i =0; i<reports.size(); i++)
            if (reports.get(i).getReportId() == reportid)
                return Response.ok(reports.get(i)).build();

        return Response.ok("[{"+ reportid + "}, {No such report exits}]").build();
    }
    
    /*@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{rid : .+}")
    public Response getReportsByIdandRange(@PathParam("rid") int reportid, @QueryParam("[?start_date=") Date startDate,@QueryParam("&end_date=") Date endDate){
        Report r;
        for(int i =0; i<reports.size(); i++)
            if (reports.get(i).getReportId() == reportid)
                r = reports.get(i);

        return Response.ok("[{"+ reportid + "}, {No such report exits}]").build();
    }*/
    
}
