package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
@Entity
//@Table(name = "objects_data")
public class ObjectsData {

    protected ObjectsData() {

    }

    public ObjectsData(int id, String image, String name, String address, String phone, int region, int type, int subtype) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.region = region;
        this.type = type;
        this.subtype = subtype;
    }

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column
    private String image;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private int region; //was Region.class
    @Column
    private int type; // was Type.class
    @Column
    private int subtype; // was Subtype.class

    @Override
    public String toString() {
        return "Object{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", region=" + region +
                ", type=" + type +
                ", subtype=" + subtype +
                '}';
    }

    public static ObjectsData createObject(ResultSet rs) {

        ObjectsData objectsData = null;
        try {
            objectsData = new ObjectsData(rs.getInt("object_id"),
                    rs.getString("object_image"),
                    rs.getString("object_name"),
                    rs.getString("object_address"),
                    rs.getString("object_phone"),
                    rs.getInt("object_region_id"),
                   rs.getInt("object_type_id"),
                    rs.getInt("object_subtype_id"));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return objectsData;
    }

//    public static String getSelectSql() {
//        return SELECT_QUERY;
//    }

//    public static EntityBase getEntity(ResultSet rs) {
//        return TourismObject.createObject(rs);
//    }
//
//    public static String getSelectByIdSql() {
//        return getSelectSql() + " " + " where object_id = ?";
//    }


}
