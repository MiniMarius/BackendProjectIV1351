SELECT
    avg(total_lessons_held) AS avg_total_lessons_held
    , avg(total_individiual_lessons_held) AS avg_total_individiual_lessons_held
    , avg(total_ensemble_lessons_held) AS avg_total_ensemble_lessons_held
    , avg(total_group_lessons_held) AS avg_total_group_lessons_held

FROM
(
    SELECT
        extract(month from cast(bookings.start_time as date)) AS start_month
        , count(distinct bookings.id) AS total_lessons_held
        , count(distinct CASE WHEN lessons.type = 'individual' THEN bookings.id ELSE NULL END) AS total_individiual_lessons_held
        , count(distinct CASE WHEN lessons.type = 'ensemble' THEN bookings.id ELSE NULL END) AS total_ensemble_lessons_held
        , count(distinct CASE WHEN lessons.type = 'group' THEN bookings.id ELSE NULL END) AS total_group_lessons_held
    FROM
        bookings
    INNER JOIN
        lessons
    ON bookings.lesson_id = lessons.id
    WHERE
        extract(year from cast(bookings.start_time as date)) = 2022
    GROUP BY
        1
) as a;
