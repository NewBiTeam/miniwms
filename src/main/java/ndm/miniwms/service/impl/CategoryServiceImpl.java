package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.CategoryDetailsMapper;
import ndm.miniwms.pojo.CategoryDetails;
import ndm.miniwms.service.ICategoryService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class CategoryServiceImpl implements ICategoryService{

	@Resource
	private CategoryDetailsMapper categoryMapper;
	
	@Override
	public List<CategoryDetails> all() {
		return categoryMapper.all();
	}

	@Override
	public void update(CategoryDetails categoryDetails) {
		categoryMapper.update(categoryDetails);
	}

	@Override
	public void add(CategoryDetails categoryDetails) {
		categoryMapper.add(categoryDetails);
	}

	@Override
	public void delete(Integer id) {
		categoryMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		categoryMapper.selectById(id);
	}

	@Override
	public Pagination<CategoryDetails> selectTab(TableModel tm) {
		PageHelper.startPage(tm.getStart()/tm.getLength() + 1, tm.getLength());
	    List<CategoryDetails> list = categoryMapper.selectTab();
	    //��PageInfo�Խ�����а��?
	    PageInfo<CategoryDetails> page = new PageInfo<CategoryDetails>(list);
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
	    
	    Pagination<CategoryDetails> pag=new Pagination<>();
		pag.setData(list);
		pag.setRecordsTotal((int) page.getTotal());
		pag.setRecordsFiltered((int) page.getTotal());
		
	    return pag;
	}
}
