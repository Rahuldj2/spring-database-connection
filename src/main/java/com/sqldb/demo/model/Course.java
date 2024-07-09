package com.sqldb.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private String courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_desc")
    private String courseDesc;

    @Column(name = "course_credits")
    private Integer courseCredits;

    @Column(name = "course_medium")
    private String courseMedium;

    @Column(name = "dept_id")
    private String deptId;

    @Column(name = "offered_in_semester")
    private String offeredInSemester;

    @Column(name = "offered_as_uwe")
    private Integer offeredAsUwe;

    @Column(name = "offered_as_me")
    private Integer offeredAsMe;

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public Integer getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(Integer courseCredits) {
        this.courseCredits = courseCredits;
    }

    public String getCourseMedium() {
        return courseMedium;
    }

    public void setCourseMedium(String courseMedium) {
        this.courseMedium = courseMedium;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getOfferedInSemester() {
        return offeredInSemester;
    }

    public void setOfferedInSemester(String offeredInSemester) {
        this.offeredInSemester = offeredInSemester;
    }

    public Integer getOfferedAsUwe() {
        return offeredAsUwe;
    }

    public void setOfferedAsUwe(Integer offeredAsUwe) {
        this.offeredAsUwe = offeredAsUwe;
    }

    public Integer getOfferedAsMe() {
        return offeredAsMe;
    }

    public void setOfferedAsMe(Integer offeredAsMe) {
        this.offeredAsMe = offeredAsMe;
    }
}
