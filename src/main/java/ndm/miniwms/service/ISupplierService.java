package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface ISupplierService {

	public List<SupplierDetails> all();

	public void update(SupplierDetails supplier);

	public void add(SupplierDetails supplier);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<SupplierDetails> selectTab(TableModel tm);
}
