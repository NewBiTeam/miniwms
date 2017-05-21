package ndm.miniwms.dao;

import java.util.List;

import ndm.miniwms.pojo.ConsigneeDetails;

public interface ConsigneeDetailsMapper {
	List<ConsigneeDetails> all();

	int delById(Integer id);

	int update(ConsigneeDetails consigneeDetails);

	int add(ConsigneeDetails consigneeDetails);
	
	ConsigneeDetails selectById(Integer id);

	List<ConsigneeDetails> selectTab();
}
