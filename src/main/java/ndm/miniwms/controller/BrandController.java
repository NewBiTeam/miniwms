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

import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.service.impl.BrandServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class BrandController {
	
	@Resource
	private BrandServiceImpl brandService;
	
	@RequestMapping(value="/brand/all",method = RequestMethod.GET)
	@ResponseBody
	public List<BrandDetails> all(){
		return brandService.all();
	}
	
	@RequestMapping(value="/brand/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(BrandDetails brand){
		brandService.add(brand);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/brand/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(BrandDetails brand){
		brandService.update(brand);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/brand/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		brandService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/brand/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		brandService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/brand/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<BrandDetails> selectTab(TableModel table){
		return brandService.selectTab(table);
	}

}
