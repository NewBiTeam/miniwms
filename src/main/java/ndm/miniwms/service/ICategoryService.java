package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface ICategoryService {
	public List<CategoryDetails> all();

	public void update(CategoryDetails categoryDetails);

	public void add(CategoryDetails categoryDetails);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<CategoryDetails> selectTab(TableModel tm);
}
