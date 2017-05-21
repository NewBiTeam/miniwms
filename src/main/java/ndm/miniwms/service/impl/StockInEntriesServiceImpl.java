package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ndm.miniwms.dao.StockInEntriesMapper;
import ndm.miniwms.pojo.StockInEntries;
import ndm.miniwms.service.IStockInEntriesService;

@Service("stockInEntries")
public class StockInEntriesServiceImpl implements IStockInEntriesService{

	@Resource
	private StockInEntriesMapper stockInEntriesMapper;
	
	@Override
	public List<StockInEntries> all() {
		return this.stockInEntriesMapper.all();
	}

	@Override
	public int delById(Integer id) {
		return this.stockInEntriesMapper.delById(id);
	}

	@Override
	public int update(StockInEntries stockInEntries) {
		return this.stockInEntriesMapper.update(stockInEntries);
	}

	@Override
	public int add(StockInEntries stockInEntries) {
		return this.stockInEntriesMapper.add(stockInEntries);
	}

	@Override
	public StockInEntries selectById(Integer id) {
		return this.stockInEntriesMapper.selectById(id);
	}

	@Override
	public List<StockInEntries> selectTab() {
		return this.stockInEntriesMapper.selectTab();
	}

	@Override
	public List<StockInEntries> selectItem(Integer itemId) {
		return this.stockInEntriesMapper.selectItem(itemId);
	}

	@Override
	public int updateQuantity(StockInEntries stockInEntries) {
		return this.stockInEntriesMapper.updateQuantity(stockInEntries);
	}

}
