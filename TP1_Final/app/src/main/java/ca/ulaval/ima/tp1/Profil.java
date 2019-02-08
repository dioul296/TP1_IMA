package ca.ulaval.ima.tp1;

import android.os.Parcel;
import android.os.Parcelable;

import java.sql.Date;

public class Profil implements Parcelable {
    private String nom;
    private String prenom;
    private java.util.Date dateNaissance;
    private  String idul;


    public Profil(String nom, String prenom, java.util.Date dateNaissance, String idul) {
        this.nom=nom;
        this.prenom=prenom;
        this.dateNaissance= dateNaissance;
        this.idul=idul;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public java.util.Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getIdul() {
        return idul;
    }

    public void setIdul(String idul) {
        this.idul = idul;
    }


    protected Profil(Parcel in) {
        nom = in.readString();
        prenom = in.readString();
        dateNaissance = (java.util.Date) in.readSerializable();
        idul = in.readString();

    }

    public static final Creator<Profil> CREATOR = new Creator<Profil>() {
        @Override
        public Profil createFromParcel(Parcel in) {
            return new Profil(in);
        }

        @Override
        public Profil[] newArray(int size) {
            return new Profil[size];
        }
    };



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nom);
        parcel.writeString(prenom);
        parcel.writeSerializable(dateNaissance);
        parcel.writeString(idul);
    }


}
