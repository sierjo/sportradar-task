package com.sportradar_task.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String slug;

    private String name;
    private String officialName;
    private String abbreviation;
    private String teamCountryCode;

    public Team() {
    }

    public Team(Integer id, String slug, String name, String officialName, String abbreviation, String teamCountryCode) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.officialName = officialName;
        this.abbreviation = abbreviation;
        this.teamCountryCode = teamCountryCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getTeamCountryCode() {
        return teamCountryCode;
    }

    public void setTeamCountryCode(String teamCountryCode) {
        this.teamCountryCode = teamCountryCode;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                ", officialName='" + officialName + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", teamCountryCode='" + teamCountryCode + '\'' +
                '}';
    }
}
