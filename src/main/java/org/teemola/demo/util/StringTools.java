package org.teemola.demo.util;

public class StringTools {
    public static boolean isNullOrEmpty(String str) {
        return null == str || "".equals(str) || "null".equals(str);
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);  // 后者要求obj为string且内容为""
    }
}
