package top.luchchuan.health.vo;


import lombok.Data;
import top.luchchuan.health.pojo.CheckGroup;
import top.luchchuan.health.pojo.CheckItem;

import java.util.List;

//  view  object
@Data
public class CheckGroupVO extends CheckGroup {

    private List<CheckItem> checkItems;

    private int[] checkItemIds;

}
