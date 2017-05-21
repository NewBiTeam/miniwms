package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.BrandDetailsMapper;
import ndm.miniwms.pojo.BrandDetails;
import ndm.miniwms.service.IBrandService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class BrandServiceImpl implements IBrandService{

	@Resource
	private BrandDetailsMapper brandMapper;
	
	@Resource
	private DataSource dataSource;
	
	@Override
	public List<BrandDetails> all() {
		return brandMapper.all();
	}

	@Override
	public void update(BrandDetails brand) {
		brandMapper.update(brand);
	}

	@Override
	public void add(BrandDetails brand) {
		brandMapper.add(brand);
	}

	@Override
	public void delete(Integer id) {
		brandMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		brandMapper.selectById(id);
	}

	@Override
	public Pagination<BrandDetails> selectTab(TableModel model) {
		PageHelper.startPage(model.getPageNum(), model.getLength());
	    List<BrandDetails> list = brandMapper.selectTab();
	    PageInfo<BrandDetails> page = new PageInfo<BrandDetails>(list);
	    
	    Pagination<BrandDetails> brandPage = new Pagination<BrandDetails>();
	    brandPage.setDraw(model.getDraw());
	    brandPage.setData(list);
	    brandPage.setRecordsFiltered((int)page.getTotal());
	    brandPage.setRecordsTotal((int)page.getTotal());
	    return brandPage;
	}
}
