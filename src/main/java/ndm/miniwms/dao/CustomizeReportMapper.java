package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.CustomizeReport;

public interface CustomizeReportMapper {

	List<CustomizeReport> all();

	int delById(Integer id);

	int update(CustomizeReport customizeReport);

	int add(CustomizeReport customizeReport);
}
