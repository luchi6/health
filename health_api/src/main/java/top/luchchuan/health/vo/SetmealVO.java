package top.luchchuan.health.vo;


import lombok.Data;
import top.luchchuan.health.pojo.Setmeal;

import java.util.List;

@Data
public class SetmealVO extends Setmeal {

    private List<CheckGroupVO> checkGroupVOList;

}
