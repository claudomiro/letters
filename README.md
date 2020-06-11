# letters
Projeto prático para IBM

Para rodar o projeto (usando o bash):
(Seguindo a covenção do HackerRank a entrada está no StdIn )
<pre>
mvn install
cat test.txt | mvn exec:java -q -Dexec.mainClass="org.claudomiro.interview.ibm.letters.Main"  > result.txt
cat result.txt
</pre>


**Porque o fonte está em inglês**?

O autor considera essa uma boa prática, pois não se sabe se a equipe que vai manter esse código estará no Cnadá, Israel ou Africa do Sul e o inglês é o que temos mais perto de uma língua universal.


