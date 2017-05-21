package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.LocationDetailsMapper;
import ndm.miniwms.pojo.LocationDetails;
import ndm.miniwms.service.ILocationService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class LocationServiceImpl implements ILocationService{

	@Resource
	private LocationDetailsMapper locationMapper;
	
	@Override
	public List<LocationDetails> all() {
		return locationMapper.all();
	}

	@Override
	public void update(LocationDetails locationDetails) {
		locationMapper.update(locationDetails);
	}

	@Override
	public void add(LocationDetails locationDetails) {
		locationMapper.add(locationDetails);
	}

	@Override
	public void delete(Integer id) {
		locationMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		locationMapper.selectById(id);
	}

	@Override
	public Pagination<LocationDetails> selectTab(TableModel model) {
		PageHelper.startPage(model.getPageNum(), model.getLength());
	    List<LocationDetails> list = locationMapper.selectTab();
	    //��PageInfo�Խ�����а�װ
	    PageInfo<LocationDetails> page = new PageInfo<LocationDetails>(list);
	    //����PageInfoȫ������
	    Pagination<LocationDetails> locationPage = new Pagination<LocationDetails>();
	    locationPage.setDraw(model.getDraw());
	    locationPage.setData(list);
	    locationPage.setRecordsFiltered((int)page.getTotal());
	    locationPage.setRecordsTotal((int)page.getTotal());
	    return locationPage;
	}

}
