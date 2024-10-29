package garbage_collection;

import model.AgentImportParamDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllocationMemoryTest {

    public static void main(String[] args) {

        try {
            AgentImportParamDto[] strsAbc = new AgentImportParamDto[10];

            List<AgentImportParamDto> lst = new ArrayList<>();
            ((ArrayList<AgentImportParamDto>) lst).ensureCapacity(1222222222);

        }catch (OutOfMemoryError e){
//            e.printStackTrace();
            System.out.println("hello");
        }
//        List<AgentImportParamDto> lst = new ArrayList<>(Arrays.asList(strsAbc));


    }
}
