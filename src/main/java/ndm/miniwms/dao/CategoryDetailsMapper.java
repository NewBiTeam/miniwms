package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.CategoryDetails;

public interface CategoryDetailsMapper {
	List<CategoryDetails> all();

	int delById(Integer id);

	int update(CategoryDetails categoryDetails);

	int add(CategoryDetails categoryDetails);

	CategoryDetails selectById(Integer id);

	List<CategoryDetails> selectTab();
}
