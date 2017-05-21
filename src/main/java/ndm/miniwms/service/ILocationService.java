package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface ILocationService {
	public List<LocationDetails> all();

	public void update(LocationDetails locationDetails);

	public void add(LocationDetails locationDetails);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<LocationDetails> selectTab(TableModel model);
}
