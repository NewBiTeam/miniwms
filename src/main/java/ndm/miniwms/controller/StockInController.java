package ndm.miniwms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.StockIn;
import ndm.miniwms.service.IStockInService;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
@RequestMapping("/stockIn")
public class StockInController {

	@Resource
	IStockInService service;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public Pagination<StockIn> toSelectAllStockItem() {
		Pagination<StockIn> pagination = new Pagination<>();
		pagination.setData(service.all());
		return pagination;
	}

	// 添加商品
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> toInsertStockItem(StockIn stockIn) {
		int num = service.add(stockIn);
		if (num == 0) {
			return new ResponseEntity<Message>(new Message(), HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
		}

	}

	// 修改商品
	@RequestMapping(value = "/upt", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> toUpdateStockItem(@RequestBody StockIn stockIn) {
		System.out.println(stockIn.getId());
		int num = service.update(stockIn);
		if (num == 0) {
			return new ResponseEntity<Message>(new Message(), HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
		}
	}
	//修改状态
	@RequestMapping(value = "/uptStatus", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> toUpdateStatus(@RequestBody StockIn stockIn) {
		System.out.println(stockIn.getId());
		int num = service.updateStatus(stockIn);
		if (num == 0) {
			return new ResponseEntity<Message>(new Message(), HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
		}
	}

	// 刪除商品
	@RequestMapping(value = "/del", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> toDeleteStockItem(Integer id) {
		int num = service.delById(id);
		if (num == 0) {
			return new ResponseEntity<Message>(new Message(), HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
		}
	}

	// 根据id查詢商品
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<StockIn> toSelectByIdStockItem(@PathVariable("id") Integer id) {
		StockIn stockItem = service.selectById(id);
		if (stockItem == null) {
			return new ResponseEntity<>(stockItem, HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<>(stockItem, HttpStatus.OK);
		}
	}
	
	//分页查询
	@RequestMapping(value="/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<StockIn> selectTab(TableModel tableModelVO){
		TableModel tableModelVO1 = new TableModel();
		tableModelVO1.setDraw(tableModelVO.getDraw());
		tableModelVO1.setLength(tableModelVO.getLength());
		tableModelVO1.setStart(tableModelVO.getStart()/10+1);
		List<StockIn> list = service.selectTab(tableModelVO1);
		Pagination<StockIn> pagination = new Pagination<>();
		pagination.setData(list);
		pagination.setDraw(tableModelVO.getDraw());
		pagination.setRecordsTotal(service.all().size());
		pagination.setRecordsFiltered(service.all().size());
		return pagination;
	}
}
