package java_string.regex;

import java.util.regex.Pattern;

public class Test3 {

    private static boolean isHtml(String s) {

        boolean ret=false;
//        Pattern htmlPattern = Pattern.compile("(?s).*?<(\\S+?)[^>]*>.*?</\\1>.*");
        Pattern htmlPattern = Pattern.compile(".*\\<[^>]+>.*", Pattern.DOTALL);
        if (s != null) {
            ret=htmlPattern.matcher(s).matches();
        }
        return ret;
    }

    public static void main(String[] args) {

//        String s = "=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>     FRA/29062028/01088     125   88   HPOL   INS/27012022/001/FRA   6726170623   6726170623   crCasRfFRAVVV0508_003   00225544   2022-05-13   INS   N   OPN     FAC   2021-02-06   2021-02-06   +   EUR   5066   100   2021-11-15T10:06:44.56   220805031     FAC   2021-02-06   2021-02-06   +   EUR   2033   100   2021-11-15T10:06:44.56   220805032     FAC   2021-02-06   2021-02-06   +   EUR   1032   100   2021-11-15T10:06:44.56   220805033     Vasil   Veselinov   testvv@VAsil.bg     123498755           2022-08-04    ";
        String s1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<ns2:creationOfCollectionOrder xmlns:ns2=\"http://convergence.collection.eulerhermes.com/cvgImx1\">\n" +
                "    <claimCaseReferenceId>FRA/29062778/0791</claimCaseReferenceId>\n" +
                "    <creditInsuranceContract>\n" +
                "        <insuranceContractNumber>125</insuranceContractNumber>\n" +
                "        <insuranceContractExtensionNumber>88</insuranceContractExtensionNumber> \n" +
                "        <creditInsuranceBU>HPOL</creditInsuranceBU>\n" +
                "    </creditInsuranceContract>\n" +
                "    <collectionContractNumber>INS/27012022/001/FRA</collectionContractNumber>\n" +
                "    <creditorEHId>6726170623</creditorEHId>\n" +
                "    <orginalCreditorEHId>6726170623</orginalCreditorEHId>\n" +
                "    <creditorCaseRef>crCasRfFRAVVV0508_003</creditorCaseRef>\n" +
                "    <debtorEhId>00225544</debtorEhId>\n" +
                "    <collectionReceptionOrderDate>2022-05-13</collectionReceptionOrderDate>\n" +
                "    <caseCategory>INS</caseCategory>\n" +
                "    <nonInclusiveCase>N</nonInclusiveCase>\n" +
                "    <claimFileStatus>OPN</claimFileStatus>\n" +
                "  <financialElement>\n" +
                "    <claimType>FAC</claimType>\n" +
                "    <issueDate>2021-02-06</issueDate>\n" +
                "    <dueDate>2021-02-06</dueDate>\n" +
                "    <debitCreditIndicator>+</debitCreditIndicator>\n" +
                "    <initialCurrency>EUR</initialCurrency>\n" +
                "    <dueGrossAmountInInitialCurrency>5038</dueGrossAmountInInitialCurrency>\n" +
                "    <dueVatAmountInInitialCurrency>100</dueVatAmountInInitialCurrency>\n" +
                "    <modificationTimestamp>2021-11-15T10:06:44.56</modificationTimestamp>\n" +
                "    <convergenceInternalFinancialElementId>220805031</convergenceInternalFinancialElementId>\n" +
                "  </financialElement>\n" +
                "  <financialElement>\n" +
                "    <claimType>FAC</claimType>\n" +
                "    <issueDate>2021-02-06</issueDate>\n" +
                "    <dueDate>2021-02-06</dueDate>\n" +
                "    <debitCreditIndicator>+</debitCreditIndicator>\n" +
                "    <initialCurrency>EUR</initialCurrency>\n" +
                "    <dueGrossAmountInInitialCurrency>7789</dueGrossAmountInInitialCurrency>\n" +
                "    <dueVatAmountInInitialCurrency>100</dueVatAmountInInitialCurrency>\n" +
                "    <modificationTimestamp>2021-11-15T10:06:44.56</modificationTimestamp>\n" +
                "    <convergenceInternalFinancialElementId>220805032</convergenceInternalFinancialElementId>\n" +
                "  </financialElement>\n" +
                "  <financialElement>\n" +
                "    <claimType>FAC</claimType>\n" +
                "    <issueDate>2021-02-06</issueDate>\n" +
                "    <dueDate>2021-02-06</dueDate>\n" +
                "    <debitCreditIndicator>+</debitCreditIndicator>\n" +
                "    <initialCurrency>EUR</initialCurrency>\n" +
                "    <dueGrossAmountInInitialCurrency>1407</dueGrossAmountInInitialCurrency>\n" +
                "    <dueVatAmountInInitialCurrency>100</dueVatAmountInInitialCurrency>\n" +
                "    <modificationTimestamp>2021-11-15T10:06:44.56</modificationTimestamp>\n" +
                "    <convergenceInternalFinancialElementId>220805033</convergenceInternalFinancialElementId>\n" +
                "  </financialElement>\n" +
                "  <assessor>\n" +
                "    <lastName>Vasil</lastName>\n" +
                "    <firstName>Veselinov</firstName>\n" +
                "    <email>testvv@VAsil.bg</email>\n" +
                "    <phoneNumber>123498755</phoneNumber>\n" +
                "  </assessor>\n" +
                "  <expectedIndemnificationDate>2022-08-04</expectedIndemnificationDate>\n" +
                "</ns2:creationOfCollectionOrder>";
        System.out.println(isHtml(s1));
    }
}
