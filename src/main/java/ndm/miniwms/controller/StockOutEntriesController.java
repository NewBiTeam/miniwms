package ndm.miniwms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.StockOutEntries;
import ndm.miniwms.service.impl.StockOutEntriesServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class StockOutEntriesController {
	
	@Resource
	private StockOutEntriesServiceImpl stockOutEntriesService;
	
	@RequestMapping(value="/stockOutEntries/all",method = RequestMethod.GET)
	@ResponseBody
	public List<StockOutEntries> all(){
		return stockOutEntriesService.all();
	}
	
	@RequestMapping(value="/stockOutEntries/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(StockOutEntries stockOutEntries){
		stockOutEntriesService.add(stockOutEntries);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockOutEntries/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(StockOutEntries stockOutEntries){
		stockOutEntriesService.update(stockOutEntries);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockOutEntries/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		stockOutEntriesService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockOutEntries/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		stockOutEntriesService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockOutEntries/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<StockOutEntries> selectTab(TableModel table){
		return stockOutEntriesService.selectTab(table);
	}
}
