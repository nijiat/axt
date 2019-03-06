package org.teemola.demo.util;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cvm.v20170312.CvmClient;

// 待完成
public class TencentOss {
    private static String secretId = "AKIDgkzVyOrhZYQuaNB9wylWBsRwmNxclhEY";
    private static String secretKey = "ZKKYoEFqUTaKZ0cKHyvqhXSMf3S40CUX";
private static String area = "ap-guangzhou";
    private Credential cred = new Credential("secretId", "secretKey");
    private CvmClient client = new CvmClient(cred, area);

}
