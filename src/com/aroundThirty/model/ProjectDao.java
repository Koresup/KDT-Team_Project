package com.aroundThirty.model;

import com.aroundThirty.JdbcUtil;
import com.aroundThirty.Resource.Resource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectDao {
    public static final String SQL_XML_SELECT = "SELECT * FROM XML";
    public static final String SQL_REPORT_SELECT = "SELECT * FROM REPORT";
    public static final String SQL_REPORT_REPLY_SELECT = "SELECT * FROM REPORT_REPLY";
    public static final String SQL_MISSING_SELECT = "SELECT * FROM MISSING";
    public static final String SQL_MISSING_REPLY_SELECT = "SELECT * FROM MISSING_REPLY";
    public static final String SQL_TEMPORARY_SELECT = "SELECT * FROM TEMPORARY";
    public static final String SQL_TEMPORARY_REPLY_SELECT = "SELECT * FROM TEMPORARY_REPLY";
    public static final String SQL_ADOPT_SELECT = "SELECT * FROM ADOPT";
    public static final String SQL_ADOPT_REPLY_SELECT = "SELECT * FROM ADOPT_REPLY";

    public static final String SQL_REPORT_INSERT = "INSERT INTO REPORT(report_Datetime, report_Place, kind_Report, phone_Num, detail, post_Create_Datetime, post_Modify_Datetime, User_ID) VALUES (?,?,?,?,?,?,?,?)";
    public static final String SQL_REPORT_REPLY_INSERT = "INSERT INTO REPORT_REPLY(report_Datetime, report_Place, kind_Report, phone_Num, detail, post_Create_Datetime, post_Modify_Datetime, User_ID) VALUES (?,?,?,?,?,?,?,?)";
    public static final String SQL_MISSING_INSERT = "INSERT INTO MISSING(report_Datetime, report_Place, kind_Report, phone_Num, detail, post_Create_Datetime, post_Modify_Datetime, User_ID) VALUES (?,?,?,?,?,?,?,?)";
    public static final String SQL_MISSING_REPLY_INSERT = "INSERT INTO MISSING_REPLY(report_Datetime, report_Place, kind_Report, phone_Num, detail, post_Create_Datetime, post_Modify_Datetime, User_ID) VALUES (?,?,?,?,?,?,?,?)";
    public static final String SQL_TEMPORARY_INSERT = "INSERT INTO TEMPORARY(report_Datetime, report_Place, kind_Report, phone_Num, detail, post_Create_Datetime, post_Modify_Datetime, User_ID) VALUES (?,?,?,?,?,?,?,?)";
    public static final String SQL_TEMPORARY_REPLY_INSERT = "INSERT INTO TEMPORARY_REPLY(report_Datetime, report_Place, kind_Report, phone_Num, detail, post_Create_Datetime, post_Modify_Datetime, User_ID) VALUES (?,?,?,?,?,?,?,?)";
    public static final String SQL_ADOPT_INSERT = "INSERT INTO ADOPT(report_Datetime, report_Place, kind_Report, phone_Num, detail, post_Create_Datetime, post_Modify_Datetime, User_ID) VALUES (?,?,?,?,?,?,?,?)";
    public static final String SQL_ADOPT_REPLY_INSERT = "INSERT INTO ADOPT_REPLY(report_Datetime, report_Place, kind_Report, phone_Num, detail, post_Create_Datetime, post_Modify_Datetime, User_ID) VALUES (?,?,?,?,?,?,?,?)";

    public static final String SQL_REPORT_UPDATE = "UPDATE REPORT SET ID=?, NAME=?, AGE=? WHERE NO=?";
    public static final String SQL_REPORT_REPLY_UPDATE = "UPDATE REPORT_REPLY SET ID=?, NAME=?, AGE=? WHERE NO=?";
    public static final String SQL_MISSING_UPDATE = "UPDATE MISSING SET ID=?, NAME=?, AGE=? WHERE NO=?";
    public static final String SQL_MISSING_REPLY_UPDATE = "UPDATE MISSING_REPLY SET ID=?, NAME=?, AGE=? WHERE NO=?";
    public static final String SQL_TEMPORARY_UPDATE = "UPDATE TEMPORARY SET ID=?, NAME=?, AGE=? WHERE NO=?";
    public static final String SQL_TEMPORARY_REPLY_UPDATE = "UPDATE TEMPORARY_REPLY SET ID=?, NAME=?, AGE=? WHERE NO=?";
    public static final String SQL_ADOPT_UPDATE = "UPDATE ADOPT SET ID=?, NAME=?, AGE=? WHERE NO=?";
    public static final String SQL_ADOPT_REPLY_UPDATE = "UPDATE ADOPT_REPLY SET ID=?, NAME=?, AGE=? WHERE NO=?";

    public static final String SQL_REPORT_DELETE = "DELETE FROM REPORT WHERE NO=?";
    public static final String SQL_REPORT_REPLY_DELETE = "DELETE FROM REPORT_REPLY WHERE NO=?";
    public static final String SQL_MISSING_DELETE = "DELETE FROM MISSING WHERE NO=?";
    public static final String SQL_MISSING_REPLY_DELETE = "DELETE FROM MISSING_REPLY WHERE NO=?";
    public static final String SQL_TEMPORARY_DELETE = "DELETE FROM TEMPORARY WHERE NO=?";
    public static final String SQL_TEMPORARY_REPLY_DELETE = "DELETE FROM TEMPORARY_REPLY WHERE NO=?";
    public static final String SQL_ADOPT_DELETE = "DELETE FROM ADOPT WHERE NO=?";
    public static final String SQL_ADOPT_REPLY_DELETE = "DELETE FROM ADOPT_REPLY WHERE NO=?";

    public static final String SQL_REPORT_SELECT_ONE = "SELECT * FROM REPORT WHERE NO=?";
    public static final String SQL_MISSING_SELECT_ONE = "SELECT * FROM MISSING WHERE NO=?";
    public static final String SQL_TEMPORARY_SELECT_ONE = "SELECT * FROM TEMPORARY WHERE NO=?";
    public static final String SQL_ADOPT_SELECT_ONE = "SELECT * FROM ADOPT WHERE NO=?";

    public static final String SQL_REPORT_SELECT_BY_ID = "SELECT * FROM REPORT WHERE ID=?";
    public static final String SQL_MISSING_SELECT_BY_ID = "SELECT * FROM MISSING WHERE ID=?";
    public static final String SQL_TEMPORARY_SELECT_BY_ID = "SELECT * FROM TEMPORARY WHERE ID=?";
    public static final String SQL_ADOPT_SELECT_BY_ID = "SELECT * FROM ADOPT WHERE ID=?";

    public static final String SQL_REPORT_SELECT_BY_NAME = "SELECT * FROM REPORT WHERE NAME=?";
    public static final String SQL_MISSING_SELECT_BY_NAME = "SELECT * FROM MISSING WHERE NAME=?";
    public static final String SQL_TEMPORARY_SELECT_BY_NAME = "SELECT * FROM TEMPORARY WHERE NAME=?";
    public static final String SQL_ADOPT_SELECT_BY_NAME = "SELECT * FROM ADOPT WHERE NAME=?";

    public static Statement stmt = null;
    public static PreparedStatement pstmt = null;
    public static ResultSet rs = null;
    public static Connection conn = null;

    public static void postInput(PostDto postDto) {
        try {
            conn = JdbcUtil.getConnection();
            switch (postDto.getPostNo()){
                case 1:
                    pstmt = conn.prepareStatement(SQL_REPORT_INSERT);
                    break;
//                case 2:
//                    pstmt = conn.prepareStatement(SQL_REPORT_REPLY_INSERT);
//                    break;
                case 2:
                    pstmt = conn.prepareStatement(SQL_MISSING_INSERT);
                    break;
//                case 4:
//                    pstmt = conn.prepareStatement(SQL_MISSING_REPLY_INSERT);
//                    break;
                case 3:
                    pstmt = conn.prepareStatement(SQL_TEMPORARY_INSERT);
                    break;
//                case 6:
//                    pstmt = conn.prepareStatement(SQL_TEMPORARY_REPLY_INSERT);
//                    break;
                case 4:
                    pstmt = conn.prepareStatement(SQL_ADOPT_INSERT);
                    break;
//                case 8:
//                    pstmt = conn.prepareStatement(SQL_ADOPT_REPLY_INSERT);
//                    break;
            }
            pstmt.setString(1, postDto.getPostDt());
            pstmt.setString(2, postDto.getPostPlace());
            pstmt.setString(3, postDto.getKindPost());
            pstmt.setString(4, postDto.getPhoneNum());
            pstmt.setString(5, postDto.getDetail());
            pstmt.setString(6, postDto.getPostCreateDt());
            pstmt.setString(7, postDto.getPostModifyDt());
            pstmt.setString(8, postDto.getUserId());
            int cnt = pstmt.executeUpdate();
            if (cnt == 0) {
                System.out.println(">>> 입력 실패!");
                conn.rollback();
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception....");
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                JdbcUtil.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<PostDto> postselectAll() {
        List<PostDto> list = new ArrayList<PostDto>();
        conn = JdbcUtil.getConnection();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL_REPORT_SELECT);
            while (rs.next()) {
                int no = rs.getInt(1);
                // String id = rs.getString(2);
                // String name = rs.getString(3);
                // int age = rs.getInt(4);
                String report_Datetime = rs.getString(2);
                String report_Place = rs.getString(3);
                String kind_Report = rs.getString(4);
                String phone_Num = rs.getString(5);
                String detail = rs.getString(6);
                String post_Create_Detertime = rs.getString(7);
                String post_Modify_Datertime = rs.getString(8);
                String User_ID = rs.getString(9);

                list.add(new PostDto(report_Datetime,report_Place,kind_Report,
                        phone_Num,detail,post_Create_Detertime,post_Modify_Datertime,
                        User_ID));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                JdbcUtil.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


    public void postDelete() {

    }

    public void showPost() {

    }

    public void showPostAll() {

    }

    public void postModity() {

    }

    public void replyInput() {

    }

    public void replyDelete() {

    }

    public void showReplyAll() {

    }

    public void replyModity() {

    }

}
