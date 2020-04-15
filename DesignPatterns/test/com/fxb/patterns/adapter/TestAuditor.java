package com.fxb.patterns.adapter;

import com.fxb.patterns.adapter.executor.AuditorService;
import com.fxb.patterns.adapter.executor.Auditors;

/**
 * @ClassName: TestAuditor
 * @Description:
 * @Author:
 * @Date: 2020/4/15 15:05
 * @Version V1.0
 **/
public class TestAuditor {
    public static void main(String[] args) {
        AuditorService<String,Integer> auditorService = Auditors.sysAuditor();
        Integer result = auditorService.execute("a");
        System.out.println(result);
    }
}
