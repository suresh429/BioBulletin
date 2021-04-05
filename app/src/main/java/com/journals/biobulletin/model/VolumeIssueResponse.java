package com.journals.biobulletin.model;

import java.util.List;

public class VolumeIssueResponse {


    /**
     * status : true
     * vol_issue_details : [{"sno":"8207","month":"December","year":"2009","title":"Imaging gout: brought back to the forefront with dual-energy computed tomography","author_names":"S Nicolaou & DJ Hou","abstractlink":null,"pdflink":"https://www.openaccessjournals.com/articles/imaging-gout-brought-back-to-the-forefront-with-dualenergy-computed-tomography.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/imaging-gout-brought-back-to-the-forefront-with-dualenergy-computed-tomography-8207.html","sup_file":"","journal":"fmim","page_num":"119","art_img":null,"doi_num":"","doi_stat":"0","art_type":"Editorial","volume":"Volume 1, Issue 2"},{"sno":"8210","month":"December","year":"2009","title":"Should axillary lymph nodes be monitored with ultrasound following breast cancer surgery?","author_names":"Cherie M Kuzmiak","abstractlink":null,"pdflink":"https://www.openaccessjournals.com/articles/should-axillary-lymph-nodes-be-monitored-with-ultrasound-following-breast-cancer-surgery.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/should-axillary-lymph-nodes-be-monitored-with-ultrasound-following-breast-cancer-surgery-8210.html","sup_file":"","journal":"fmim","page_num":"123","art_img":null,"doi_num":"","doi_stat":"0","art_type":"Editorial","volume":"Volume 1, Issue 2"},{"sno":"8213","month":"December","year":"2009","title":"Hyperpolarized xenon MRI:\r\nresearch presented and future clinical trials promised, MRI for prostate cancer detection, Angiography alone may not be enough\r\nfor plaque analysis, Imaging swine flu","author_names":"anonymous","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/hyperpolarized-xenon-mriresearch-presented-and-future-clinical-trials-promised-mri-for-prostate-cancer-detection-angiogr.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/hyperpolarized-xenon-mriresearch-presented-and-future-clinical-trials-promised-mri-for-prostate-cancer-detection-angiography-alone-8213.html","sup_file":"","journal":"fmim","page_num":"127","art_img":null,"doi_num":"","doi_stat":"0","art_type":"News and Views","volume":"Volume 1, Issue 2"},{"sno":"8220","month":"December","year":"2009","title":"How have developments in molecular imaging techniques furthered schizophrenia research?","author_names":"Judy L Thompson, Nina Urban & Anissa Abi-Dargham","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/how-have-developments-in-molecular-imaging-techniques-furthered-schizophrenia-research.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/how-have-developments-in-molecular-imaging-techniques-furthered-schizophrenia-research-8220.html","sup_file":"","journal":"fmim","page_num":"135","art_img":null,"doi_num":"","doi_stat":"0","art_type":"Review Article","volume":"Volume 1, Issue 2"},{"sno":"8225","month":"December","year":"2009","title":"Diffusion-tensor imaging in brain tumors","author_names":"Nail Bulakbasi","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/diffusiontensor-imaging-in-brain-tumors.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/diffusiontensor-imaging-in-brain-tumors-8225.html","sup_file":"","journal":"fmim","page_num":"155","art_img":null,"doi_num":"","doi_stat":"0","art_type":"Review Article","volume":"Volume 1, Issue 2"},{"sno":"8227","month":"December","year":"2009","title":"Dynamic contrast-enhanced MRI in cancer","author_names":"Fiona J Gilbert and Trevor S Ahearn","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/dynamic-contrastenhanced-mri-in-cancer.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/dynamic-contrastenhanced-mri-in-cancer-8227.html","sup_file":"","journal":"fmim","page_num":"173","art_img":null,"doi_num":"","doi_stat":"0","art_type":"Review Article","volume":"Volume 1, Issue 2"},{"sno":"8230","month":"December","year":"2009","title":"ECG-gated multidetector-row computed tomography in the assessment of left ventricular function","author_names":"Marco Rengo, Paola Lucchesi, Carlo Nicola de Cecco, Pasquale Paolantonio, Riccardo Ferrari & Andrea Laghi","abstractlink":"","pdflink":"https://www.openaccessjournals.com/articles/ecggated-multidetectorrow-computed-tomography-in-the-assessment-of-left-ventricular-function.pdf","fulltextlink":"https://www.openaccessjournals.com/articles/ecggated-multidetectorrow-computed-tomography-in-the-assessment-of-left-ventricular-function-8230.html","sup_file":"","journal":"fmim","page_num":"187","art_img":null,"doi_num":"","doi_stat":"0","art_type":"Review Article","volume":"Volume 1, Issue 2"}]
     * vol_issue : 7
     */

    private boolean status;
    private int vol_issue;
    /**
     * sno : 8207
     * month : December
     * year : 2009
     * title : Imaging gout: brought back to the forefront with dual-energy computed tomography
     * author_names : S Nicolaou & DJ Hou
     * abstractlink : null
     * pdflink : https://www.openaccessjournals.com/articles/imaging-gout-brought-back-to-the-forefront-with-dualenergy-computed-tomography.pdf
     * fulltextlink : https://www.openaccessjournals.com/articles/imaging-gout-brought-back-to-the-forefront-with-dualenergy-computed-tomography-8207.html
     * sup_file :
     * journal : fmim
     * page_num : 119
     * art_img : null
     * doi_num :
     * doi_stat : 0
     * art_type : Editorial
     * volume : Volume 1, Issue 2
     */

    private List<VolIssueDetailsBean> vol_issue_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVol_issue() {
        return vol_issue;
    }

    public void setVol_issue(int vol_issue) {
        this.vol_issue = vol_issue;
    }

    public List<VolIssueDetailsBean> getVol_issue_details() {
        return vol_issue_details;
    }

    public void setVol_issue_details(List<VolIssueDetailsBean> vol_issue_details) {
        this.vol_issue_details = vol_issue_details;
    }

    public static class VolIssueDetailsBean {
        private String sno;
        private String month;
        private String year;
        private String title;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String sup_file;
        private String journal;
        private String page_num;
        private String art_img;
        private String doi_num;
        private String doi_stat;
        private String art_type;
        private String volume;

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

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getPage_num() {
            return page_num;
        }

        public void setPage_num(String page_num) {
            this.page_num = page_num;
        }

        public String getArt_img() {
            return art_img;
        }

        public void setArt_img(String art_img) {
            this.art_img = art_img;
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

        public String getArt_type() {
            return art_type;
        }

        public void setArt_type(String art_type) {
            this.art_type = art_type;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }
    }
}
