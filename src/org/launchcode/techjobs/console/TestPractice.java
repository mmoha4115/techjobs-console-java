package org.launchcode.techjobs.console;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestPractice {
    public static void main(String[] args) {
//        ArrayList<HashMap<String, String>> hello = new ArrayList<HashMap<String, String>>();
//        System.out.println(hello);
//        String sentence = "jobs,description,'company, inc',bus / ines,city,'new, companies','another, comma'";
//        String[] sent = sentence.split(",");
//        System.out.println(sentence);
//        int count = 0;
//        String part1 = "";
//        String part2 = "";
//
//
////        |||||||||
//        ArrayList<String> result = new ArrayList<>();
//        for (String category : sent) {
//            if (category.startsWith("'") || category.contains("'")) {
//                count++;
//                if (count == 2) {
//                    count = 0;
//                    part2 = part1 + "," + category;
//                    result.add(part2);
//                }
//                part1 = category;
//            } else {
//                result.add(category);
//                System.out.println(part2);
//            }
//        }
//        System.out.println(result);
//        for (String i : sent) {
//            System.out.println(i);
//        }

        ArrayList<HashMap<String,String>> somejobs = JobData.findAll();
        System.out.println(somejobs);
      for(int i = 0;i < somejobs.size();i++){
          HashMap<String,String> post = somejobs.get(i);
//          System.out.println(post.containsValue("java"));
          System.out.println("\n\t***************\n");
          for(Map.Entry<String,String> fields:post.entrySet()){
//              System.out.println(fields.getKey()+" : "+fields.getValue());
              System.out.println("whaaat");
              String avalue = fields.getValue();
              String akey = fields.getKey();
              System.out.println(akey);
              if(akey.equals("position type")) {
                  if (avalue.contains("Data")) { //this solves getting a search from all.
                      System.out.println(post);
                      break;
                  }
              }

              System.out.println("Not find");
              }
          }

      }
    }
