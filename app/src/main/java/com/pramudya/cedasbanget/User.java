package com.pramudya.cedasbanget;

public class User {
    private int id;
    private String username;
    private String email;
    private String alamat;
    private String jenis_kelamin;
    private String password;
    private String no_hp;
    private String tgl_lahir;

    public User(int id, String username, String email, String alamat, String jenis_kelamin, String password, String no_hp, String tgl_lahir) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.alamat = alamat;
        this.jenis_kelamin = jenis_kelamin;
        this.password = password;
        this.no_hp = no_hp;
        this.tgl_lahir = tgl_lahir;
    }

    public User(String username, String email, String alamat, String jenis_kelamin, String password, String no_hp, String tgl_lahir) {
        this.username = username;
        this.email = email;
        this.alamat = alamat;
        this.jenis_kelamin = jenis_kelamin;
        this.password = password;
        this.no_hp = no_hp;
        this.tgl_lahir = tgl_lahir;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }
}
