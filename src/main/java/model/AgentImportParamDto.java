package model;

import java.util.Arrays;
import java.util.List;

public class AgentImportParamDto {

    private String sessionKey;
    private Boolean isAll;
    private String[] ids;
    private List<String> lstStr;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Boolean getIsAll() {
        return isAll;
    }

    public void setIsAll(Boolean isAll) {
        this.isAll = isAll;
    }

    public String[] getIds() {
        return ids;
    }

    public void setIds(String[] ids) {
        this.ids =  Arrays.copyOf(ids, ids.length);
    }
}
