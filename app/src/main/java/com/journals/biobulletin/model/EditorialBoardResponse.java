package com.journals.biobulletin.model;

import java.util.List;

public class EditorialBoardResponse {


    /**
     * editorialboardarr : [{"ename":"Michaela Cellina","editor_description":"Resident in Radiology, Radiology Department, ASST Fatebenefratelli Sacco piazza Principessa Clotilde 3, Milan, Italy","editor_type":"Editorial advisory board"},{"ename":"Keyvan Farahani","editor_description":"Program Specialist, Cancer Imaging Program, Division of Cancer Treatment and Diagnosis, National Cancer Institute, USA","editor_type":"Editorial Advisory Board"},{"ename":"Nihaal Reddy Kushkulla","editor_description":"Pediatric Neuroradiology and Pediatric Radiology, Johns Hopkins Hospital, Baltimore, USA","editor_type":"Editorial Advisory Board"},{"ename":"Sanjiv Sam Gambhir","editor_description":"Director, Molecular Imaging Program at Stanford, Stanford University, USA","editor_type":"Editorial Advisory Board"},{"ename":"Giesel Frederik L","editor_description":"University Hospital Heidelberg, Department of Nuclear Medicine, Heidelberg, Germany","editor_type":"Editorial Advisory Board"},{"ename":"Marco Fiore","editor_description":"Department of Anesthesiological, Surgical and Emergency Sciences, Italy","editor_type":"Editorial Advisory Board"},{"ename":"Francesco Loria","editor_description":"Diagnostic Radiology - Radiation Oncology, Dirigente Medico Di I Livello Dept of Radiology Palmi Hospital","editor_type":"Editorial Advisory Board"},{"ename":"Fabio Presotto","editor_description":"Head of Internal Medicine Unit, Department of Medicine, Hospital dell'Angelo, Mestre-Venice, Italy","editor_type":"Editorial Advisory Board"},{"ename":"Ertan Sahin","editor_description":"Department of Nuclear Medicine, Namik Kemal University, Turkey","editor_type":"Editorial Advisory Board"},{"ename":"Khaled M Soliman","editor_description":"Consultant Medical Physicist, Medical Physics department, Prince Sultan Military Medical City, Riyadh, Saudi Arabia","editor_type":"Editorial Advisory Board"},{"ename":"Guenther J. Kraus","editor_description":"Section chief, Diagnosezentrum Urania, Laurenzerberg, Vienna, Austria","editor_type":"Editorial Advisory Board"},{"ename":"Tapas Kumar Sar","editor_description":"Dept. of Veterinary Pharmacology & Toxicology, India","editor_type":"Editorial Advisory Board"},{"ename":"N.Dhineksh Kumar","editor_description":"Edens Dental and Maxillofacial Hospital Pvt ltd, India","editor_type":"Editorial Advisory Board"},{"ename":"Rajul Rastogi","editor_description":"Department of Radiology, Teerthanker Mahaveer Medical College & Research Center, India","editor_type":"Editorial Advisory Board"},{"ename":"Giovanni Maria Carlomagno","editor_description":"Emeritus Professor of Aerospace and Mechanical Engineering Università degli Studi di Napoli \"Federico II\" Department of Industrial Engineering (DIAS), Italy","editor_type":"Editorial Advisory Board"},{"ename":"Raimund Kleiser","editor_description":"Line imaging center, Institute of Neuroradiology, Kepler Universitätsklinikum GmbH, Neuromed Campus, Austria","editor_type":"Editorial Advisory Board"},{"ename":"Fazli Yanik","editor_description":"Assist. Prof. Dr., Trakya University Thoracic Surgery","editor_type":"Editorial Advisory Board"},{"ename":"Fathima Fijula Palot Manzil","editor_description":"Assistant Professor of Clincal Radiology at Weill Cornell Medicie, Qatar.","editor_type":"Editorial Advisory Board"},{"ename":"Bouguila  Jed","editor_description":"Department of ENT, Maxillofacial Surgery and Aesthetic Surgery. La Rabta Hospital in Tunis-Tunisia","editor_type":"Editorial Advisory Board"},{"ename":"Hariom Gupta","editor_description":"Analytical Discipline and Centralized Instrument Facility (ADCIF) CSIR-Central Salt & Marine Chemicals Research Institute, India","editor_type":"Editorial Advisory Board"},{"ename":"Vyacheslav Kalchenko","editor_description":"Department of Veterinary Resources, Weizmann Institute of Science, Israel","editor_type":"Editorial Advisory Board"}]
     * editorial_cnt : 21
     */

    private int editorial_cnt;
    /**
     * ename : Michaela Cellina
     * editor_description : Resident in Radiology, Radiology Department, ASST Fatebenefratelli Sacco piazza Principessa Clotilde 3, Milan, Italy
     * editor_type : Editorial advisory board
     */

    private List<EditorialboardarrBean> editorialboardarr;

    public int getEditorial_cnt() {
        return editorial_cnt;
    }

    public void setEditorial_cnt(int editorial_cnt) {
        this.editorial_cnt = editorial_cnt;
    }

    public List<EditorialboardarrBean> getEditorialboardarr() {
        return editorialboardarr;
    }

    public void setEditorialboardarr(List<EditorialboardarrBean> editorialboardarr) {
        this.editorialboardarr = editorialboardarr;
    }

    public static class EditorialboardarrBean {
        private String ename;
        private String editor_description;
        private String editor_type;

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getEditor_description() {
            return editor_description;
        }

        public void setEditor_description(String editor_description) {
            this.editor_description = editor_description;
        }

        public String getEditor_type() {
            return editor_type;
        }

        public void setEditor_type(String editor_type) {
            this.editor_type = editor_type;
        }
    }
}
