package ru.mirea.journal;

public class Information {
    private String UI;
    private ActionDoc Act;

    Information(){ } /**коструктор**/

    void writing(int m, String str) {
        if (m % 2 != 0) {               /**если строка нечётная - это пользовательский ID, чётная - действие**/
           setUI(str);

        } else {
            setAct(ActionDoc.valueOf(str));

        }

    }

    public String getUI() { return UI; }              /**геттер пользоватеольского ID**/

    public void setUI(String UI) {   //сеттер пользовательского ID
        this.UI = UI;
    }   /**сеттер пользоватеольского ID**/

    public ActionDoc getAct() {     //геттер ID документа
        return Act;
    }       /**геттер действия в документе**/

    public void setAct(ActionDoc act) { Act = act; }  /**сеттер действия в документе**/
}
