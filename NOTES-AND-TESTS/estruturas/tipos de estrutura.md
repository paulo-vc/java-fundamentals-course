o básico de sempre:

//condicionais
if-else
switch-case

//repeticao
for
for em array (variavel.length) ou for(Tipo variavel : variavel) (for-each)
while
do-while

// condição ternária: substitui o if/else
// composto por 3 partes: condição, resultado verdadeiro e resultado falso.

int nota = 7;
String resultado = nota >=7 ? "Aprovado" : "Reprovado";



//exceções
try-catch-finally
throw

try{ //permite que você defina um bloco de código para ser testado quanto a erros
    bloco de código
}
catch(Exception e){ //permite definir um bloco de código a ser executado caso ocorra erro no bloco try
    qual exceção, bloco de código
}

exceções
checked and unchecked exceptions
O que determina uma exceção ser classificado como checada ou não checada ?
É o risco dela ser disparada logo você precisa tratá-la, exemplo: