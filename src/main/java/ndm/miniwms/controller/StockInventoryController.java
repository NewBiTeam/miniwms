package ndm.miniwms.controller;

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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.service.IStockInventoryService;
import ndm.miniwms.service.impl.StockInventoryServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;
import net.sf.jxls.transformer.XLSTransformer;

@Controller
public class StockInventoryController {
	@Resource
	private IStockInventoryService service;
	
	
	 @RequestMapping("/stockInventory/export")
	 @ResponseBody
	    public void export(HttpServletRequest request,HttpServletResponse response){
		 String path = "/doc/dataSourceTemplate/stockInventory.xlsx";
	        String templateFileName= this.getClass().getResource(path).getFile();
	        System.out.println(templateFileName);
	        String destFileName= "stockInventory.xls";
	        //ģ������
	        List<StockInventory> staff = service.all();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");  
	        
	        Map<String,Object> beans = new HashMap<String,Object>();
	        beans.put("dateFormat", dateFormat);
	        beans.put("employees", staff);
	        XLSTransformer transformer = new XLSTransformer();
	        InputStream in=null;
	        OutputStream out=null;
	        //������Ӧ
	        response.setHeader("Content-Disposition", "attachment;filename=" + destFileName);
	        response.setContentType("application/vnd.ms-excel");
	        try {
	            in=new BufferedInputStream(new FileInputStream(templateFileName));
	            Workbook workbook=transformer.transformXLS(in, beans);
	            out=response.getOutputStream();
	            //������д����������ѻ��������ȫ������ȥ
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
	
	@Resource
	private StockInventoryServiceImpl stockInventoryService;
	
	@RequestMapping(value="/stockInventory/all",method = RequestMethod.GET)
	@ResponseBody
	public List<StockInventory> all(){
		return stockInventoryService.all();
	}
	
	@RequestMapping(value="/stockInventory/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(StockInventory stockInventory){
		stockInventoryService.add(stockInventory);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockInventory/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(StockInventory stockInventory){
		stockInventoryService.update(stockInventory);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockInventory/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		stockInventoryService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockInventory/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		stockInventoryService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockInventory/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<StockInventory> selectTab(TableModel table){
		return stockInventoryService.selectTab(table);
	}
}
