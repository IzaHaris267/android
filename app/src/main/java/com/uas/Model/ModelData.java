package com.uas.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelData {

    @SerializedName("id")
    @Expose
    private String Id;

    @SerializedName("nama")
    @Expose
    private String nama;

    @SerializedName("bahan")
    @Expose
    private String bahan;

    @SerializedName("langkah")
    @Expose
    private String langkah;

    public static final String id = "ID";
    public static final String nama = "ID";
    public static final String bahan= "ID";
    public static final String langkah= "ID";

    public ModelData(String id, String nama, String bahan, String langkah) {
        this.id = id;
        this.nama = nama;
        this.bahan = bahan;
        this.langkah = langkah;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getid() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setid(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * 
     * @param nama
     *     The Nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * 
     * @return
     *     The bahan
     */
    public String getBahan() {
        return bahan;
    }

    /**
     * 
     * @param bahan
     *     The Bahan
     */
    public void setLangkah(String langkah) {
        this.langkah = langkah;
    }

}
