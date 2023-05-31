package com.esis.jee_projet;


import java.util.Date;
    public class Utilisateurs {
        private int id;
        private String nom;
        private String postnom;
        private String prenom;
        private String email;
        private String phone;
        private Date datenaiss;

        public Utilisateurs(int id, String nom, String postnom, String prenom, String email, String phone, Date datenaiss) {
            this.id = id;
            this.nom = nom;
            this.postnom = postnom;
            this.prenom = prenom;
            this.email = email;
            this.phone = phone;
            this.datenaiss = datenaiss;
        }
        public Utilisateurs(){

        }

        public String getNom() {
            return nom;
        }

        public String getPostnom() {
            return postnom;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public Date getDatenaiss() {
            return datenaiss;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPostnom(String postnom) {
            this.postnom = postnom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setDatenaiss(Date datenaiss) {
            this.datenaiss = datenaiss;
        }


    }
