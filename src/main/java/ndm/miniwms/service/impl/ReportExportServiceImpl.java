package ndm.miniwms.service.impl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import ndm.miniwms.dao.LocationDetailsMapper;
import ndm.miniwms.dao.StockEntriesMapper;
import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.pojo.StockEntries;
import ndm.miniwms.service.IReportExportService;
import net.sf.jxls.transformer.XLSTransformer;

@Service
public class ReportExportServiceImpl implements IReportExportService{

	@Resource
	StockEntriesMapper stockEntriesMapper;
	
	@Resource
	LocationDetailsMapper locationMapper;
	
	@Override
	public void stockEntriesExport(HttpServletRequest request,HttpServletResponse response) {
		//获取resources路径
		//this.getClass().getResourceAsStream()
		String path = request.getSession().getServletContext().getRealPath("/");
		System.out.println(path);
        String templateFileName=path+"WEB-INF\\classes\\doc\\dataSourceTemplate\\stockEntres.xlsx";
        System.out.println(templateFileName);
        String destFileName= "stockentres.xlsx";
        //模拟数据
        List<StockEntries> stockEntriesList = stockEntriesMapper.selectTab();
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String,Object> beans = new HashMap<String,Object>();
        beans.put("dateformat", dateformat);
        beans.put("list", stockEntriesList);
        XLSTransformer transformer = new XLSTransformer();
        InputStream in=null;
        OutputStream out=null;
        //设置响应
        response.setHeader("Content-Disposition", "attachment;filename=" + destFileName);
        response.setContentType("application/vnd.ms-excel");
        try {
            in=new BufferedInputStream(new FileInputStream(templateFileName));
            Workbook workbook=transformer.transformXLS(in, beans);
            out=response.getOutputStream();
            //将内容写入输出流并把缓存的内容全部发出去
            workbook.write(out);
            out.flush();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){try {in.close();} catch (IOException e) {}}
            if (out!=null){try {out.close();} catch (IOException e) {}}
        }
	}
	
	@Override
	public void locationExport(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getSession().getServletContext().getRealPath("/");
		System.out.println(path);
        String templateFileName=path+"WEB-INF\\classes\\doc\\dataSourceTemplate\\location.xlsx";
        System.out.println(templateFileName);
        String destFileName= "location.xlsx";
        //模拟数据
        List<LocationDetails> locationDetails = locationMapper.selectTab();
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String,Object> beans = new HashMap<String,Object>();
        beans.put("dateformat", dateformat);
        beans.put("list", locationDetails);
        XLSTransformer transformer = new XLSTransformer();
        InputStream in=null;
        OutputStream out=null;
        //设置响应
        response.setHeader("Content-Disposition", "attachment;filename=" + destFileName);
        response.setContentType("application/vnd.ms-excel");
        try {
            in=new BufferedInputStream(new FileInputStream(templateFileName));
            Workbook workbook=transformer.transformXLS(in, beans);
            out=response.getOutputStream();
            //将内容写入输出流并把缓存的内容全部发出去
            workbook.write(out);
            out.flush();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){try {in.close();} catch (IOException e) {}}
            if (out!=null){try {out.close();} catch (IOException e) {}}
        }
	}
}
