package java_string;

public class MaxCharater {

    public static void main(String[] args) {
        String text = "From: JONKERS Timo\n" +
                "\n" +
                "Sent: vendredi 26 novembre 2021 10:41\n" +
                "To: BELMANS Petra <Petra.BELMANS@atradius.com>; VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>\n" +
                "Cc: t.jonkers.collect@atradius.com\n" +
                "Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                "\n" +
                " \n" +
                "Dag Petra,\n" +
                " \n" +
                "Inderdaad, ik heb de betaling van november nog niet in het dossier geboekt.\n" +
                "Ik heb dat aan claims doorgegeven.\n" +
                " \n" +
                "Van zodra het bedrag aangepast is, zal ik het afbetalingsplan bevestigen.\n" +
                " \n" +
                "Groeten,\n" +
                " \n" +
                " \n" +
                "\n" +
                "Timo Jonkers\n" +
                "Collector\n" +
                "I\n" +
                "Operations\n" +
                "Atradius Collections B.V.\n" +
                "Avenue Prince de Liège 78, 5100 Namur \n" +
                "I Belgium\n" +
                "Phone: +32 (0)81 324 226\n" +
                "timo.jonkers@atradius.com\n" +
                "I\n" +
                "www.atradiuscollections.com\n" +
                "\n" +
                "Connect with Atradius Collections on\n" +
                "Twitter:\n" +
                "\n" +
                "@atradiuscollect | YouTube:\n" +
                "atradiuscollections | LinkedIn:\n" +
                "Atradius-Collections\n" +
                " \n" +
                " \n" +
                "\n" +
                " \n" +
                " \n" +
                "Madame, Monsieur,\n" +
                "\n" +
                "Le Règlement Général sur la Protection des Données (RGPD) est d’application depuis 2018 et vous octroie davantage de droits en matière de vie privée. Vous recevez cet e-mail car Atradius Collections traite vos données personnelles dans le cadre de notre service\n" +
                " de recouvrement des créances. Pour obtenir un aperçu complet de vos droits et la manière dont nous pouvons utiliser vos données personnelles, cliquez\n" +
                "ici pour consulte notre politique de confidentialité.\n" +
                "Nous nous engageons à utiliser vos données personnelles conformément à notre accord ainsi qu'à notre politique de confidentialité.\n" +
                " \n" +
                "Geachte mevrouw, geachte heer, De Algemene Verordening Gegevensbescherming ('GDPR') is van toepassing sinds 2018 en verleent\n" +
                " u aanvullende rechten met betrekking tot uw privacy. U ontvangt deze e-mail omdat Atradius Collections uw persoonlijke gegevens verwerkt in het kader van de incassodiensten die zij aan uw bedrijf verleent. Voor een volledig overzicht van uw rechten en hoe\n" +
                " wij uw persoonlijke gegevens kunnen gebruiken, vindt u hier\n" +
                " ons privacybeleid. \n" +
                "\n" +
                " \n" +
                "\n" +
                "\n" +
                "From: BELMANS Petra <Petra.BELMANS@atradius.com>\n" +
                "\n" +
                "Sent: vendredi 26 novembre 2021 10:15\n" +
                "To: VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>; JONKERS Timo <Timo.JONKERS@atradius.com>\n" +
                "Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                "\n" +
                " \n" +
                "Dag Steven,\n" +
                "Dag Timo,\n" +
                " \n" +
                "Even een update in dit dossier qua betalingen.\n" +
                "Verzekerde laat nog weten dat ze naast de betaling van 1500 in oktober ook rechtstreeks 1500 EUR ontvangen hebben van de klant per 10/11\n" +
                "Fèten heeft het aan Timo laten weten, maar het claimsdossier is nog niet bijgewerkt.\n" +
                " \n" +
                "Verzekerde bevestigt me dat het saldo dus nu 4220.02 EUR is\n" +
                " \n" +
                "Ze komen echter ook terug op hun vraag:\n" +
                "Debiteur laat weten dat alles vooraf betalen toch niet mogelijk is.\n" +
                "Hij zou het afbetalingsplan willen laten lopen\n" +
                "11/12    1500\n" +
                "11/01    1500    \n" +
                "\n" +
                "11/2      1500    \n" +
                "\n" +
                "11/3      saldo\n" +
                " \n" +
                "En het order in bijlage nu al vooruitbetalen.\n" +
                " \n" +
                "Steven, kan je hiermee akkoord gaan?\n" +
                " \n" +
                "Timo, ik denk dat het bedrag van 6948.39€ dat jij me had meegedeeld geen rekening houdt met de betaling in november…\n" +
                " \n" +
                "Graag nog even nakijken.\n" +
                " \n" +
                "\n" +
                "met vriendelijke groeten, kind regards, cordialement,\n" +
                "\n" +
                "Petra\n" +
                " \n" +
                "Petra Belmans (niet\n" +
                " aanwezig op woensdag)\n" +
                "Senior Account Executive\n" +
                " / Customer Service Center\n" +
                "Atradius Crédito y Caución S.A. de Seguros y Reaseguros\n" +
                "T: +32 (0)3 213 42 93\n" +
                "F: +32 (0)3 226 50 66\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "\n" +
                "From: BELMANS Petra\n" +
                "\n" +
                "Sent: donderdag 25 november 2021 16:07\n" +
                "To: VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>\n" +
                "Cc: SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                "\n" +
                " \n" +
                "Goedemiddag Steven,\n" +
                " \n" +
                "Zie hieronder de vraag van verzekerde en de offerte in bijlage die alvast werd opgemaakt.\n" +
                " \n" +
                "Deze debiteur wil een nieuwe bestelling plaatsen, maar alvorens hier op in te gaan had ik graag het standpunt van Atradius willen weten.\n" +
                " \n" +
                "Mogen wij vragen aan de debiteur om het resterende saldo van factuur 910209880 te betalen plus de bijkomende kosten en intresten en een voorafbetaling voor het nieuwe order?\n" +
                " \n" +
                "Uiteraard mogen zij dit vragen aan debiteur, maar gaan we hiermee akkoord?\n" +
                " \n" +
                "met vriendelijke groeten, kind regards, cordialement,\n" +
                "\n" +
                "Petra\n" +
                " \n" +
                "Petra Belmans (niet aanwezig op woensdag)\n" +
                "Senior Account Executive / Customer Service Center\n" +
                "Atradius Crédito y Caución S.A. de Seguros y Reaseguros\n" +
                "T: +32 (0)3 213 42 93\n" +
                "F: +32 (0)3 226 50 66\n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                "-----Original Message-----\n" +
                "From: Feten.Najem@sew-eurodrive.be <Feten.Najem@sew-eurodrive.be>\n" +
                "\n" +
                "Sent: donderdag 25 november 2021 15:53\n" +
                "To: BELMANS Petra <Petra.BELMANS@atradius.com>\n" +
                "Cc: philip.stoop@receivium.be;\n" +
                "Berten.Thys@sew-eurodrive.be; SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                " \n" +
                "Hallo Petra,\n" +
                " \n" +
                "Het gaat louter om een prijsaanvraag. We hebben nog geen definitieve bestelling ontvangen.\n" +
                " \n" +
                "Alvorens dit te aanvaarden wou ik me toch graag even informeren wat de mogelijkheden zijn.\n" +
                " \n" +
                "In bijlage kan u alvast de offerte terugvinden.\n" +
                " \n" +
                "Très sincèrement vôtre,\n" +
                "Met vriendelijke groeten,\n" +
                "Best regards,\n" +
                "Mit freundlichen Gruessen,\n" +
                " \n" +
                "Fèten Najem,\n" +
                "Accountant\n" +
                "SEW-EURODRIVE n.v./s.a.\n" +
                "Direct Phone : +32(0)16.386.362 \n" +
                "Fax : +32(0)16.386.336\n" +
                "http://www.sew-eurodrive.be\n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                "-----Original Message-----\n" +
                "From: BELMANS Petra <Petra.BELMANS@atradius.com>\n" +
                "\n" +
                "Sent: jeudi 25 novembre 2021 15:38\n" +
                "To: Najem, Fèten <Feten.Najem@sew-eurodrive.be>; SUYKENS-DE\n" +
                " LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "Cc: philip.stoop@receivium.be; Thys, Berten <Berten.Thys@sew-eurodrive.be>\n" +
                "Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                " \n" +
                "Goedemiddag Fèten,\n" +
                " \n" +
                "Kan je een kopie van het order bezorgen, zodat we weten over hoeveel het gaat.\n" +
                "Wanneer zou de levering plaatsvinden?\n" +
                " \n" +
                "Alvast bedankt !\n" +
                " \n" +
                "met vriendelijke groeten, kind regards, cordialement,\n" +
                "\n" +
                "Petra\n" +
                " \n" +
                "Petra Belmans (niet aanwezig op woensdag)\n" +
                "Senior Account Executive / Customer Service Center\n" +
                "Atradius Crédito y Caución S.A. de Seguros y Reaseguros\n" +
                "T: +32 (0)3 213 42 93\n" +
                "F: +32 (0)3 226 50 66\n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                "-----Original Message-----\n" +
                "From: Feten.Najem@sew-eurodrive.be <Feten.Najem@sew-eurodrive.be>\n" +
                "\n" +
                "Sent: donderdag 25 november 2021 11:24\n" +
                "To: SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "Cc: philip.stoop@receivium.be;\n" +
                "Berten.Thys@sew-eurodrive.be\n" +
                "Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                " \n" +
                "CAUTION: This email originated from outside of Atradius. Do not click links or open attachments unless you recognize the sender and know the content is safe.\n" +
                " \n" +
                " \n" +
                "Hallo Liesbet,\n" +
                " \n" +
                "Deze debiteur wil een nieuwe bestelling plaatsen, maar alvorens hier op in te gaan had ik graag het standpunt van Atradius willen weten.\n" +
                " \n" +
                "Mogen wij vragen aan de debiteur om het resterende saldo van factuur 910209880 te betalen plus de bijkomende kosten en intresten en een voorafbetaling voor het nieuwe order?\n" +
                " \n" +
                " \n" +
                "Très sincèrement vôtre,\n" +
                "Met vriendelijke groeten,\n" +
                "Best regards,\n" +
                "Mit freundlichen Gruessen,\n" +
                " \n" +
                "Fèten Najem,\n" +
                "Accountant\n" +
                "SEW-EURODRIVE n.v./s.a.\n" +
                "Direct Phone : +32(0)16.386.362 \n" +
                "Fax : +32(0)16.386.336\n" +
                "http://www.sew-eurodrive.be\n" +
                " \n" +
                " \n" +
                " \n" +
                "-----Original Message-----\n" +
                "From: documents.atradiusBE@atradius.com\n" +
                " <documents.atradiusBE@atradius.com>\n" +
                "\n" +
                "Sent: jeudi 21 octobre 2021 11:57\n" +
                "To: Najem, Fèten <Feten.Najem@sew-eurodrive.be>\n" +
                "Subject: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                " \n" +
                "Please find attached documents relating to your Atradius policy. Please do not reply to this email. If you need to speak to us regarding the document(s) please contact your usual Atradius contact. The details can be\n" +
                " found on the attached document.\n" +
                " \n" +
                "****************************************\n" +
                "The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information\n" +
                " about the main registration details of Atradius Group offices in your country, please visit\n" +
                "https://group.atradius.com/contact-us/\n" +
                " \n" +
                "Important Notice\n" +
                "This e-mail, including any and all attachments, is intended for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure\n" +
                " of the content of this email is not permitted, unless expressly otherwise indicated in the email by the Atradius contact person. If you are not the intended recipient of this email and its contents, please notify the sender immediately by reply email and delete\n" +
                " this email and all its attachments subsequently. Although this email and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of the recipient\n" +
                " to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. Email received by Atradius Group can be stored for business purposes.\n" +
                "****************************************\n" +
                " \n" +
                " \n" +
                "<p></p>\n" +
                " \n" +
                "****************************************\n" +
                "TVA/ BTW: BE 0661.624.528\n" +
                "RPM Namur /  RPR Namen \n" +
                "Siège social / Hoofdzetel: Paseo de la Castellana 4\n" +
                "28046 Madrid (ES)\n" +
                "Registre du commerce / Handelsregister Madrid M-171.144\n" +
                " \n" +
                "The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information\n" +
                " about the main registration details of Atradius Group offices in your country please visit\n" +
                "https://group.atradius.com/contact-us/\n" +
                "\n" +
                " \n" +
                "Important Notice\n" +
                "This e-mail, including any and all attachments, is inten\n" +
                "HTML !!!!!!!!\n" +
                "encodeImageTag().replaced =  \n" +
                "\n" +
                "\n" +
                "From: JONKERS Timo\n" +
                "\n" +
                "Sent: vendredi 26 novembre 2021 10:41\n" +
                "To: BELMANS Petra <Petra.BELMANS@atradius.com>; VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>\n" +
                "Cc: t.jonkers.collect@atradius.com\n" +
                "Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                "\n" +
                " \n" +
                "Dag Petra,\n" +
                " \n" +
                "Inderdaad, ik heb de betaling van november nog niet in het dossier geboekt.\n" +
                "Ik heb dat aan claims doorgegeven.\n" +
                " \n" +
                "Van zodra het bedrag aangepast is, zal ik het afbetalingsplan bevestigen.\n" +
                " \n" +
                "Groeten,\n" +
                " \n" +
                " \n" +
                "\n" +
                "Timo Jonkers\n" +
                "Collector\n" +
                "I\n" +
                "Operations\n" +
                "Atradius Collections B.V.\n" +
                "Avenue Prince de Liège 78, 5100 Namur \n" +
                "I Belgium\n" +
                "Phone: +32 (0)81 324 226\n" +
                "timo.jonkers@atradius.com\n" +
                "I\n" +
                "www.atradiuscollections.com\n" +
                "\n" +
                "Connect with Atradius Collections on\n" +
                "Twitter:\n" +
                "\n" +
                "@atradiuscollect | YouTube:\n" +
                "atradiuscollections | LinkedIn:\n" +
                "Atradius-Collections\n" +
                " \n" +
                " \n" +
                "\n" +
                " \n" +
                " \n" +
                "Madame, Monsieur,\n" +
                "\n" +
                "Le Règlement Général sur la Protection des Données (RGPD) est d’application depuis 2018 et vous octroie davantage de droits en matière de vie privée. Vous recevez cet e-mail car Atradius Collections traite vos données personnelles dans le cadre de notre service\n" +
                " de recouvrement des créances. Pour obtenir un aperçu complet de vos droits et la manière dont nous pouvons utiliser vos données personnelles, cliquez\n" +
                "ici pour consulte notre politique de confidentialité.\n" +
                "Nous nous engageons à utiliser vos données personnelles conformément à notre accord ainsi qu'à notre politique de confidentialité.\n" +
                " \n" +
                "Geachte mevrouw, geachte heer, De Algemene Verordening Gegevensbescherming ('GDPR') is van toepassing sinds 2018 en verleent\n" +
                " u aanvullende rechten met betrekking tot uw privacy. U ontvangt deze e-mail omdat Atradius Collections uw persoonlijke gegevens verwerkt in het kader van de incassodiensten die zij aan uw bedrijf verleent. Voor een volledig overzicht van uw rechten en hoe\n" +
                " wij uw persoonlijke gegevens kunnen gebruiken, vindt u hier\n" +
                " ons privacybeleid. \n" +
                "\n" +
                " \n" +
                "\n" +
                "\n" +
                "From: BELMANS Petra <Petra.BELMANS@atradius.com>\n" +
                "\n" +
                "Sent: vendredi 26 novembre 2021 10:15\n" +
                "To: VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>; JONKERS Timo <Timo.JONKERS@atradius.com>\n" +
                "Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                "\n" +
                " \n" +
                "Dag Steven,\n" +
                "Dag Timo,\n" +
                " \n" +
                "Even een update in dit dossier qua betalingen.\n" +
                "Verzekerde laat nog weten dat ze naast de betaling van 1500 in oktober ook rechtstreeks 1500 EUR ontvangen hebben van de klant per 10/11\n" +
                "Fèten heeft het aan Timo laten weten, maar het claimsdossier is nog niet bijgewerkt.\n" +
                " \n" +
                "Verzekerde bevestigt me dat het saldo dus nu 4220.02 EUR is\n" +
                " \n" +
                "Ze komen echter ook terug op hun vraag:\n" +
                "Debiteur laat weten dat alles vooraf betalen toch niet mogelijk is.\n" +
                "Hij zou het afbetalingsplan willen laten lopen\n" +
                "11/12    1500\n" +
                "11/01    1500    \n" +
                "\n" +
                "11/2      1500    \n" +
                "\n" +
                "11/3      saldo\n" +
                " \n" +
                "En het order in bijlage nu al vooruitbetalen.\n" +
                " \n" +
                "Steven, kan je hiermee akkoord gaan?\n" +
                " \n" +
                "Timo, ik denk dat het bedrag van 6948.39€ dat jij me had meegedeeld geen rekening houdt met de betaling in november…\n" +
                " \n" +
                "Graag nog even nakijken.\n" +
                " \n" +
                "\n" +
                "met vriendelijke groeten, kind regards, cordialement,\n" +
                "\n" +
                "Petra\n" +
                " \n" +
                "Petra Belmans (niet\n" +
                " aanwezig op woensdag)\n" +
                "Senior Account Executive\n" +
                " / Customer Service Center\n" +
                "Atradius Crédito y Caución S.A. de Seguros y Reaseguros\n" +
                "T: +32 (0)3 213 42 93\n" +
                "F: +32 (0)3 226 50 66\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "\n" +
                "From: BELMANS Petra\n" +
                "\n" +
                "Sent: donderdag 25 november 2021 16:07\n" +
                "To: VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>\n" +
                "Cc: SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                "\n" +
                "\n" +
                " \n" +
                "Goedemiddag Steven,\n" +
                " \n" +
                "Zie hieronder de vraag van verzekerde en de offerte in bijlage die alvast werd opgemaakt.\n" +
                " \n" +
                "Deze debiteur wil een nieuwe bestelling plaatsen, maar alvorens hier op in te gaan had ik graag het standpunt van Atradius willen weten.\n" +
                " \n" +
                "Mogen wij vragen aan de debiteur om het resterende saldo van factuur 910209880 te betalen plus de bijkomende kosten en intresten en een voorafbetaling voor het nieuwe order?\n" +
                " \n" +
                "Uiteraard mogen zij dit vragen aan debiteur, maar gaan we hiermee akkoord?\n" +
                " \n" +
                "met vriendelijke groeten, kind regards, cordialement,\n" +
                "\n" +
                "Petra\n" +
                " \n" +
                "Petra Belmans (niet aanwezig op woensdag)\n" +
                "Senior Account Executive / Customer Service Center\n" +
                "Atradius Crédito y Caución S.A. de Seguros y Reaseguros\n" +
                "T: +32 (0)3 213 42 93\n" +
                "F: +32 (0)3 226 50 66\n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                "-----Original Message-----\n" +
                "From: Feten.Najem@sew-eurodrive.be <Feten.Najem@sew-eurodrive.be>\n" +
                "\n" +
                "Sent: donderdag 25 november 2021 15:53\n" +
                "To: BELMANS Petra <Petra.BELMANS@atradius.com>\n" +
                "Cc: philip.stoop@receivium.be;\n" +
                "Berten.Thys@sew-eurodrive.be; SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                " \n" +
                "Hallo Petra,\n" +
                " \n" +
                "Het gaat louter om een prijsaanvraag. We hebben nog geen definitieve bestelling ontvangen.\n" +
                " \n" +
                "Alvorens dit te aanvaarden wou ik me toch graag even informeren wat de mogelijkheden zijn.\n" +
                " \n" +
                "In bijlage kan u alvast de offerte terugvinden.\n" +
                " \n" +
                "Très sincèrement vôtre,\n" +
                "Met vriendelijke groeten,\n" +
                "Best regards,\n" +
                "Mit freundlichen Gruessen,\n" +
                " \n" +
                "Fèten Najem,\n" +
                "Accountant\n" +
                "SEW-EURODRIVE n.v./s.a.\n" +
                "Direct Phone : +32(0)16.386.362 \n" +
                "Fax : +32(0)16.386.336\n" +
                "http://www.sew-eurodrive.be\n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                "-----Original Message-----\n" +
                "From: BELMANS Petra <Petra.BELMANS@atradius.com>\n" +
                "\n" +
                "Sent: jeudi 25 novembre 2021 15:38\n" +
                "To: Najem, Fèten <Feten.Najem@sew-eurodrive.be>; SUYKENS-DE\n" +
                " LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "Cc: philip.stoop@receivium.be; Thys, Berten <Berten.Thys@sew-eurodrive.be>\n" +
                "Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                " \n" +
                "Goedemiddag Fèten,\n" +
                " \n" +
                "Kan je een kopie van het order bezorgen, zodat we weten over hoeveel het gaat.\n" +
                "Wanneer zou de levering plaatsvinden?\n" +
                " \n" +
                "Alvast bedankt !\n" +
                " \n" +
                "met vriendelijke groeten, kind regards, cordialement,\n" +
                "\n" +
                "Petra\n" +
                " \n" +
                "Petra Belmans (niet aanwezig op woensdag)\n" +
                "Senior Account Executive / Customer Service Center\n" +
                "Atradius Crédito y Caución S.A. de Seguros y Reaseguros\n" +
                "T: +32 (0)3 213 42 93\n" +
                "F: +32 (0)3 226 50 66\n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                "-----Original Message-----\n" +
                "From: Feten.Najem@sew-eurodrive.be <Feten.Najem@sew-eurodrive.be>\n" +
                "\n" +
                "Sent: donderdag 25 november 2021 11:24\n" +
                "To: SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>\n" +
                "Cc: philip.stoop@receivium.be;\n" +
                "Berten.Thys@sew-eurodrive.be\n" +
                "Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                " \n" +
                "CAUTION: This email originated from outside of Atradius. Do not click links or open attachments unless you recognize the sender and know the content is safe.\n" +
                " \n" +
                " \n" +
                "Hallo Liesbet,\n" +
                " \n" +
                "Deze debiteur wil een nieuwe bestelling plaatsen, maar alvorens hier op in te gaan had ik graag het standpunt van Atradius willen weten.\n" +
                " \n" +
                "Mogen wij vragen aan de debiteur om het resterende saldo van factuur 910209880 te betalen plus de bijkomende kosten en intresten en een voorafbetaling voor het nieuwe order?\n" +
                " \n" +
                " \n" +
                "Très sincèrement vôtre,\n" +
                "Met vriendelijke groeten,\n" +
                "Best regards,\n" +
                "Mit freundlichen Gruessen,\n" +
                " \n" +
                "Fèten Najem,\n" +
                "Accountant\n" +
                "SEW-EURODRIVE n.v./s.a.\n" +
                "Direct Phone : +32(0)16.386.362 \n" +
                "Fax : +32(0)16.386.336\n" +
                "http://www.sew-eurodrive.be\n" +
                " \n" +
                " \n" +
                " \n" +
                "-----Original Message-----\n" +
                "From: documents.atradiusBE@atradius.com\n" +
                " <documents.atradiusBE@atradius.com>\n" +
                "\n" +
                "Sent: jeudi 21 octobre 2021 11:57\n" +
                "To: Najem, Fèten <Feten.Najem@sew-eurodrive.be>\n" +
                "Subject: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127\n" +
                " \n" +
                "Please find attached documents relating to your Atradius policy. Please do not reply to this email. If you need to speak to us regarding the document(s) please contact your usual Atradius contact. The details can be\n" +
                " found on the attached document.\n" +
                " \n" +
                "****************************************\n" +
                "The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information\n" +
                " about the main registration details of Atradius Group offices in your country, please visit\n" +
                "https://group.atradius.com/contact-us/\n" +
                " \n" +
                "Important Notice\n" +
                "This e-mail, including any and all attachments, is intended for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure\n" +
                " of the content of this email is not permitted, unless expressly otherwise indicated in the email by the Atradius contact person. If you are not the intended recipient of this email and its contents, please notify the sender immediately by reply email and delete\n" +
                " this email and all its attachments subsequently. Although this email and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of the recipient\n" +
                " to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. Email received by Atradius Group can be stored for business purposes.\n" +
                "****************************************\n" +
                " \n" +
                " \n" +
                "<p></p>\n" +
                " \n" +
                "****************************************\n" +
                "TVA/ BTW: BE 0661.624.528\n" +
                "RPM Namur /  RPR Namen \n" +
                "Siège social / Hoofdzetel: Paseo de la Castellana 4\n" +
                "28046 Madrid (ES)\n" +
                "Registre du commerce / Handelsregister Madrid M-171.144\n" +
                " \n" +
                "The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information\n" +
                " about the main registration details of Atradius Group offices in your country please visit\n" +
                "https://group.atradius.com/contact-us/\n" +
                "\n" +
                " \n" +
                "Important Notice\n" +
                "This e-mail, including any and all attachments, is inten\n" +
                " From: JONKERS TimoSent: vendredi 26 novembre 2021 10:41To: BELMANS Petra <Petra.BELMANS@atradius.com>; VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>Cc: t.jonkers.collect@atradius.comSubject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127 Dag Petra, Inderdaad, ik heb de betaling van november nog niet in het dossier geboekt.Ik heb dat aan claims doorgegeven. Van zodra het bedrag aangepast is, zal ik het afbetalingsplan bevestigen. Groeten,  Timo JonkersCollectorIOperationsAtradius Collections B.V.Avenue Prince de Liège 78, 5100 Namur I BelgiumPhone: +32 (0)81 324 226timo.jonkers@atradius.comIwww.atradiuscollections.comConnect with Atradius Collections onTwitter:@atradiuscollect | YouTube:atradiuscollections | LinkedIn:Atradius-Collections    Madame, Monsieur,Le Règlement Général sur la Protection des Données (RGPD) est d’application depuis 2018 et vous octroie davantage de droits en matière de vie privée. Vous recevez cet e-mail car Atradius Collections traite vos données personnelles dans le cadre de notre service de recouvrement des créances. Pour obtenir un aperçu complet de vos droits et la manière dont nous pouvons utiliser vos données personnelles, cliquezici pour consulte notre politique de confidentialité.Nous nous engageons à utiliser vos données personnelles conformément à notre accord ainsi qu'à notre politique de confidentialité. Geachte mevrouw, geachte heer, De Algemene Verordening Gegevensbescherming ('GDPR') is van toepassing sinds 2018 en verleent u aanvullende rechten met betrekking tot uw privacy. U ontvangt deze e-mail omdat Atradius Collections uw persoonlijke gegevens verwerkt in het kader van de incassodiensten die zij aan uw bedrijf verleent. Voor een volledig overzicht van uw rechten en hoe wij uw persoonlijke gegevens kunnen gebruiken, vindt u hier ons privacybeleid.  From: BELMANS Petra <Petra.BELMANS@atradius.com>Sent: vendredi 26 novembre 2021 10:15To: VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>; JONKERS Timo <Timo.JONKERS@atradius.com>Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127 Dag Steven,Dag Timo, Even een update in dit dossier qua betalingen.Verzekerde laat nog weten dat ze naast de betaling van 1500 in oktober ook rechtstreeks 1500 EUR ontvangen hebben van de klant per 10/11Fèten heeft het aan Timo laten weten, maar het claimsdossier is nog niet bijgewerkt. Verzekerde bevestigt me dat het saldo dus nu 4220.02 EUR is Ze komen echter ook terug op hun vraag:Debiteur laat weten dat alles vooraf betalen toch niet mogelijk is.Hij zou het afbetalingsplan willen laten lopen11/12    150011/01    1500    11/2      1500    11/3      saldo En het order in bijlage nu al vooruitbetalen. Steven, kan je hiermee akkoord gaan? Timo, ik denk dat het bedrag van 6948.39€ dat jij me had meegedeeld geen rekening houdt met de betaling in november… Graag nog even nakijken. met vriendelijke groeten, kind regards, cordialement,Petra Petra Belmans (niet aanwezig op woensdag)Senior Account Executive / Customer Service CenterAtradius Crédito y Caución S.A. de Seguros y ReasegurosT: +32 (0)3 213 42 93F: +32 (0)3 226 50 66   From: BELMANS PetraSent: donderdag 25 november 2021 16:07To: VLIEGHERE DE Steven <Steven.VLIEGHEREDE@atradius.com>Cc: SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>Subject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127 Goedemiddag Steven, Zie hieronder de vraag van verzekerde en de offerte in bijlage die alvast werd opgemaakt. Deze debiteur wil een nieuwe bestelling plaatsen, maar alvorens hier op in te gaan had ik graag het standpunt van Atradius willen weten. Mogen wij vragen aan de debiteur om het resterende saldo van factuur 910209880 te betalen plus de bijkomende kosten en intresten en een voorafbetaling voor het nieuwe order? Uiteraard mogen zij dit vragen aan debiteur, maar gaan we hiermee akkoord? met vriendelijke groeten, kind regards, cordialement,Petra Petra Belmans (niet aanwezig op woensdag)Senior Account Executive / Customer Service CenterAtradius Crédito y Caución S.A. de Seguros y ReasegurosT: +32 (0)3 213 42 93F: +32 (0)3 226 50 66     -----Original Message-----From: Feten.Najem@sew-eurodrive.be <Feten.Najem@sew-eurodrive.be>Sent: donderdag 25 november 2021 15:53To: BELMANS Petra <Petra.BELMANS@atradius.com>Cc: philip.stoop@receivium.be;Berten.Thys@sew-eurodrive.be; SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127 Hallo Petra, Het gaat louter om een prijsaanvraag. We hebben nog geen definitieve bestelling ontvangen. Alvorens dit te aanvaarden wou ik me toch graag even informeren wat de mogelijkheden zijn. In bijlage kan u alvast de offerte terugvinden. Très sincèrement vôtre,Met vriendelijke groeten,Best regards,Mit freundlichen Gruessen, Fèten Najem,AccountantSEW-EURODRIVE n.v./s.a.Direct Phone : +32(0)16.386.362 Fax : +32(0)16.386.336http://www.sew-eurodrive.be    -----Original Message-----From: BELMANS Petra <Petra.BELMANS@atradius.com>Sent: jeudi 25 novembre 2021 15:38To: Najem, Fèten <Feten.Najem@sew-eurodrive.be>; SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>Cc: philip.stoop@receivium.be; Thys, Berten <Berten.Thys@sew-eurodrive.be>Subject: RE: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127 Goedemiddag Fèten, Kan je een kopie van het order bezorgen, zodat we weten over hoeveel het gaat.Wanneer zou de levering plaatsvinden? Alvast bedankt ! met vriendelijke groeten, kind regards, cordialement,Petra Petra Belmans (niet aanwezig op woensdag)Senior Account Executive / Customer Service CenterAtradius Crédito y Caución S.A. de Seguros y ReasegurosT: +32 (0)3 213 42 93F: +32 (0)3 226 50 66     -----Original Message-----From: Feten.Najem@sew-eurodrive.be <Feten.Najem@sew-eurodrive.be>Sent: donderdag 25 november 2021 11:24To: SUYKENS-DE LAET Liesbet <Liesbet.SUYKENS-DELAET@atradius.com>Cc: philip.stoop@receivium.be;Berten.Thys@sew-eurodrive.beSubject: FW: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127 CAUTION: This email originated from outside of Atradius. Do not click links or open attachments unless you recognize the sender and know the content is safe.  Hallo Liesbet, Deze debiteur wil een nieuwe bestelling plaatsen, maar alvorens hier op in te gaan had ik graag het standpunt van Atradius willen weten. Mogen wij vragen aan de debiteur om het resterende saldo van factuur 910209880 te betalen plus de bijkomende kosten en intresten en een voorafbetaling voor het nieuwe order?  Très sincèrement vôtre,Met vriendelijke groeten,Best regards,Mit freundlichen Gruessen, Fèten Najem,AccountantSEW-EURODRIVE n.v./s.a.Direct Phone : +32(0)16.386.362 Fax : +32(0)16.386.336http://www.sew-eurodrive.be   -----Original Message-----From: documents.atradiusBE@atradius.com <documents.atradiusBE@atradius.com>Sent: jeudi 21 octobre 2021 11:57To: Najem, Fèten <Feten.Najem@sew-eurodrive.be>Subject: Request for Information Case number: 10131873 Debiteur: V W AUTOMATION SA Debiteur: 21863889 Polisnummer: 276127 Please find attached documents relating to your Atradius policy. Please do not reply to this email. If you need to speak to us regarding the document(s) please contact your usual Atradius contact. The details can be found on the attached document. ****************************************The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information about the main registration details of Atradius Group offices in your country, please visithttps://group.atradius.com/contact-us/ Important NoticeThis e-mail, including any and all attachments, is intended for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure of the content of this email is not permitted, unless expressly otherwise indicated in the email by the Atradius contact person. If you are not the intended recipient of this email and its contents, please notify the sender immediately by reply email and delete this email and all its attachments subsequently. Although this email and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of the recipient to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. Email received by Atradius Group can be stored for business purposes.****************************************  <p></p> ****************************************TVA/ BTW: BE 0661.624.528RPM Namur /  RPR Namen Siège social / Hoofdzetel: Paseo de la Castellana 428046 Madrid (ES)Registre du commerce / Handelsregister Madrid M-171.144 The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information about the main registration details of Atradius Group offices in your country please visithttps://group.atradius.com/contact-us/ Important NoticeThis e-mail, including any and all attachments, is inten\n" +
                "codix.oracle.forms.laf.TextAreaPJC.setProperty - id = TextArea.Append ; object = ded for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure\n" +
                " of the content of this e-mail is not permitted, unless expressly otherwise indicated in the e-mail by the Atradius contact person. If you are not the intended recipient of this e-mail and its contents, please notify the sender immediately by reply e-mail and\n" +
                " delete this e-mail and all its attachments subsequently. Although this e-mail and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of\n" +
                " the recipient to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. E-mail received by Atradius Group can be stored for business purposes.\n" +
                "****************************************\n" +
                " \n" +
                " \n" +
                "<p></p>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information about the main registration details of Atradius Group offices in your country, please visit https://group.atradius.com/contact-us/Important Notice\n" +
                "\t\tThis e-mail, including any and all attachments, is intended for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure of the content of this email is not permitted, unless expressly otherwise indicated in the email by the Atradius contact person. If you are not the intended recipient of this email and its contents, please notify the sender immediately by reply email and delete this email and all its attachments subsequently. Although this email and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of the recipient to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. Email received by Atradius Group can be stored for business purposes.\n" +
                "\t \n" +
                "HTML !!!!!!!!\n" +
                "encodeImageTag().replaced = ded for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure\n" +
                " of the content of this e-mail is not permitted, unless expressly otherwise indicated in the e-mail by the Atradius contact person. If you are not the intended recipient of this e-mail and its contents, please notify the sender immediately by reply e-mail and\n" +
                " delete this e-mail and all its attachments subsequently. Although this e-mail and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of\n" +
                " the recipient to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. E-mail received by Atradius Group can be stored for business purposes.\n" +
                "****************************************\n" +
                " \n" +
                " \n" +
                "<p></p>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information about the main registration details of Atradius Group offices in your country, please visit https://group.atradius.com/contact-us/Important Notice\n" +
                "\t\tThis e-mail, including any and all attachments, is intended for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure of the content of this email is not permitted, unless expressly otherwise indicated in the email by the Atradius contact person. If you are not the intended recipient of this email and its contents, please notify the sender immediately by reply email and delete this email and all its attachments subsequently. Although this email and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of the recipient to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. Email received by Atradius Group can be stored for business purposes.\n" +
                "\t \n" +
                "ded for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure of the content of this e-mail is not permitted, unless expressly otherwise indicated in the e-mail by the Atradius contact person. If you are not the intended recipient of this e-mail and its contents, please notify the sender immediately by reply e-mail and delete this e-mail and all its attachments subsequently. Although this e-mail and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of the recipient to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. E-mail received by Atradius Group can be stored for business purposes.****************************************  <p></p>The operating companies affiliated with Atradius N.V. (Atradius Group) conduct insurance, debt collection and information services business through their registered (branch) offices in many countries. For information about the main registration details of Atradius Group offices in your country, please visit https://group.atradius.com/contact-us/Important Notice\t\tThis e-mail, including any and all attachments, is intended for the addressee or its representative only. It is confidential and may be under legal privilege. Any form of publication, reproduction, copying or disclosure of the content of this email is not permitted, unless expressly otherwise indicated in the email by the Atradius contact person. If you are not the intended recipient of this email and its contents, please notify the sender immediately by reply email and delete this email and all its attachments subsequently. Although this email and any attachments are believed to be free of any virus or other defect that might affect any computer system into which it is received and/or opened, it is the responsibility of the recipient to ensure that it is virus free and no responsibility is accepted by Atradius Group companies, either jointly or severally, for any loss or damage arising in any way from its use. Email received by Atradius Group can be stored for business purposes.\t";

        System.out.println(text);
    }
}
