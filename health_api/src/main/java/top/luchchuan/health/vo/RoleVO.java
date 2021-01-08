package top.luchchuan.health.vo;


import lombok.Data;
import top.luchchuan.health.pojo.Permission;
import top.luchchuan.health.pojo.Role;

import java.util.ArrayList;
import java.util.List;

@Data
public class RoleVO extends Role {

    private List<Permission> permissionsList = new ArrayList<>(0);//对应权限集合
    private List<MenuVO> menuVOList = new ArrayList<>();
}
