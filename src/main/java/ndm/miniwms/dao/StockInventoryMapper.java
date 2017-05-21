package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockInventory;

public interface StockInventoryMapper {
	List<StockInventory> all();
	
	int delById(Integer id);
	
	int update(StockInventory stockInventory);
	
	int add(StockInventory stockInventory);
	
	StockInventory selectById(Integer id);
	
	List<StockInventory> selectTab();
	
	StockInventory selectItem(Integer itemId);
	
	int updateQuantity(StockInventory stockInventory);
}
