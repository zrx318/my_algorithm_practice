import java.util.Base64;

public class Test {
    public static void main(String[] args) {
        String t = "{\n" +
                "    \"from\" : %d,\n" +
                "    \"size\": %d,\n" +
                "    \"sort\":{\n" +
                "        \"push_time\":\"desc\"\n" +
                "    },\n" +
                "    \"query\":{\n" +
                "        \"bool\":{\n" +
                "            \"filter\":[\n" +
                "                {\n" +
                "                    \"terms\":{\n" +
                "                        \"subscribe_id\":[\n" +
                "                            %s\n" +
                "                        ]\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"range\":{\n" +
                "                        \"push_time\":{\n" +
                "                            \"gte\":%d\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "}";
        String token = "L2tkL3Rvb2wvcGVybV9iYXRjaA==";
        token = new String(Base64.getDecoder().decode(token));
        System.out.println(token);
    }
}
