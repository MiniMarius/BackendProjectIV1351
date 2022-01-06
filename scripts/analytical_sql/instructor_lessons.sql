SELECT
    users.id
    , COUNT(DISTINCT bookings.id) AS total_lessons_given
FROM
    bookings
INNER JOIN
    users
ON bookings.instructor_id = users.id
WHERE
    date_trunc('month', cast(bookings.start_time as date)) = $input_month
GROUP BY
    1
HAVING
    COUNT(DISTINCT bookings.id) > $input_no_lessons
ORDER BY
    2 DESC