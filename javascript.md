#JavaScript
- [Какие есть области видимости?](#какие-есть-области-видимости)
- [Что такое bind? call & apply?](#что-такое-bind-call--apply)
- [Потеря контекста в js?](#потеря-контекста-в-js)
- [js однопоточный или многопоточный?](#js-однопоточный-или-многопоточный)
- [Что такое closure в js?](#что-такое-closure-в-js)
- [Как проверить присутствует ли идентификатор в html?](#как-проверить-присутствует-ли-идентификатор-в-html)
- [2 функции с одинаковам названием, но разным количеством параметров, могут ли быть проблемы?](#2-функции-с-одинаковам-названием-но-разным-количеством-параметров-могут-ли-быть-проблемы)

## Какие есть области видимости?
+ Локальная область видимости (уровня функции)
+ Глобальная область видимости
###### Relative links:
+ https://getinstance.info/articles/javascript/variables-scope-in-javascript/

## Что такое bind? call & apply?
call()/apply() to invoke the function immediately. bind() returns a bound function that, when executed later, will have the correct context ("this") for calling the original function. So bind() can be used when the function needs to be called later in certain events when it's useful.
###### Relative links:
+ https://www.codementor.io/niladrisekhardutta/how-to-call-apply-and-bind-in-javascript-8i1jca6jp

## Потеря контекста в js?
this is set primarily by how the function is called, not where it's defined. 
###### Relative links:
+ https://stackoverflow.com/questions/30486345/losing-this-context-in-javascript-when-passing-around-members
+ https://ru.stackoverflow.com/questions/535030/%D0%9F%D0%BE%D1%82%D0%B5%D1%80%D1%8F-%D0%BA%D0%BE%D0%BD%D1%82%D0%B5%D0%BA%D1%81%D1%82%D0%B0-%D0%B2%D1%8B%D0%B7%D0%BE%D0%B2%D0%B0

## js однопоточный или многопоточный?
Javascript is a single threaded language. This means it has one call stack and one memory heap. As expected, it executes code in order and must finish executing a piece code before moving onto the next.
###### Relative links:
- https://dev.to/steelvoltage/if-javascript-is-single-threaded-how-is-it-asynchronous-56gd

## Что такое closure в js?
A closure is an inner function that has access to the outer (enclosing) function’s variables—scope chain. The closure has three scope chains: it has access to its own scope (variables defined between its curly brackets), it has access to the outer function’s variables, and it has access to the global variables.
###### Relative links:
- https://javascriptissexy.com/understand-javascript-closures-with-ease/

## Как проверить присутствует ли идентификатор в html?
here's an easy way to do it with jQuery:
```
if ($('#elementId').length > 0) {
  // exists.
}
```
And if you can't use 3rd-party libraries, just stick to base JavaScript:
```
var element =  document.getElementById('elementId');
if (typeof(element) != 'undefined' && element != null)
{
  // exists.
}
```
###### Relative links:
- https://stackoverflow.com/questions/5629684/how-to-check-if-element-exists-in-the-visible-dom

## 2 функции с одинаковам названием, но разным количеством параметров, могут ли быть проблемы?
it is not possible to overload functions in Javascript
###### Relative links:
- https://stackoverflow.com/questions/456177/function-overloading-in-javascript-best-practices
