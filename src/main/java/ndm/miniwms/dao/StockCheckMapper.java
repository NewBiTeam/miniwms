package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockCheck;

public interface StockCheckMapper {

	List<StockCheck> all();

	int delById(Integer id);

	int update(StockCheck stockCheck);

	int add(StockCheck stockCheck);
}
