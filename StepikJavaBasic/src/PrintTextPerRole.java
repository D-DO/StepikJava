public class PrintTextPerRole {
    public static void main(String[] args) {

        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Федя",
                "Лука Лукич",
                "Иван"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};


        System.out.println(printTextPerRole(roles, textLines));
    }


    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder str = new StringBuilder("");
        for (String role : roles) {
            str.append(role).append(":").append('\n');
            int i = 1;
            for (String text : textLines) {
                if (text.startsWith(role.concat(":"))) {
//                    text = text.substring(role.length() + 1, text.length());
                    text = text.replaceFirst(role.concat(":"),"");
                    str.append(i).append(")").append(text).append('\n');
                    i++;
                }
                for (String othersRole : roles) {
                    if (othersRole != role) {
                        if (text.startsWith(othersRole.concat(":"))) {
                            i++;
                        }
                    }
                }
            }
            str.append('\n').append('\n');
        }
        return str.toString();
    }

}
