package by.instruction.papera;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //объявляем переменные для кнопки назад
    private long backPressedTime;
    private Toast backToast;
    //конец объявления переменных для кнопки назад

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapter> chapterList;
    List<Topics> topicsList;

    //объявляем новые переменные для поиска 26/02/2023
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    String[] codingList = {"",""};
    //финал. Судя по всему в кодинг лист надо будет вписать все названия

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                //пишем код пописка
        listView = findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_customtext,codingList);
        listView.setAdapter(arrayAdapter);
        //финал кода поиска

        expandableListView= (ExpandableListView)findViewById(R.id.expandableListView);
        addData();
        sendData();

    }

    void addData()
    {
        //single time
        chapterList=new ArrayList<>();

        //multiple time
        topicsList=new ArrayList<>();

        //chapter 1 - добавлять по ходу сколько надо t01~10
        topicsList.add(new Topics("1. Конституция Республики Беларусь", "t001"));
        topicsList.add(new Topics("1.1. Закон об охране труда №356-З", "t01"));
        topicsList.add(new Topics("1.2. Трудовой кодекс Республики Беларусь", "t02"));
        topicsList.add(new Topics("1.3. Кодекс об административных правонарушениях", "t03"));
        topicsList.add(new Topics("1.4. Уголовный кодекс Республики Беларусь", "t04"));
        topicsList.add(new Topics("1.5. Декрет №7 О развитии предпринимательства", "t05"));
        topicsList.add(new Topics("1.6. Закон о пожарной безопасности №2403-XII", "t06"));
        topicsList.add(new Topics("1.7. Закон о радиационной безопасности №198-З", "t07"));
        topicsList.add(new Topics("1.8. Закон об атомной энергии №208-З", "t08"));
        topicsList.add(new Topics("1.9. Указ №510 Контрольная (надзорная) деятельность", "t09"));
        chapterList.add(new Chapter("1. Кодексы, Законы, Директивы...",topicsList));

        //chapter 2 t11~89
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("2.1. Правила по охране труда №53", "t11"));
        topicsList.add(new Topics("2.2. МПОТ погрузочно-разгрузочные №12", "t12"));
        topicsList.add(new Topics("2.3. МПОТ при холодной обработке металлов №7/92", "t13"));
        topicsList.add(new Topics("2.4. NEW! ПОТ авто и горэлектро транспорт №78/104", "t14"));
        topicsList.add(new Topics("2.5. ПОТ при работе на высоте №52", "t15"));
        topicsList.add(new Topics("2.6. МПОТ мобильные подъемные рабочие платформы №78", "t16"));
        topicsList.add(new Topics("2.7. МПОТ напольный безрельс и грузовые тележки №165", "t17"));
        topicsList.add(new Topics("2.8. ПОТ в сельском и рыбном хозяйствах №29/44", "t18"));
        topicsList.add(new Topics("2.9. ПОТ при выполнении строительный работ №24/33", "t19"));
        topicsList.add(new Topics("2.10. ПОТ лесное хозяйство, обработка древесины №32/5", "t20"));
        topicsList.add(new Topics("2.11. ПОТ водопровод и канализация №11/55", "t21"));
        topicsList.add(new Topics("2.12. МПОТ при выполнении окрасочных работ №104", "t22"));
        topicsList.add(new Topics("2.13. ПОТ при ремонте и ТО сельхозтехники №14", "t23"));
        topicsList.add(new Topics("2.14. ПОТ при хранении и переработке зерна №55", "t24"));
        topicsList.add(new Topics("2.15. МПОТ промышленный альпинизм №184", "t25"));
        topicsList.add(new Topics("2.16. МПОТ при производстве шин и резиновых изделий №189", "t26"));
        topicsList.add(new Topics("2.17. МПОТ при техобслуживании и ремонте зданий и сооружений №141", "t27"));
        topicsList.add(new Topics("2.18. МПОТ при эксплуатации строительных подъемников №12/2", "t28"));
        topicsList.add(new Topics("2.19. МПОТ при термической обработке металлов №99/9", "t29"));
        topicsList.add(new Topics("2.20. МПОТ при эксплуатации конвейерных, трубопроводных и др. №54", "t30"));
        topicsList.add(new Topics("2.21. МПОТ в кондитерском производстве №164", "t31"));
        topicsList.add(new Topics("2.22. МПОТ при переработке пластмасс №18", "t32"));
        topicsList.add(new Topics("2.23. МПОТ оказание психиатрической помощи лицам, страдающим психическими расстройствами №19/28", "t33"));
        topicsList.add(new Topics("2.24. МПОТ при предоставлении гостиничных услуг №121/19", "t34"));
        topicsList.add(new Topics("2.25. МПОТ при работе с химвеществами, проявляющими опасные свойства №90/9", "t35"));
        topicsList.add(new Topics("2.26. МПОТ при производстве вина №154", "t36"));
        topicsList.add(new Topics("2.27. МПОТ при эксплуатации фреоновых холодильных установок №126/20", "t37"));
        topicsList.add(new Topics("2.28. МПОТ при производстве табачных изделий №93", "t38"));
        topicsList.add(new Topics("2.29. МПОТ при производстве сахара №86", "t39"));
        topicsList.add(new Topics("2.30. МПОТ при производстве плодоовощных консервов №45", "t40"));
        topicsList.add(new Topics("2.31. МПОТ при производстве пищевых концентратов №155", "t41"));
        topicsList.add(new Topics("2.32. МПОТ при производстве дрожжей №127", "t42"));
        topicsList.add(new Topics("2.33. NEW!ПОТ при выполнении работ на объектах радиосвязи №7/3", "t43"));
        topicsList.add(new Topics("2.34. МПОТ при производстве маргариновой и майонезной продукции №141", "t44"));
        topicsList.add(new Topics("2.35. МПОТ при производстве солода, пива и безалкогольных напитков №143", "t45"));
        topicsList.add(new Topics("2.36. МПОТ при производстве спирта и ликеро-водочных изделий №166", "t46"));
        topicsList.add(new Topics("2.37. МПОТ при производстве дистиллированных натуральных жирных кислот №133", "t47"));
        topicsList.add(new Topics("2.38. МПОТ при производстве растительных масел методом прессования и экстракции №115", "t48"));
        topicsList.add(new Topics("2.39. МПОТ при работе с эпоксидными смолами и материалами на их основе №53", "t49"));
        topicsList.add(new Topics("2.40. МПОТ при работе со свинцом и его неорганическими соединениями №116", "t50"));
        topicsList.add(new Topics("2.41. ПОТ в ветеринарных лабораториях №31", "t51"));
        topicsList.add(new Topics("2.42. ПОТ для зоопарков №33", "t52"));
        topicsList.add(new Topics("2.43. ПОТ при выполнении работ в цирках №14/7", "t53"));
        topicsList.add(new Topics("2.44. ПОТ для театров и концертных залов №4", "t54"));
        topicsList.add(new Topics("2.45. ПОТ при производстве фильмов №31", "t55"));
        topicsList.add(new Topics("2.46. ПТБиОТ выправительные работы на внутренних водных путях №15", "t56"));
        topicsList.add(new Topics("2.47. ПОТ полиграфическая деятельность №11", "t57"));
        topicsList.add(new Topics("2.48. ПОТ на объектах почтовой связи РБ №29", "t58"));
        topicsList.add(new Topics("2.49. ПОТ по пайке и лужению №9", "t59"));
        topicsList.add(new Topics("2.50. ОПОТ строительство и ремонт автодорог №14", "t60"));
        topicsList.add(new Topics("2.51. ОПОТ в зелёном хозяйстве РБ №9", "t61"));
        topicsList.add(new Topics("2.52. ПОТ работников железнодорожных станций БЖД №552-Ц", "t62"));
        topicsList.add(new Topics("2.53. МПОТ при производстве крахмальной продукции №46", "t63"));
        topicsList.add(new Topics("2.54. ПОТ при работах на станциях проводного вещания №5", "t64"));
        topicsList.add(new Topics("2.55. ПОТ при работах на кабельных линиях передачи сетей радиосвязи №1", "t65"));
        topicsList.add(new Topics("2.56. ПОТ при работах на воздушных линиях электросвязи и проводного вещания №49", "t66"));
        topicsList.add(new Topics("2.57. ПОТ при эксплуатации систем медгазоснабжения №243", "t67"));
        topicsList.add(new Topics("2.58. ОПОТ машины для уборки улиц, дорог, спецсооружения №10", "t68"));
        topicsList.add(new Topics("2.59. ПОТ при выполнении работ на объектах телефонной,-графной связи и передачи данных №53", "t69"));
        topicsList.add(new Topics("2.60. ПОТ распространение издательской продукции №16", "t70"));
        topicsList.add(new Topics("2.61. ПОТ в системе госгидрометеорологической службы РБ №108", "t71"));
        chapterList.add(new Chapter("2. Правила по охране труда",topicsList));

        //chapter 3 t90~99
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("3.1. Инструкция обучения, инструктажа и ПЗ по ОТ №175", "t90"));
        topicsList.add(new Topics("3.2. Положения о комиссиях для ПЗ по ОТ №210", "t91"));
        topicsList.add(new Topics("3.3. Перечень профессий для подготовки рабочих №7/14", "t92"));
        topicsList.add(new Topics("3.4. Стажировка водителей транспортных средств №46", "t93"));
        chapterList.add(new Chapter("3. Обучение, инструктажи и ПЗ по ОТ",topicsList));

        //chapter 4 t100~104
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("4.1. Контроль за соблюдением требований по ОТ №51", "t100"));
        chapterList.add(new Chapter("4. Контроль за состоянием ОТ",topicsList));

        //chapter 5 t105~115
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("5.1. Рекомендации по разработке СУОТ №108", "t105"));
        topicsList.add(new Topics("5.2. Vision Zero: Концепция нулевого травматизма", "t107"));
        chapterList.add(new Chapter("5. Система управления охраной труда",topicsList));

        //chapter 6 t116~124
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("6.1. Обязательные и внеочередные медосмотры №74", "t116"));
        topicsList.add(new Topics("6.2. Предсменный медосмотр или освидетельствование №116/119", "t117"));
        topicsList.add(new Topics("6.3. Предрейсовые медосмотры водителей (лицензия) №84", "t118"));
        topicsList.add(new Topics("6.4. Контроль водителей на алкоголь (без лицензии) №25/28", "t119"));
        topicsList.add(new Topics("6.5. Предрейсовые медосмотры трактористов №87", "t120"));
        topicsList.add(new Topics("6.6. Аптечки (перечни вложений) №80", "t121"));
        chapterList.add(new Chapter("6. Медосмотры",topicsList));

        //chapter 7 t125~129
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("7.1. Правила расследования НС №30", "t125"));
        topicsList.add(new Topics("7.2. Формы документов для расследования НС №51/94", "t126"));
        topicsList.add(new Topics("7.3. Правила определения тяжести производственных травм №9", "t127"));
        topicsList.add(new Topics("7.4. Соглашение о расследовании НС ЕАЭС №80", "t128"));
        chapterList.add(new Chapter("7. Расследование несчастных случаев",topicsList));

        //chapter 8 t130~139
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("8.1. Инструкция о порядке обеспечения СИЗ №209", "t130"));
        topicsList.add(new Topics("8.2. Перечень СИЗ непосредственно для безопасности труда №145", "t131"));
        topicsList.add(new Topics("8.3. Смывающие и обезвреживающие средства №208", "t132"));
        topicsList.add(new Topics("8.4. Рекомендации: Комиссия по качеству СИЗ №12", "t133"));
        topicsList.add(new Topics("8.4. ТРТС 019/2011 Безопасность СИЗ", "t134"));
        chapterList.add(new Chapter("8. Средства индивидуальной защиты",topicsList));

        //chapter 9 t140~149
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("9.1. Типовой положение о службе ОТ №98", "t140"));
        topicsList.add(new Topics("9.2. Норматив численности специалистов по ОТ №94", "t141"));
        chapterList.add(new Chapter("9. Служба охраны труда",topicsList));

        //chapter 10 t150~170
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("10.1. Порядок осуществления общественного контроля №180", "t150"));
        topicsList.add(new Topics("10.2. Положение о технической инспекции труда №271", "t151"));
        topicsList.add(new Topics("10.3. Порядок участия профсоюзов в расследовании НС №272", "t152"));
        topicsList.add(new Topics("10.4. Указ об общественном контроле №240", "t153"));
        topicsList.add(new Topics("10.5. Положение об общественном инспекторе по ОТ №271", "t154"));
        topicsList.add(new Topics("10.6. СБОРНИК для профработников и актива 2023", "t155"));
        chapterList.add(new Chapter("10. Профсоюзы",topicsList));

        //chapter 11 t171~
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("11.1. О разработке инструкций по ОТ №176", "t170"));
        topicsList.add(new Topics("11.2. О планировании мероприятий по ОТ №111", "t171"));
        topicsList.add(new Topics("11.3. О нормах подъёма женщинами №133", "t172"));
        topicsList.add(new Topics("11.4. Запрещённые работы для женщин №35", "t173"));
        topicsList.add(new Topics("11.5. О нормах подъема детьми №134", "t174"));
        topicsList.add(new Topics("11.6. Запрет на труд до 18 лет №67", "t175"));
        topicsList.add(new Topics("11.7. Лёгкие работы от 14 до 16 лет №144", "t176"));
        chapterList.add(new Chapter("11. Организация охраны труда",topicsList));

        //chapter 12 t180~
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("12.1. Порядок аттестации по условиям труда №253", "t180"));
        topicsList.add(new Topics("12.2. Инструкция по оценке условий труда №35", "t181"));
        topicsList.add(new Topics("12.3. Оценка тяжести и напряжённости труда №027-2012", "t182"));
        topicsList.add(new Topics("12.4. Формы документов по аттестации №74", "t183"));
        topicsList.add(new Topics("12.5. Списки №1 и №2. Пост. №536", "t184"));
        topicsList.add(new Topics("12.5. Как применять Списки №1 и №2. Пост. №86", "t185"));
        chapterList.add(new Chapter("12. Аттестация рабочих мест",topicsList));

        //chapter 13 t190~
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("13.1. Об обеспечении пожарной безопасности №82", "t190"));
        topicsList.add(new Topics("13.2. О внештатных пожарных формированиях №296", "t191"));
        topicsList.add(new Topics("13.3. Спецтребования по ПБ прибывание детей №561", "t192"));
        topicsList.add(new Topics("13.4. Спецтребования ПБ взрыво-пожароопасных производств №779", "t193"));
        chapterList.add(new Chapter("13. Пожарная безопасность",topicsList));

        //chapter 14 t210~
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("14.1. NEW!Отчёт 1-т (травматизм)", "t210"));
        topicsList.add(new Topics("14.2. Отчёт по форме 2-условия труда", "t211"));
        topicsList.add(new Topics("14.3. Отчёт 4 Улучшение условий и ОТ", "t212"));
        chapterList.add(new Chapter("14. Отчётность по охране труда",topicsList));

        //chapter 15 t220~
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("15.1. СН 1.04.01-2020 Техсостояние зданий и сооружений", "t220"));
        chapterList.add(new Chapter("15. Здания и сооружения",topicsList));

        //chapter 16 t230~
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("16.1. Правила обеспечения МОЛОКОМ №260", "t230"));
        topicsList.add(new Topics("16.2. Перечень вредных веществ для молока №34/12", "t231"));
        topicsList.add(new Topics("16.3. Перечень лечебно-профилактическое питание № 51/41", "t232"));
        topicsList.add(new Topics("16.4. Положение о лечебном питании №№ 491", "t233"));
        chapterList.add(new Chapter("16. Молоко и лечебное питание",topicsList));

        //chapter 17 t240~
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("17.1. УКАЗ о лицензировании атомной энергии №137", "t240"));
        topicsList.add(new Topics("17.2. О реализации Закона о радиационной безопасности №497", "t241"));
        topicsList.add(new Topics("17.3. Критерии оценки радиационного воздействия №829 (вступает в силу с 08.03.2023)", "t242"));
        topicsList.add(new Topics("17.4. Радиационно-гигиенический паспорт №443", "t243"));
        topicsList.add(new Topics("17.5. Реестр аттестованных консультантов радиационной безопасности №19", "t244"));
        topicsList.add(new Topics("17.6. Безопасность при обращении с источниками ионизирующего излучения №79", "t245"));
        topicsList.add(new Topics("17.7. Категории источников ионизирующего излучения №4", "t246"));
        topicsList.add(new Topics("17.8. Учёт и контроль источников ионизирующего излучения №16", "t247"));
        topicsList.add(new Topics("17.9. Экспертиза безопасности ионизирующего излучения №17", "t248"));
        topicsList.add(new Topics("17.10. Обучение и ПЗ по вопросам ядерной и радиационной безопасности №18", "t249"));
        topicsList.add(new Topics("17.11. Документы ядерной и радиационной безопасности №64", "t250"));
        topicsList.add(new Topics("17.12. Учёт доз облучения населения и персонала №110", "t251"));
        topicsList.add(new Topics("17.13. СНиП Радиационная безопасность №213", "t252"));
        topicsList.add(new Topics("17.14. СНиП Обеспечение радиационной безопасности персонала и населения №137", "t253"));
        topicsList.add(new Topics("17.15. СНиП Обращение с лучевыми досмотровыми установками №134", "t254"));
        topicsList.add(new Topics("17.16. СНиП Линейные ускорители электронов до 100 МэВ №165", "t255"));
        chapterList.add(new Chapter("17. Радиационная безопасность",topicsList));

        //chapter 18 t260~
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("18.1. Указ №530 О СТРАХОВОЙ ДЕЯТЕЛЬНОСТИ", "t260"));
        topicsList.add(new Topics("18.2. Пособия по НС на производстве №393", "t261"));
        topicsList.add(new Topics("18.3. Положение об уплате страховых взносов №1297", "t262"));
        chapterList.add(new Chapter("18. Страховая деятельность",topicsList));

        //chapter 19 t270~
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("19.1. Гражданский кодекс N 218-З", "t270"));
        topicsList.add(new Topics("19.2. NEW!Указ О защите прав граждан работающих по ГПД №314", "t271"));
        chapterList.add(new Chapter("19. Договор подряда (ГПД)",topicsList));

        sendData();

    }

    void sendData()
    {

        customAdapter=new CustomAdapter(chapterList, MainActivity.this);
        expandableListView.setAdapter(customAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.privacy:
                startActivity(new Intent(MainActivity.this, Privacy.class));
                break;
            case R.id.contact:
                startActivity(new Intent(MainActivity.this, Contact.class));
                break;

        }

        return super.onOptionsItemSelected(item);
    }


//начало кода системной кнопки назад

    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast = Toast.makeText(getBaseContext(), "Теперь можно бахнуть кофейку:)", Toast.LENGTH_SHORT);
            backToast.show();
        }
        //пробую вырубать процесс сплаш скрина
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
            finishAffinity();
        }
        //финал кода

        backPressedTime = System.currentTimeMillis();

    }

    //конец кода системной кнопки назад
}