package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.SupplierDetailsMapper;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.service.ISupplierService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class SupplierServiceImpl implements ISupplierService{

	@Resource
	private SupplierDetailsMapper supplierMapper;
	
	@Override
	public List<SupplierDetails> all() {
		return supplierMapper.all();
	}

	@Override
	public void update(SupplierDetails supplier) {
		supplierMapper.update(supplier);
	}

	@Override
	public void add(SupplierDetails supplier) {
		supplierMapper.add(supplier);
	}

	@Override
	public void delete(Integer id) {
		supplierMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		supplierMapper.selectById(id);
	}

	@Override
	public Pagination<SupplierDetails> selectTab(TableModel tm) {
		PageHelper.startPage(tm.getStart()/tm.getLength() + 1, tm.getLength());
	    List<SupplierDetails> list = supplierMapper.selectTab();
	    //��PageInfo�Խ�����а��?
	    PageInfo<SupplierDetails> page = new PageInfo<SupplierDetails>(list);
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
	    
	    Pagination<SupplierDetails> pag=new Pagination<>();
		pag.setData(list);
		pag.setRecordsTotal((int) page.getTotal());
		pag.setRecordsFiltered((int) page.getTotal());
		
	    return pag;
	}
}
