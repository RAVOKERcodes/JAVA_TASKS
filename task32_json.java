package TASK;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class task32_json {
    public static void main(String[] args){
        // ----- Encode ----- //
        JSONObject obj = new JSONObject();
        obj.put("Name","RAVOKER");
        obj.put("Age",new Integer(21));
        obj.put("Salary",new Double(99999.99));
        
        String str = obj.toJSONString();   //JSON Object
        System.out.println(str);

        // ----- Decode ----- //
        Object obj1 = JSONValue.parse(str);
        JSONObject jsonObject = (JSONObject)obj;
        String name = (String)jsonObject.get("Name");   //Get
        int age = (Integer)jsonObject.get("Age");
        double salary = (Double)jsonObject.get("Salary");
        System.out.println(name+" "+salary+" "+age);
    }
}