package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.StockOutEntriesMapper;
import ndm.miniwms.pojo.StockOutEntries;
import ndm.miniwms.service.IStockOutEntriesService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class StockOutEntriesServiceImpl implements IStockOutEntriesService{

	@Resource
	private StockOutEntriesMapper srockOutEntries;
	
	@Override
	public List<StockOutEntries> all() {
		return srockOutEntries.all();
	}

	@Override
	public void update(StockOutEntries stockOutEntries) {
		srockOutEntries.update(stockOutEntries);
	}

	@Override
	public void add(StockOutEntries stockOutEntries) {
		srockOutEntries.add(stockOutEntries);
	}

	@Override
	public void delete(Integer id) {
		srockOutEntries.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		srockOutEntries.selectById(id);
	}

	@Override
	public Pagination<StockOutEntries> selectTab(TableModel table) {
		PageHelper.startPage(table.getStart()/table.getLength() + 1,table.getLength());
	    List<StockOutEntries> list = srockOutEntries.all();
	    Pagination<StockOutEntries> pagination = new Pagination<>();
	    //用PageInfo对结果进行包装
	    PageInfo<StockOutEntries> page = new PageInfo<StockOutEntries>(list);
	    //测试PageInfo全部属性
	    int total = (int)page.getTotal();
	    pagination.setDraw(table.getDraw());
	    pagination.setRecordsFiltered(this.all().size());
	    pagination.setRecordsTotal(total);
	    pagination.setData(list);
	    return pagination;
	}

	@Override
	public List<StockOutEntries> bill(StockOutEntries stockOutEntries) {
		return srockOutEntries.bill(stockOutEntries);
	}
	
}
