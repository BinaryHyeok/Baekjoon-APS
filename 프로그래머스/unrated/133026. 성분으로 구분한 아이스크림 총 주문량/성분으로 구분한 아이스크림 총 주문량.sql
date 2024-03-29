-- 코드를 입력하세요
SELECT info.INGREDIENT_TYPE, sum(half.TOTAL_ORDER) as TOTAL_ORDER
FROM FIRST_HALF as half
LEFT JOIN ICECREAM_INFO as info
ON half.FLAVOR = info.FLAVOR
GROUP BY info.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC;