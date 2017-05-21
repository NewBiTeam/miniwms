package ndm.miniwms.service;

import ndm.miniwms.pojo.StockEntries;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

public interface IStockEntriesService {
	public Pagination<StockEntries> selectTab(TableModel tm);
}
