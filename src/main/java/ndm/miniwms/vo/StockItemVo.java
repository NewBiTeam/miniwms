package ndm.miniwms.vo;

public class StockItemVo {

	private Integer id;
	private String SKU; // SKU
	private String name; // 名称
	private String barcode; // 条形码
	private String weight; // 重量
	private String volume; // 体积
	private String hazardFlagName;
	private String UOM;
	private String categoryName; //种类  category_id
	private String brandName; //品牌 brand_id
	
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getHazardFlagName() {
		return hazardFlagName;
	}
	public void setHazardFlagName(String hazardFlagName) {
		this.hazardFlagName = hazardFlagName;
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
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getUOM() {
		return UOM;
	}
	public void setUOM(String uOM) {
		UOM = uOM;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
	
}
