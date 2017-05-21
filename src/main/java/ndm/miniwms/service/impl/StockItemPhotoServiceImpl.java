package ndm.miniwms.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ndm.miniwms.dao.StockItemPhotoMapper;
import ndm.miniwms.pojo.StockItemPhoto;
import ndm.miniwms.service.IStockItemPhotoService;

@Service("stockItemPhotoService")
public class StockItemPhotoServiceImpl implements IStockItemPhotoService {

	@Resource
	StockItemPhotoMapper stockItemPhotoMapper;

	// 添加圖片
	@Override
	public void add(StockItemPhoto stockItemPhoto, MultipartFile image) {
		try {
			InputStream stream = image.getInputStream();
			OutputStream outputStream = new FileOutputStream("*/" + image.getOriginalFilename());
			int len = 0;
			byte[] buffer = new byte[1024];
			while ((len = stream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, len);
			}
			outputStream.flush();
			outputStream.close();
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File file = new File("*/" + image.getOriginalFilename());
		String path = file.getPath();
		stockItemPhoto.setPath(path);
		stockItemPhotoMapper.add(stockItemPhoto);
	}

	// 查看圖片
	@Override
	public StockItemPhoto selectById(Integer id, HttpServletResponse response) {
		StockItemPhoto stockItemPhoto = stockItemPhotoMapper.selectById(id);
		response.setContentType("image/*");
		try {
			FileInputStream fileInputStream = new FileInputStream(stockItemPhoto.getPath());
			byte[] bs = new byte[1024];
			OutputStream os = response.getOutputStream();
			while (fileInputStream.read(bs) != -1) {
				os.write(bs);
			}
			fileInputStream.close();
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stockItemPhoto;
	}

}
