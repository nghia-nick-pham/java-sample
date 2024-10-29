package project.eth_01.job;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class CronTrigger {
    public static void triggerCron() throws Exception {
        JobDetail job = JobBuilder.newJob(JobCrawlingPages.class)
                .withIdentity("dummyJobName", "group1").build();
        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("dummyTriggerName", "group1")
                .withSchedule(
                        SimpleScheduleBuilder.simpleSchedule()
                                .withIntervalInSeconds(20).repeatForever())
                .build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
    }
}
