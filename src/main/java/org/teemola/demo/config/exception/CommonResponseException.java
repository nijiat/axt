package org.teemola.demo.config.exception;

import com.alibaba.fastjson.JSONObject;
import org.teemola.demo.entity.BaseResponse;
import org.teemola.demo.util.CommonUtil;
import org.teemola.demo.util.constants.ErrorEnum;

/**
 * 本系统使用的自定义错误类
 * 比如在校验参数时,如果不符合要求,可以抛出此错误类
 * 拦截器可以统一拦截此错误,将其中json返回给前端
 */

public class CommonResponseException extends RuntimeException{

    private BaseResponse resultResponse;

    /**
     * 调用时可以在任何代码处直接throws这个Exception,
     * 都会统一被拦截,并封装好json返回给前台
     *
     * @param baseResponse 以错误的ErrorEnum做参数
     */
    public CommonResponseException(BaseResponse baseResponse) {
        this.resultResponse = baseResponse;
    }

    public BaseResponse getResultResponse() {
        return resultResponse;
    }
}
