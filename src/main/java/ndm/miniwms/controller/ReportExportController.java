package ndm.miniwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ndm.miniwms.service.IReportExportService;

@Controller
public class ReportExportController {
	@Resource
	IReportExportService iReportExportService;
	
	@RequestMapping(value="/stockentres/export",method=RequestMethod.GET)
    public void stockentresExport(HttpServletRequest request,HttpServletResponse response){
		iReportExportService.stockEntriesExport(request, response);
    }
	
	@RequestMapping(value="/location/export",method=RequestMethod.GET)
    public void locationExport(HttpServletRequest request,HttpServletResponse response){
		iReportExportService.locationExport(request, response);
    }
}
