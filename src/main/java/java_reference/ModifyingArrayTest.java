package java_reference;

import model.AgentImportParamDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModifyingArrayTest {

    public static void main(String[] args) {

        AgentImportParamDto agentImportParamDto = new AgentImportParamDto();

        String[] arrStr = new String[]{"a","b"};

        List<String> lstA = new ArrayList<>();
        lstA.add("a");


        agentImportParamDto.setIds(arrStr);
//        agentImportParamDto.setLstStr(lstA);

        System.out.println(Arrays.toString(agentImportParamDto.getIds()));
//        System.out.println(agentImportParamDto.getLstStr().get(0));

        arrStr[0] = "c";
        lstA.set(0,"b");

        System.out.println(Arrays.toString(agentImportParamDto.getIds()));
//        System.out.println(agentImportParamDto.getLstStr().get(0));

    }
}
