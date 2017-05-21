package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockCheckEntries;

public interface StockCheckEntriesMapper {

	List<StockCheckEntries> all();

	int delById(Integer id);

	int update(StockCheckEntries stockCheckEntries);

	int add(StockCheckEntries stockCheckEntries);
}



