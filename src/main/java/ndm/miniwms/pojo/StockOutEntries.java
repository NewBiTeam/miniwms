package ndm.miniwms.pojo;

public class StockOutEntries {
	private Integer id;// 鍑哄簱鍗曟槑缁唅d
	private Integer outId;// 鍑哄簱鍗昳d
	private Integer itemId;// 鍟嗗搧id
	private Integer quantity;// 鏁伴噺
	private Integer inventoryId;// 搴撳瓨id
	private String UDF1;// 鑷畾涔夊弬鏁�1
	private String UDF2;// 鑷畾涔夊弬鏁�2
	private String UDF3;// 鑷畾涔夊弬鏁�3
	private String UDF4;// 鑷畾涔夊弬鏁�4
	private String UDF5;// 鑷畾涔夊弬鏁�5
	private String UDF6;// 鑷畾涔夊弬鏁�6

	private StockOut stockOut;//鍑哄簱鍗�
	private StockItem stockItem;//鍟嗗搧
	private StockInventory stockInventory;//搴撳瓨

	public StockOut getStockOut() {
		return stockOut;
	}

	public void setStockOut(StockOut stockOut) {
		this.stockOut = stockOut;
	}

	public StockItem getStockItem() {
		return stockItem;
	}

	public void setStockItem(StockItem stockItem) {
		this.stockItem = stockItem;
	}

	public StockInventory getStockInventory() {
		return stockInventory;
	}

	public void setStockInventory(StockInventory stockInventory) {
		this.stockInventory = stockInventory;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOutId() {
		return outId;
	}

	public void setOutId(Integer outId) {
		this.outId = outId;
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

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
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
