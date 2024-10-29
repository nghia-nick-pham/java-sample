package java_collection.sort;

import java.util.*;

public class MainTest {

    public static void main(String[] args) {
        String arr[]  = {"FRAIS","IMP","SAAS_MOB","SAA_MOB","SYST","ORNT","BL","CLO","CONT","DRG","EAR","FICH","GPH","IRR","PAISP","PREV","PRV","RASR","RASR2","REJET","REJ_FIXE","REJ_MOB","RESIL","REST","SAA","SAAS","SAAS_FIXE","SAA_FIXE","SOL","SUSP","VIP"};
//        String arr[]  = {"AGENDA","CONT_FIXE","CONT_MOB","DRG_FIXE","DRG_MOB","FRAIS","IMP","SAAS_MOB","SAA_MOB","SYST","ORNT","BL","CLO","CONT","DRG","EAR","FICH","GPH","IRR","PAISP","PREV","PRV","RASR","RASR2","REJET","REJ_FIXE","REJ_MOB","RESIL","REST","SAA","SAAS","SAAS_FIXE","SAA_FIXE","SOL","SUSP","VIP"};
        List<String> graphs = new ArrayList<>(Arrays.asList(arr));
        String arrPriority[] = {"ORNT","SYST"};
        List<String> listPriority = Arrays.asList(arrPriority);
        List<String> graphsPriorityTmp = new ArrayList<>();
//        for (String graph: graphs
//             ) {
//            if (listPriority.contains(graph)){
////                graphsPriorityTmp.add(graph);
//                graphs.remove(graph);
//            }
//        }

        //Separate element to priority graphs and graphs
        for (Iterator<String> iter = graphs.listIterator(); iter.hasNext(); ) {
            String graph = iter.next();
            if (listPriority.contains(graph)) {
                graphsPriorityTmp.add(graph);
                iter.remove();
            }
        }

        //sort graph
        Collections.sort(graphs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                o1 = o1 == null ? "" : o1;
                o2 = o2 == null ? "" : o2;
                if ("ORNT".equals(o1))
                    return -1;
                if ("SYST".equals(o1))
                    return -1;
//                if ("ORNT".equals(o1)){
//                    graphs
//                }
                System.out.println(o1.compareTo(o2));
                return o1.compareTo(o2);
            }
        });

        //Merge grapsPriority into graphs
        graphs.addAll(0,graphsPriorityTmp);

        System.out.println(graphs.toString());

    }
}
