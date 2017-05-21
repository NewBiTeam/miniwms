package ndm.miniwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ndm.miniwms.dao.ConsigneeDetailsMapper;
import ndm.miniwms.pojo.CompanyDetails;
import ndm.miniwms.pojo.CompanyUser;
import ndm.miniwms.pojo.ConsigneeDetails;
import ndm.miniwms.pojo.SupplierDetails;
import ndm.miniwms.service.IConsigneeService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Service
public class ConsigneeServiceImpl implements IConsigneeService{

	@Resource
	private ConsigneeDetailsMapper consigneeMapper;
	
	@Override
	public List<ConsigneeDetails> all() {
		return consigneeMapper.all();
	}

	@Override
	public void update(ConsigneeDetails consigneeDetails) {
		consigneeMapper.update(consigneeDetails);
	}

	@Override
	public void add(ConsigneeDetails consigneeDetails) {
		consigneeMapper.add(consigneeDetails);
	}

	@Override
	public void delete(Integer id) {
		consigneeMapper.delById(id);
	}

	@Override
	public void selectById(Integer id) {
		consigneeMapper.selectById(id);
	}

	@Override
	public Pagination<ConsigneeDetails> selectTab(TableModel tm) {
		PageHelper.startPage(tm.getStart()/tm.getLength() + 1, tm.getLength());
	    List<ConsigneeDetails> list = consigneeMapper.selectTab();
	    //��PageInfo�Խ�����а��?
	    PageInfo<ConsigneeDetails> page = new PageInfo<ConsigneeDetails>(list);
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
	    
	    Pagination<ConsigneeDetails> pag=new Pagination<>();
		pag.setData(list);
		pag.setRecordsTotal((int) page.getTotal());
		pag.setRecordsFiltered((int) page.getTotal());
		
	    return pag;
	}
}
