select t.Name as TEAM_NAME, j.goals_for as GOALS_FOR, j.goals_agains as GOALS_AGAINST, sum(k.points) as POINTS from (
select m.host_team as team, case
when m.host_goals > m.guest_goals then 3
when m.host_goals < m.guest_goals then 0
else 1
end as points
from my_db.matches m
union all
select m.guest_team, case
when m.host_goals > m.guest_goals then 0
when m.host_goals < m.guest_goals then 3
else 1
end as guest_points
from my_db.matches m) k, my_db.teams t, (
select i.team, sum(i.goals_for) as goals_for, sum(i.goals_agains) as goals_agains
from (
select m.match_id, m.host_team as team, m.host_goals as goals_for, guest_goals as goals_agains
from my_db.matches m
union
select m.match_id,m.guest_team as team, m.guest_goals as goals_for, host_goals as goals_agains
from my_db.matches m) i
group by i.team) j
where k.team=t.id and j.team=t.id
group by t.name
order by 4 desc;