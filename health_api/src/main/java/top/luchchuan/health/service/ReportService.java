package top.luchchuan.health.service;

import java.util.List;
import java.util.Map;

public interface ReportService{
    Map findLastyearMemberCountsByMonth();

    List<Map> getSetmealProportion();
}
