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

import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.service.ILocationService;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class LocationController {
	
	@Resource
	private ILocationService locationService;
	
	@RequestMapping(value="/location/all",method = RequestMethod.GET)
	@ResponseBody
	public List<LocationDetails> all(){
		return locationService.all();
	}
	
	@RequestMapping(value="/location/add",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(LocationDetails locationDetails){
		locationService.add(locationDetails);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/location/upt",method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> update(LocationDetails locationDetails){
		locationService.update(locationDetails);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/location/del",method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> delete(Integer id){
		locationService.delete(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/location/{id}",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Message> selectById(@PathVariable ("id") Integer id){
		locationService.selectById(id);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/location/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<LocationDetails> selectTab(TableModel table){
		return locationService.selectTab(table);
	}
}
