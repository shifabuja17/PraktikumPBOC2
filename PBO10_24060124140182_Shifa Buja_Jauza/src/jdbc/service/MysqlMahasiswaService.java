/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author Advan Workplus
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.utilities.MysqlUtility;
import jdbc.model.Mahasiswa;

public class MysqlMahasiswaService {

    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    /** Membuat objek mahasiswa
     * @return  */
    public Mahasiswa makeMhsObject() {
        Mahasiswa mhs = new Mahasiswa();
        return mhs;
    }

    /** Menambahkan data mahasiswa
     * @param mhs */
    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa(id, nama) VALUES (?, ?)";

        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);

            statement.setInt(1, mhs.getId());
            statement.setString(2, mhs.getNama());

            statement.executeUpdate();

            System.out.println("Data berhasil ditambahkan");

        } catch (SQLException e) {
            System.out.println("Gagal tambah data : " + e.getMessage());
        }
    }

    /** Update data mahasiswa */
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";

        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);

            statement.setString(1, mhs.getNama());
            statement.setInt(2, mhs.getId());

            statement.executeUpdate();

            System.out.println("Data berhasil diupdate");

        } catch (SQLException e) {
            System.out.println("Gagal update data : " + e.getMessage());
        }
    }

    /** Delete data mahasiswa sesuai id
     * @param id */
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id=?";

        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);

            statement.setInt(1, id);

            statement.executeUpdate();

            System.out.println("Data berhasil dihapus");

        } catch (SQLException e) {
            System.out.println("Gagal hapus data : " + e.getMessage());
        }
    }

    /** Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;

        String sql = "SELECT * FROM mahasiswa WHERE id=?";

        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);

            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                mhs = new Mahasiswa();

                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }

        } catch (SQLException e) {
            System.out.println("Gagal ambil data : " + e.getMessage());
        }

        return mhs;
    }

    /** Ambil semua isi tabel mahasiswa
     * @return  */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();

        String sql = "SELECT * FROM mahasiswa";

        try {
            PreparedStatement statement = koneksi.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();

                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));

                list.add(mhs);
            }

        } catch (SQLException e) {
            System.out.println("Gagal ambil semua data : " + e.getMessage());
        }

        return list;
    }
}