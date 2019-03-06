package org.teemola.demo.utils;

import com.alibaba.fastjson.JSONObject;

import org.teemola.demo.config.exception.CommonResponseException;
import org.teemola.demo.entity.BaseResponse;
import org.teemola.demo.util.StringTools;
import org.teemola.demo.util.constants.Constants;
import org.teemola.demo.util.constants.ErrorEnum;
import org.teemola.demo.utils.error.MyError;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

// json 工具类
public class CommonUtil {


    /**
     * 返回错误信息JSON
     */
    public static JSONObject errorJson(ErrorEnum errorEnum) {
        JSONObject resultJson = new JSONObject();
        resultJson.put("code", errorEnum.getErrorCode());
        resultJson.put("msg", errorEnum.getErrorMsg());
        resultJson.put("info", new JSONObject());
        return resultJson;
    }


    /**
     * 验证是否含有全部必填字段
     *
     * @param requiredColumns 必填的参数字段名称 逗号隔开 比如"userId, name, telephone"
     */
    public static void  hasAllRequired(Map<String,String> map, String requiredColumns) {
        if(!StringTools.isNullOrEmpty(requiredColumns)){
            //验证字段非空
            String[] columns = requiredColumns.split(",");
            String missCol = "";
            for (String column : columns) {
                Object val = map.get(column.trim());
                if (StringTools.isNullOrEmpty(val)) {
                    missCol += column + "  ";
                }
            }
            if (!StringTools.isNullOrEmpty(missCol)) {
                BaseResponse baseResponse = new MyError().FieldsError();
                throw new CommonResponseException(baseResponse);
            }
        }
    }



}
