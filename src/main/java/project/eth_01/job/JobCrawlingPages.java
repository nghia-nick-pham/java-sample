package project.eth_01.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import project.eth_01.common.ExceptionUtil;
import project.eth_01.crawler.Crawler;
import project.eth_01.model.Transaction;
import project.eth_01.service.CrawlingPages;

import java.util.ArrayList;
import java.util.List;

public class JobCrawlingPages implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        List<Transaction> lstTran = new ArrayList<>();

        try{
            lstTran = Crawler.CrawlDataList(10,5);
            CrawlingPages.doMain(lstTran);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
