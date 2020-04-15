package com.fxb.patterns.adapter.executor;

/**
 * @ClassName: SysAuditor
 *  系统审核执行者
 * @Description: 最终的执行者
 * 具体的审核逻辑写在此处
 * @Author:
 * @Date: 2020/4/15 12:53
 * @Version V1.0
 **/
public class SysAuditor extends AbstractAuditorService<String,Integer> {

    @Override
    public Integer execute(String val) {
        if (val == null){
            throw new NullPointerException("被审核参数i不可为空");
        }
        return analyse(val);
    }

    /**
     * 私有逻辑 模拟审核流程
     * 例如 请求第三方接口 根据返回数据做判断
     * */
    private Integer analyse(String val){
        if ("a".equals(val)){
            return 1;
        }
        if ("b".equals(val)){
            return 1;
        }
        if ("c".equals(val)){
            return 1;
        }
        return 0;
    }
}
