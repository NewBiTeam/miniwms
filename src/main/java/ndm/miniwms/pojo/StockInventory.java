package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

public class StockInventory {
	private Integer id; // 库存id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private boolean locked; // 是否锁定
	private Integer itemId; // 商品id
	private Integer quantity; // 数量
	private Integer lastOperatorId; // 最后修改人id
	private Integer companyId; // 公司id
	private Integer locationId; // 库位id
	private Integer inId; // 入库单id
	private String UDF1; // 自定义参数1
	private String UDF2; // 自定义参数2
	private String UDF3; // 自定义参数3
	private String UDF4; // 自定义参数4
	private String UDF5; // 自定义参数5
	private String UDF6; // 自定义参数6

	private CompanyDetails companyDetails;// 公司
	private LocationDetails locationDetails;// 库位
	private StockIn stockIn;// 入库单
	private StockItem stockItem;// 商品
	private CompanyUser companyUser; // 修改人
	
	private List<StockOutEntries> stockOutEntriesList;// 出库单明细
	private List<StockCheckEntries> stockCheckEntiesList;// 盘点明细
	private List<StockEntries> stockEntriesList;// 变更记录
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
    public boolean isLocked() {
        return locked;
    }
    public void setLocked(boolean locked) {
        this.locked = locked;
    }
    public Integer getItemId() {
        return itemId;
    }
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getLastOperatorId() {
        return lastOperatorId;
    }
    public void setLastOperatorId(Integer lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
    }
    public Integer getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    public Integer getLocationId() {
        return locationId;
    }
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
    public Integer getInId() {
        return inId;
    }
    public void setInId(Integer inId) {
        this.inId = inId;
    }
    public String getUDF1() {
        return UDF1;
    }
    public void setUDF1(String uDF1) {
        UDF1 = uDF1;
    }
    public String getUDF2() {
        return UDF2;
    }
    public void setUDF2(String uDF2) {
        UDF2 = uDF2;
    }
    public String getUDF3() {
        return UDF3;
    }
    public void setUDF3(String uDF3) {
        UDF3 = uDF3;
    }
    public String getUDF4() {
        return UDF4;
    }
    public void setUDF4(String uDF4) {
        UDF4 = uDF4;
    }
    public String getUDF5() {
        return UDF5;
    }
    public void setUDF5(String uDF5) {
        UDF5 = uDF5;
    }
    public String getUDF6() {
        return UDF6;
    }
    public void setUDF6(String uDF6) {
        UDF6 = uDF6;
    }
    public CompanyDetails getCompanyDetails() {
        return companyDetails;
    }
    public void setCompanyDetails(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }
    public LocationDetails getLocationDetails() {
        return locationDetails;
    }
    public void setLocationDetails(LocationDetails locationDetails) {
        this.locationDetails = locationDetails;
    }
    public StockIn getStockIn() {
        return stockIn;
    }
    public void setStockIn(StockIn stockIn) {
        this.stockIn = stockIn;
    }
    public StockItem getStockItem() {
        return stockItem;
    }
    public void setStockItem(StockItem stockItem) {
        this.stockItem = stockItem;
    }
    public CompanyUser getCompanyUser() {
        return companyUser;
    }
    public void setCompanyUser(CompanyUser companyUser) {
        this.companyUser = companyUser;
    }
    public List<StockOutEntries> getStockOutEntriesList() {
        return stockOutEntriesList;
    }
    public void setStockOutEntriesList(List<StockOutEntries> stockOutEntriesList) {
        this.stockOutEntriesList = stockOutEntriesList;
    }
    public List<StockCheckEntries> getStockCheckEntiesList() {
        return stockCheckEntiesList;
    }
    public void setStockCheckEntiesList(List<StockCheckEntries> stockCheckEntiesList) {
        this.stockCheckEntiesList = stockCheckEntiesList;
    }
    public List<StockEntries> getStockEntriesList() {
        return stockEntriesList;
    }
    public void setStockEntriesList(List<StockEntries> stockEntriesList) {
        this.stockEntriesList = stockEntriesList;
    }
	
	
}
