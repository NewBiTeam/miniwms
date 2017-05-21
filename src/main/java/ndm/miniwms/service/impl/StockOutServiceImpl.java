package ndm.miniwms.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.StockInventoryMapper;
import ndm.miniwms.dao.StockOutEntriesMapper;
import ndm.miniwms.dao.StockOutMapper;
import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.pojo.StockOut;
import ndm.miniwms.pojo.StockOutEntries;
import ndm.miniwms.service.IStockOutService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class StockOutServiceImpl implements IStockOutService{

	@Resource
	private StockOutMapper stockOutMapper;
	
	@Resource
	private StockOutEntriesMapper stockOutEntriesMapper;
	
	@Resource
	private StockInventoryMapper stockInventoryMapper;
	
	@Override
	public List<StockOut> all() {
		return stockOutMapper.all();
	}

	@Override
	public void update(StockOut stockOut) {
		stockOutMapper.update(stockOut);
	}

	@Override
	public void add(StockOut stockOut) {
		stockOutMapper.add(stockOut);
	}

	@Override
	public void delete(Integer id) {
		stockOutMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		stockOutMapper.selectById(id);
	}

	@Override
	public Pagination<StockOut> selectTab(TableModel table) {
		PageHelper.startPage(table.getStart()/table.getLength() + 1,table.getLength());
	    List<StockOut> list = stockOutMapper.selectTab();
	    Pagination<StockOut> pagination = new Pagination<>();
	    //用PageInfo对结果进行包装
	    PageInfo<StockOut> page = new PageInfo<StockOut>(list);
	    //测试PageInfo全部属性
	    int total = (int)page.getTotal();
	    pagination.setDraw(table.getDraw());
	    pagination.setRecordsFiltered(this.all().size());
	    pagination.setRecordsTotal(total);
	    pagination.setData(list);
	    return pagination;
	}

	@Override
	public void bill(StockOut stockOut) {
		for(int i=0;i<stockOut.getStockEntriesList().size();i++){
			StockInventory stockInventory = stockInventoryMapper.selectById(stockOut.getId());
			StockOutEntries stockOutEntries = stockOutEntriesMapper.selectById(stockOut.getId());
			stockOutEntries.setItemId(stockInventory.getItemId());
			stockOutEntries.setInventoryId(stockInventory.getId());
			stockOutEntries.setOutId(stockOut.getId());
			stockOutEntries.setQuantity(stockOut.getStockOutEntriesList().size());
			stockOutEntriesMapper.add(stockOutEntries);
			stockInventory.setQuantity(stockInventory.getQuantity()-stockOut.getStockOutEntriesList().size());
			stockInventoryMapper.update(stockInventory);
		}
		stockOutMapper.add(stockOut);
	}
	
}
