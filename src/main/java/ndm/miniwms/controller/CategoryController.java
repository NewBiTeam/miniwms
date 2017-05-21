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

import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.pojo.ConsigneeDetails;
import ndm.miniwms.service.impl.CategoryServiceImpl;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class CategoryController {

	@Resource
	private CategoryServiceImpl categoryService;
	
	@RequestMapping(value="/category/all",method = RequestMethod.GET)
	@ResponseBody
	public List<CategoryDetails> all(){
		return categoryService.all();
	}
	
	@RequestMapping(value="/category/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(CategoryDetails categoryDetails){
		categoryService.add(categoryDetails);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/category/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(CategoryDetails categoryDetails){
		categoryService.update(categoryDetails);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/category/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		categoryService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/category/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		categoryService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/category/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<CategoryDetails> selectTab(TableModel tm){
		return categoryService.selectTab(tm);
	}
}
