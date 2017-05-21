package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockOut;

public interface StockOutMapper {
	List<StockOut> all();
	
	int delById(Integer id);
	
	int update(StockOut stockOut);
	
	int add(StockOut stockOut);
	
	StockOut selectById(Integer id);
	
	List<StockOut> selectTab();
	
	
}
