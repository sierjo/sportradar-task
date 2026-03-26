document.addEventListener("DOMContentLoaded", () => {
    fetch('/api/events')
        .then(response => response.json())
        .then(data => {
            const tbody = document.querySelector('#eventsTable tbody');
            data.forEach(event => {
                const homeTeam = event.homeTeam ? event.homeTeam.name : 'TBD';
                const awayTeam = event.awayTeam ? event.awayTeam.name : 'TBD';
                const score = event.status === 'played' ? `${event.homeGoals} - ${event.awayGoals}` : 'vs';
                const comp = event.competition ? event.competition.name : 'Unknown';
                const stage = event.stage ? event.stage.name : '';

                const row = `<tr>
                            <td>${event.dateVenue} ${event.timeVenue || ''}</td>
                            <td>${comp} (${stage})</td>
                            <td>${homeTeam}</td>
                            <td>${score}</td>
                            <td>${awayTeam}</td>
                            <td>${event.status}</td>
                        </tr>`;
                tbody.innerHTML += row;
            });
        })
        .catch(error => console.error('Error fetching events:', error));
});