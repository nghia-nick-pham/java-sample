package project.eth_01;

import project.eth_01.crawler.Crawler;
import project.eth_01.job.CronTrigger;
import project.eth_01.job.JobCrawlingFull;
import project.eth_01.job.JobCrawlingPages;
import project.eth_01.model.Transaction;
import project.eth_01.service.CrawlingPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        CronTrigger.triggerCron();
//        if(args[0].isEmpty() || "1".equalsIgnoreCase(args[0])) {
//            JobCrawlingFull.doMain();
//        }else if ("2".equalsIgnoreCase(args[0]) {
//            JobCrawlingPages
//        }

        //Test
//        Crawler.CrawlDataList(10,1);
    }
}
