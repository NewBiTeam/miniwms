package ndm.miniwms.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import ndm.miniwms.pojo.StockItemPhoto;
import ndm.miniwms.service.IStockItemPhotoService;

@Controller
public class StockItemPhotoController {

	@Resource(name = "stockItemPhotoService")
	IStockItemPhotoService stockItemPhotoService;

	// 图片显示
	@RequestMapping(value = "/stockItem/photo/{id}" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<StockItemPhoto> toSelectByIdStockItemPhoto(@PathVariable("id") Integer id,
			HttpServletResponse response) {
		StockItemPhoto stockItemPhoto = stockItemPhotoService.selectById(id,response);
		return new ResponseEntity<>(stockItemPhoto, HttpStatus.OK);
	}

	// 圖片增加
	@RequestMapping(value = "/stockItem/photos/upload" ,method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<StockItemPhoto> toInsertStockItemPhoto(StockItemPhoto stockItemPhoto,@RequestParam("image") MultipartFile  image) {
		stockItemPhotoService.add(stockItemPhoto , image);
		return new ResponseEntity<>(stockItemPhoto, HttpStatus.OK);
	}

}
