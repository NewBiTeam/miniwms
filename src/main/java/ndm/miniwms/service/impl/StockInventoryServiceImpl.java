package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.StockInventoryMapper;
import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.service.IStockInventoryService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service("stockInventoryService")
public class StockInventoryServiceImpl implements IStockInventoryService{

	@Resource
	private StockInventoryMapper dao;
	@Override
	public List<StockInventory> all() {
		return this.dao.all();
	}

	@Override
	public int delById(Integer id) {
		return this.dao.delById(id);
	}
	
	@Override
    public int delete(Integer id) {
        return this.delById(id);
    }

	@Override
	public int update(StockInventory stockInventory) {
		return this.dao.update(stockInventory);
	}

	@Override
	public int add(StockInventory stockInventory) {
		return this.dao.add(stockInventory);
	}

	@Override
	public StockInventory selectById(Integer id) {
		return this.dao.selectById(id);
	}

	@Override
	public Pagination<StockInventory> selectTab(TableModel tableModelVO) {
		PageHelper.startPage(tableModelVO.getPageNum(), tableModelVO.getLength());
		
	    List<StockInventory> list = this.dao.selectTab();
	    //��PageInfo�Խ�����а�װ
	    PageInfo<StockInventory> page = new PageInfo<StockInventory>(list);
	    //����PageInfoȫ������
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
	    Pagination<StockInventory> p = new Pagination<StockInventory>();
	    p.setData(list);
	    p.setRecordsFiltered((int)page.getTotal());
	    p.setRecordsTotal((int)page.getTotal());
	    p.setDraw(tableModelVO.getDraw());
		return p;
	}

	@Override
	public StockInventory selectItem(Integer itemId) {
		return this.dao.selectItem(itemId);
	}

	@Override
	public int updateQuantity(StockInventory stockInventory) {
		return this.dao.updateQuantity(stockInventory);
	}

}
