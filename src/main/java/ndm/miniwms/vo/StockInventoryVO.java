package ndm.miniwms.vo;

import java.util.Date;

import ndm.miniwms.pojo.StockInventory;

public class StockInventoryVO {
	private Integer id; // 库存id
	private Date created; // 创建时间
	private Date modified; // 修改时间
	private boolean locked; // 是否锁定
	private String itemName; // 商品id
	private Integer quantity; // 数量
	private String lastOperatorName; // 最后修改人id
	private String companyName; // 公司id
	private String locationName; // 库位id
	private String inName; // 入库单id
	private String UDF1; // 自定义参数1
	private String UDF2; // 自定义参数2
	private String UDF3; // 自定义参数3
	private String UDF4; // 自定义参数4
	private String UDF5; // 自定义参数5
	private String UDF6; // 自定义参数6
	
	public StockInventoryVO(StockInventory stockInventory){
		this.id = stockInventory.getId();
		this.created = stockInventory.getCreated();
		this.modified = stockInventory.getModified();
		this.locked = stockInventory.isLocked();
		this.quantity = stockInventory.getQuantity();
		this.UDF1 = stockInventory.getUDF1();
		this.UDF2 = stockInventory.getUDF2();
		this.UDF3 = stockInventory.getUDF3();
		this.UDF4 = stockInventory.getUDF4();
		this.UDF5 = stockInventory.getUDF5();
		this.UDF6 = stockInventory.getUDF6();
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getLastOperatorName() {
		return lastOperatorName;
	}

	public void setLastOperatorName(String lastOperatorName) {
		this.lastOperatorName = lastOperatorName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getInName() {
		return inName;
	}

	public void setInName(String inName) {
		this.inName = inName;
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

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
	
	
}
