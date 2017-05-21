package ndm.miniwms.service;

import org.springframework.web.multipart.MultipartFile;

public interface IBatchImportService {
	public void addBrand(MultipartFile brand);
	public void addCompany(MultipartFile company);
	public void addSupplier(MultipartFile supplier);
	public void addCategory(MultipartFile category);
	public void addConsignee(MultipartFile consignee);
	public void addUser(MultipartFile user);
	public void addLocation(MultipartFile location);
	public void addWarehouse(MultipartFile warehouse);
}
