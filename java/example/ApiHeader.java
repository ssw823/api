package example;

/**
 * Created by 2 on 2016/11/12.
 */
public class ApiHeader {
    private String Version;
    private String AccessKeyId;
    private String SignatureMethod;
    private String Signature;

    public ApiHeader(String version, String accessKeyId, String signatureMethod, String signature) {
        Version = version;
        AccessKeyId = accessKeyId;
        SignatureMethod = signatureMethod;
        Signature = signature;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getAccessKeyId() {
        return AccessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        AccessKeyId = accessKeyId;
    }

    public String getSignatureMethod() {
        return SignatureMethod;
    }

    public void setSignatureMethod(String signatureMethod) {
        SignatureMethod = signatureMethod;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
