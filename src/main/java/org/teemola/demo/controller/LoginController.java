package org.teemola.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.teemola.demo.config.exception.CommonResponseException;
import org.teemola.demo.entity.BaseResponse;
import org.teemola.demo.service.LoginService;
import org.teemola.demo.utils.CommonUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/login")
@Api(tags = "Login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 登录
     * @requestBody 要求参数需放置在web请求的body内,并根据 content-type 来解析方法参数
     */
    @RequestMapping(value = "auth",method = RequestMethod.POST , consumes = "application/json")
    @ResponseBody
    public BaseResponse authlogin( @RequestBody Map<String,String> map){

        try {
            CommonUtil.hasAllRequired(map, "username, password");
            return loginService.authLogin(map);
        }
        catch (CommonResponseException commonResponseException){
            return commonResponseException.getResultResponse();
        }
    }



    /**
     * 查询当前登录用户的信息
     */
    @RequestMapping(value = "info",method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse getInfo(){
        return loginService.getUserPermission();
    }

    /**
     * 登出
     */
    @RequestMapping(value = "layout",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse logout() {
        return loginService.logout();
    }

}
