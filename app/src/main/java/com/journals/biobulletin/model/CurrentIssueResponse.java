package com.journals.biobulletin.model;

import java.util.List;

public class CurrentIssueResponse {

    /**
     * status : true
     * message : Records Found
     * currentissue_details : [{"sno":"14532","month":"February","year":"2021","title":"Acoustic microscopy: latest developments and applications.","journal":"fmim","vol":"13","issue":"2","author_names":"Saijo","abstractlink":"acoustic-microscopy-latest-developments-and-applications-14532.html","pdflink":"https://www.openaccessjournals.com/articles/acoustic-microscopy-latest-developments-and-applications.pdf","fulltextlink":null,"sup_file":"","art_type":"Review Article","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14534","month":"February","year":"2021","title":"Recent developments in coronary computed tomography imaging.","journal":"fmim","vol":"13","issue":"2","author_names":"Leschka, Stolzmann & Alkadhi","abstractlink":"recent-developments-in-coronary-computed-tomography-imaging-14534.html","pdflink":"https://www.openaccessjournals.com/articles/recent-developments-in-coronary-computed-tomography-imaging.pdf","fulltextlink":null,"sup_file":"","art_type":"Review Article","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14535","month":"February","year":"2021","title":"Imaging autoimmune pancreatitis.","journal":"fmim","vol":"13","issue":"2","author_names":"Irie, Nojiri, Kamochi","abstractlink":"imaging-autoimmune-pancreatitis-14535.html","pdflink":"https://www.openaccessjournals.com/articles/imaging-autoimmune-pancreatitis.pdf","fulltextlink":null,"sup_file":"","art_type":"Review Article","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14536","month":"February","year":"2021","title":"Ultrasound imaging of the early fetus:  is it safe?","journal":"fmim","vol":"13","issue":"2","author_names":"Jacques S Abramowicz","abstractlink":"ultrasound-imaging-of-the-early-fetus--is-it-safe-14536.html","pdflink":"https://www.openaccessjournals.com/articles/ultrasound-imaging-of-the-early-fetus--is-it-safe.pdf","fulltextlink":null,"sup_file":"","art_type":"Review Article","page_num":"85 - 95","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14537","month":"February","year":"2021","title":"Radiation dose reduction in  computed tomography:  techniques and future perspective","journal":"fmim","vol":"13","issue":"2","author_names":"Lifeng Yuâ? , Xin Liu, Shuai Leng,  James M Kofler, Juan C Ramirez-Giraldo, Mingliang Qu, Jodie Christner, Joel G Fletcher & Cynthia H McCollough","abstractlink":"radiation-dose-reduction-in--computed-tomography--techniques-and-future-perspective-14537.html","pdflink":"https://www.openaccessjournals.com/articles/radiation-dose-reduction-in--computed-tomography--techniques-and-future-perspective.pdf","fulltextlink":null,"sup_file":"","art_type":"Review Article","page_num":"65 - 84","doi_num":"","doi_stat":"0","doi_stat_temp":"0"}]
     * currentissue_cnt : 5
     */

    private boolean status;
    private String message;
    private int currentissue_cnt;
    /**
     * sno : 14532
     * month : February
     * year : 2021
     * title : Acoustic microscopy: latest developments and applications.
     * journal : fmim
     * vol : 13
     * issue : 2
     * author_names : Saijo
     * abstractlink : acoustic-microscopy-latest-developments-and-applications-14532.html
     * pdflink : https://www.openaccessjournals.com/articles/acoustic-microscopy-latest-developments-and-applications.pdf
     * fulltextlink : null
     * sup_file :
     * art_type : Review Article
     * page_num :
     * doi_num :
     * doi_stat : 0
     * doi_stat_temp : 0
     */

    private List<CurrentissueDetailsBean> currentissue_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCurrentissue_cnt() {
        return currentissue_cnt;
    }

    public void setCurrentissue_cnt(int currentissue_cnt) {
        this.currentissue_cnt = currentissue_cnt;
    }

    public List<CurrentissueDetailsBean> getCurrentissue_details() {
        return currentissue_details;
    }

    public void setCurrentissue_details(List<CurrentissueDetailsBean> currentissue_details) {
        this.currentissue_details = currentissue_details;
    }

    public static class CurrentissueDetailsBean {
        private String sno;
        private String month;
        private String year;
        private String title;
        private String journal;
        private String vol;
        private String issue;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String sup_file;
        private String art_type;
        private String page_num;
        private String doi_num;
        private String doi_stat;
        private String doi_stat_temp;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
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

        public String getAuthor_names() {
            return author_names;
        }

        public void setAuthor_names(String author_names) {
            this.author_names = author_names;
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

        public String getSup_file() {
            return sup_file;
        }

        public void setSup_file(String sup_file) {
            this.sup_file = sup_file;
        }

        public String getArt_type() {
            return art_type;
        }

        public void setArt_type(String art_type) {
            this.art_type = art_type;
        }

        public String getPage_num() {
            return page_num;
        }

        public void setPage_num(String page_num) {
            this.page_num = page_num;
        }

        public String getDoi_num() {
            return doi_num;
        }

        public void setDoi_num(String doi_num) {
            this.doi_num = doi_num;
        }

        public String getDoi_stat() {
            return doi_stat;
        }

        public void setDoi_stat(String doi_stat) {
            this.doi_stat = doi_stat;
        }

        public String getDoi_stat_temp() {
            return doi_stat_temp;
        }

        public void setDoi_stat_temp(String doi_stat_temp) {
            this.doi_stat_temp = doi_stat_temp;
        }
    }
}
