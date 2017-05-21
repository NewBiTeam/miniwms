package ndm.miniwms.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import ndm.miniwms.service.impl.BatchImportServiceImpl;
import ndm.miniwms.vo.Message;

@Controller
public class BatchImportController {
	
	@Resource
	private BatchImportServiceImpl BatchImportService;
	
	@RequestMapping(value = "/batchImport/brand",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> brandAdd(MultipartFile Filedata){
		BatchImportService.addBrand(Filedata);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/category",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> categoryAdd(MultipartFile Filedata){
		BatchImportService.addCategory(Filedata);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/company",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> companyAdd(MultipartFile Filedata){
		BatchImportService.addCompany(Filedata);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/consignee",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> consigneeAdd(MultipartFile Filedata){
		BatchImportService.addConsignee(Filedata);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/location",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> locationAdd(MultipartFile Filedata){
		BatchImportService.addLocation(Filedata);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/supplier",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> supplierAdd(MultipartFile Filedata){
		BatchImportService.addSupplier(Filedata);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/user",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> userAdd(MultipartFile Filedata){
		BatchImportService.addUser(Filedata);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/batchImport/warehouse",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> warehouseAdd(MultipartFile Filedata){
		BatchImportService.addWarehouse(Filedata);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
}
