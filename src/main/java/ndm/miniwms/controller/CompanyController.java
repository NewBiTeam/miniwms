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

import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.service.impl.CompanyServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class CompanyController {

	@Resource
	private CompanyServiceImpl companyService;
	
	@RequestMapping(value="/company/all",method = RequestMethod.GET)
	@ResponseBody
	public List<CompanyDetails> all(){
		return companyService.all();
	}
	
	@RequestMapping(value="/company/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(CompanyDetails companyDetails){
		companyService.add(companyDetails);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/company/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(CompanyDetails companyDetails){
		companyService.update(companyDetails);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/company/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		companyService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/company/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		companyService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/company/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<CompanyDetails> selectTab(TableModel table){
		return companyService.selectTab(table);
	}
}
