package RepairRunTest;
//
//PTN_ID_FK,REPAIR_DETAIL_FK,REPAIR_ITEM,REPAIR_PRICE,REPAIR_DAYS
//        silkroad01,가방 클리닝,가방,24000,1
//        silkroad01,가죽 복원,가방,39000,5
//        silkroad01,지퍼 수선,가방,9000,1
//        silkroad01,신발 클리닝,신발,19000,1
//        silkroad01,부분 염색,신발,14000,3
//        silkroad01,손상 복원,신발,34000,3
//        silkroad01,벨트 길이 수선,지갑벨트,9000,1
//        silkroad01,가죽 교체,지갑벨트,39000,2
//        silkroad01,염색,지갑벨트,29000,5
//        silkroad01,디자인 수선,의류,0,0
//        silkroad01,사이즈 수선,의류,0,0
//        silkroad01,기장 수선,의류,0,0


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepairRunTest {
    public static void main(String[] args) {
        List<Map<String,Object>> layer1 = new ArrayList<>();
        // Map<String,Object>> => Object
        List<Map<String,Object>> layer2 = new ArrayList<>();
        // Map<String,Object>> => Object
        Map<String,Object> layer3 = new HashMap<>();

        Map<String, Object> repairServiceMap = new HashMap<>();
        repairServiceMap.put("item", "가방");

        List<Map<String, Object>> detailList = new ArrayList<>();

        // Create a detail using a Map
        Map<String, Object> detail1 = new HashMap<>();
        detail1.put("name", "가방클리닝");
        detail1.put("days", 1);
        detail1.put("price", 24000);

        // Add the detail to the list
        detailList.add(detail1);

        // Create and add more details to the list
        Map<String, Object> detail2 = new HashMap<>();
        detail2.put("name", "가죽복원");
        detail2.put("days", 5);
        detail2.put("price", 39000);

        Map<String, Object> detail3 = new HashMap<>();
        detail3.put("name", "지퍼수선");
        detail3.put("days", 1);
        detail3.put("price", 9000);

        detailList.add(detail2);
        detailList.add(detail3);

        // Add the list of details to the repairServiceMap
        repairServiceMap.put("detail", detailList);

        // Access and use the populated data
        String item = (String) repairServiceMap.get("item");
        System.out.println("Item: " + item);

        List<Map<String, Object>> details = (List<Map<String, Object>>) repairServiceMap.get("detail");
        for (Map<String, Object> detail : details) {
            String detailName = (String) detail.get("name");
            Object days = detail.get("days");
            Object price = detail.get("price");

            System.out.println("Detail Name: " + detailName);
            System.out.println("Days: " + days);
            System.out.println("Price: " + price);
        }



    }
}
