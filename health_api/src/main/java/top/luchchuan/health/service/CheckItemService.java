package top.luchchuan.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.luchchuan.health.entity.PageResult;
import top.luchchuan.health.entity.QueryPageBean;
import top.luchchuan.health.pojo.CheckItem;

public interface CheckItemService  extends IService<CheckItem> {
    PageResult findPage(QueryPageBean queryPageBean);
}
