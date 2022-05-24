# Design Patterns
This report has written with the supervision of Prof. Dr. Mehmet Akşit in order to add new flexibility requirements to the War Game in a scenario that our group members are engineers that work for the game company and we were assigned to make the game more flexible with implementing suitable Design Patterns to the required problem.
## Main Goal
The goal of this report is to analyze the software architecture of the war game,
and to define new flexibility requirements to make the game more scalable,
efficient and flexible. And the main goal is to implement the Design Patterns to
solve the requirement problems that we define. It is aimed that these flexibility
requirements, which will be added while using the design patterns, minimize the
realization costs and increase the compatibility within the software of the game.
It is aimed that the added design patterns add flexibility to the commercial,
quality, functional and system requirements of the project by producing the
already existing components in the project, managing their behavior, or making
them a structure. It is aimed to provide qualifications and contribute to the
elimination of concerns. It is planned that the Design Patterns to be used will
not go beyond the solution areas defined in the game report. It is also aimed to
explain the reason why the patterns has been chosen in the later parts of the
report, together with the presentation of their static structure and dynamic
structure
## Methodology
The method of the project is the method of problem solving. In order to realize
the problem solving method in the project, design patterns are used and it is
aimed to meet the flexibility criteria.
In order to realize the method followed in the project, it is necessary to follow
the project steps in an incremental way. The steps of this project start with
identifying the problem. After the project is understood, the definition, purpose
and requirements of the project are determined. With the determination of the
project design, flexibility is provided in the components of the war game by
using the design patterns in the project.
In order to use Design Patterns, firstly design patterns were learned by
researching. These patterns were primarily created based on the book "Design
Patterns: Elements of Reusable Object-Oriented Software" [1] and also benefited
from various sources. Design Patterns have three categories. These are
Creational Patterns, Behavioral Patterns and Structural Patterns.
The decision of which design pattern will be applied to which component of the
project has been determined to meet the flexibility criterion. In the development
process that followed, it was aimed to add design patterns to the project with the
incremental progression method. In this direction, the design patterns have been
integrated within the project in accordance with the requirements, flexibility and
purpose criteria. Design patterns will be added by two different methods.
1. Patterns to be implemented on the existing architecture of the game
2. Patterns to be implemented by making changes on the project architecture
It is aimed to prove whether the design pattern applied to a certain component of
the war game provides flexibility with the method called “proof of concept”.

## Contents
As mentioned briefly in the introduction section, this report is a document that
the engineers working for the game company will benefit from.
In this context, the second part of the report contains information about the raw
version of the game that has not been developed by our team. In order to better
understand the changes we made on the architecture, the second part contains
summary information about the design of the game.
Then, in the third part of the report, the division of labor of the team members,
information about the flexibility requirements, the advantages and
disadvantages of the candidate patterns are included.
Each team member made 10 Design Pattern proposals and detailed five of them.
The next part of the third part of the report is the part where five of these 10
patterns are detailed. This section is divided into three in itself.
● The matching between requirement problem and the design pattern
● Static class diagram of the pattern
● Dynamic application diagram of the pattern
At the end of the third section, there is information about the test scenarios and
test results for each detailed pattern, the introduction of the code and its
relationship with the structure of the pattern.
The fourth and last part of the report includes explanations about the difficulties
faced by the team members in applying the patterns, the problem-pattern
association, and the final statement about the report.





## Project Paper
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-001.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-002.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-003.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-004.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-005.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-006.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-007.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-008.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-009.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-010.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-011.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-012.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-013.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-014.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-015.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-016.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-017.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-018.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-019.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-020.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-021.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-022.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-023.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-024.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-025.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-026.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-027.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-028.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-029.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-030.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-031.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-032.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-033.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-034.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-035.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-036.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-037.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-038.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-039.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-040.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-041.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-042.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-043.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-044.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-045.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-046.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-047.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-048.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-049.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-050.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-051.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-052.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-053.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-054.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-055.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-056.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-057.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-058.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-059.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-060.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-061.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-062.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-063.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-064.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-065.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-066.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-067.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-068.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-069.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-070.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-071.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-072.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-073.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-074.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-075.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-076.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-077.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-078.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-079.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-080.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-081.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-082.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-083.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-084.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-085.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-086.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-087.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-088.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-089.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-090.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-091.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-092.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-093.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-094.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-095.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-096.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-097.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-098.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-099.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-100.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-101.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-102.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-103.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-104.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-105.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-106.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-107.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-108.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-109.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-110.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-111.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-112.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-113.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-114.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-115.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-116.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-117.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-118.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-119.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-120.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-121.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-122.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-123.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-124.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-125.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-126.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-127.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-128.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-129.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-130.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-131.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-132.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-133.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-134.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-135.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-136.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-137.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-138.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-139.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-140.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-141.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-142.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-143.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-144.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-145.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-146.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-147.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-148.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-149.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-150.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-151.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-152.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-153.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-154.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-155.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-156.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-157.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-158.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-159.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-160.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-161.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-162.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-163.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-164.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-165.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-166.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-167.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-168.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-169.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-170.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-171.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-172.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-173.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-174.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-175.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-176.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-177.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-178.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-179.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-180.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-181.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-182.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-183.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-184.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-185.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-186.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-187.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-188.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-189.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-190.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-191.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-192.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-193.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-194.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-195.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-196.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-197.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-198.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-199.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-200.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-201.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-202.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-203.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-204.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-205.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-206.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-207.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-208.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-209.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-210.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-211.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-212.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-213.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-214.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-215.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-216.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-217.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-218.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-219.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-220.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-221.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-222.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-223.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-224.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-225.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-226.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-227.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-228.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-229.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-230.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-231.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-232.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-233.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-234.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-235.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-236.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-237.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-238.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-239.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-240.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-241.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-242.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-243.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-244.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-245.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-246.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-247.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-248.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-249.jpg?raw=true)
![Image](https://github.com/ardaisker/DesignPatterns/blob/main/Paper/DesignPatternsPaper-250.jpg?raw=true)



## Contact
Arda Isker - ardaegeisker@gmail.com  --- aisker@etu.edu.tr

Baran Özgenç - bozgenc@etu.edu.tr

Elçin Duman - eduman@etu.edu.tr

Taner Furkan Göztok - furkangoztok09@gmail.com --- tfgoztok@etu.edu.tr



Project Link: [https://github.com/ardaisker/DesignPatterns](https://github.com/ardaisker/DesignPatterns) 


## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



## License
Apache License 2.0

