package org.teemola.demo.util;

import com.alibaba.fastjson.JSONObject;
import org.teemola.demo.config.exception.CommonResponseException;
import org.teemola.demo.entity.BaseResponse;
import org.teemola.demo.util.constants.Constants;
import org.teemola.demo.util.constants.ErrorEnum;
import org.teemola.demo.utils.error.MyError;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

// json 工具类
public class CommonUtil {
    /**
     * 返回一个info为空对象的成功消息的json
     */
    public static JSONObject successJson() {
        return successJson(new JSONObject());
    }

    /**
     * 返回一个返回码为100的json
     */
    public static JSONObject successJson(Object info) {
        JSONObject resultJson = new JSONObject();
        resultJson.put("code", Constants.SUCCESS_CODE);
        resultJson.put("msg", Constants.SUCCESS_MSG);  // 指返回成功，但不代表shiro验证通过
        resultJson.put("info", info);
        return resultJson;
    }

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
     * 查询分页结果后的封装工具方法 -- 获取封装分页对象
     *
     * @param requestJson 请求参数json,此json在之前调用fillPageParam 方法时,已经将pageRow放入
     * @param list        查询分页对象list
     * @param totalCount  查询出记录的总条数
     */
    public static JSONObject successPage(final JSONObject requestJson, List<JSONObject> list, int totalCount){
        int pageRow = requestJson.getIntValue("PageRow");
        int totalPage = getPageCounts(pageRow, totalCount);
        JSONObject info = new JSONObject();
        info.put("list", list);
        info.put("totalCount", totalCount);
        info.put("totalPage", totalPage);

        JSONObject result = successJson();
        result.put("info", info);
        return result;
    }

    /**
     * 查询分页结果后的封装工具方法
     *
     * @param list 查询分页对象list
     */
    public static JSONObject successPage(List<JSONObject> list) {
        JSONObject result = successJson();
        JSONObject info = new JSONObject();
        info.put("info", info);
        info.put("list", list);
        result.put("info", info);
        return result;
    }



    /**
     * 获取总页数
     *
     * @param pageRow   每页行数
     * @param itemCount 结果的总条数
     */
    private static int getPageCounts(int pageRow, int itemCount) {
        if(itemCount== 0) return 1;
        return itemCount % pageRow > 0 ? itemCount / pageRow +1 : itemCount / pageRow ;
    }

    /**
     * 将request参数值转为json
     */
    public static JSONObject request2Json(HttpServletRequest request) {
        JSONObject resultJson = new JSONObject();
        Enumeration paramNames = request.getParameterNames();
        while(paramNames.hasMoreElements()){
            String paramName = (String) paramNames.nextElement();
            String[] valueList = request.getParameterValues(paramName);
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < valueList.length; ++i){
                if(valueList[i].length() > 0){
                    if(i>0) sb.append(",");
                    sb.append(valueList[i]);
                }
            }
            resultJson.put(paramName, sb.toString());
        }
        return resultJson;
    }

    /**
     * 将request转JSON
     * 并且验证非空字段
     */
//    public static JSONObject convert2JsonAndCheckRequiredColumns(HttpServletRequest request, String requiredColumns) {
//        JSONObject obj = request2Json(request);
//        hasAllRequired(obj, requiredColumns);
//        return obj;
//    }

    /**
     * 验证是否含有全部必填字段
     *
     * @param requiredColumns 必填的参数字段名称 逗号隔开 比如"userId, name, telephone"
     */
    public static void hasAllRequired(HttpServletRequest request, String requiredColumns) {
        if(!StringTools.isNullOrEmpty(requiredColumns)){
            //验证字段非空
            String[] columns = requiredColumns.split(",");
            String missCol = "";
            for (String column : columns) {
                Object val = request.getSession().getAttribute(column.trim());
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

    /**
     * 在分页查询之前,为查询条件里加上分页参数
     *
     * @param paramObject    查询条件json
     * @param defaultPageRow 默认的每页条数,即前端不传pageRow参数时的每页条数
     */
    private static void fillPageParam(final JSONObject paramObject, int defaultPageRow) {
        int pageNum = paramObject.getIntValue("pageNum");
        pageNum = pageNum == 0 ? 1 : pageNum;
        int pageRow = paramObject.getIntValue("pageRow");
        pageRow = pageRow == 0 ? defaultPageRow : pageRow;
        paramObject.put("offSet", (pageNum - 1) * pageRow);
        paramObject.put("pageRow", pageRow);
        paramObject.put("pageNum", pageNum);
        //删除此参数,防止前端传了这个参数,pageHelper分页插件检测到之后,拦截导致SQL错误
        paramObject.remove("pageSize");
    }

    /**
     * 分页查询之前的处理参数
     * 没有传pageRow参数时,默认每页10条.
     */
    public static void fillPageParam(final JSONObject paramObject) {
        fillPageParam(paramObject, 10);
    }

}
