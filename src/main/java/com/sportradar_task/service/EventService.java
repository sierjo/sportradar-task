package com.sportradar_task.service;

import com.sportradar_task.entity.Event;
import com.sportradar_task.entity.Team;
import com.sportradar_task.repository.CompetitionRepository;
import com.sportradar_task.repository.EventRepository;
import com.sportradar_task.repository.StageRepository;
import com.sportradar_task.repository.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;
    private final TeamRepository teamRepository;
    private final CompetitionRepository competitionRepository;
    private final StageRepository stageRepository;

    public EventService(EventRepository eventRepository, TeamRepository teamRepository, CompetitionRepository competitionRepository, StageRepository stageRepository) {
        this.eventRepository = eventRepository;
        this.teamRepository = teamRepository;
        this.competitionRepository = competitionRepository;
        this.stageRepository = stageRepository;
    }

    @Transactional(readOnly = true)
    public List<Event> getAllEvents() {

        return eventRepository.findAllWithDetails();
    }

    @Transactional(readOnly = true)
    public Event getEventById(Integer id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id: " + id));
    }

    @Transactional
    public Event createEvent(Event event) {

        if (event.getCompetition() != null) {
            competitionRepository.save(event.getCompetition());
        }

        if (event.getStage() != null) {
            stageRepository.save(event.getStage());
        }

        if (event.getHomeTeam() != null) {
            Team homeTeam = teamRepository.findBySlug(event.getHomeTeam().getSlug())
                    .orElseGet(() -> teamRepository.save(event.getHomeTeam()));
            event.setHomeTeam(homeTeam);
        }

        if (event.getAwayTeam() != null) {
            Team awayTeam = teamRepository.findBySlug(event.getAwayTeam().getSlug())
                    .orElseGet(() -> teamRepository.save(event.getAwayTeam()));
            event.setAwayTeam(awayTeam);
        }

        return eventRepository.save(event);
    }
}
