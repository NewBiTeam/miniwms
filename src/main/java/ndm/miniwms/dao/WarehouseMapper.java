package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.Warehouse;

public interface WarehouseMapper {
	List<Warehouse> all();

	int delById(Integer id);

	int update(Warehouse warehouse);

	int add(Warehouse warehouse);

	Warehouse selectById(Integer id);

	List<Warehouse> selectTab();
}
