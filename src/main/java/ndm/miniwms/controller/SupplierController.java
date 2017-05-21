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

import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.service.impl.SupplierServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class SupplierController {

	@Resource
	private SupplierServiceImpl supplierService;
	
	@RequestMapping(value="/supplier/all",method = RequestMethod.GET)
	@ResponseBody
	public List<SupplierDetails> all(){
		return supplierService.all();
	}
	
	@RequestMapping(value="/supplier/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(SupplierDetails supplier){
		supplierService.add(supplier);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/supplier/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(SupplierDetails supplier){
		supplierService.update(supplier);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/supplier/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		supplierService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/supplier/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		supplierService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/supplier/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<SupplierDetails> selectTab(TableModel tm){
		return supplierService.selectTab(tm);
	}
}
