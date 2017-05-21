package ndm.miniwms.pojo;

public class RoleHasMenu {
	private Integer id; // 角色－菜单关系id
	private Integer roleId; // 角色id
	private Integer menuId; // 菜单id

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

}
