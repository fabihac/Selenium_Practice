package Pages;
import org.apache.commons.codec.binary.Base64;

public class encodeDecode {
    public static void main(String[] args){
        String str ="Fabiha_Marzan_Chowdhury";

        byte[] encodeString = Base64.encodeBase64(str.getBytes());
        String value = new String(encodeString);
        System.out.println("encode string: "+ value);

        String str2 = "RmFiaWhhX01hcnphbl9DaG93ZGh1cnk=";
        //String str2 = "a2f830445512d169c34fecafbf81961776a895d565dc06d916cf18dd90543c44689aed915c0724969b65f34398b247e4c4b21ab657c522ba934d031a54670f9f";
        byte[] decodeString = Base64.decodeBase64(str2);
        String value2 = new String(decodeString);
        System.out.println("decode string:"+ value2);

    }
}
