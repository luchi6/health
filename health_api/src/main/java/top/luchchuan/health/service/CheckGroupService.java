package top.luchchuan.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.luchchuan.health.dto.CheckGroupDTO;
import top.luchchuan.health.entity.PageResult;
import top.luchchuan.health.entity.QueryPageBean;
import top.luchchuan.health.pojo.CheckGroup;
import top.luchchuan.health.vo.CheckGroupVO;

public interface CheckGroupService extends IService<CheckGroup> {


    PageResult findPage(QueryPageBean queryPageBean);

    CheckGroupVO findCheckIteminfosByGroupId(int id);

    boolean saveUpdate(CheckGroupDTO checkGroupDTO);
}
