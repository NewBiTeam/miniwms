package ndm.miniwms.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReadStatus;
import org.jxls.reader.XLSReader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;

import ndm.miniwms.dao.BrandDetailsMapper;
import ndm.miniwms.dao.CategoryDetailsMapper;
import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.pojo.StockItem;
import ndm.miniwms.pojo.StockItemPhoto;
import ndm.miniwms.service.IStockItemPhotoService;
import ndm.miniwms.service.IStockItemService;
import ndm.miniwms.vo.Message;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.StockItemVo;
import ndm.miniwms.vo.TableModel;

@Controller
public class StockItemController {

	@Resource(name = "stockItemService")
	IStockItemService stockItemService;

	@Resource(name = "stockItemPhotoService")
	IStockItemPhotoService stockItemPhotoService;

	// 查询所有商品
	@RequestMapping(value = "/stockItem/all", method = RequestMethod.GET)
	@ResponseBody
	public List<StockItem> toSelectAllStockItem() {
		return stockItemService.all();
	}

	// 添加商品
	@RequestMapping(value = "/stockItem/add", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> toInsertStockItem(StockItemVo stockItemVo) {
		int num = stockItemService.add(stockItemVo);
		if (num == 0) {
			return new ResponseEntity<Message>(new Message(), HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
		}

	}

	// 修改商品
	@RequestMapping(value = "/stockItem/upt", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Message> toUpdateStockItem(@RequestParam("textFile") MultipartFile textFile,StockItemVo stockItemVo,
			 HttpServletRequest request) {
		int num = stockItemService.update(stockItemVo, textFile, request);
		if (num == 0) {
			return new ResponseEntity<Message>(new Message(), HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
		}
	}

	// 刪除商品
	@RequestMapping(value = "/stockItem/del", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Message> toDeleteStockItem(Integer id) {
		int num = stockItemService.delById(id);
		if (num == 0) {
			return new ResponseEntity<Message>(new Message(), HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<Message>(new Message(), HttpStatus.OK);
		}
	}

	// 根据id查詢商品
	@RequestMapping(value = "/stockItem/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<StockItem> toSelectByIdStockItem(@PathVariable("id") Integer id) {
		StockItem stockItem = stockItemService.selectById(id);
		if (stockItem == null) {
			return new ResponseEntity<>(stockItem, HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<>(stockItem, HttpStatus.OK);
		}
	}
	
	//分页查询
	@RequestMapping(value="/stockItem/page",method = RequestMethod.GET)
	@ResponseBody
	public Pagination<StockItem> selectTab(TableModel table){
		return stockItemService.selectTab(table);
	}

}
