package top.luchchuan.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.luchchuan.health.pojo.OrderSetting;

import java.util.List;
import java.util.Map;

public interface OrderSettingService extends IService<OrderSetting> {
    boolean importOrderSettings(List<String[]> readExcelList);

    Map findSettingData(int year, int month);

    boolean updateNumberByOrderDate(int number, String orderdate);

    int isOrderOKorNot(String orderdate);

    void updateReservationsByOrderDate(String orderdate);
}
