package ndm.miniwms.pojo;

import java.util.Date;

public class StockEntries {
	private Integer id;// 记录id
	private Integer inventoryId;// 库存id
	private Integer itemId;// 商品id
	private Date date;// 日期
	private String type;// 类型
	private Integer inId;// 入库单id
	private Integer outId;// 出库单id
	private Integer checkId;// 盘点id
	private Integer openingStock;// 变更前数量
	private Integer closingStock;// 变更后数量
	private Integer companyId;// 公司id
	private Integer operatorId;// 操作人id

	private StockInventory stockInventory;//库存
	private StockItem stockItem;//商品
	private StockIn stockIn;//入库单
	private StockOut stockOut;//出库单
	private StockCheck stockCheck;//盘点
	private CompanyDetails companyDetails;//公司
	private CompanyUser companyUser;//用户
	
	public StockInventory getStockInventory() {
		return stockInventory;
	}

	public void setStockInventory(StockInventory stockInventory) {
		this.stockInventory = stockInventory;
	}

	public StockItem getStockItem() {
		return stockItem;
	}

	public void setStockItem(StockItem stockItem) {
		this.stockItem = stockItem;
	}

	public StockIn getStockIn() {
		return stockIn;
	}

	public void setStockIn(StockIn stockIn) {
		this.stockIn = stockIn;
	}

	public StockOut getStockOut() {
		return stockOut;
	}

	public void setStockOut(StockOut stockOut) {
		this.stockOut = stockOut;
	}

	public StockCheck getStockCheck() {
		return stockCheck;
	}

	public void setStockCheck(StockCheck stockCheck) {
		this.stockCheck = stockCheck;
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public CompanyUser getCompanyUser() {
		return companyUser;
	}

	public void setCompanyUser(CompanyUser companyUser) {
		this.companyUser = companyUser;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getInId() {
		return inId;
	}

	public void setInId(Integer inId) {
		this.inId = inId;
	}

	public Integer getOutId() {
		return outId;
	}

	public void setOutId(Integer outId) {
		this.outId = outId;
	}

	public Integer getCheckId() {
		return checkId;
	}

	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}

	public Integer getOpeningStock() {
		return openingStock;
	}

	public void setOpeningStock(Integer openingStock) {
		this.openingStock = openingStock;
	}

	public Integer getClosingStock() {
		return closingStock;
	}

	public void setClosingStock(Integer closingStock) {
		this.closingStock = closingStock;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

}
