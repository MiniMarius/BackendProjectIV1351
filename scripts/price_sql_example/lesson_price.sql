WITH
    sibling_discount
    AS (
    SELECT
        student_id
    FROM
        siblings
    INNER JOIN
        bookings
    ON siblings.student_id = bookings.student_id
    INNER JOIN
        bookings
    ON siblings.student_id2 = bookings.student_id
    WHERE
        bookings.start_time BETWEEN $start_time AND $end_time
    )

SELECT
lessons.student_id
, SUM(
CASE
    WHEN lessons.skill_level = 'beginner'
    THEN 5
    WHEN lessons.skill_level = 'intermediate'
    THEN 10
    WHEN lessons.skill_level = 'advanced'
    THEN 20
    ELSE 0
END
+
CASE
    WHEN lessons.type = 'group'
    THEN 2
    WHEN lessons.type = 'individual'
    THEN 10
    WHEN lessons.type = 'ensemble'
    THEN 20
    ELSE 0
END
)
-- sibling discount
* CASE WHEN sibling_discount.student_id IS NOT NULL THEN 0.9 ELSE 1.0 END
AS total_price_lessons

FROM
    lessons
INNER JOIN
    bookings
ON lessons.id = bookings.lesson_id
LEFT JOIN
    sibling_discount
ON sibling_discount.student_id = bookings.student_id
WHERE
    bookings.start_time BETWEEN $start_time AND $end_time