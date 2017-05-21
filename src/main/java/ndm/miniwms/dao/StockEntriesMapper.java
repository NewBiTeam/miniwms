package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockEntries;

public interface StockEntriesMapper {

	List<StockEntries> all();
	
	List<StockEntries> selectTab();

	int delById(Integer id);

	int update(StockEntries stockEntries);

	int add(StockEntries stockEntries);
}
