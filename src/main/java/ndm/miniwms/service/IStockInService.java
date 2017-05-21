package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.StockIn;
import ndm.miniwms.vo.TableModel;

public interface IStockInService {

	List<StockIn> all();
	
	int delById(Integer id);
	
	int update(StockIn stockIn);
	
	int add(StockIn stockIn);
	
	StockIn selectById(Integer id);
	
	List<StockIn> selectTab(TableModel tableModelVO);
	int updateStatus(StockIn stockIn);
}
