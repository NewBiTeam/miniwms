package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.StockItemPhoto;

public interface StockItemPhotoMapper {
	List<StockItemPhoto> all();

	int delById(Integer id);

	int update(StockItemPhoto stockItemPhoto);

	int add(StockItemPhoto stockItemPhoto);

	StockItemPhoto selectById(Integer id);
}
