package project.eth_01.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import project.eth_01.common.Constant;
import project.eth_01.model.Transaction;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;

public class Crawler {

    public static final String url = "https://etherscan.io/txs";
    public static final String paramPS = "?ps=";
    public static final String paramP = "?p=";
    public static final String STR_VALUE_PS_MAX = "100";

    public Crawler() {
    }

    public static Map<String, Transaction> CrawlData(int ps, int p) throws Exception{
        String urlTemp = "";
        Document doc = null;
        Elements elements = null;
        Map<String, Transaction> mapTrans = new HashMap<>();
        for (int i = 1; i <= p; i++) {
            urlTemp = url.concat(paramPS).concat(String.valueOf(ps)).concat(paramP).concat(String.valueOf(p));
            doc = Jsoup.connect(urlTemp).get();
            elements = doc.select("#paywall_mask > table > tbody > tr");
            for (Element ele: elements) {
                String mapKey = "";
                String addressFrom = "";
                try {
                    mapKey = ele.child(1).select("span > a").get(0).text();
//                String addressFrom = Optional.ofNullable(ele.child(6).select("span > a").get(0)).map(Element::text).orElse("N/A");
                    addressFrom = Optional.ofNullable(ele.child(6).select("span > a").get(0)).map(Element::text).orElse("N/A");
                    Transaction tran = new Transaction();
                    tran.setAddressFrom(addressFrom);
                    mapTrans.put(mapKey, tran);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }

        }

        return mapTrans;
    }

    public static List<Transaction> CrawlDataList(int ps, int p) throws Exception{
        String urlTemp = "";
        Document doc = null;
        Elements elements = null;
        List<Transaction> arrTran = new ArrayList<>();

        DateFormat formatter=new SimpleDateFormat(Constant.STR_DATE_PATTERN);

        for (int i = 1; i <= p; i++) {
//            urlTemp = url.concat(paramPS).concat(String.valueOf(ps)).concat(paramP).concat(String.valueOf(i));
            urlTemp = url.concat(paramP).concat(String.valueOf(i));
            doc = Jsoup.connect(urlTemp).get();
            elements = doc.select("#paywall_mask > table > tbody > tr");
            for (Element ele: elements) {
                String txnHash = "";
                String transfer = "";
                String block = "";
                String strAge = "";
                String addressFrom = "";
                String addressTo = "";
                String nameTo = "";
                String value = "";
                String txtFee = "";

                try {
//                    txnHash = ele.child(1).select("span > a").get(0).text();
                    txnHash = ele.child(1).child(0).children().text();
//                String addressFrom = Optional.ofNullable(ele.child(6).select("span > a").get(0)).map(Element::text).orElse("N/A");
                    transfer = ele.child(2).children().text();
                    block = ele.child(3).children().text();
                    strAge = ele.selectFirst("td.showDate").children().text();
                    addressFrom = ele.child(6).child(0).children().text();
                    addressTo = ele.child(8).select("a").attr("href");
                    value = ele.child(9).text();
                    txtFee = ele.child(10).children().text();
                    Transaction tran = new Transaction();
                    tran.setTxnHash(txnHash);
                    tran.setMethod(transfer);
                    tran.setBlock(block);
                    tran.setAge(formatter.parse(strAge));
                    tran.setAddressFrom(addressFrom);
                    tran.setAddressTo(addressTo!=null&&!addressTo.isEmpty()?addressTo.replaceAll("/address/",""):"");
                    tran.setValue(value!=null&&!value.isEmpty()? new BigDecimal(value.replaceAll(" Ether","")):BigDecimal.ZERO);
                    tran.setTxnFee(txtFee!=null&&!txtFee.isEmpty()? new BigDecimal(txtFee):BigDecimal.ZERO);
//                    System.out.println(txnHash);
                    arrTran.add(tran);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            //ignore DDOS
            Thread.sleep(1000);

        }

        return arrTran;
    }

    public static List<Transaction> CrawlDataOnPage(int page) throws Exception{
        String urlTemp = "";
        Document doc = null;
        Elements elements = null;
        DateFormat formatter=new SimpleDateFormat(Constant.STR_DATE_PATTERN);

        List<Transaction> arrTran = new ArrayList<>();
        urlTemp = url.concat(paramPS).concat(STR_VALUE_PS_MAX).concat(paramP).concat(String.valueOf(page));
        doc = Jsoup.connect(urlTemp).get();
        elements = doc.select("#paywall_mask > table > tbody > tr");
        for (Element ele: elements) {
            String txnHash = "";
            String transfer = "";
            String block = "";
            String strAge = "";
            String addressFrom = "";
            String addressTo = "";
            String nameTo = "";
            String value = "";
            String txtFee = "";

            try {
//                    txnHash = ele.child(1).select("span > a").get(0).text();
                txnHash = ele.child(1).child(0).children().text();
//                String addressFrom = Optional.ofNullable(ele.child(6).select("span > a").get(0)).map(Element::text).orElse("N/A");
                transfer = ele.child(2).children().text();
                block = ele.child(3).children().text();
                strAge = ele.selectFirst("td.showDate").children().text();
                addressFrom = ele.child(6).child(0).children().text();
                addressTo = ele.child(8).select("a").attr("href");
                value = ele.child(9).text();
                txtFee = ele.child(10).children().text();
                Transaction tran = new Transaction();
                tran.setTxnHash(txnHash);
                tran.setMethod(transfer);
                tran.setBlock(block);
                tran.setAge(formatter.parse(strAge));
                tran.setAddressFrom(addressFrom);
                tran.setAddressTo(addressTo!=null&&!addressTo.isEmpty()?addressTo.replaceAll("/address/",""):"");
                tran.setValue(value!=null&&!value.isEmpty()? new BigDecimal(value.replaceAll(" Ether","")):BigDecimal.ZERO);
                tran.setTxnFee(txtFee!=null&&!txtFee.isEmpty()? new BigDecimal(txtFee):BigDecimal.ZERO);
                    System.out.println(tran.getValue());
                arrTran.add(tran);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return arrTran;
    }
}
