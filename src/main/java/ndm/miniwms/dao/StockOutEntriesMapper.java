package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockOutEntries;

public interface StockOutEntriesMapper {
	
	List<StockOutEntries> bill(StockOutEntries stockOutEntries);
	
	List<StockOutEntries> all();
	
	int delById(Integer id);
	
	int update(StockOutEntries stockOutEntries);
	
	int add(StockOutEntries stockOutEntries);
	
	StockOutEntries selectById(Integer id);
	
	List<StockOutEntries> selectTab();
}
