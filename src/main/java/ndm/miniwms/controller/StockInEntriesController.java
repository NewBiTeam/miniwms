package ndm.miniwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.StockIn;
import ndm.miniwms.pojo.StockInEntries;
import ndm.miniwms.pojo.StockInventory;
import ndm.miniwms.service.IStockInEntriesService;
import ndm.miniwms.service.IStockInService;
import ndm.miniwms.service.IStockInventoryService;
import ndm.miniwms.vo.Message;

@Controller
@RequestMapping("/stockInEntries")
public class StockInEntriesController {

	@Resource
	private IStockInEntriesService service;

	@Resource
	private IStockInService stockInService;

	@Resource
	private IStockInventoryService stockInventoryService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Message> insert(@RequestBody StockInEntries[] stockInEntriesList) {
		for (StockInEntries stockInEntries : stockInEntriesList) {
			StockIn stockIn = new StockIn();
			stockIn.setStatus(false);
			stockInService.add(stockIn);
			List<StockIn> list = stockInService.all();
			int id = list.get(list.size() - 1).getId();
			stockInEntries.setInId(id);
			this.service.add(stockInEntries);
			StockInventory stockInventory1 = stockInventoryService.selectItem(stockInEntries.getItemId());
			if (stockInventory1 != null) {
				StockInventory stockInventory = new StockInventory();
				stockInventory.setItemId(stockInEntries.getItemId());

				stockInventory.setQuantity(stockInventory1.getQuantity() + stockInEntries.getQuantity());
				stockInventoryService.updateQuantity(stockInventory);
			}
		}
		return new ResponseEntity<Message>(new Message(), HttpStatus.OK);

	}
}
