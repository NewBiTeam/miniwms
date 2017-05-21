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

import ndm.miniwms.pojo.StockOut;
import ndm.miniwms.service.impl.StockOutServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class StockOutController {

	@Resource
	private StockOutServiceImpl stockService;
	
	@RequestMapping(value="/stockOut/all",method = RequestMethod.GET)
	@ResponseBody
	public List<StockOut> all(){
		return stockService.all();
	}
	
	@RequestMapping(value="/stockOut/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(StockOut stockOut){
		stockService.add(stockOut);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockOut/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(StockOut stockOut){
		stockService.update(stockOut);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockOut/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		stockService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockOut/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		stockService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/stockOut/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<StockOut> selectTab(TableModel table){
		return stockService.selectTab(table);
	}
	
	@RequestMapping(value="/stockOut/bill",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> selectTab(StockOut stockOut){
		stockService.bill(stockOut);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
}
