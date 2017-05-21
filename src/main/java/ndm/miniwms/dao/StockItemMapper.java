package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockItem;

public interface StockItemMapper {
	List<StockItem> all();

	int delById(Integer id);

	int update(StockItem stockItem);

	int add(StockItem stockItem);
	
	StockItem selectById(Integer id);
	
	List<StockItem> selectStockItem();
}
