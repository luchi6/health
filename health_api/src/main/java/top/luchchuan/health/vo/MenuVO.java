package top.luchchuan.health.vo;


import lombok.Data;
import top.luchchuan.health.pojo.Menu;

import java.util.ArrayList;
import java.util.List;

@Data
public class MenuVO extends Menu {

    private List<MenuVO> children = new ArrayList<MenuVO>();//子菜单集合

}
