package org.teemola.demo.utils.error;

import org.teemola.demo.entity.BaseResponse;

public class MyError {
    private int code;
    private String message;
    public BaseResponse AccessForbidden() {
        return new BaseResponse(403, "没有访问权限");
    }
    public BaseResponse VercodeError() { return new BaseResponse(1001, "验证码错误");}
    public BaseResponse VercodeTimeOut() {
        return new BaseResponse(1000, "验证码超时");
    }
    public BaseResponse PhoneExists() {
        return new BaseResponse(1002, "手机号已存在");
    }
    public BaseResponse UserExists() {
        return new BaseResponse(1003, "用户已存在");
    }
    public BaseResponse InvalidUsername() {
        return new BaseResponse(1004, "无效用户");
    }
    public BaseResponse InvalidPassword() {
        return new BaseResponse(1005, "无效密码");
    }
    public BaseResponse NotLogin() {
        return new BaseResponse(1006, "用户未登录");
    }
    public BaseResponse LoginAgain() {
        return new BaseResponse(1007, "请重新登录");
    }
    public BaseResponse PhoneNotExists() {
        return new BaseResponse(1008, "手机号不存在");
    }
    public BaseResponse FieldsError() { return new BaseResponse(1009, "缺少参数");  }
    public BaseResponse InvalidWechatUser() {
        return new BaseResponse(1010, "微信用户不存在");
    }
    public BaseResponse InvalidWechatCode() {
        return new BaseResponse(1011, "微信code无效");
    }
    public BaseResponse InvalidWechatOAuth2AccessToken() {
        return new BaseResponse(1012, "微信OAuth2 AccessToken无效");
    }
    public BaseResponse ResultNotFound() {
        return new BaseResponse(2001, "查询结果不存在");
    }
    public BaseResponse ClassNotFound() {
        return new BaseResponse(2002, "教学班不存在");
    }
    public BaseResponse CourseNotFound() {
        return new BaseResponse(2003, "课程不存在");
    }
    public BaseResponse FileNotFound() {
        return new BaseResponse(2004, "文件找不到");
    }
    public BaseResponse ExaminationNotFound() {
        return new BaseResponse(2005, "找不到试卷");
    }
    public BaseResponse SpecificNotFound() {
        return new BaseResponse(2006, "找不到具体的这节课");
    }
    public BaseResponse QuestionNotFound() {
        return new BaseResponse(2007, "找不到题目");
    }
    public BaseResponse SchoolNotFound() {
        return new BaseResponse(2008, "找不到该学校");
    }
    public BaseResponse TimeNotInClass() {
        return new BaseResponse(2009, "当前不在上课时间");
    }
    public BaseResponse UserAlreadyInit() {
        return new BaseResponse(2010, "用户已经初始化");
    }
    public BaseResponse NoPrivilege() {
        return new BaseResponse(2011, "没有权限");
    }
    public BaseResponse NoAtten() {
        return new BaseResponse(2012, "没有签到内容");
    }
    public BaseResponse ClassIsNotEnd() {
        return new BaseResponse(2013, "上课时间未结束");
    }
    public BaseResponse SignStop() {
        return new BaseResponse(2014, "签到已经结束");
    }
    public BaseResponse QuestionPushed() {
        return new BaseResponse(2015, "改题已经推送过");
    }
    public BaseResponse QuestionNotAnswer() {
        return new BaseResponse(2016, "改题未回答过");
    }
    public BaseResponse CollegeNotFound() {
        return new BaseResponse(2017, "学院找不到");
    }
    public BaseResponse MajorNotFound() {
        return new BaseResponse(2018, "专业找不到");
    }
    public BaseResponse HomeWorkTimeOut() {
        return new BaseResponse(2019, "超过作业提交时间");
    }
}
