package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class LocationDetails {
	private Integer id; // 库位id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private String name; // 名称
	private Integer usage; // 是否已被使用
	private String XCoord; // X坐标
	private String YCoord; // Y坐标
	private String ZCoord; // Z坐标
	private Integer warehouseId; // 仓库id
	private Integer companyId; // 公司id

	private Warehouse warehouse; //仓库
	private StockInventory stockInventory; //库存
	private CompanyDetails companyDetails; //公司
	private List<StockInEntries> sotckInEntriesList; //入库单明细
	
	
	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public StockInventory getStockInventory() {
		return stockInventory;
	}

	public void setStockInventory(StockInventory stockInventory) {
		this.stockInventory = stockInventory;
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public List<StockInEntries> getSotckInEntriesList() {
		return sotckInEntriesList;
	}

	public void setSotckInEntriesList(List<StockInEntries> sotckInEntriesList) {
		this.sotckInEntriesList = sotckInEntriesList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUsage() {
		return usage;
	}

	public void setUsage(Integer usage) {
		this.usage = usage;
	}

	public String getXCoord() {
		return XCoord;
	}

	public void setXCoord(String xCoord) {
		XCoord = xCoord;
	}

	public String getYCoord() {
		return YCoord;
	}

	public void setYCoord(String yCoord) {
		YCoord = yCoord;
	}

	public String getZCoord() {
		return ZCoord;
	}

	public void setZCoord(String zCoord) {
		ZCoord = zCoord;
	}

	public Integer getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
