package top.luchchuan.health.vo;


import lombok.Data;
import top.luchchuan.health.pojo.User;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserVO extends User {

    private List<RoleVO> roleVOList = new ArrayList<>(0);//对应角色集合

}
