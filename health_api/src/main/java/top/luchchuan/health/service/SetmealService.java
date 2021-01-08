package top.luchchuan.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.luchchuan.health.dto.SetmealDTO;
import top.luchchuan.health.entity.PageResult;
import top.luchchuan.health.entity.QueryPageBean;
import top.luchchuan.health.pojo.Setmeal;
import top.luchchuan.health.vo.SetmealVO;

public interface SetmealService extends IService<Setmeal> {
    boolean saveUpdate(SetmealDTO setmealDTO);

    PageResult findPage(QueryPageBean queryPageBean);

    void clearOssImg();

    SetmealVO findSetMealDetailById(int id);
}
