package java_string.regex;

import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "Hi\n" +
                "\n" +
                "Best Regards,\n" +
                "Nghia Van Pham\n" +
                "Java Developer, Java Apps Team VN\n" +
                "\n" +
                "------------------------------------------\n" +
                "E-mail:       nvpham@codix.eu\n" +
                "Mobile:       +84 989 967 006\n" +
                "Main Office: +33 4 89 87 77 77\n" +
                "Fax :            +33 4 89 87 77 00\n" +
                "\n" +
                "-----Original Message-----\n" +
                "From: Nghia Van Pham \n" +
                "Sent: Thursday, December 23, 2021 3:51 PM\n" +
                "To: 'MOLOM@cupid.codixfr.private' <MOLOM@cupid.codixfr.private>\n" +
                "Subject: Atradius Collections Nb. 1901010002 DEBTORUPLOAD20/CL AUTO\n" +
                "\n" +
                "From: JONKERS Timo\n" +
                "\n" +
                " \n" +
                "\n" +
                "Sent: vendredi 26 novembre 2021 10:41\n" +
                "\n" +
                "To: BELMANS Petra <Petra.BELMANS@atradius.com>; VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>\n" +
                "\n" +
                "Cc: t.jonkers.collect@atradius.com\n" +
                "\n" +
                "Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Dag Petra,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Inderdaad, ik heb de betaling van november nog niet in het dossier geboekt.\n" +
                "\n" +
                "Ik heb dat aan claims doorgegeven.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Van zodra het bedrag aangepast is, zal ik het afbetalingsplan bevestigen.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Groeten,\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Timo Jonkers\n" +
                "\n" +
                "Collector\n" +
                "\n" +
                "I\n" +
                "\n" +
                "Operations\n" +
                "\n" +
                "Atradius Collections B.V.\n" +
                "\n" +
                "Avenue Prince de Liège 78, 5100 Namur \n" +
                "\n" +
                "I Belgium\n" +
                "\n" +
                "Phone: +32 (0)81 324 226\n" +
                "\n" +
                "timo.jonkers@atradius.com\n" +
                "\n" +
                "I\n" +
                "\n" +
                "www.atradiuscollections.com\n" +
                "\n" +
                " \n" +
                "\n" +
                "Connect with Atradius Collections on\n" +
                "\n" +
                "Twitter:\n" +
                "\n" +
                " \n" +
                "\n" +
                "@atradiuscollect | YouTube:\n" +
                "\n" +
                "atradiuscollections | LinkedIn:\n" +
                "\n" +
                "Atradius-Collections\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Madame, Monsieur,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Le Règlement Général sur la Protection des Données (RGPD) est d’application depuis 2018 et vous octroie davantage de droits en matière de vie privée. Vous recevez cet e-mail car Atradius Collections traite vos données personnelles dans le cadre de notre service\n" +
                "\n" +
                "de recouvrement des créances. Pour obtenir un aperçu complet de vos droits et la manière dont nous pouvons utiliser vos données personnelles, cliquez\n" +
                "\n" +
                "ici pour consulte notre politique de confidentialité.\n" +
                "\n" +
                "Nous nous engageons à utiliser vos données personnelles conformément à notre accord ainsi qu'à notre politique de confidentialité.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Geachte mevrouw, geachte heer, De Algemene Verordening Gegevensbescherming ('GDPR') is van toepassing sinds 2018 en verleent\n" +
                "\n" +
                "u aanvullende rechten met betrekking tot uw privacy. U ontvangt deze e-mail omdat Atradius Collections uw persoonlijke gegevens verwerkt in het kader van de incassodiensten die zij aan uw bedrijf verleent. Voor een volledig overzicht van uw rechten en hoe\n" +
                "\n" +
                "wij uw persoonlijke gegevens kunnen gebruiken, vindt u hier\n" +
                "\n" +
                "ons privacybeleid.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "From: BELMANS Petra <Petra.BELMANS@atradius.com>\n" +
                "\n" +
                " \n" +
                "\n" +
                "Sent: vendredi 26 novembre 2021 10:15\n" +
                "\n" +
                "To: VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>; JONKERS Timo <Timo.JONKERS@atradius.com>\n" +
                "\n" +
                "Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Dag Steven,\n" +
                "\n" +
                "Dag Timo,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Even een update in dit dossier qua betalingen.\n" +
                "\n" +
                "Verzekerde laat nog weten dat ze naast de betaling van 1500 in oktober ook rechtstreeks 1500 EUR ontvangen hebben van de klant per 10/11\n" +
                "\n" +
                "Fèten heeft het aan Timo laten weten, maar het claimsdossier is nog niet bijgewerkt.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Verzekerde bevestigt me dat het saldo dus nu 4220.02 EUR is\n" +
                "\n" +
                " \n" +
                "\n" +
                "Ze komen echter ook terug op hun vraag:\n" +
                "\n" +
                "Debiteur laat weten dat alles vooraf betalen toch niet mogelijk is.\n" +
                "\n" +
                "Hij zou het afbetalingsplan willen laten lopen\n" +
                "\n" +
                "11/12    1500\n" +
                "\n" +
                "11/01    1500    \n" +
                "\n" +
                " \n" +
                "\n" +
                "11/2      1500    \n" +
                "\n" +
                " \n" +
                "\n" +
                "11/3      saldo\n" +
                "\n" +
                " \n" +
                "\n" +
                "En het order in bijlage nu al vooruitbetalen.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Steven, kan je hiermee akkoord gaan?\n" +
                "\n" +
                " \n" +
                "\n" +
                "Timo, ik denk dat het bedrag van 6948.39€ dat jij me had meegedeeld geen rekening houdt met de betaling in november…\n" +
                "\n" +
                " \n" +
                "\n" +
                "Graag nog even nakijken.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "met vriendelijke groeten, kind regards, cordialement,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Petra\n" +
                "\n" +
                " \n" +
                "\n" +
                "Petra Belmans (niet\n" +
                "\n" +
                "aanwezig op woensdag)\n" +
                "\n" +
                "Senior Account Executive\n" +
                "\n" +
                "/ Customer Service Center\n" +
                "\n" +
                "Atradius Crédito y Caución S.A. de Seguros y Reaseguros\n" +
                "\n" +
                "T: +32 (0)3 213 42 93\n" +
                "\n" +
                "F: +32 (0)3 226 50 66\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "From: BELMANS Petra\n" +
                "\n" +
                " \n" +
                "\n" +
                "Sent: donderdag 25 november 2021 16:07\n" +
                "\n" +
                "To: VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>\n" +
                "\n" +
                "Cc: SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "\n" +
                "Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Goedemiddag Steven,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Zie hieronder de vraag van verzekerde en de offerte in bijlage die alvast werd opgemaakt.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Deze debiteur wil een nieuwe bestelling plaatsen, maar alvorens hier op in te gaan had ik graag het standpunt van Atradius willen weten.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Mogen wij vragen aan de debiteur om het resterende saldo van factuur 910209880 te betalen plus de bijkomende kosten en intresten en een voorafbetaling voor het nieuwe order?\n" +
                "\n" +
                " \n" +
                "\n" +
                "Uiteraard mogen zij dit vragen aan debiteur, maar gaan we hiermee akkoord?\n" +
                "\n" +
                " \n" +
                "\n" +
                "met vriendelijke groeten, kind regards, cordialement,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Petra\n" +
                "\n" +
                " \n" +
                "\n" +
                "Petra Belmans (niet aanwezig op woensdag)\n" +
                "\n" +
                "Senior Account Executive / Customer Service Center\n" +
                "\n" +
                "Atradius Crédito y Caución S.A. de Seguros y Reaseguros\n" +
                "\n" +
                "T: +32 (0)3 213 42 93\n" +
                "\n" +
                "F: +32 (0)3 226 50 66\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "-----Original Message-----\n" +
                "\n" +
                "From: Feten.Najem@sew-eurodrive.be <Feten.Najem@sew-eurodrive.be>\n" +
                "\n" +
                " \n" +
                "\n" +
                "Sent: donderdag 25 november 2021 15:53\n" +
                "\n" +
                "To: BELMANS Petra <Petra.BELMANS@atradius.com>\n" +
                "\n" +
                "Cc: philip.stoop@receivium.be;\n" +
                "\n" +
                "Berten.Thys@sew-eurodrive.be; SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "\n" +
                "Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                " \n" +
                "\n" +
                "Hallo Petra,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Het gaat louter om een prijsaanvraag. We hebben nog geen definitieve bestelling ontvangen.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Alvorens dit te aanvaarden wou ik me toch graag even informeren wat de mogelijkheden zijn.\n" +
                "\n" +
                " \n" +
                "\n" +
                "In bijlage kan u alvast de offerte terugvinden.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Très sincèrement vôtre,\n" +
                "\n" +
                "Met vriendelijke groeten,\n" +
                "\n" +
                "Best regards,\n" +
                "\n" +
                "Mit freundlichen Gruessen,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Fèten Najem,\n" +
                "\n" +
                "Accountant\n" +
                "\n" +
                "SEW-EURODRIVE n.v./s.a.\n" +
                "\n" +
                "Direct Phone : +32(0)16.386.362\n" +
                "\n" +
                "Fax : +32(0)16.386.336\n" +
                "\n" +
                "http://www.sew-eurodrive.be\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "-----Original Message-----\n" +
                "\n" +
                "From: BELMANS Petra <Petra.BELMANS@atradius.com>\n" +
                "\n" +
                " \n" +
                "\n" +
                "Sent: jeudi 25 novembre 2021 15:38\n" +
                "\n" +
                "To: Najem, Fèten <Feten.Najem@sew-eurodrive.be>; SUYKENS-DE\n" +
                "\n" +
                "LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "\n" +
                "Cc: philip.stoop@receivium.be; Thys, Berten <Berten.Thys@sew-eurodrive.be>\n" +
                "\n" +
                "Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                " \n" +
                "\n" +
                "Goedemiddag Fèten,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Kan je een kopie van het order bezorgen, zodat we weten over hoeveel het gaat.\n" +
                "\n" +
                "Wanneer zou de levering plaatsvinden?\n" +
                "\n" +
                " \n" +
                "\n" +
                "Alvast bedankt !\n" +
                "\n" +
                " \n" +
                "\n" +
                "met vriendelijke groeten, kind regards, cordialement,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Petra\n" +
                "\n" +
                " \n" +
                "\n" +
                "Petra Belmans (niet aanwezig op woensdag)\n" +
                "\n" +
                "Senior Account Executive / Customer Service Center\n" +
                "\n" +
                "Atradius Crédito y Caución S.A. de Seguros y Reaseguros\n" +
                "\n" +
                "T: +32 (0)3 213 42 93\n" +
                "\n" +
                "F: +32 (0)3 226 50 66\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "-----Original Message-----\n" +
                "\n" +
                "From: Feten.Najem@sew-eurodrive.be <Feten.Najem@sew-eurodrive.be>\n" +
                "\n" +
                " \n" +
                "\n" +
                "Sent: donderdag 25 november 2021 11:24\n" +
                "\n" +
                "To: SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "\n" +
                "Cc: philip.stoop@receivium.be;\n" +
                "\n" +
                "Berten.Thys@sew-eurodrive.be\n" +
                "\n" +
                "Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                " \n" +
                "\n" +
                "CAUTION: This email originated from outside of Atradius. Do not click links or open attachments unless you recognize the sender and know the content is safe.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Hallo Liesbet,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Deze debiteur wil een nieuwe bestelling plaatsen, maar alvorens hier op in te gaan had ik graag het standpunt van Atradius willen weten.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Mogen wij vragen aan de debiteur om het resterende saldo van factuur 910209880 te betalen plus de bijkomende kosten en intresten en een voorafbetaling voor het nieuwe order?\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Très sincèrement vôtre,\n" +
                "\n" +
                "Met vriendelijke groeten,\n" +
                "\n" +
                "Best regards,\n" +
                "\n" +
                "Mit freundlichen Gruessen,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Fèten Najem,\n" +
                "\n" +
                "Accountant\n" +
                "\n" +
                "SEW-EURODRIVE n.v./s.a.\n" +
                "\n" +
                "Direct Phone : +32(0)16.386.362\n" +
                "\n" +
                "Fax : +32(0)16.386.336\n" +
                "\n" +
                "http://www.sew-eurodrive.be\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "-----Original Message-----\n" +
                "\n" +
                "From: documents.atradiusBE@atradius.com\n" +
                "\n" +
                "<documents.atradiusBE@atradius.com>\n" +
                "\n" +
                " \n" +
                "\n" +
                "Sent: jeudi 21 octobre 2021 11:57\n" +
                "\n" +
                "To: Najem, Fèten <Feten.Najem@sew-eurodrive.be>\n" +
                "\n" +
                "Subject: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                " \n" +
                "\n" +
                "Please find attached documents relating to your Atradius policy. Please do not reply to this email. If you need to speak to us regarding the document(s) please contact your usual Atradius contact. The details can be\n" +
                "\n" +
                "found on the attached document.\n" +
                "\n" +
                " \n" +
                "\n" +
                "****************************************\n" +
                "\n" +
                "The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information\n" +
                "\n" +
                "about the main registration details of Atradius Group offices in your country, please visit\n" +
                "\n" +
                "https://group.atradius.com/contact-us/\n" +
                "\n" +
                " \n" +
                "\n" +
                "Important Notice\n" +
                "\n" +
                "This e-mail, including any and all attachments, is intended for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure\n" +
                "\n" +
                "of the content of this email is not permitted, unless expressly otherwise indicated in the email by the Atradius contact person. If you are not the intended recipient of this email and its contents, please notify the sender immediately by reply email and delete\n" +
                "\n" +
                "this email and all its attachments subsequently. Although this email and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of the recipient\n" +
                "\n" +
                "to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. Email received by Atradius Group ca";
        String s2 = "n be stored for business purposes.\n" +
                "\n" +
                "****************************************\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "<p></p>\n" +
                "\n" +
                " \n" +
                "\n" +
                "****************************************\n" +
                "\n" +
                "TVA/ BTW: BE 0661.624.528\n" +
                "\n" +
                "RPM Namur /  RPR Namen\n" +
                "\n" +
                "Siège social / Hoofdzetel: Paseo de la Castellana 4\n" +
                "\n" +
                "28046 Madrid (ES)\n" +
                "\n" +
                "Registre du commerce / Handelsregister Madrid M-171.144\n" +
                "\n" +
                " \n" +
                "\n" +
                "The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information\n" +
                "\n" +
                "about the main registration details of Atradius Group offices in your country please visit\n" +
                "\n" +
                "https://group.atradius.com/contact-us/\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Important Notice\n" +
                "\n" +
                "This e-mail, including any and all attachments, is intended for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure\n" +
                "\n" +
                "of the content of this e-mail is not permitted, unless expressly otherwise indicated in the e-mail by the Atradius contact person. If you are not the intended recipient of this e-mail and its contents, please notify the sender immediately by reply e-mail and\n" +
                "\n" +
                "delete this e-mail and all its attachments subsequently. Although this e-mail and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of\n" +
                "\n" +
                "the recipient to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. E-mail received by Atradius Group can be stored for business purposes.\n" +
                "\n" +
                "****************************************\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "<p></p>\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information about the main registration details of Atradius Group offices in your country, please visit https://group.atradius.com/contact-us/Important Notice\n" +
                "\n" +
                "                        This e-mail, including any and all attachments, is intended for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure of the content of this email is not permitted, unless expressly otherwise indicated in the email by the Atradius contact person. If you are not the intended recipient of this email and its contents, please notify the sender immediately by reply email and delete this email and all its attachments subsequently. Although this email and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of the recipient to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. Email received by Atradius Group can be stored for business purposes.";


        String s3 = "Hello World";
        System.out.println(isHtml(s1));
    }

    private static boolean isHtml(String s) {
        boolean ret=false;
        Pattern htmlPattern = Pattern.compile("(?s).*?<(\\S+?)[^>]*>.*?</\\1>.*");
        if (s != null) {
            ret=htmlPattern.matcher(s).matches();
        }
        return ret;
    }
}
