package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity(name = "objects_data")
//@Table(name = "objects_data", schema = "bootcamp_final_project")
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
    @Column (name = "object_id")
//    @GeneratedValue(strategy=GenerationType.TABLE)
    private int id;
    @Column (name = "object_image")
    private String image;
    @Column (name = "object_name")
    private String name;
    @Column (name = "object_address")
    private String address;
    @Column (name = "object_phone")
    private String phone;
    @Column (name = "object_region_id")
    private int region; //was Region.class
    @Column (name = "object_type_id")
    private int type; // was Type.class
    @Column (name = "object_subtype_id")
    private int subtype; // was Subtype.class

    @Override
    public String toString() {
        return "ObjectsData{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", region=" + region +
                ", type=" + type +
                ", subtype=" + subtype +
                '}';
    }
}

//    public static ObjectsData createObject(ResultSet rs) {
//
//        ObjectsData objectsData = null;
//        try {
//            objectsData = new ObjectsData(rs.getInt("object_id"),
//                    rs.getString("object_image"),
//                    rs.getString("object_name"),
//                    rs.getString("object_address"),
//                    rs.getString("object_phone"),
//                    rs.getInt("object_region_id"),
//                   rs.getInt("object_type_id"),
//                    rs.getInt("object_subtype_id"));
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return objectsData;
//    }

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



