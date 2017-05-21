package ndm.miniwms.pojo;

import java.util.Date;
import java.util.List;

import ndm.miniwms.vo.StockItemVo;

public class StockItem {
	private Integer id; // 鍟嗗搧id
	private String SKU; // SKU
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private String name; // 名称
	private String barcode; // 条形码
	private String weight; // 重量
	private String volume; // 体制
	private Integer brandId; // 品牌id
	private Integer categoryId; // 种类id
	private String UOM; // 计量单位
	private Integer hazardFlag; // 是否危险品
	private Integer companyId; // 公司id
	private Integer locationId; // 库位id
	private String description; // 备注

	private BrandDetails brandDetails;//品牌
	private CategoryDetails categoryDetails;//种类
	private CompanyDetails companyDetails;//公司
	private List<StockEntries> stockEntriesList;//库存变更记录
	private List<StockInventory> stockInventoryList;//库存
	private List<StockInEntries> stockInEntriesList;//入库明细
	private List<StockItemPhoto> StockItemPhotoList; //圖片
	
	public StockItem(){}
	
	public StockItem(StockItemVo stockItemVo){
		this.id=stockItemVo.getId();
		this.SKU=stockItemVo.getSKU();
		this.name=stockItemVo.getName();
		this.barcode=stockItemVo.getBarcode();
		this.weight=stockItemVo.getWeight();
		this.volume=stockItemVo.getVolume();
		this.UOM=stockItemVo.getUOM();
	}
	public BrandDetails getBrandDetails() {
		return brandDetails;
	}

	public void setBrandDetails(BrandDetails brandDetails) {
		this.brandDetails = brandDetails;
	}

	public CategoryDetails getCategoryDetails() {
		return categoryDetails;
	}

	public void setCategoryDetails(CategoryDetails categoryDetails) {
		this.categoryDetails = categoryDetails;
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public List<StockEntries> getStockEntriesList() {
		return stockEntriesList;
	}

	public void setStockEntriesList(List<StockEntries> stockEntriesList) {
		this.stockEntriesList = stockEntriesList;
	}

	public List<StockInventory> getStockInventoryList() {
		return stockInventoryList;
	}

	public void setStockInventoryList(List<StockInventory> stockInventoryList) {
		this.stockInventoryList = stockInventoryList;
	}

	public List<StockInEntries> getStockInEntriesList() {
		return stockInEntriesList;
	}

	public void setStockInEntriesList(List<StockInEntries> stockInEntriesList) {
		this.stockInEntriesList = stockInEntriesList;
	}

	public List<StockItemPhoto> getStockItemPhotoList() {
		return StockItemPhotoList;
	}

	public void setStockItemPhotoList(List<StockItemPhoto> stockItemPhotoList) {
		StockItemPhotoList = stockItemPhotoList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
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

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public Integer getHazardFlag() {
		return hazardFlag;
	}

	public void setHazardFlag(Integer hazardFlag) {
		this.hazardFlag = hazardFlag;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
