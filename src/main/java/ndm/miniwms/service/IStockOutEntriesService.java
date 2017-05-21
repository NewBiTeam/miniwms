package ndm.miniwms.service;

import java.util.List;

import ndm.miniwms.pojo.StockOutEntries;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface IStockOutEntriesService {
	public List<StockOutEntries> all();

	public void update(StockOutEntries stockOutEntries);

	public void add(StockOutEntries stockOutEntries);

	public void delete(Integer id);

	public void selectById(Integer id);

	public Pagination<StockOutEntries> selectTab(TableModel table);
	
	public List<StockOutEntries> bill(StockOutEntries stockOutEntries);
}
