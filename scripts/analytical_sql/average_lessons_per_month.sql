SELECT
    total_lessons_held / 12.0 AS avg_total_lessons_held
    , total_individiual_lessons_held / 12.0 AS avg_total_individiual_lessons_held
    , total_ensemble_lessons_held / 12.0 AS avg_total_ensemble_lessons_held
    , total_group_lessons_held / 12.0 AS avg_total_group_lessons_held

FROM
(
    SELECT
        count(distinct bookings.id) AS total_lessons_held
        , count(distinct CASE WHEN lessons.type = 'individual' THEN bookings.id ELSE NULL END) AS total_individiual_lessons_held
        , count(distinct CASE WHEN lessons.type = 'ensemble' THEN bookings.id ELSE NULL END) AS total_ensemble_lessons_held
        , count(distinct CASE WHEN lessons.type = 'group' THEN bookings.id ELSE NULL END) AS total_group_lessons_held
    FROM
        bookings
    INNER JOIN
        lessons
    ON bookings.lesson_id = lessons.id
    WHERE
        extract(year from cast(bookings.start_time as date)) = #{input_year}
) as a;

