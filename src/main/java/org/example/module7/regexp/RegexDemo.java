package org.example.module7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    /*
    RegEx - Regular Expression
    . - будь який символ окрім символа нового рядка (\n)
    \ - скасування спеціального значення
    ^ - на початку рядка
    $ - на кінці рядка

    \d - будь-яке цифра 0-9
    \D - будь яке не число
    \w - будь який словесний символ
    \W - будь який не словесний \n \t
    \s - будь який пробільний символ
    \S - будь який не пробільний

    [abc] - будь який з вказаних
    | - або
    ( ) - групування

    Квантифікатори:
    * - 0 або більше
    + - 1 або більше
    ? - 0 або 1
    {n} - n - кількість
    {n,m} - від n до m
    {n,} - n або більше

    ?= - look forward
    [12][0-9] - два числа, перший один або два, другий будь який від 0 до 9
    10
    11
    ...
    29
     */

    public static final String EMAIL_REGEX = "[a-z0-9]+@[a-z]{1,10}\\.[a-z]{3,4}";
    public static final String DATA_FORMAT_REGEX = "(19|20)\\d\\d([- /.])(0[1-9]|1[012])\\2(0[1-9]|[12][0-9]|3[01])";
    public static void main(String[] args) {
        String s = "Hello from \"Java\"";
        System.out.println(s);

        String email = "mykola@mail.com";
        boolean matches = email.matches(EMAIL_REGEX);
        System.out.println("matches = " + matches);
        String lorem = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur vel pellentesque lorem, vel tempor lacus. 
                Cras a nulla in nunc pellentesque rhoncus nec sit amet enim. Praesent interdum elementum magna. 
                Suspendisse hendrerit malesuada molestie. Mauris aliquet ante nec tortor consectetur, ut commodo lorem cursus. 
                Nunc mattis euismod lacinia. Maecenas vel efficitur massa, quis consectetur erat. 
                Quisque suscipit odio nec volutpat pharetra. Fusce 1900.01.01 convallis, lacus ut ornare posuere, enim dui faucibus ipsum, 
                sit amet suscipit neque mauris non ex. Quisque suscipit lorem non lorem hendrerit maximus. Nunc neque sem, 
                tristique vel enim sed, accumsan dapibus urna.
                                
                Nulla facilisi. Phasellus maximus, arcu sit amet viverra lobortis, magna sem auctor risus, a 
                tempor lorem lorem non dui. Donec eu dapibus risus, quis ornare arcu. 1900 01 01 Nam facilisis et tortor ac bibendum. 
                Aliquam porttitor cursus nisl ac dictum. Sed mattis dui id sagittis facilisis. Vestibulum iaculis non lorem 
                eget porta. Mauris 1900 02 31 tempor erat sit amet neque tincidunt molestie. Maecenas lobortis odio sit amet sem imperdiet 
                aliquam. Fusce cursus egestas nibh, non luctus lorem viverra vitae. Nulla pharetra dolor ac blandit pellentesque. 
                Suspendisse potenti.
                                
                Aliquam tempor, lorem ut varius ullamcorper, lorem tellus pharetra eros, vel egestas velit risus nec risus. 
                Curabitur quis pellentesque diam. Integer at dolor magna. Sed finibus mauris 1900-01-01 ut mattis iaculis. Phasellus semper 
                risus sed magna pretium, vitae finibus dui auctor. Vestibulum eget nisi eu erat vehicula pretium et in sapien. 
                Duis pretium cursus vehicula.
                                
                Vestibulum rutrum sem eget sem posuere sodales. Aliquam dignissim nisi urna, id vestibulum diam euismod a. 
                Integer pellentesque fermentum bibendum. Pellentesque viverra leo lacus, non condimentum nisi vulputate at. 
                Etiam vitae massa sit amet lectus varius ornare. Fusce mauris est, molestie ut velit sit amet, aliquet eleifend mi. 
                Ut non lorem suscipit, pellentesque magna eget, euismod tellus. Donec sed lacus velit. Donec mattis malesuada placerat. 
                Aliquam erat volutpat. Morbi tempor nunc eu lectus efficitur 1900-01-01 elementum. Maecenas ac magna nec ipsum varius bibendum vel 
                nec lectus. Curabitur sed suscipit massa. Duis eget enim in nunc blandit rutrum a in leo.
                """;
        // Pattern Matcher
        Pattern pattern = Pattern.compile(DATA_FORMAT_REGEX);
        Matcher matcher = pattern.matcher(lorem);

//        boolean b = matcher.find();
//        System.out.println(b);
        while (matcher.find()) {
            String result = matcher.group();
            System.out.println("result = " + result);
        }
    }
}
