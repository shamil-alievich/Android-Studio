# Android-Studio
java 
/*Начнем с более простого способа - установка лимита с помощью разметки. Для этого необходимо добавить атрибут


android:maxLength="16"

в тег EditText.

Чтобы сделать это же в коде программы, необходимо выполнить следующий код:
*/

EditText editText = ...;
int maxLength = 16;
InputFilter[] FilterArray = new InputFilter[1];
FilterArray[0] = new InputFilter.LengthFilter(maxLength);
editText.setFilters(FilterArray);
