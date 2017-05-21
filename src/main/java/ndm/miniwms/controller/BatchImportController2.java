package ndm.miniwms.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ndm.miniwms.dao.BrandDetailsMapper;
import ndm.miniwms.dao.CategoryDetailsMapper;
import ndm.miniwms.dao.StockItemMapper;
import ndm.miniwms.service.IStockItemService;
import ndm.miniwms.vo.Message;

@Controller
public class BatchImportController2 {

	@Resource
	StockItemMapper stockItemMapper;
	@Resource(name = "stockItemService")
	IStockItemService stockItemService;

	@Resource
	CategoryDetailsMapper categoryDetailsMapper;

	@Resource
	BrandDetailsMapper brandDetailsMapper;

	// 批量添加
	@RequestMapping(value = "/batchImport2/stockItem", method = RequestMethod.POST)

	public ResponseEntity<Message> toInsertStockItems(MultipartFile Filedata) {
		stockItemService.allStockItem(Filedata);
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
	}
}
