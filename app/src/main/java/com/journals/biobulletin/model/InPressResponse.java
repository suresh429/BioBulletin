package com.journals.biobulletin.model;

import java.util.List;

public class InPressResponse {


    /**
     * status : true
     * message : Records Found
     * inpress_details : [{"sno":"14277","month":"November","year":"2020","title":"A global review of COVID - 19 pandemic","volume":"Volume 12, Issue 7","journal":"fmim","author_names":"Bahiru Tenaw Goshu","abstractlink":"a-global-review-of-covid--19-pandemic-14277.html","pdflink":"https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic-14277.html","sup_file":"","art_type":"Review Article","page_num":"91-97","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14280","month":"November","year":"2020","title":"Stress Echocardiography and coronary artery disease","volume":"Volume 12, Issue 7","journal":"fmim","author_names":"Spandhana Nayak","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/stress-echocardiography-and-coronary-artery-disease.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/stress-echocardiography-and-coronary-artery-disease-14280.html","sup_file":"","art_type":"Commentary","page_num":"99","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14288","month":"November","year":"2020","title":"Applications of conventional radiology and tomographic images","volume":"Volume 12, Issue 7","journal":"fmim","author_names":"Akrambasha","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/applications-of-conventional-radiology-and-tomographic-images.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/applications-of-conventional-radiology-and-tomographic-images-14288.html","sup_file":"","art_type":"Commentary","page_num":"100","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14289","month":"November","year":"2020","title":"Effect of Plain radiography in pregnant women","volume":"Volume 12, Issue 7","journal":"fmim","author_names":"Nik James","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/effect-of-plain-radiography-in-pregnant-women.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/effect-of-plain-radiography-in-pregnant-women-14289.html","sup_file":"","art_type":"Mini Review","page_num":"101","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14290","month":"November","year":"2020","title":"Editorial on clinical analysis and medical intervention","volume":"Volume 12, Issue 7","journal":"fmim","author_names":"ErtanSahin","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/editorial-on-clinical-analysis-and-medical-intervention.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/editorial-on-clinical-analysis-and-medical-intervention-14290.html","sup_file":"","art_type":"Editorial","page_num":"103","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14477","month":"January","year":"2021","title":"The Correlation between Disease Stage and Pulmonary Edema Assessed with Chest X-Ray in Chronic Kidney Disease Patients.","volume":"Volume 13, Issue 1","journal":"fmim","author_names":"Widiastuti*, Ratih Tri Kusuma Dewi, Bhisma Murti, Ervina Ruth, Ida Prista Maryetty,Muhamad Lukman Hermansah, Rachmi Fauziah Rahayu, Muchtar Hanafi, Yusuf Syaeful Nawawi.","abstractlink":"the-correlation-between-disease-stage-and-pulmonary-edema-assessed-with-chest-xray-in-chronic-kidney-disease-patients-14477.html","pdflink":"https://www.openaccessjournals.com/articles/the-correlation-between-disease-stage-and-pulmonary-edema-assessed-with-chest-xray-in-chronic-kidney-disease-patients.pdf","fulltextlink":null,"sup_file":"","art_type":"Research Article","page_num":"1","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14490","month":"January","year":"2021","title":"Glioblastoma Image Analysis using Convolutional Neural Networks to Accurately Classify Gene Methylation and Predict Drug Effectiveness","volume":"Volume 13, Issue 1","journal":"fmim","author_names":"Viraj Mehta","abstractlink":"glioblastoma-image-analysis-using-convolutional-neural-networks-to-accurately-classify-gene-methylation-and-predict-drug-14490.html","pdflink":"https://www.openaccessjournals.com/articles/glioblastoma-image-analysis-using-convolutional-neural-networks-to-accurately-classify-gene-methylation-and-predict-drug.pdf","fulltextlink":null,"sup_file":"","art_type":"Research Article","page_num":"7","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14491","month":"January","year":"2021","title":"Covid-19: Radiographic Imaging","volume":"Volume 13, Issue 1","journal":"fmim","author_names":"Chintala Amala","abstractlink":null,"pdflink":"https://www.openaccessjournals.com/articles/covid19-radiographic-imaging.pdf","fulltextlink":null,"sup_file":"","art_type":"Commentary","page_num":"19","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14492","month":"January","year":"2021","title":"Impact of Surgical Approach on Stratifying Glioblastoma Patients","volume":"Volume 13, Issue 1","journal":"fmim","author_names":"Siri Muppidi","abstractlink":null,"pdflink":"https://www.openaccessjournals.com/articles/impact-of-surgical-approach-on-stratifying-glioblastoma-patients.pdf","fulltextlink":null,"sup_file":"","art_type":"Commentary","page_num":"20","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14493","month":"January","year":"2021","title":"Large-scale Intracranial Disease: Structural Imaging","volume":"Volume 13, Issue 1","journal":"fmim","author_names":"Prasanna Yadav","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/largescale-intracranial-disease-structural-imaging.pdf","fulltextlink":null,"sup_file":"","art_type":"Short Communication","page_num":"21","doi_num":"","doi_stat":"0","doi_stat_temp":"0"}]
     * inpress_cnt : 10
     */

    private boolean status;
    private String message;
    private int inpress_cnt;
    /**
     * sno : 14277
     * month : November
     * year : 2020
     * title : A global review of COVID - 19 pandemic
     * volume : Volume 12, Issue 7
     * journal : fmim
     * author_names : Bahiru Tenaw Goshu
     * abstractlink : a-global-review-of-covid--19-pandemic-14277.html
     * pdflink : https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic.pdf
     * fulltextlink : https://www.openaccessjournals.com/articles/a-global-review-of-covid--19-pandemic-14277.html
     * sup_file :
     * art_type : Review Article
     * page_num : 91-97
     * doi_num :
     * doi_stat : 0
     * doi_stat_temp : 0
     */

    private List<InpressDetailsBean> inpress_details;

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

    public int getInpress_cnt() {
        return inpress_cnt;
    }

    public void setInpress_cnt(int inpress_cnt) {
        this.inpress_cnt = inpress_cnt;
    }

    public List<InpressDetailsBean> getInpress_details() {
        return inpress_details;
    }

    public void setInpress_details(List<InpressDetailsBean> inpress_details) {
        this.inpress_details = inpress_details;
    }

    public static class InpressDetailsBean {
        private String sno;
        private String month;
        private String year;
        private String title;
        private String volume;
        private String journal;
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

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
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
