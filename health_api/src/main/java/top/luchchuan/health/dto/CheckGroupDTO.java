package top.luchchuan.health.dto;


import lombok.Data;
import top.luchchuan.health.pojo.CheckGroup;

@Data
public class CheckGroupDTO extends CheckGroup {

    /**
     * 选择的检查项id列表
     * */
    private Integer[] checkitemIds;

}
