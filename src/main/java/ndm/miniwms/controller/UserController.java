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

import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.service.impl.UserServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class UserController {

	@Resource
	private UserServiceImpl userService;
	
	@RequestMapping(value="/user/all",method = RequestMethod.GET)
	@ResponseBody
	public List<CompanyUser> all(){
		return userService.all();
	}
	
	@RequestMapping(value="/user/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(CompanyUser user){
		userService.add(user);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(CompanyUser user){
		userService.update(user);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		userService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		userService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<CompanyUser> selectTab(TableModel tm){
		return userService.selectTab(tm);
	}
}
