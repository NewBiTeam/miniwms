package ndm.miniwms.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import ndm.miniwms.pojo.StockItem;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.StockItemVo;
import ndm.miniwms.vo.TableModel;

public interface IStockItemService {

	// 查询所有商品
	List<StockItem> all();

	// 添加商品
	int add(StockItemVo stockItemVo);

	// 修改商品
	int update(StockItemVo stockItemVo, MultipartFile textFile, HttpServletRequest request);

	// 刪除商品
	int delById(Integer id);

	// 根据id查詢商品
	StockItem selectById(Integer id);
	
	//批量添加
	 void allStockItem(MultipartFile file);
	 
	 Pagination<StockItem> selectTab(TableModel table);
}
