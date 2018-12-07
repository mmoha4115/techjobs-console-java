package org.launchcode.techjobs.console;

import java.lang.reflect.Array;
import java.util.*;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a searchTerm:  ");
        String searchTerm = scanner.nextLine();
        System.out.print("Enter a searchField");
        String searchField = scanner.nextLine();
//{position type= name=, employer=DST, location=, core competency=}
        ArrayList<HashMap<String, String>> allJobs = JobData.findAll();
        for (int i = 0; i < allJobs.size(); i++) {
            HashMap<String, String> aJob = allJobs.get(i);
            for (Map.Entry<String, String> afieldOfAJob : aJob.entrySet()) {
                String avalueOfAField = afieldOfAJob.getValue();
                avalueOfAField = avalueOfAField.toLowerCase();
                String aKeyOfAField = afieldOfAJob.getKey();
                if (aKeyOfAField.equals(searchField)) {
                    if (avalueOfAField.contains(searchTerm)) { //this solves getting a search from all.
                        for (Map.Entry<String, String> aFieldOfAJob : aJob.entrySet()) {
                            System.out.println(aFieldOfAJob.getKey() + " : " + aFieldOfAJob.getValue());
                        }
                        System.out.println("\n**********\n");
                        break;
                    }
                }
            }
        }

    }
}

