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

import ndm.miniwms.pojo.ConsigneeDetails;
import ndm.miniwms.service.impl.ConsigneeServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class ConsigneeController {

	@Resource
	private ConsigneeServiceImpl consigneeService;
	
	@RequestMapping(value="/consignee/all",method = RequestMethod.GET)
	@ResponseBody
	public List<ConsigneeDetails> all(){
		return consigneeService.all();
	}
	
	@RequestMapping(value="/consignee/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(ConsigneeDetails consignee){
		consigneeService.add(consignee);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/consignee/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(ConsigneeDetails consignee){
		consigneeService.update(consignee);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/consignee/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		consigneeService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/consignee/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		consigneeService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/consignee/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<ConsigneeDetails> selectTab(TableModel tm){
		return consigneeService.selectTab(tm);
	}
}
