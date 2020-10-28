package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarOutputStream;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        //Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : "+topCompanies.isEmpty());

        topCompanies.add("google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        //Find thr size of an ArrayList
        System.out.println("here are the top "+topCompanies.size()+ "Companies in the world");
        System.out.println(topCompanies);
        //retrieve the element at a give index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() -1);

        System.out.println("Best Company: "+bestCompany);
        System.out.println("Second Best Company: "+secondBestCompany);
        System.out.println("Last Company in the list: "+lastCompany);
        //Modify the element at a given index
        topCompanies.set(4,"Walmart");
        System.out.println("Modified top companies list: "+topCompanies);
    }
}
