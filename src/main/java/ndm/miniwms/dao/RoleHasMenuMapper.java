package ndm.miniwms.dao;

import ndm.miniwms.pojo.RoleHasMenu;

public interface RoleHasMenuMapper {
    public int add(RoleHasMenu rhm);
    
    public int delByRoleId(Integer id);
}
