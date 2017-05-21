package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.WarehouseMapper;
import ndm.miniwms.pojo.Warehouse;
import ndm.miniwms.service.IWarehouseService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class WarehouseServiceImpl implements IWarehouseService{

	@Resource
	private WarehouseMapper warehouseMapper;
	
	@Override
	public List<Warehouse> all() {
		return warehouseMapper.all();
	}

	@Override
	public void update(Warehouse warehouse) {
		warehouseMapper.update(warehouse);
	}

	@Override
	public void add(Warehouse warehouse) {
		warehouseMapper.add(warehouse);
	}

	@Override
	public void delete(Integer id) {
		warehouseMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		warehouseMapper.selectById(id);
	}

	@Override
	public Pagination<Warehouse> selectTab(TableModel model) {
		PageHelper.startPage(model.getPageNum(), model.getLength());
	    List<Warehouse> list = warehouseMapper.selectTab();
	    //��PageInfo�Խ�����а�װ
	    PageInfo<Warehouse> page = new PageInfo<Warehouse>(list);
	    
	    Pagination<Warehouse> warehousePage = new Pagination<Warehouse>();
	    warehousePage.setData(list);
	    warehousePage.setDraw(model.getDraw());
	    warehousePage.setRecordsFiltered((int)page.getTotal());
	    warehousePage.setRecordsTotal((int)page.getTotal());
	    return warehousePage;
	}

}
