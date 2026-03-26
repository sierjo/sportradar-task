package com.sportradar_task.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer season;
    private String status;
    private LocalDate dateVenue;
    private LocalTime timeVenue;
    private Integer homeGoals;
    private Integer awayGoals;
    private String winner;

    // Названия колонок соответствуют заданию с префиксом _foreignkey
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "_foreignkey_home_team")
    private Team homeTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "_foreignkey_away_team")
    private Team awayTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "_foreignkey_competition")
    private Competition competition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "_foreignkey_stage")
    private Stage stage;

    public Event(Integer season, String status, LocalDate dateVenue, LocalTime timeVenue, Integer homeGoals, Integer awayGoals, String winner, Team homeTeam, Team awayTeam, Competition competition, Stage stage) {
        this.season = season;
        this.status = status;
        this.dateVenue = dateVenue;
        this.timeVenue = timeVenue;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.winner = winner;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.competition = competition;
        this.stage = stage;
    }

    public Event() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDateVenue() {
        return dateVenue;
    }

    public void setDateVenue(LocalDate dateVenue) {
        this.dateVenue = dateVenue;
    }

    public LocalTime getTimeVenue() {
        return timeVenue;
    }

    public void setTimeVenue(LocalTime timeVenue) {
        this.timeVenue = timeVenue;
    }

    public Integer getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }

    public Integer getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", season=" + season +
                ", status='" + status + '\'' +
                ", dateVenue=" + dateVenue +
                ", timeVenue=" + timeVenue +
                ", homeGoals=" + homeGoals +
                ", awayGoals=" + awayGoals +
                ", winner='" + winner + '\'' +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", competition=" + competition +
                ", stage=" + stage +
                '}';
    }
}
