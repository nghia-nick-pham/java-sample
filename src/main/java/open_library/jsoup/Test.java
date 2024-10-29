package open_library.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {

    public static void main(String[] args) throws Exception {

        Document doc = Jsoup.connect("https://etherscan.io/txs?ps=50&p=1").get();
        System.out.println(doc.title());
        Elements newsHeadlines = doc.select("#paywall_mask > table > tbody > tr:nth-child(1) > td > span > a");
        for (Element headline : newsHeadlines) {
                System.out.println("abc");
            System.out.println("%s\n\t%s" +
                    headline.attr("href"));
        }
    }
}
