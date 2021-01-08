package top.luchchuan.health.dto;

import lombok.Data;
import top.luchchuan.health.pojo.Setmeal;

import java.io.Serializable;

@Data
public class SetmealDTO extends Setmeal implements Serializable {

    private Integer[] checkgroupIds;

}
