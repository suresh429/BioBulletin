package com.journals.biobulletin.model;

import java.util.List;

public class JournalsListResponse {


    /**
     * journal_cnt : 32
     * status : true
     * message : Records Found
     * journal_details : [{"managejournal":"Advanced Materials Science Research","journal":"aaamsr"},{"managejournal":"Annals of Clinical Trials and Vaccines Research","journal":"actvr"},{"managejournal":"Annals of Histology & Surgical Pathology","journal":"oaahsp"},{"managejournal":"Archives of Nursing and Care","journal":"oanc"},{"managejournal":"Clinical Investigation","journal":"fmci"},{"managejournal":"Clinical Practice","journal":"fmcp"},{"managejournal":"Diabetes Management","journal":"fmdm"},{"managejournal":"Imaging in Medicine","journal":"fmim"},{"managejournal":"International Journal of Clinical Rheumatology","journal":"fmijcr"},{"managejournal":"Interventional Cardiology","journal":"fmic"},{"managejournal":"Interventional Pediatrics & Research","journal":"ipdr"},{"managejournal":"JBR Journal of Interdisciplinary Medicine and Dental Sciences","journal":"jimds"},{"managejournal":"Journal of Agriculture","journal":"jagri"},{"managejournal":"Journal of Biochemistry Research","journal":"oabr"},{"managejournal":"Journal of Cancer & Metastasis Research","journal":"oajcmr"},{"managejournal":"Journal of Chemical & Structural Biology","journal":"oajcsb"},{"managejournal":"Journal of Cosmetic Science and Technology","journal":"oajcst"},{"managejournal":"Journal of Diabetes Medication & Care","journal":"jdmc"},{"managejournal":"Journal of Experimental Stroke & Translational Medicine","journal":"jestm"},{"managejournal":"Journal of Interventional Nephrology","journal":"oain"},{"managejournal":"Journal of Labor and Childbirth","journal":"jlcb"},{"managejournal":"Journal of Leukaemia & Lymphoma Research","journal":"oajllr"},{"managejournal":"Journal of Medicinal and Organic Chemistry","journal":"jmoc"},{"managejournal":"Journal of Neonatal Studies","journal":"jns"},{"managejournal":"Journal of Pediatric Neurological Disorders","journal":"pnn"},{"managejournal":"Journal of Pharmaceutical Research and Clinical Practice","journal":"jprcp"},{"managejournal":"Journal of Pharmaceutical Toxicology","journal":"oajpt"},{"managejournal":"Neuroscience and Psychiatry: Open Access","journal":"npoa"},{"managejournal":"Pharmaceutical Bioprocessing","journal":"fmpb"},{"managejournal":"Research on Chronic Diseases","journal":"oarcd"},{"managejournal":"SEO Database","journal":"seo"},{"managejournal":"Stem Cell Research and Regenerative Medicine","journal":"srrm"}]
     */

    private int journal_cnt;
    private boolean status;
    private String message;
    /**
     * managejournal : Advanced Materials Science Research
     * journal : aaamsr
     */

    private List<JournalDetailsBean> journal_details;

    public int getJournal_cnt() {
        return journal_cnt;
    }

    public void setJournal_cnt(int journal_cnt) {
        this.journal_cnt = journal_cnt;
    }

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

    public List<JournalDetailsBean> getJournal_details() {
        return journal_details;
    }

    public void setJournal_details(List<JournalDetailsBean> journal_details) {
        this.journal_details = journal_details;
    }

    public static class JournalDetailsBean {
        private String managejournal;
        private String journal;

        public String getManagejournal() {
            return managejournal;
        }

        public void setManagejournal(String managejournal) {
            this.managejournal = managejournal;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }
    }
}
