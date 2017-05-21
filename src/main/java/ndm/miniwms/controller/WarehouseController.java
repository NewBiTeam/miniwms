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

import ndm.miniwms.pojo.Warehouse;
import ndm.miniwms.service.impl.WarehouseServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class WarehouseController {
	
	@Resource
	private WarehouseServiceImpl warehouseService;
	
	@RequestMapping(value="/warehouse/all",method = RequestMethod.GET)
	@ResponseBody
	public List<Warehouse> all(){
		return warehouseService.all();
	}
	
	@RequestMapping(value="/warehouse/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(Warehouse warehouse){
		warehouseService.add(warehouse);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/warehouse/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(Warehouse warehouse){
		warehouseService.update(warehouse);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/warehouse/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		warehouseService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/warehouse/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		warehouseService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/warehouse/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<Warehouse> selectTab(TableModel table){
		return warehouseService.selectTab(table);
	}
}
