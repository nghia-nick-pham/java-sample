package project.eth_01.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import project.eth_01.crawler.Crawler;
import project.eth_01.model.Transaction;
import project.eth_01.service.CrawlingFull;
import project.eth_01.service.CrawlingPages;

import java.util.List;

public class JobCrawlingFull {


    public static void doMain() throws Exception{

        for(int i = 1; i <= 5000; i++) {
            List<Transaction> lstTran = Crawler.CrawlDataOnPage(i);
            CrawlingFull.doMain(lstTran);
            Thread.sleep(1000);
        }

    }

}
