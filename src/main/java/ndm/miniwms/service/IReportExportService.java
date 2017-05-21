package ndm.miniwms.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IReportExportService {
	public void stockEntriesExport(HttpServletRequest request,HttpServletResponse response);
	
	public void locationExport(HttpServletRequest request,HttpServletResponse response);
}
