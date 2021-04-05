package com.journals.biobulletin.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AbstractResponse {


    /**
     * status : true
     * abstract : 2
     * abstract_details : [{"sno":"14277","journal":"fmim","title":"A global review of COVID - 19 pandemic","author_names":"Bahiru Tenaw Goshu","keywords":null,"abstract":"<p>In December 2019, the WHO identified causative agent of outbreak as the severe acute respiratory syndrome coronavirus-2 (SARSCoV- 2) that causes to a disease the so called coronavirus disease-2019 (COVID-19) after a pneumonia cases with unspecified etiology was reported in Wuhan, Hubei province, China. According to a phylogenetic investigation, the virus is meticulously correlated to bat coronavirus RaTG13. Now, in human, asymptomatic carriers can also transmit the virus. The COVID 19 virus is affecting 213 countries and territories around the world and 2 international conveyances and on May 26, 2020 more than 5,603,558 confirmed cases and 348,194 deaths have been reported. The disease has a manifestation of fever, dry cough, and chest pain with pneumonia in severe cases. Initially, it is tried to eliminate the disease in China via isolation but are now transmitted globally. Yet, there are no vaccines and drugs to treat the virus. As it is a novel virus, there are knowledge gaps that misleads to any preventive actions. Therefore, this review provides current scientific facts about the COVID-19 pandemic.<\/p>","doi_num":"","abstractlink":"a-global-review-of-covid--19-pandemic-14277.html","pdflink":"https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic-14277.html","year":"2020","page_num":"91-97","pub_date":"2020-11-16","rec_date":"","date":"2020-11-16","old_omics_id":"","domain_name":"https://www.openaccessjournals.com/","vol":"12","issue":"7","vol_issue_name":"Volume 12, Issue 7"},{"sno":"14277","journal":"fmim","title":"A global review of COVID - 19 pandemic","author_names":"Bahiru Tenaw Goshu","keywords":null,"abstract":"<p>In December 2019, the WHO identified causative agent of outbreak as the severe acute respiratory syndrome coronavirus-2 (SARSCoV- 2) that causes to a disease the so called coronavirus disease-2019 (COVID-19) after a pneumonia cases with unspecified etiology was reported in Wuhan, Hubei province, China. According to a phylogenetic investigation, the virus is meticulously correlated to bat coronavirus RaTG13. Now, in human, asymptomatic carriers can also transmit the virus. The COVID 19 virus is affecting 213 countries and territories around the world and 2 international conveyances and on May 26, 2020 more than 5,603,558 confirmed cases and 348,194 deaths have been reported. The disease has a manifestation of fever, dry cough, and chest pain with pneumonia in severe cases. Initially, it is tried to eliminate the disease in China via isolation but are now transmitted globally. Yet, there are no vaccines and drugs to treat the virus. As it is a novel virus, there are knowledge gaps that misleads to any preventive actions. Therefore, this review provides current scientific facts about the COVID-19 pandemic.<\/p>","doi_num":"","abstractlink":"a-global-review-of-covid--19-pandemic-14277.html","pdflink":"https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic-14277.html","year":"2020","page_num":"91-97","pub_date":"2020-11-16","rec_date":"","date":"2020-11-16","old_omics_id":"","domain_name":"https://www.openaccessjournals.com/","vol":"12","issue":"7","vol_issue_name":"Volume 12, Issue 7"}]
     */

    private boolean status;
    @SerializedName("abstract")
    private int abstractX;
    /**
     * sno : 14277
     * journal : fmim
     * title : A global review of COVID - 19 pandemic
     * author_names : Bahiru Tenaw Goshu
     * keywords : null
     * abstract : <p>In December 2019, the WHO identified causative agent of outbreak as the severe acute respiratory syndrome coronavirus-2 (SARSCoV- 2) that causes to a disease the so called coronavirus disease-2019 (COVID-19) after a pneumonia cases with unspecified etiology was reported in Wuhan, Hubei province, China. According to a phylogenetic investigation, the virus is meticulously correlated to bat coronavirus RaTG13. Now, in human, asymptomatic carriers can also transmit the virus. The COVID 19 virus is affecting 213 countries and territories around the world and 2 international conveyances and on May 26, 2020 more than 5,603,558 confirmed cases and 348,194 deaths have been reported. The disease has a manifestation of fever, dry cough, and chest pain with pneumonia in severe cases. Initially, it is tried to eliminate the disease in China via isolation but are now transmitted globally. Yet, there are no vaccines and drugs to treat the virus. As it is a novel virus, there are knowledge gaps that misleads to any preventive actions. Therefore, this review provides current scientific facts about the COVID-19 pandemic.</p>
     * doi_num :
     * abstractlink : a-global-review-of-covid--19-pandemic-14277.html
     * pdflink : https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic.pdf
     * fulltextlink : https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic-14277.html
     * year : 2020
     * page_num : 91-97
     * pub_date : 2020-11-16
     * rec_date :
     * date : 2020-11-16
     * old_omics_id :
     * domain_name : https://www.openaccessjournals.com/
     * vol : 12
     * issue : 7
     * vol_issue_name : Volume 12, Issue 7
     */

    private List<AbstractDetailsBean> abstract_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAbstractX() {
        return abstractX;
    }

    public void setAbstractX(int abstractX) {
        this.abstractX = abstractX;
    }

    public List<AbstractDetailsBean> getAbstract_details() {
        return abstract_details;
    }

    public void setAbstract_details(List<AbstractDetailsBean> abstract_details) {
        this.abstract_details = abstract_details;
    }

    public static class AbstractDetailsBean {
        private String sno;
        private String journal;
        private String title;
        private String author_names;
        private String keywords;
        @SerializedName("abstract")
        private String abstractX;
        private String doi_num;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String year;
        private String page_num;
        private String pub_date;
        private String rec_date;
        private String date;
        private String old_omics_id;
        private String domain_name;
        private String vol;
        private String issue;
        private String vol_issue_name;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor_names() {
            return author_names;
        }

        public void setAuthor_names(String author_names) {
            this.author_names = author_names;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getDoi_num() {
            return doi_num;
        }

        public void setDoi_num(String doi_num) {
            this.doi_num = doi_num;
        }

        public String getAbstractlink() {
            return abstractlink;
        }

        public void setAbstractlink(String abstractlink) {
            this.abstractlink = abstractlink;
        }

        public String getPdflink() {
            return pdflink;
        }

        public void setPdflink(String pdflink) {
            this.pdflink = pdflink;
        }

        public String getFulltextlink() {
            return fulltextlink;
        }

        public void setFulltextlink(String fulltextlink) {
            this.fulltextlink = fulltextlink;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getPage_num() {
            return page_num;
        }

        public void setPage_num(String page_num) {
            this.page_num = page_num;
        }

        public String getPub_date() {
            return pub_date;
        }

        public void setPub_date(String pub_date) {
            this.pub_date = pub_date;
        }

        public String getRec_date() {
            return rec_date;
        }

        public void setRec_date(String rec_date) {
            this.rec_date = rec_date;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getOld_omics_id() {
            return old_omics_id;
        }

        public void setOld_omics_id(String old_omics_id) {
            this.old_omics_id = old_omics_id;
        }

        public String getDomain_name() {
            return domain_name;
        }

        public void setDomain_name(String domain_name) {
            this.domain_name = domain_name;
        }

        public String getVol() {
            return vol;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public String getIssue() {
            return issue;
        }

        public void setIssue(String issue) {
            this.issue = issue;
        }

        public String getVol_issue_name() {
            return vol_issue_name;
        }

        public void setVol_issue_name(String vol_issue_name) {
            this.vol_issue_name = vol_issue_name;
        }
    }
}
