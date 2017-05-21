package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.StockInMapper;
import ndm.miniwms.pojo.StockIn;
import ndm.miniwms.service.IStockInService;
import ndm.miniwms.vo.TableModel;

@Service("stockInService")
public class StockInServiceImpl implements IStockInService{

	@Resource
	private StockInMapper stockInMapperDao;
	@Override
	public List<StockIn> all() {
		return this.stockInMapperDao.all();
	}

	@Override
	public int delById(Integer id) {
		return this.stockInMapperDao.delById(id);
	}

	@Override
	public int update(StockIn stockIn) {
		return this.stockInMapperDao.update(stockIn);
	}

	@Override
	public int add(StockIn stockIn) {
		return this.stockInMapperDao.add(stockIn);
	}

	@Override
	public StockIn selectById(Integer id) {
		return this.stockInMapperDao.selectById(id);
	}

	@Override
	public List<StockIn> selectTab(TableModel tableModelVO) {
		PageHelper.startPage(tableModelVO.getStart(), tableModelVO.getLength());
	    List<StockIn> list = stockInMapperDao.selectTab();
	    //��PageInfo�Խ�����а�װ
	    PageInfo<StockIn> page = new PageInfo<StockIn>(list);
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
		return list;
	}

	@Override
	public int updateStatus(StockIn stockIn) {
		return this.stockInMapperDao.updateStatus(stockIn);
	}

}
