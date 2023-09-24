# HR-management
 
## **HW_20092023**

## **[Class: Employee](HR-management/src/main/java/org/example/Employee.java)**
> ## Fields:
>> - id
>> - name
>> - surname
>> - grade
>> - salary
>> - bonusPCT (% bonus yearly)
>> - hasPlanBeenCompleted

## **[Class: Grade (A, B, C, D)](HR-management/src/main/java/org/example/Grade.java)**
## **[Class: Department (SALES, HR, FINANCE, SECURITY, ADMINISTRATION)](HR-management/src/main/java/org/example/Department.java)**
## **[Class: Generator](HR-management/src/main/java/org/example/Generator.java)**
> ## Methods:
>> - [empIdGen](https://github.com/DmitriDjourov/HR-management/blob/2ba5828abf00682cf8a2e55d8cecd5bb28628bdb/HR-management/src/main/java/org/example/Generator.java#L11C11-L11C11) - (has to generate id format: "EMP%********".  * - some digits)
>> - [empGen](https://github.com/DmitriDjourov/HR-management/blob/2ba5828abf00682cf8a2e55d8cecd5bb28628bdb/HR-management/src/main/java/org/example/Generator.java#L16C28-L16C28) - (creates 40 employees. Use Faker(Фэйкер, не Факер))) dependency
>>  https://mvnrepository.com/artifact/com.github.javafaker/javafaker to generate what you want)

## **[Class: SetUP:](HR-management/src/main/java/org/example/SetUp.java)**
## Method:
>> - setUP - (fill List<Employee>)

## **[Class: ServiceCollection](HR-management/src/main/java/org/example/ServiceCollection.java)**
## Methods:
>> - [показать всех отсортировав по имени](https://github.com/DmitriDjourov/HR-management/blob/048844f405469f49b6565f98adde5c6c1f354a25/HR-management/src/main/java/org/example/ServiceCollection.java#L11)
>> - [показать всех отсортировав по зарплате](https://github.com/DmitriDjourov/HR-management/blob/048844f405469f49b6565f98adde5c6c1f354a25/HR-management/src/main/java/org/example/ServiceCollection.java#L16)
>> - [показать имя, фамилию, департамент и грейд](https://github.com/DmitriDjourov/HR-management/blob/048844f405469f49b6565f98adde5c6c1f354a25/HR-management/src/main/java/org/example/ServiceCollection.java#L21)
>> - показать среднюю зарплату по департаментам
>> - показать имя, фамилию и грейд только у тех кто выполнил план. hasPlanBeenCompleted = тру
>> - повысить % бонуса у всех сотрудников того департамента, в котором больше всего сотрудников hasPlanBeenCompleted = тру,
>> если таких несколько то повысить у всех.
>> - понизить % бонуса у департамента у которого меньше всего сотрудников выполнило план, если таких несколько то у всех
>> - у департамента продаж взять всех кто выполнили план и если у сотруднка который выполнил план грейд А то повысить зп и бонус,
>> если грейд ниже то повысить на 1 ступень и только зп.

## Во всех методах НЕ ИСПОЛЬЗОВАТЬ System-out. Все методы должны возвращать значение.
## Все выводы на экран только в метода [мэйн](HR-management/src/main/java/org/example/Main.java).

## Метод [мэйн](HR-management/src/main/java/org/example/Main.java) будет лежать в отдельном классе.
## В методе [мэйн](HR-management/src/main/java/org/example/Main.java) только запуск методов и никаких созданий сотрудников итд, за исключением вызова метода.

## !!!!СДЕЛАТЬ ОТДЕЛЬНЫЙ ПРОЕКТ В РЕПОЗИТОРИИ, НЕ ОТДЕЛЬНОЙ ПАПКОЙ, А ОТДЛЬНЫМ ПРОЕКТОМ.
## ПОТОМ БУДЕМ ДОПИСЫВАТЬ ФУНКЦИОНАЛ ТУДА ЖЕ.
