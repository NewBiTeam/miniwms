package ndm.miniwms.vo;

public class LocationVO {
	private Integer id;
	private String name;
	private String XCoord;
	private String YCoord;
	private String ZCoord;
	private String companyName;
	private String warehouseName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	
}
