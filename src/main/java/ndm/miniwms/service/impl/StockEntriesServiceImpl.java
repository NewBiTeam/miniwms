package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.StockEntriesMapper;
import ndm.miniwms.pojo.StockEntries;
import ndm.miniwms.service.IStockEntriesService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class StockEntriesServiceImpl implements IStockEntriesService{

	@Resource
	StockEntriesMapper stockEntriesMapper;
	
	@Override
	public Pagination<StockEntries> selectTab(TableModel tm) {
		PageHelper.startPage(tm.getStart()/tm.getLength() + 1, tm.getLength());
	    List<StockEntries> list = stockEntriesMapper.selectTab();
	    PageInfo<StockEntries> page = new PageInfo<StockEntries>(list);
	    System.out.println(page.getPageNum());
	    System.out.println(page.getPageSize());
	    System.out.println(page.getStartRow());
	    System.out.println(page.getEndRow());
	    System.out.println(page.getTotal());
	    System.out.println(page.getPages());
	    System.out.println(page.getFirstPage());
	    System.out.println(page.getLastPage());
	    System.out.println(page.isHasPreviousPage());
	    System.out.println(page.isHasNextPage());
	    Pagination<StockEntries> pag=new Pagination<>();
		pag.setData(list);
		pag.setRecordsTotal((int) page.getTotal());
		pag.setRecordsFiltered((int) page.getTotal());
	    return pag;
	}

}
