package example;
import com.dtdream.uim.utils.SignatureHelper;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws Exception {
//        testGetMethod();
       // testPostMethod();
       // testRegionListMethod("http","127.0.0.1","8083","Ovrj1tzUVYaebXui","Js4daoJowzffGBUqf0eF7ucYRH4KSg");
//        getEcsInventory();
        testCreateProject();
//        testApiShenhe();
//        getAliRamAccessKey();
    }

    public static void testRegionListMethod(String protocol,String host,String port,String akId,String akSecret) throws Exception {
        Map<String,String> headers=new HashMap<String, String>();
        headers.put("SignatureMethod","HMAC-SHA256");
        headers.put("Version","20160701");
        headers.put("AccessKeyId",akId);
        String signature = SignatureHelper.simpleSignRequest("get", headers, akSecret);
        headers.put("Signature",signature);
        DtHttpRequest httpRequest=new DtHttpRequest(headers,protocol,host,port);
        Map<String,String> param=new HashMap<String, String>();
        param.put("regionId","cn-hangzhou-am24");
        param.put("bucketName","aaaa1");
        String result = httpRequest.sendGet("gateway/api/region/list", null);
        System.out.println(result);
    }
    public static void testGetMethod() throws Exception {

        Map<String,String> headers=new HashMap<String, String>();
        headers.put("SignatureMethod","HMAC-SHA256");
        headers.put("Version","20160701");
        headers.put("AccessKeyId","xev2qr6Fvcx91rWg");
        String signature = SignatureHelper.simpleSignRequest("get", headers, "9azm0X2htBAiulFXOfnJddWd3JJsr0");
        headers.put("Signature",signature);


        DtHttpRequest httpRequest=new DtHttpRequest(headers,"http","127.0.0.1","8083");
        Map<String,String> param=new HashMap<String, String>();
        param.put("regionId","cn-hangzhou-am24");
        param.put("bucketName","aaaa1");
        String result = httpRequest.sendGet("gateway/api/cloudOss/read/getBucketInfo", param);
        System.out.println(result);

    }
    public static void testPostMethod() throws Exception {
        Map<String,String> headers=new HashMap<String, String>();
        headers.put("SignatureMethod","HMAC-SHA256");
        headers.put("Version","20160701");
        headers.put("AccessKeyId","xev2qr6Fvcx91rWg");
        String signature = SignatureHelper.simpleSignRequest("post", headers, "9azm0X2htBAiulFXOfnJddWd3JJsr0");
        headers.put("Signature",signature);
        DtHttpRequest httpRequest=new DtHttpRequest(headers,"http","127.0.0.1","8083");
        Map<String,String> param=new HashMap<String, String>();
        param.put("bandwidth","1");
        param.put("chargeType","PayByTraffic");
        param.put("cpu","1");
        param.put("createEcsNum","1");
        param.put("departmentId","2");
        param.put("imageId","aliyun1501_32_40G_aliaegis_20160222.vhd");
        param.put("instanceName","testEcs");
        param.put("memory","1");
        param.put("networkType","vpc");
        param.put("password","Admin123");
        param.put("projectId","78");
        param.put("regionId","cn-hangzhou-am24");
        param.put("securityGroupId","sg-881z4rvpw");
        param.put("systemDiskType","cloud_ssd");
        param.put("vSwitchId","vsw-88oby56u0");
        param.put("vpcId","vpc-884lnnm4w");
        param.put("zoneId","cn-hangzhou-hsd-am24001-a");
        String result = httpRequest.sendPost("gateway/api/cloudEcs/manage/createDtcenterEcsInstance", param);
        System.out.println(result);
    }

    public static void getEcsInventory() throws Exception {
        Map<String,String> headers=new HashMap<String, String>();
        headers.put("SignatureMethod","HMAC-SHA256");
        headers.put("Version","20160701");
        headers.put("AccessKeyId","2iQWR1pLqxBp6x7f");
        String signature = SignatureHelper.simpleSignRequest("get", headers, "TQdc9FHSbYtHkRJdUX6nOgrMfoPJWp");
        headers.put("Signature",signature);

        DtHttpRequest httpRequest=new DtHttpRequest(headers,"http","10.33.110.252","80");
        Map<String,String> param=new HashMap<String, String>();
//        param.put("region","cn-hangzhou-am24");
        String result = httpRequest.sendGet("gateway/api/inventory/ecsInventory", param);
        System.out.println(result);
    }

    public static void testCreateProject() throws Exception {
        Map<String,String> headers=new HashMap<String, String>();
        headers.put("SignatureMethod","HMAC-SHA256");
        headers.put("Version","20160701");
        headers.put("AccessKeyId","d9HmZhbMgf62Y1ez");
        String signature = SignatureHelper.simpleSignRequest("get", headers, "jit23cfATHrItS3BKnHTG75IiL2JEp");
        headers.put("Signature",signature);

        DtHttpRequest httpRequest=new DtHttpRequest(headers,"http","172.31.62.252","80");
        Map<String,String> param=new HashMap<String, String>();

        String result = httpRequest.sendGet("gateway/api/cloudEcs/read/getCloudEcsList", param);
        System.out.println(result);
    }

//    lzl MVrfU7gh9qyx3GWP xfZgd52jNgB6aJuPvJANx0EniEGxJC
//    admin l5J0UebLSNFkle2L Jo0XyR5z5kqzyldC1rsj7vgjm53KwI
    public static void testApiShenhe() throws Exception{
        DtHttpRequest httpRequest=new DtHttpRequest();
        Map<String,Object> param=new HashMap<String, Object>();
        param.put("projectCode","w201705120000000008");
        param.put("acceptcomment","ok123");
        param.put("isAccepted","true");

        String result = httpRequest.sendPostBody("http://172.31.161.103:80/gateway/api/portalplat/toNextTask", param);
        System.out.println(result);
    }
    public static void getAliRamAccessKey() throws Exception{
        Map<String,String> headers=new HashMap<String, String>();
        headers.put("regionId","cn-hangzhou-am24");
        headers.put("userId","28");
        headers.put("pageNum","1");
        headers.put("pageSize","10");

        DtHttpRequest httpRequest=new DtHttpRequest(headers,"http","172.31.62.230","80");
        Map<String,String> param=new HashMap<String, String>();
        param.put("regionId","cn-hangzhou-am24");
        param.put("userId","28");
        param.put("pageNum","1");
        param.put("pageSize","10");
        String result = httpRequest.sendGet("gateway/api/users/read/getAliRamAccessKey", param);
        System.out.println(result);

    }
}
