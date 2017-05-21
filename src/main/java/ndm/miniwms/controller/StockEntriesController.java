package ndm.miniwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.StockEntries;
import ndm.miniwms.service.IStockEntriesService;
import ndm.miniwms.vo.Pagination;
import ndm.miniwms.vo.TableModel;

@Controller
public class StockEntriesController {
	@Resource
	IStockEntriesService iStockEntriesService;
	
	@RequestMapping(value="/stockentres/page",method=RequestMethod.GET)
	@ResponseBody
	public Pagination<StockEntries> selectTab(TableModel tm){
		return iStockEntriesService.selectTab(tm);
	}
}