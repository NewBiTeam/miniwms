package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.StockOut;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface IStockOutService {
	public List<StockOut> all();

	public void update(StockOut stockOut);

	public void add(StockOut stockOut);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<StockOut> selectTab(TableModel table);
	
	public void bill(StockOut stockOut);
}
