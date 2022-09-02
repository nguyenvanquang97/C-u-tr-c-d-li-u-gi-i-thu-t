import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Bai5 {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String path : paths){
            String arr[] = path.split(" ");
            String root = arr[0];
            int len = arr.length;
            for(int i =1;i<len;i++){
                String file = arr[i];
                int index = file.indexOf("(");
                String fileName = file.substring(0,index);
                String content = file.substring(index+1,file.length());

                if(map.get(content)==null){
                    map.putIfAbsent(content,new ArrayList<>());
                }
                map.get(content).add(root+"/"+fileName);
            }
        }


        Set<String> st = map.keySet();
        for(String key : st){
            if(map.get(key).size()>1)
                result.add(map.get(key));
        }

        return result;
    }
    }


