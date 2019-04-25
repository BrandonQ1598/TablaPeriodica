package com.example.tablaperiodica;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button hidrogeno,he,li,be,b,c,n,o,f,ne,na,mg,al,si,p,s,cl,ar,k,ca,sc,ti,v,cr,mn,fe,co,ni,cu,zn,ga,ge,as,se,br,kr,rb,sr,y,zr,nb,mo,tc,ru,rh,pd,ag,cd,in,sn;
    Button sb,te,i,xe,cs,ba,lu,hf,ta,w,re,os,ir,pt,au,hg,tl,pb,bi,po,at,rn,fr,ra,lr,rf,db,sg,bh,hs,mt,ds,rg,uub,uut,uuq,uup,uuh,uus,uuo,la,ce,pr,nd,pm,sm,eu,gd;
    Button tb,dy,ho,er,tm,yb,ac,th,pa,u,np,pu,am,cm,bk,cf,es,fm,md,no,lu2,lr2;
    ImageButton busqueda;
    EditText txt_busq;
    String elemento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        hidrogeno =findViewById(R.id.btn_h);he=findViewById(R.id.btn_he);li=findViewById(R.id.btn_li);be=findViewById(R.id.btn_be);
        b=findViewById(R.id.btn_b);c=findViewById(R.id.btn_c);lr2=findViewById(R.id.btn_lr2);lu2=findViewById(R.id.btn_lu2);
        n=findViewById(R.id.btn_n);o=findViewById(R.id.btn_o);f=findViewById(R.id.btn_f);ne=findViewById(R.id.btn_ne);
        na=findViewById(R.id.btn_na);mg=findViewById(R.id.btn_mg);al=findViewById(R.id.btn_al);si=findViewById(R.id.btn_si);
        p=findViewById(R.id.btn_p);s=findViewById(R.id.btn_s);cl=findViewById(R.id.btn_cl);ar=findViewById(R.id.btn_ar);
        k=findViewById(R.id.btn_k);ca=findViewById(R.id.btn_ca);sc=findViewById(R.id.btn_sc);ti=findViewById(R.id.btn_ti);
        v=findViewById(R.id.btn_v);cr=findViewById(R.id.btn_cr);mn=findViewById(R.id.btn_mn);fe=findViewById(R.id.btn_fe);
        co=findViewById(R.id.btn_co);ni=findViewById(R.id.btn_ni);cu=findViewById(R.id.btn_cu);zn=findViewById(R.id.btn_zn);
        ga=findViewById(R.id.btn_ga);ge=findViewById(R.id.btn_ge);as=findViewById(R.id.btn_as);se=findViewById(R.id.btn_se);
        br=findViewById(R.id.btn_br);kr=findViewById(R.id.btn_kr);rb=findViewById(R.id.btn_rb);sr=findViewById(R.id.btn_sr);
        mo=findViewById(R.id.btn_mo);nb=findViewById(R.id.btn_nb);zr=findViewById(R.id.btn_zr);y=findViewById(R.id.btn_y);
        pd=findViewById(R.id.btn_pd);rh=findViewById(R.id.btn_rh);ru=findViewById(R.id.btn_ru);tc=findViewById(R.id.btn_tc);
        ag=findViewById(R.id.btn_ag);cd=findViewById(R.id.btn_cd);in=findViewById(R.id.btn_in);sn=findViewById(R.id.btn_sn);
        xe=findViewById(R.id.btn_xe);i=findViewById(R.id.btn_i);te=findViewById(R.id.btn_te);sb=findViewById(R.id.btn_sb);
        hf=findViewById(R.id.btn_hf);lu=findViewById(R.id.btn_lu);ba=findViewById(R.id.btn_ba);cs=findViewById(R.id.btn_cs);
        ta=findViewById(R.id.btn_ta);w=findViewById(R.id.btn_w);re=findViewById(R.id.btn_re);os=findViewById(R.id.btn_os);
        hg=findViewById(R.id.btn_hg);au=findViewById(R.id.btn_au);pt=findViewById(R.id.btn_pt);ir=findViewById(R.id.btn_ir);
        po=findViewById(R.id.btn_po);bi=findViewById(R.id.btn_bi);pb=findViewById(R.id.btn_pb);tl=findViewById(R.id.btn_tl);
        at=findViewById(R.id.btn_at);rn=findViewById(R.id.btn_rn);fr=findViewById(R.id.btn_fr);ra=findViewById(R.id.btn_ra);
        sg=findViewById(R.id.btn_sg);db=findViewById(R.id.btn_db);rf=findViewById(R.id.btn_rf);lr=findViewById(R.id.btn_lr);
        ds=findViewById(R.id.btn_ds);mt=findViewById(R.id.btn_mt);hs=findViewById(R.id.btn_hs);bh=findViewById(R.id.btn_bh);
        uuq=findViewById(R.id.btn_uuq);uut=findViewById(R.id.btn_uut);uub=findViewById(R.id.btn_uub);rg=findViewById(R.id.btn_rg);
        uup=findViewById(R.id.btn_uup);uuh=findViewById(R.id.btn_uuh);uus=findViewById(R.id.btn_uus);uuo=findViewById(R.id.btn_uuo);
        nd=findViewById(R.id.btn_nd);pr=findViewById(R.id.btn_pr);ce=findViewById(R.id.btn_ce);la=findViewById(R.id.btn_la);
        nd=findViewById(R.id.btn_nd);pm=findViewById(R.id.btn_pm);sm=findViewById(R.id.btn_sm);eu=findViewById(R.id.btn_eu);
        gd=findViewById(R.id.btn_gd);tb=findViewById(R.id.btn_tb);dy=findViewById(R.id.btn_dy);ho=findViewById(R.id.btn_ho);
        ac=findViewById(R.id.btn_ac);yb=findViewById(R.id.btn_yb);tm=findViewById(R.id.btn_tm);er=findViewById(R.id.btn_er);
        np=findViewById(R.id.btn_np);u=findViewById(R.id.btn_u);pa=findViewById(R.id.btn_pa);th=findViewById(R.id.btn_th);
        pu=findViewById(R.id.btn_pu);am=findViewById(R.id.btn_am);cm=findViewById(R.id.btn_cm);bk=findViewById(R.id.btn_bk);
        cf=findViewById(R.id.btn_cf);es=findViewById(R.id.btn_es);fm=findViewById(R.id.btn_fm);md=findViewById(R.id.btn_md);
        no=findViewById(R.id.btn_no);
        busqueda=findViewById(R.id.ib_busqueda);
        txt_busq=findViewById(R.id.txt_busqueda);


        hidrogeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Hidrogeno");
                h.putExtra("periodo","1");
                h.putExtra("grupo","1");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","En las industrias del petróleo y química,Se utiliza como gas de protección en\n" +
                        "los métodos de soldadura,se utiliza hidrógeno puro o mezclado con nitrógeno\n" +
                        "(aveces llamado forming gas) como gas indicador para detectar fugas");
                h.putExtra("ruta",R.drawable.hidrogeno);
                startActivity(h);
            }
        });

        he.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Helio");
                h.putExtra("periodo","1");
                h.putExtra("grupo","18");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Inmersion a gran profundidad\nRefrigerante en aplicaciones en temperatura extremademente elevada\nAplicaciones medicas");
                h.putExtra("ruta",R.drawable.helio);
                startActivity(h);
            }
        });
        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Litio");
                h.putExtra("periodo","2");
                h.putExtra("grupo","1");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El cloruro de litio y el bromuro de litio tienen una elevada higroscopicidad por lo que son excelentes secantes. El segundo se emplea en bombas de calor de contracción, entre otros compuestos como el nitrato de litio. El estearato de \n" +
                        "litio es un lubricante de propósito general en aplicaciones a alta temperatura.\n" +
                        "El hidróxido de litio se usa en las naves espaciales y submarinos para depurar\n" +
                        "el aire extrayendo el dióxido de carbono. También tiene aplicaciones nucleares.");
                h.putExtra("ruta",R.drawable.litio);
                startActivity(h);
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Berilio");
                h.putExtra("periodo","2");
                h.putExtra("grupo","2");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El principal uso del berilio metálico se encuentra en la manufactura de\n" +
                        "aleaciones berilio-cobre y en el desarrollo de materiales moderadores y\n" +
                        "reflejantes para reactores nucleares. Elemento de aleación, en aleaciones\n" +
                        "cobre-berilio con una gran variedad de aplicaciones. Antaño se emplearon\n" +
                        "compuestos de berilio en tubos fluorescentes, uso abandonado por la beriliosis.");
                h.putExtra("ruta",R.drawable.berilio);
                startActivity(h);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Boro");
                h.putExtra("periodo","2");
                h.putExtra("grupo","13");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Las fibras de boro usadas en aplicaciones mecánicas especiales, \n" +
                        "en el ámbito aeroespacial. El boro amorfo se usa en fuegos pirotécnicos \n" +
                        "por su color verde.\n" +
                        "El ácido bórico se emplea en productos textiles.\n" +
                        "El boro es usado como semiconductor.");
                h.putExtra("ruta",R.drawable.boro);
                startActivity(h);

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Carbono");
                h.putExtra("periodo","2");
                h.putExtra("grupo","14");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El principal uso industrial del carbono es como un componente de hidrocarburos, \n" +
                        "especialmente los combustibles fósiles (petróleo y gas natural). \n" +
                        "El grafito se combina con arcilla para fabricar las minas de los lápices. \n" +
                        "Se usa como elemento de aleación principal de los aceros.");
                h.putExtra("ruta",R.drawable.carbono);
                startActivity(h);

            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Nitrogeno");
                h.putExtra("periodo","2");
                h.putExtra("grupo","15");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","La aplicación comercial más importante del nitrógeno diatómico es la obtención \n" +
                        "de amoníaco. Los compuestos orgánicos de nitrógeno como la nitroglicerina y el \n" +
                        "trinitrotolueno son a menudo explosivos. ");
                h.putExtra("ruta",R.drawable.nitrogeno);
                startActivity(h);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Oxigeno");
                h.putExtra("periodo","2");
                h.putExtra("grupo","16");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El 55 % de la producción mundial de oxígeno se consume en la producción de acero. \n" +
                        "Otro 25 % se dedica a la industria química. Del 20 % restante la mayor parte \n" +
                        "se usa para aplicaciones medicinales.");
                h.putExtra("ruta",R.drawable.oxigeno);
                startActivity(h);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Fluor");
                h.putExtra("periodo","2");
                h.putExtra("grupo","17");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El fluoruro de hidrógeno se emplea en la obtención de criolita sintética. \n" +
                        "Algunos fluoruros se añaden a las pastas de dientes para la prevención de caries. \n" +
                        "Se emplea flúor monoatómico en la fabricación de semiconductores.");
                h.putExtra("ruta",R.drawable.fluor);
                startActivity(h);
            }
        });
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Neon");
                h.putExtra("periodo","2");
                h.putExtra("grupo","18");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Indicadores de alto voltaje.\n" +
                        "Tubos de televisión.\n" +
                        "Junto con el helio se emplea para obtener un tipo de láser.\n" +
                        "El neón licuado se comercializa como refrigerante criogénico.\n" +
                        "El neón líquido se utiliza en lugar del nitrógeno líquido para refrigeración.");
                h.putExtra("ruta",R.drawable.fluor);
                startActivity(h);
            }
        });
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Sodio");
                h.putExtra("periodo","3");
                h.putExtra("grupo","1");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps"," En aleaciones antifricción (oro). En la fabricación de desodorantes (en\n" +
                        " combinación con ácidos grasos). En la purificación de metales fundidos. El \n" +
                        " sodio metálico también se emplea en los laboratorios en la desecación de\n" +
                        " disolventes. Iluminación mediante lámparas de vapor de sodio. ");
                h.putExtra("ruta",R.drawable.sodio);
                startActivity(h);
            }
        });
        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Magnesio");
                h.putExtra("periodo","3");
                h.putExtra("grupo","2");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El uso principal del metal es como elemento de aleación del aluminio,\n" +
                        "empleándose las aleaciones aluminio-magnesio en envases de bebidas. ");
                h.putExtra("ruta",R.drawable.magnesio);
                startActivity(h);
            }
        });
        al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Aluminio");
                h.putExtra("periodo","3");
                h.putExtra("grupo","13");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","En estado puro se aprovechan sus propiedades ópticas para fabricar espejos \n" +
                        "domésticos e industriales, como pueden ser los de los telescopios reflectores. \n" +
                        "Su uso más popular, sin embargo, es como papel aluminio, que consiste en láminas \n" +
                        "de material con un espesor tan pequeño que resulta fácilmente maleable y apto \n" +
                        "por tanto para embalaje alimentario. También se usa en la fabricación de latas y tetrabriks.");
                h.putExtra("ruta",R.drawable.aluminio);
                startActivity(h);
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Silicio");
                h.putExtra("periodo","3");
                h.putExtra("grupo","14");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Como material refractario, se usa en cerámicas, vidriados y esmaltados.\n" +
                        "Como elemento fertilizante en forma de mineral primario rico en silicio, para la agricultura.\n" +
                        "Como elemento de aleación en fundiciones.\n" +
                        "Fabricación de vidrio para ventanas y aislantes.\n" +
                        "El carburo de silicio es uno de los abrasivos más importantes.\n" +
                        "Se usa en láseres para obtener una luz con una longitud de onda de 456 nm.");
                h.putExtra("ruta",R.drawable.silicio);
                startActivity(h);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Fosforo");
                h.putExtra("periodo","3");
                h.putExtra("grupo","15");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El fósforo es un componente esencial de los organismos.\n" +
                        "Es el segundo mineral más abundante en el cuerpo humano.\n" +
                        "Forma parte de los ácidos nucleicos (ADN y ARN).\n" +
                        "Forma parte de los huesos y dientes de los animales.");
                h.putExtra("ruta",R.drawable.fosforo);
                startActivity(h);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Azufre");
                h.putExtra("periodo","3");
                h.putExtra("grupo","16");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El azufre se usa en multitud de procesos industriales, como la producción \n" +
                        "de ácido sulfúrico para baterías, la fabricación de pólvora y el vulcanizado del caucho.\n" +
                        "\n" +
                        "Los sulfitos se usan para blanquear el papel y en fósforos. El tiosulfato de sodio \n" +
                        "o amonio se emplea en la industria fotográfica como «fijador». También el azufre \n" +
                        "se emplea en la industria enológica como antiséptico. Uno de sus principales usos \n" +
                        "es como anhídrido sulfuroso.\n" +
                        "\n" +
                        "El azufre tiene usos como fungicida y en la manufactura de fosfatos fertilizantes.");
                h.putExtra("ruta",R.drawable.azufre);
                startActivity(h);
            }
        });
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Cloro");
                h.putExtra("periodo","3");
                h.putExtra("grupo","17");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El cloro es un químico importante para la purificación del agua. \n" +
                        "Es utilizado en la elaboración de plásticos, solventes para lavado en \n" +
                        "seco y desgrasado de metales, producción de agroquímicos y fármacos, \n" +
                        "insecticidas, colorantes y tintes, etc.");
                h.putExtra("ruta",R.drawable.cloro);
                startActivity(h);
            }
        });
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Argon");
                h.putExtra("periodo","3");
                h.putExtra("grupo","18");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se emplea como gas de relleno en lámparas incandescentes. En el ámbito \n" +
                        "industrial y científico se emplea universalmente de la recreación de atmósferas inertes. ");
                h.putExtra("ruta",R.drawable.argon);
                startActivity(h);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Potasio");
                h.putExtra("periodo","4");
                h.putExtra("grupo","1");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps"," El potasio metal se usa en células fotoeléctricas. El cloruro y el nitrato se\n" +
                        " emplean como fertilizantes. El peróxido de potasio se usa en aparatos de\n" +
                        " respiración autónomos de bomberos y mineros. El cloruro de potasio se utiliza \n" +
                        " para provocar un paro cardíaco en las ejecuciones con inyección letal.");
                h.putExtra("ruta",R.drawable.potasio);
                startActivity(h);
            }
        });
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Calcio");
                h.putExtra("periodo","4");
                h.putExtra("grupo","2");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps"," El calcio es un agente reductor en la extracción de otros metales como el\n" +
                        " uranio, circonio y torio.  Tiene aplicaciones en muchos productos lácteos o\n" +
                        " medicamentos para el refuerzo de los huesos. Se utiliza en arcos de luz de alta\n" +
                        " intensidad (luz de cal). El hidróxido de calcio (Ca(OH)2), llamado cal apagada,\n" +
                        " tiene muchas aplicaciones en donde el ion hidroxilo es necesario.");
                h.putExtra("ruta",R.drawable.calcio);
                startActivity(h);
            }
        });
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Escandio");
                h.putExtra("periodo","4");
                h.putExtra("grupo","3");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","La aplicación principal del escandio en peso es en las aleaciones de aluminio-escandio \n" +
                        "para componentes menores de la industria aeroespacial. El óxido de escandio Sc2O3, \n" +
                        "se utiliza en luces de alta intensidad.  La adición de escandio al aluminio limita el \n" +
                        "crecimiento excesivo del grano que se produce en la zona afectada por el calor en la \n" +
                        "soldadura de aleaciones de aluminio. ");
                h.putExtra("ruta",R.drawable.escandio);
                startActivity(h);
            }
        });
        ti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Titanio");
                h.putExtra("periodo","4");
                h.putExtra("grupo","4");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El titanio se emplea en las aleaciones de acero para reducir el tamaño del grano\n" +
                        "y como desoxidante, y en las de acero inoxidable para reducir su contenido de carbono.\n" +
                        "Pigmentos y aditivos. Las tuberías soldadas y ciertos equipamientos de titanio, \n" +
                        "como intercambiadores de calor, tanques, recipientes de encausado y válvulas,\n" +
                        "se emplean en las industrias químicas y petroquímicas, principalmente debido \n" +
                        "su resistencia a la corrosión. El metal de titanio se utiliza en diversas \n" +
                        "aplicaciones en la automoción, particularmente en el automovilismo y el motociclismo.");
                h.putExtra("ruta",R.drawable.titanio);
                startActivity(h);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Vanadio");
                h.putExtra("periodo","4");
                h.putExtra("grupo","5");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se emplea en acero inoxidable usado en instrumentos quirúrgicos y herramientas, \n" +
                        "en aceros resistentes a la corrosión, y mezclado con aluminio en aleaciones de \n" +
                        "titanio empleadas en motores de reacción. También, en aceros empleados en ejes \n" +
                        "de ruedas y cigüeñales, engranajes, y otros componentes críticos. Se emplea en \n" +
                        "algunos componentes de reactores nucleares. Forma parte de algunos imanes \n" +
                        "superconductores. Algunos compuestos de vanadio se utilizan como catalizadores \n" +
                        "en la producción de anhídrido maleico y ácido sulfúrico. Los óxidos mixtos de \n" +
                        "vanadio se utilizan como catalizadores para la producción de ácido acrílico a \n" +
                        "partir de propano, propileno o acroleína.");
                h.putExtra("ruta",R.drawable.vanadio);
                startActivity(h);
            }
        });
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Cromo");
                h.putExtra("periodo","4");
                h.putExtra("grupo","6");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El cromo se utiliza principalmente en metalurgia para aportar resistencia \n" +
                        "a la corrosión y un acabado brillante.\n" +
                        "En aleaciones, por ejemplo, el acero inoxidable es aquel que contiene más \n" +
                        "del 12 % de cromo, aunque las propiedades antioxidantes del cromo empiezan \n" +
                        "a notarse a partir del 5 % de concentración. Además tiene un efecto \n" +
                        "alfágeno, es decir, abre el campo de la ferrita y lo fija.\n" +
                        "En procesos de cromado (depositar una capa protectora mediante \n" +
                        "electrodeposición). También se utiliza en el anodizado del aluminio.\n" +
                        "En pinturas cromadas como tratamiento antioxidante");
                h.putExtra("ruta",R.drawable.cromo);
                startActivity(h);
            }
        });
        mn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Manganeso");
                h.putExtra("periodo","4");
                h.putExtra("grupo","7");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El traquetreo de los motores se reduce mediante el uso de un compuesto \n" +
                        "de manganeso que se añade a la gasolina sin plomo. Esto aumenta el \n" +
                        "octanaje del combustible.\n" +
                        "El manganeso se utiliza en las baterías desechables estándar.\n" +
                        "El manganeso es esencial para producir el acero y el hierro. \n" +
                        "El manganeso es un componente esencial para la fabricación de acero \n" +
                        "inoxidable de bajo costo.");
                h.putExtra("ruta",R.drawable.manganeso);
                startActivity(h);
            }
        });
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Hierro");
                h.putExtra("periodo","4");
                h.putExtra("grupo","8");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El hierro es el metal duro más usado, con el 95 % en peso de la producción\n" +
                        "mundial de metal. El hierro puro (pureza a partir de 99,5 %) no tiene \n" +
                        "demasiadas aplicaciones, salvo excepciones para utilizar su potencial magnético. \n" +
                        "El hierro tiene su gran aplicación para formar los productos siderúrgicos, \n" +
                        "utilizando éste como elemento matriz para alojar otros elementos aleantes \n" +
                        "tanto metálicos como no metálicos, que confieren distintas propiedades al material. ");
                h.putExtra("ruta",R.drawable.hierro);
                startActivity(h);
            }
        });
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Cobalto");
                h.putExtra("periodo","4");
                h.putExtra("grupo","9");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Aleaciones entre las que cabe señalar superaleaciones usadas en turbinas\n" +
                        "de gas de aviación, aleaciones resistentes a la corrosión, aceros rápidos, \n" +
                        "y carburos cementados y herramientas de diamante. Herramientas de corte \n" +
                        "en procesos de fabricación para fresadoras.\n" +
                        "Imanes (Alnico, Fernico, Cunico, Cunife) y cintas magnéticas.\n" +
                        "Catálisis del petróleo e industria química.");
                h.putExtra("ruta",R.drawable.cobalto);
                startActivity(h);
            }
        });
        ni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Niquel");
                h.putExtra("periodo","4");
                h.putExtra("grupo","10");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Aproximadamente el 65 % del níquel consumido se emplea en la fabricación\n" +
                        "de acero inoxidable austenítico y otro 12 % en superaleaciones de níquel. \n" +
                        "El restante 23 % se reparte entre otras aleaciones, baterías recargables, \n" +
                        "catálisis, acuñación de moneda, recubrimientos metálicos y fundición.");
                h.putExtra("ruta",R.drawable.niquel);
                startActivity(h);
            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Cobre");
                h.putExtra("periodo","4");
                h.putExtra("grupo","11");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El cobre puro se emplea principalmente en la fabricación de cables eléctricos.\n" +
                        "Se emplea en varios componentes de coches y camiones, principalmente los \n" +
                        "radiadores (gracias a su alta conductividad térmica y resistencia a la corrosión), \n" +
                        "frenos y cojinetes. Una gran parte de las redes de transporte de agua \n" +
                        "están hechas de cobre. El cobre y, sobre todo, el bronce se utilizan también \n" +
                        "como elementos arquitectónicos y revestimientos en tejados, fachadas, puertas y \n" +
                        "ventanas. El cobre se emplea también a menudo para los pomos de las puertas de \n" +
                        "locales públicos, por sus propiedades anti-bacterianas.");
                h.putExtra("ruta",R.drawable.cobre);
                startActivity(h);
            }
        });
        zn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Zinc");
                h.putExtra("periodo","4");
                h.putExtra("grupo","12");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","La principal aplicación del zinc —cerca del 50 % del consumo anual— es el \n" +
                        "galvanizado del acero para protegerlo de la corrosión.  Piezas de fundición \n" +
                        "inyectada en la industria de automoción.\n" +
                        "Metalurgia de metales preciosos y eliminación de la plata del plomo.\n" +
                        "Utilizado en fabricación de pinturas al óleo, para fabricar el color blanco \n" +
                        "de zinc, utilizado para crear transparencias en la pintura.\n" +
                        "Aleaciones: latón, alpaca, cuproníquel-zinc, aluzinc, virenium, tombac, etc.");
                h.putExtra("ruta",R.drawable.zinc);
                startActivity(h);
            }
        });
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Galio");
                h.putExtra("periodo","4");
                h.putExtra("grupo","13");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","En medicina nuclear se emplea el galio como elemento trazador (escáner de galio) \n" +
                        "para el diagnóstico de enfermedades inflamatorias o infecciosas activas, \n" +
                        "tumores y abscesos ya que se acumula en los tejidos que sufren dichas patologías.");
                h.putExtra("ruta",R.drawable.galio);
                startActivity(h);
            }
        });
        ge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Germanio");
                h.putExtra("periodo","4");
                h.putExtra("grupo","14");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Fibra óptica.\n" +
                        "Electrónica: radares y amplificadores de guitarras eléctricas-\n" +
                        "Óptica de infrarrojos: Espectroscopios, sistemas de visión nocturna y otros equipos.\n" +
                        "Lentes, con alto índice de refracción, de ángulo ancho y para microscopios.\n" +
                        "En joyería.");
                h.putExtra("ruta",R.drawable.germanio);
                startActivity(h);
            }
        });
        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Arsenico");
                h.putExtra("periodo","4");
                h.putExtra("grupo","15");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Preservante de la madera\n" +
                        "El arseniuro de galio es un importante material semiconductor empleado en \n" +
                        "circuitos integrados más rápidos, y caros, que los de silicio. \n" +
                        "También se usa en la construcción de diodos láser y LED.\n" +
                        "Aditivo en aleaciones de plomo y latones.\n" +
                        "Insecticidas y herbicidas");
                h.putExtra("ruta",R.drawable.arsenico);
                startActivity(h);
            }
        });
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Selenio");
                h.putExtra("periodo","4");
                h.putExtra("grupo","16");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El selenio se usa con diversos fines. Su derivado, el selenio de amonio, \n" +
                        "por ejemplo, se ocupa en la fabricación de vidrio. Otro derivado, \n" +
                        "el sulfuro de selenio, se usa en lociones y champúes como tratamiento para la dermatitis seborreica.");
                h.putExtra("ruta",R.drawable.selenio);
                startActivity(h);
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Bromo");
                h.putExtra("periodo","4");
                h.putExtra("grupo","17");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se utiliza para detectar la presencia de compuestos orgánicos insaturados.\n" +
                        "Los bromuros actúan médicamente como sedantes y el bromuro de plata se utiliza \n" +
                        "como un elemento fundamental en las placas fotográficas.");
                h.putExtra("ruta",R.drawable.bromo);
                startActivity(h);
            }
        });
        kr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Kripton");
                h.putExtra("periodo","4");
                h.putExtra("grupo","18");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","En la fotografía.\n" +
                        "Las lámparas de flash (usadas para fotografía a alta velocidad).\n" +
                        "Los proyectores, en especial si son de alta definición.\n" +
                        "Y al estar expuestos en la fabricación automática de circuitos integrados.");
                h.putExtra("ruta",R.drawable.kripton);
                startActivity(h);
            }
        });
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Rubidio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","1");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Recubrimientos fotoemisores de telurio-rubidio en células fotoeléctricas \n" +
                        "y detectores electrónicos. En medicina para la tomografía por emisión de \n" +
                        "positrones, el tratamiento de la epilepsia y la separación por \n" +
                        "ultracentrifugado de ácido nucleicos y virus. Fluido de trabajo en \n" +
                        "turbinas de vapor. Sirve para conseguir el color púrpura en los fuegos artificiales. ");
                h.putExtra("ruta",R.drawable.rubidio);
                startActivity(h);
            }
        });
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Estroncio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","2");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Pirotecnia (nitrato). El carbonato se usa en el refino del zinc. \n" +
                        "Otros compuestos de estroncio se utilizan en la fabricación de cerámicas, \n" +
                        "productos de vidrio, pigmentos para pinturas (cromato), lámparas \n" +
                        "fluorescentes (fosfato) y medicamentos (cloruro y peróxido).");
                h.putExtra("ruta",R.drawable.estroncio);
                startActivity(h);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Itrio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","3");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Pirotecnia (nitrato). El carbonato se usa en el refino del zinc. \n" +
                        "Otros compuestos de estroncio se utilizan en la fabricación de cerámicas, \n" +
                        "productos de vidrio, pigmentos para pinturas (cromato), lámparas \n" +
                        "fluorescentes (fosfato) y medicamentos (cloruro y peróxido).\n" +
                        "El itrio se utiliza comercialmente en la industria metálica para aleaciones.\n" +
                        "El óxido de itrio se emplea para producir granates de itrio-hierro (Y3Fe5Si3O12),\n" +
                        "muy eficientes como filtros de microondas y también en la transmisión y \n" +
                        "transducción de energía acústica. Se usa como catalizador para la polimerización \n" +
                        "del etileno. Se utiliza como “atrapador” para eliminar oxígeno e impurezas de \n" +
                        "otros materiales; esto le permite reducir el óxido de vanadio y otros metales \n" +
                        "no ferrosos. En pequeñas cantidades se añade óxido de itrio a las superaleaciones \n" +
                        "de níquel usadas en turbinas de aviación para mantener sus propiedades mecánicas \n" +
                        "a altas temperaturas.");
                h.putExtra("ruta",R.drawable.itrio);
                startActivity(h);
            }
        });
        zr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Circonio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","4");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se utiliza como aditivo en aceros obteniéndose materiales muy resistentes. \n" +
                        "El óxido de circonio impuro se emplea para fabricar crisoles de laboratorio\n" +
                        "(que soportan cambios bruscos de temperatura), recubrimiento de hornos y \n" +
                        "como material refractario en industrias cerámicas y de vidrio. El óxido de \n" +
                        "circonio se usa en joyería; es una gema artificial denominada circonita \n" +
                        "que imita al diamante. Se utiliza como aditivo para fabricar arenas sintéticas.");
                h.putExtra("ruta",R.drawable.circonio);
                startActivity(h);
            }
        });
        nb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Niobio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","5");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Los soldadores utilizan el niobio para ligar los componentes de acero inoxidable. \n" +
                        "En aleación con titanio, se puede extrusionar el niobio en un alambre superconductor \n" +
                        "que luego se puede moldear para formar imanes que no pierden la superconductividad \n" +
                        "al ser colocados en campos magnéticos externos. Lámparas de vapor de sodio. Joyería. \n" +
                        "Dado a su propiedad de cambiar su color mediante el tratamiento de sus capas \n" +
                        "superficiales, también se emplea en la fabricación de monedas bimetálicas: \n" +
                        "25 euros de Austria y 1 Lat en Letonia.");
                h.putExtra("ruta",R.drawable.niobio);
                startActivity(h);
            }
        });
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Molibdeno");
                h.putExtra("periodo","5");
                h.putExtra("grupo","6");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El molibdeno se usa como catalizador en la industria petrolera. \n" +
                        "En concreto, es útil para la eliminación de azufre. El molibdeno \n" +
                        "se emplea en determinadas aplicaciones electrónicas, como en las \n" +
                        "capas de metal conductoras en los transistores TFT.");
                h.putExtra("ruta",R.drawable.molibdeno);
                startActivity(h);
            }
        });
        tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Tecnecio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","7");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se usa principalmente en procedimientos de diagnóstico de funcionamiento\n" +
                        "de órganos del cuerpo humano, por ejemplo, como marcador radiactivo \n" +
                        "que el equipamiento médico puede detectar en el cuerpo humano. \n" +
                        "Puede usarse como catalizador. Para algunas reacciones, por ejemplo \n" +
                        "la deshidrogenación del alcohol isopropílico.");
                h.putExtra("ruta",R.drawable.tecnecio);
                startActivity(h);
            }
        });
        ru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Rutenio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","8");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Debido a su gran efectividad para endurecer al paladio y al platino, \n" +
                        "se emplea en las aleaciones de estos metales que se usan en contactos \n" +
                        "eléctricos con una alta resistencia al desgaste. Se incorpora al \n" +
                        "titanio como elemento de aleación para aumentar la resistencia a \n" +
                        "la corrosión. Un 0,1% la mejora en unas cien veces.");
                h.putExtra("ruta",R.drawable.rutenio);
                startActivity(h);
            }
        });
        rh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Rodio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","9");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Típicamente, el oro blanco es galvanizado con una capa externa de rodio. \n" +
                        "Otro uso del Rodio es actuar como catalizador para la hidrogenación y es \n" +
                        "activo en la reformación catalítica de hidrocarburos.");
                h.putExtra("ruta",R.drawable.rodio);
                startActivity(h);
            }
        });
        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Paladio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","10");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El paladio se usa principalmente en los convertidores catalíticos.\n" +
                        "También se usa en la joyería, en odontología, relojería, en las tiras \n" +
                        "reactivas para comprobar los niveles de azúcar en la sangre, \n" +
                        "en las bujías de los aviones y en la producción de instrumentos \n" +
                        "quirúrgicos y contactos eléctricos.");
                h.putExtra("ruta",R.drawable.paladio);
                startActivity(h);
            }
        });
        ag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Plata");
                h.putExtra("periodo","5");
                h.putExtra("grupo","11");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El 70% de la producción mundial de plata se utiliza con fines industriales, \n" +
                        "y el 30%, con fines monetarios; buena parte de este metal se emplea en \n" +
                        "orfebrería, pero sus usos más importantes se dan en la industria fotográfica, \n" +
                        "química.En electrónica, por su elevada conductividad es empleada cada vez más, \n" +
                        "por ejemplo, en los contactos de circuitos integrados y teclados de ordenador.\n" +
                        "Fabricación de espejos de gran reflectividad de la luz visible \n" +
                        "(los comunes se fabrican con aluminio).\n" +
                        "La plata se ha empleado para fabricar monedas desde 700 a. C., \n" +
                        "inicialmente con electrum, aleación natural de oro y plata, y más tarde de plata pura.\n" +
                        "En joyería y platería para fabricar gran variedad de artículos ornamentales y \n" +
                        "de uso doméstico cotidiano, y con menor grado de pureza, en artículos de bisutería.");
                h.putExtra("ruta",R.drawable.plata);
                startActivity(h);
            }
        });
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Cadmio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","12");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se emplea en acumuladores eléctricos de níquel-cadmio recargables.\n" +
                        "Es componente de aleaciones de bajo punto de fusión. Se emplea \n" +
                        "en aleaciones de cojinetes, con bajo coeficiente de fricción y \n" +
                        "gran resistencia a la fatiga.\n" +
                        "Se utiliza mucho en electrodeposición: recubrimiento de rectificadores y acumuladores.\n" +
                        "Utilizado en barras de control del flujo de neutrones en los reactores atómicos.");
                h.putExtra("ruta",R.drawable.cadmio);
                startActivity(h);
            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Indio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","13");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se empleó principalmente durante la Segunda Guerra Mundial como \n" +
                        "recubrimiento en motores aeronáuticos de alto rendimiento. \n" +
                        "Su óxido se emplea en la fabricación de paneles electroluminiscentes.");
                h.putExtra("ruta",R.drawable.indio);
                startActivity(h);
            }
        });
        sn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Estaño");
                h.putExtra("periodo","5");
                h.putExtra("grupo","14");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se usa como protector del hierro, del acero y de diversos metales \n" +
                        "usados en la fabricación de latas de conserva.\n" +
                        "También se usa para disminuir la fragilidad del vidrio.\n" +
                        "Los compuestos de estaño se usan para fungicidas, tintes, dentífricos y pigmentos.\n" +
                        "Se usa para realizar bronce, aleación de estaño y cobre.\n" +
                        "Se usa para la soldadura blanda, aleado con plomo.");
                h.putExtra("ruta",R.drawable.estanio);
                startActivity(h);
            }
        });
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Antimonio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","15");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Ha sido la batería secundaria (o recargable) más importante por todo el mundo. \n" +
                        "Se utilizan en vehículos de motor, o como baterías industriales. \n" +
                        "Su uso se confina en gran parte a la fabricación de balas y perdigones");
                h.putExtra("ruta",R.drawable.antimonio);
                startActivity(h);
            }
        });
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Telurio");
                h.putExtra("periodo","5");
                h.putExtra("grupo","16");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se utiliza como ventana óptica de infrarrojos y como material de célula solar.");
                h.putExtra("ruta",R.drawable.telurio);
                startActivity(h);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Yodo");
                h.putExtra("periodo","5");
                h.putExtra("grupo","17");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se ha empleado en el tratamiento de cáncer y otras patologías de la glándula tiroidea.\n" +
                        "También se ha empleado como trazador en el agua superficial y como indicador de la \n" +
                        "dispersión de residuos en el medio ambiente..");
                h.putExtra("ruta",R.drawable.yodo);
                startActivity(h);
            }
        });
        xe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Xenon");
                h.putExtra("periodo","5");
                h.putExtra("grupo","18");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El uso principal y más famoso de este gas es en la fabricación de dispositivos \n" +
                        "emisores de luz tales como lámparas bactericidas, tubos electrónicos, lámparas \n" +
                        "estroboscópicas y flashes fotográficos. Como anestésico en anestesia general.\n" +
                        "En instalaciones nucleares, se usa en cámaras de burbujas, sondas, y en \n" +
                        "otras áreas donde el alto peso molecular es una cualidad deseable.");
                h.putExtra("ruta",R.drawable.xenon);
                startActivity(h);
            }
        });
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Cesio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","1");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Las sales de cesio se han utilizado en medicina como agentes antishock \n" +
                        "después de la administración de drogas de arsénico. Los compuestos \n" +
                        "de cesio se usan en la producción de vidrio y cerámica, como absorbentes \n" +
                        "en plantas de purificación de dióxido de carbono, en microquímica.");
                h.putExtra("ruta",R.drawable.cesio);
                startActivity(h);
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Bario");
                h.putExtra("periodo","6");
                h.putExtra("grupo","2");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El bario se usa en pirotecnia. El bario metálico tiene pocas aplicaciones prácticas,\n" +
                        "aunque a veces se usa para recubrir conductores eléctricos en aparatos electrónicos \n" +
                        "y en sistemas de encendido de automóviles.  También conocido como Barita o \n" +
                        "Baritina, debido a su alta densidad, se utiliza como lodo de perforación en \n" +
                        "los pozos de petróleo. El óxido de bario (BaO) forma parte de las lentes de vidrio \n" +
                        "mineral de alta calidad, usadas, por ejemplo, en instrumentos ópticos.");
                h.putExtra("ruta",R.drawable.bario);
                startActivity(h);
            }
        });
        lu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Lutecio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","18");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Este metal se emplea como catalizador en el craqueo del petróleo en las refinerías, \n" +
                        "y en diversos procesos químicos, como alquilación, hidrogenación y polimerización. \n" +
                        "También se están investigando radioisótopos de lutecio para ser aplicados \n" +
                        "en medicina nuclear en tratamientos terapéuticos.");
                h.putExtra("ruta",R.drawable.lutecio);
                startActivity(h);
            }
        });
        hf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Hafnio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","4");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","En lámparas de gas e incandescentes. En catalizadores para polimerización \n" +
                        "metalocénica. Para eliminar oxígeno y nitrógeno de tubos de vacío. \n" +
                        "En aleaciones de hierro, titanio, niobio, tántalo y otras aleaciones metálicas. \n" +
                        "En enero de 2007, se anunció como parte fundamental de una nueva tecnología de \n" +
                        "microprocesadores, desarrollada separadamente por IBM e Intel, en reemplazo del silicio.");
                h.putExtra("ruta",R.drawable.hafnio);
                startActivity(h);
            }
        });
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Tantalio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","5");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se utiliza casi exclusivamente en la fabricación de condensadores electrolíticos \n" +
                        "de tántalio. El Ta2O5-SiO2 es utilizado como catalizador en la síntesis de \n" +
                        "butadieno a partir de etano.  En los últimos años el tántalo se ha introducido \n" +
                        "también en el mercado numismático de la moneda de colección. ");
                h.putExtra("ruta",R.drawable.tantalio);
                startActivity(h);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Wolframio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","6");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","En estado puro se utiliza en la fabricación de filamentos para lámparas eléctricas, \n" +
                        "resistencias para hornos eléctricos con atmósfera reductoras o neutras, contactos \n" +
                        "eléctricos para los distribuidores de automóvil, también como proyectil anticarro \n" +
                        "(flecha) por su elevado punto de fusión y densidad, ánodos para tubos de rayos X y de televisión.");
                h.putExtra("ruta",R.drawable.wolframio);
                startActivity(h);
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Renio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","7");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Al ser un elemento metálico refractario y resistente a la corrosión, es usado \n" +
                        "principalmente en joyería, en la construcción de filamentos para espectrómetros \n" +
                        "de masas y como catalizador de reacciones de hidrogenación y deshidrogenación en \n" +
                        "la industria química.");
                h.putExtra("ruta",R.drawable.renio);
                startActivity(h);
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Osmio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","8");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El tetróxido de osmio es un buen oxidante. Se emplea en química orgánica \n" +
                        "como reactivo para sintetizar 1-2 cis-dioles a partir de un doble enlace.");
                h.putExtra("ruta",R.drawable.osmio);
                startActivity(h);
            }
        });
        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Iridio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","9");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Las aleaciones de osmio-iridio son usadas en brújulas y balanzas. \n" +
                        "Aleaciones de iridio-osmio se han usado en plumas estilográficas.");
                h.putExtra("ruta",R.drawable.iridio);
                startActivity(h);
            }
        });
        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Platino");
                h.putExtra("periodo","6");
                h.putExtra("grupo","10");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Joyería, Catalizadores para vehiculos. El platino se usa en la producción de \n" +
                        "unidades de disco duro en ordenadores y en cables de fibra óptica. \n" +
                        "El platino se usa en drogas anti-cancerígenas y en implantes. \n" +
                        "También es utilizado en aparatos de neurocirugía y en aleaciones para restauraciones dentales.");
                h.putExtra("ruta",R.drawable.platino);
                startActivity(h);
            }
        });
        au.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Oro");
                h.putExtra("periodo","6");
                h.putExtra("grupo","11");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","De la producción mundial de oro el 70 % se utiliza en joyería, el 20 % en \n" +
                        "reservas e inversiones y solo al 10 % se le da usos industriales. El oro \n" +
                        "ejerce funciones críticas en comunicaciones, naves espaciales, motores \n" +
                        "de aviones de reacción y otros muchos productos.\n" +
                        "Su alta conductividad eléctrica y resistencia a la oxidación ha permitido \n" +
                        "un amplio uso como capas delgadas electrodepositadas sobre la superficie \n" +
                        "de conexiones eléctricas para asegurar una conexión buena, de baja resistencia.");
                h.putExtra("ruta",R.drawable.oro);
                startActivity(h);
            }
        });
        hg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Mercurio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","12");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El mercurio se utiliza principalmente para la fabricación de productos químicos \n" +
                        "industriales o para aplicaciones eléctricas y electrónicas. Se emplea en \n" +
                        "algunos termómetros, especialmente los que se usan para medir temperaturas \n" +
                        "elevadas. Una cantidad cada vez mayor se usa como mercurio gaseoso en lámparas \n" +
                        "fluorescentes, mientras que la mayoría de las otras aplicaciones se están \n" +
                        "eliminando lentamente debido a las regulaciones de salud y seguridad, \n" +
                        "siendo reemplazado en algunas aplicaciones por materiales menos tóxicos, \n" +
                        "pero considerablemente más caros.");
                h.putExtra("ruta",R.drawable.mercurio);
                startActivity(h);
            }
        });
        tl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Talio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","13");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Fue usado para exterminar ratas y hormigas. Se utilizan en cristales infrarrojos.\n" +
                        "Util en fotorresistores.para la identificación de tumores óseos.");
                h.putExtra("ruta",R.drawable.talio);
                startActivity(h);
            }
        });
        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Plomo");
                h.putExtra("periodo","6");
                h.putExtra("grupo","14");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","En la antigüedad se escribía en láminas u hojas de plomo. En el imperio romano  \n" +
                        "las cañerías y las bañeras se recubrían con plomo.Se utiliza como cubierta para cables, \n" +
                        "ya sea la de teléfono, de televisión, de internet o de electricidad.");
                h.putExtra("ruta",R.drawable.plomo);
                startActivity(h);
            }
        });
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Bismuto");
                h.putExtra("periodo","6");
                h.putExtra("grupo","15");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Puede ser utilizado en lugar del plomo en numerosos usos en balística y como balasto.\n" +
                        "Al ser el bismuto un elemento denso con un peso atómico elevado, es utilizado para \n" +
                        "fabricar escudos de látex impregnados con bismuto para protección de los rayos-X \n" +
                        "durante exámenes médicos.");
                h.putExtra("ruta",R.drawable.bismuto);
                startActivity(h);
            }
        });
        po.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Polonio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","16");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Mezclado o aleado con berilio, el polonio puede ser una fuente de neutrones.\n" +
                        "Se utiliza también en dispositivos destinados a la eliminación de carga estática,\n" +
                        "en cepillos especiales para eliminar el polvo acumulado en películas fotográficas \n" +
                        "y también en fuentes de calor para satélites artificiales o sondas espaciales.");
                h.putExtra("ruta",R.drawable.polonio);
                startActivity(h);
            }
        });
        rn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Radon");
                h.putExtra("periodo","6");
                h.putExtra("grupo","18");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Aunque algunos médicos creyeron una vez que el radón se puede utilizar terapéuticamente,\n" +
                        "no hay evidencia para esta creencia y el radón no está actualmente en uso médico.");
                h.putExtra("ruta",R.drawable.radon);
                startActivity(h);
            }
        });
        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Francio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","1");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","No hay aplicaciones comerciales para el francio debido a su escasez y a su inestabilidad.");
                h.putExtra("ruta",R.drawable.francio);
                startActivity(h);
            }
        });
        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Astato");
                h.putExtra("periodo","6");
                h.putExtra("grupo","17");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas");
                h.putExtra("ruta",R.drawable.astato);
                startActivity(h);
            }
        });
        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Radio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","2");
                h.putExtra("bloque","S");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Antiguamente se usaba en pinturas luminiscentes para relojes y otros instrumentos. \n" +
                        "Cuando se mezcla con berilio, es una fuente de neutrones para experimentos físicos. \n" +
                        "Una unidad de radiactividad, el curio, está basada en la radiactividad del radio-226. \n" +
                        "El radio se empleaba a principios de siglo hasta los años 30 en medicinas, \n" +
                        "entre ellos el Radithor (agua destilada con radio), que lo describían como \n" +
                        "solución ante todos los males. ");
                h.putExtra("ruta",R.drawable.radon);
                startActivity(h);
            }
        });
        lr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Laurencio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","18");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.laurencio);
                startActivity(h);
            }
        });
        rf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Rutherfordio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","4");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Al ser un elemento sumamente inestable, se descompone con mucha facilidad en \n" +
                        "otros elementos, por tal razón, se ha considerado que no es necesario el estudio \n" +
                        "de los efectos que pudiese tener en la salud.Se emplea en acero inoxidable \n" +
                        "usado en instrumentos quirúrgicos y herramientas, en aceros resistentes a \n" +
                        "la corrosión, y mezclado con aluminio en aleaciones de titanio empleadas en \n" +
                        "motores de reacción. También, en aceros empleados en ejes de ruedas y \n" +
                        "cigüeñales, engranajes, y otros componentes críticos.");
                h.putExtra("ruta",R.drawable.rutherfordio);
                startActivity(h);
            }
        });
        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Dubnio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","5");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.dubnio);
                startActivity(h);
            }
        });
        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Seaborgio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","6");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.seaborgio);
                startActivity(h);
            }
        });
        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Bohrio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","7");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.bohrio);
                startActivity(h);
            }
        });
        hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Hassio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","8");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.hassio);
                startActivity(h);
            }
        });
        mt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Meitnerio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","9");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.meitnerio);
                startActivity(h);
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Darmstadtio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","10");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.darmstadtio);
                startActivity(h);
            }
        });
        rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Roentgenio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","11");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.roentgenio);
                startActivity(h);
            }
        });
        uub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Ununbio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","12");
                h.putExtra("bloque","D");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.ununbio);
                startActivity(h);
            }
        });
        uut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Ununtrio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","13");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Elemento no descubierto.");
                h.putExtra("ruta",R.drawable.ununtrio);
                startActivity(h);
            }
        });
        uuq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Ununquadio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","14");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.ununquadio);
                startActivity(h);
            }
        });
        uup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Ununpentio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","15");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.ununpentio);
                startActivity(h);
            }
        });
        uus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Ununhexio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","16");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Elemento no descubierto.");
                h.putExtra("ruta",R.drawable.ununhexio);
                startActivity(h);
            }
        });
        uuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Ununseptio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","17");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Como es un elemento de reciente descubrimiento, no se conocen sus aplicaciones, \n" +
                        "por lo que su producción se reduce a la investigación científica.");
                h.putExtra("ruta",R.drawable.ununseptio);
                startActivity(h);
            }
        });
        uuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Ununoctio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","18");
                h.putExtra("bloque","P");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Elemento no descubierto.");
                h.putExtra("ruta",R.drawable.ununoctio);
                startActivity(h);
            }
        });
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Lantano");
                h.putExtra("periodo","6");
                h.putExtra("grupo","4");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Es utilizado como componente de las pantallas intensificadoras de las unidades\n" +
                        "de rayos X. El óxido de lantano confiere al vidrio resistencia a las bases y \n" +
                        "se emplea para la fabricación de vidrios ópticos especiales. Además se usa \n" +
                        "para fabricar crisoles.");
                h.putExtra("ruta",R.drawable.lantano);
                startActivity(h);
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Cerio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","5");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Convertidores catalíticos para motores de combustión interna.\n" +
                        "Como catalizador del proceso de cracking en la industria del petróleo.\n" +
                        "En aleaciones utilizadas en encendedores.\n" +
                        "El óxido de cerio se usa para el pulido de lentes, instrumentos ópticos y semiconductores.\n" +
                        "En las aleaciones de los imanes permanentes.");
                h.putExtra("ruta",R.drawable.cerio);
                startActivity(h);
            }
        });
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Praseodimio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","6");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Como un agente de aleación con el magnesio para crear los metales de \n" +
                        "alta resistencia que se utilizan en motores de avión.\n" +
                        "El praseodimio forma la base de las luces de arco de carbón que son \n" +
                        "utilizadas en la industria de movimiento de imágenes, para la iluminación \n" +
                        "de un taller y las luces de un proyector.\n" +
                        "Los compuestos del praseodimio son usados para dar a los vidrios y \n" +
                        "esmaltes un color amarillo.");
                h.putExtra("ruta",R.drawable.praseodimio);
                startActivity(h);
            }
        });
        nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Neodimio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","7");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Es un componente del didimio, usado para colorear cristales y la \n" +
                        "fabricación de gafas de protección para los soldadores, pues absorben \n" +
                        "la luz ámbar de la llama.\n" +
                        "Confiere delicados colores a los cristales que varían desde el violeta \n" +
                        "puro, hasta el gris claro. Es muy buen sustituto de la pintura metalizada de los coches.\n" +
                        "Sales de neodimio son usadas como colorantes de esmaltes.");
                h.putExtra("ruta",R.drawable.neodimio);
                startActivity(h);
            }
        });
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Prometio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","8");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.prometio);
                startActivity(h);
            }
        });
        sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Samario");
                h.putExtra("periodo","6");
                h.putExtra("grupo","9");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El óxido de samario se utiliza en óptica para absorber la luz infrarroja\n" +
                        "Como catalizador en la deshidratación y en la deshidrogenación de etanol.\n" +
                        "Se usa como parte de una aleación en los imanes de samario-cobalto.\n" +
                        "El Samario 153 se utiliza junto con el Estroncio 89 en radioterapia paliativa \n" +
                        "para la disminución del dolor en pacientes terminales.");
                h.putExtra("ruta",R.drawable.samario);
                startActivity(h);
            }
        });
        eu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Europio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","10");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El europio es uno de los elementos químicos que forman compuestos \n" +
                        "fluorescentes usados en dispositivos como televisiones en color, \n" +
                        "lámparas fluorescentes y cristales. Todos sus compuestos químicos \n" +
                        "raros tienen propiedades comparables.");
                h.putExtra("ruta",R.drawable.europio);
                startActivity(h);
            }
        });
        gd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Gadolinio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","11");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.gadolinio);
                startActivity(h);
            }
        });
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Terbio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","12");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Este elemento se utiliza en el dopaje de materiales usados en dispositivos \n" +
                        "de estado sólido, tales como el fluoruro de calcio, el tungstato de calcio \n" +
                        "y el molibdato de estroncio. El oxosulfato de gadolinio dopado con terbio \n" +
                        "es uno de los mejores colorantes en rayos X.\n" +
                        "También se emplea como cristal estabilizador en células de combustible que \n" +
                        "operan a elevadas temperaturas, junto al óxido de circonio, en aleaciones \n" +
                        "y en la producción de componentes electrónicos. Su óxido se utiliza en los \n" +
                        "fósforos verdes de lámparas fluorescentes y tubos de imagen.");
                h.putExtra("ruta",R.drawable.terbio);
                startActivity(h);
            }
        });
        dy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Disprosio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","13");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se usa, en conjunción con vanadio y otros elementos, como componente \n" +
                        "de materiales para láseres; su alta sección eficaz de absorción de neutrones \n" +
                        "térmicos y su alto punto de fusión también sugieren su utilidad para barras \n" +
                        "de control nuclear. Un óxido mixto de disprosio y níquel forma materiales \n" +
                        "que absorben los neutrones y no se contraen ni dilatan bajo bombardeo de \n" +
                        "neutrones prolongado, y que se usan para barras de control en reactores nucleares.");
                h.putExtra("ruta",R.drawable.disprosio);
                startActivity(h);
            }
        });
        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Holmio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","14");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El holmio tiene pocas aplicaciones prácticas, aunque se ha usado \n" +
                        "como catalizador en reacciones químicas industriales y también para \n" +
                        "la fabricación de algunos dispositivos electrónicos. \n" +
                        "En medicina se utiliza el láser de holmio.\n" +
                        "También se utiliza el filtro de vidrio de Oxido de Holmio como Material \n" +
                        "de Referencia Certificado para evaluación de la precisión de longitud \n" +
                        "de onda en las regiones UV y visibles en equipos de espectroscopía.");
                h.putExtra("ruta",R.drawable.holmio);
                startActivity(h);
            }
        });
        er.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Erbio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","15");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Se utiliza en tecnología nuclear como amortiguador de neutrones.\n" +
                        "Utilizado como dopante en amplificadores de fibra óptica.\n" +
                        "Cuando se adiciona al vanadio como elemento de aleación el erbio \n" +
                        "rebaja la dureza y mejora el mecanizado.\n" +
                        "El óxido de erbio tiene un color rosa y se utiliza a veces como \n" +
                        "colorante para vidrios y esmaltes para porcelanas. ");
                h.putExtra("ruta",R.drawable.erbio);
                startActivity(h);
            }
        });
        tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Tulio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","16");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.tulio);
                startActivity(h);
            }
        });
        yb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Iterbio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","17");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Un isótopo del iterbio se ha usado como fuente de radiación alternativa \n" +
                        "para una máquina de rayos X portátil cuando no se disponía de electricidad. \n" +
                        "Su metal también puede usarse para mejorar el refinamiento del grano, \n" +
                        "la resistencia y otras propiedades mecánicas del acero inoxidable. \n" +
                        "Algunas aleaciones de iterbio se usan en odontología.");
                h.putExtra("ruta",R.drawable.iterbio);
                startActivity(h);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Actinio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","4");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El uso del actinio es casi exclusivo para investigaciones científicas. \n" +
                        "La radiactividad del actinio es del orden de 150 veces la del radio,\u200B \n" +
                        "haciéndolo útil como fuente de neutrones; al margen de ello, \n" +
                        "no tiene aplicaciones industriales significativas.");
                h.putExtra("ruta",R.drawable.actinio);
                startActivity(h);
            }
        });
        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Torio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","5");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Aparte de su incipiente uso como combustible nuclear, el torio metálico \n" +
                        "o alguno de sus óxidos se utilizan en las áreas siguientes:\n" +
                        "\n" +
                        "Incorporación al wolframio metálico para fabricar filamentos de lámparas eléctricas.\n" +
                        "Aplicaciones en material cerámico de alta temperatura.\n" +
                        "Como:\n" +
                        "Agente de aleación en estructuras metálicas.\n" +
                        "Componente básico de la tecnología del magnesio.\n" +
                        "Catalizador en química orgánica.\n" +
                        "Fabricación de:\n" +
                        "Lámparas electrónicas.\n" +
                        "Lentes de alta calidad para instrumentos de precisión.");
                h.putExtra("ruta",R.drawable.torio);
                startActivity(h);
            }
        });
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Protactinio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","6");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Debido a su escasez, alta radioactividad y toxicidad, actualmente no \n" +
                        "existen usos para el protactinio fuera de la investigación científica básica. ");
                h.putExtra("ruta",R.drawable.protactinio);
                startActivity(h);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Uranio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","7");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El principal uso del uranio en la actualidad es como combustible para \n" +
                        "los reactores nucleares. Por su alta densidad, se utiliza el uranio \n" +
                        "en la construcción de estabilizadores para aviones, satélites \n" +
                        "artificiales y veleros (balastos/quillas).\n" +
                        "Se ha utilizado uranio como agregado para la creación de cristales \n" +
                        "de tonos fluorescentes verdes o amarillos.");
                h.putExtra("ruta",R.drawable.uranio);
                startActivity(h);
            }
        });
        np.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Neptunio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","8");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas.");
                h.putExtra("ruta",R.drawable.neptunio);
                startActivity(h);
            }
        });
        pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Plutonio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","9");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","El isótopo plutonio-239 es un componente clave en las armas nucleares \n" +
                        "debido a su fácil fisión y su disponibilidad.  \n" +
                        "Combustible nuclear de mezcla de óxidos.\n" +
                        "Energía y fuente de calor.");
                h.putExtra("ruta",R.drawable.plutonio);
                startActivity(h);
            }
        });
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Americio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","10");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Este mismo radioisótopo fue utilizado como una fuente portátil de \n" +
                        "rayos gamma para su uso en radiografías.  Además es citado para uso \n" +
                        "en un avanzado cohete de propulsión nuclear");
                h.putExtra("ruta",R.drawable.americio);
                startActivity(h);
            }
        });
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Curio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","11");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas");
                h.putExtra("ruta",R.drawable.curio);
                startActivity(h);
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Berkelio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","12");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas");
                h.putExtra("ruta",R.drawable.berkelio);
                startActivity(h);
            }
        });
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Californio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","12");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Tiene aplicaciones especializadas como un fuerte emisor de neutrones.\n" +
                        "El californio también ha sido usado para producir otros elementos transuránicos.");
                h.putExtra("ruta",R.drawable.californio);
                startActivity(h);
            }
        });
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Einstenio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","14");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","No hay aplicaciones prácticas que no sean las de la investigación científica básica.");
                h.putExtra("ruta",R.drawable.einstenio);
                startActivity(h);
            }
        });
        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Fermio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","15");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas");
                h.putExtra("ruta",R.drawable.fermio);
                startActivity(h);
            }
        });
        md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Mendelevio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","16");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas");
                h.putExtra("ruta",R.drawable.medelevio);
                startActivity(h);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Nobelio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","17");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas");
                h.putExtra("ruta",R.drawable.nobelio);
                startActivity(h);
            }
        });
        lu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Lutecio");
                h.putExtra("periodo","6");
                h.putExtra("grupo","18");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Este metal se emplea como catalizador en el craqueo del petróleo en \n" +
                        "las refinerías, y en diversos procesos químicos, como alquilación, \n" +
                        "hidrogenación y polimerización. También se están investigando \n" +
                        "radioisótopos de lutecio para ser aplicados en medicina nuclear \n" +
                        "en tratamientos terapéuticos.");
                h.putExtra("ruta",R.drawable.lutecio);
                startActivity(h);
            }
        });
        lr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h= new Intent(MainActivity.this,Pantalla_elem.class);
                h.putExtra("nombre","Laurencio");
                h.putExtra("periodo","7");
                h.putExtra("grupo","18");
                h.putExtra("bloque","F");
                h.putExtra("paises","Todos");
                h.putExtra("apps","Desconocidas");
                h.putExtra("ruta",R.drawable.laurencio);
                startActivity(h);
            }
        });
        busqueda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elemento=txt_busq.getText().toString();
                if(elemento.equalsIgnoreCase("Helio")|| elemento.equalsIgnoreCase("He")){
                    he.callOnClick();
                }else if(elemento.equalsIgnoreCase("Hidrogeno")||elemento.equalsIgnoreCase("H")){
                    hidrogeno.callOnClick();
                }else if(elemento.equalsIgnoreCase("Litio")|| elemento.equalsIgnoreCase("Li")){
                    li.callOnClick();
                }else if(elemento.equalsIgnoreCase("Berilio")|| elemento.equalsIgnoreCase("Be")){
                    be.callOnClick();
                }else if(elemento.equalsIgnoreCase("Boro")|| elemento.equalsIgnoreCase("B")){
                    b.callOnClick();
                }else if(elemento.equalsIgnoreCase("Carbono")|| elemento.equalsIgnoreCase("C")){
                    c.callOnClick();
                }else if(elemento.equalsIgnoreCase("Nitrogeno")|| elemento.equalsIgnoreCase("N")){
                    n.callOnClick();
                }else if(elemento.equalsIgnoreCase("Oxigeno")|| elemento.equalsIgnoreCase("O")){
                    o.callOnClick();
                }else if(elemento.equalsIgnoreCase("Fluor")|| elemento.equalsIgnoreCase("F")){
                    f.callOnClick();
                }else if(elemento.equalsIgnoreCase("Neon")|| elemento.equalsIgnoreCase("Ne")){
                    ne.callOnClick();
                }else if(elemento.equalsIgnoreCase("Sodio")|| elemento.equalsIgnoreCase("Na")){
                    na.callOnClick();
                }else if(elemento.equalsIgnoreCase("Magnesio")|| elemento.equalsIgnoreCase("Mg")){
                    mg.callOnClick();
                }else if(elemento.equalsIgnoreCase("Aluminio")|| elemento.equalsIgnoreCase("Al")){
                    al.callOnClick();
                }else if(elemento.equalsIgnoreCase("Silicio")|| elemento.equalsIgnoreCase("Si")){
                    si.callOnClick();
                }else if(elemento.equalsIgnoreCase("Fosforo")|| elemento.equalsIgnoreCase("P")){
                    p.callOnClick();
                }else if(elemento.equalsIgnoreCase("Azufre")|| elemento.equalsIgnoreCase("S")){
                    s.callOnClick();
                }else if(elemento.equalsIgnoreCase("Cloro")|| elemento.equalsIgnoreCase("Cl")){
                    cl.callOnClick();
                }else if(elemento.equalsIgnoreCase("Argon")|| elemento.equalsIgnoreCase("Ar")){
                    ar.callOnClick();
                }else if(elemento.equalsIgnoreCase("Potasio")|| elemento.equalsIgnoreCase("K")){
                    k.callOnClick();
                }else if(elemento.equalsIgnoreCase("Calcio")|| elemento.equalsIgnoreCase("Ca")){
                    ca.callOnClick();
                }else if(elemento.equalsIgnoreCase("Escandio")|| elemento.equalsIgnoreCase("Sc")){
                    sc.callOnClick();
                }else if(elemento.equalsIgnoreCase("Titanio")|| elemento.equalsIgnoreCase("Ti")){
                    ti.callOnClick();
                }else if(elemento.equalsIgnoreCase("Vanadio")|| elemento.equalsIgnoreCase("V")){
                    v.callOnClick();
                }else if(elemento.equalsIgnoreCase("Cromo")|| elemento.equalsIgnoreCase("Cr")){
                    cr.callOnClick();
                }else if(elemento.equalsIgnoreCase("Manganeso")|| elemento.equalsIgnoreCase("Mn")){
                    mn.callOnClick();
                }else if(elemento.equalsIgnoreCase("Hierro")|| elemento.equalsIgnoreCase("Fe")){
                    fe.callOnClick();
                }else if(elemento.equalsIgnoreCase("Cobalto")|| elemento.equalsIgnoreCase("Co")){
                    co.callOnClick();
                }else if(elemento.equalsIgnoreCase("Niquel")|| elemento.equalsIgnoreCase("Ni")){
                    ni.callOnClick();
                }else if(elemento.equalsIgnoreCase("Cobre")|| elemento.equalsIgnoreCase("Cu")){
                    cu.callOnClick();
                }else if(elemento.equalsIgnoreCase("Zinc")|| elemento.equalsIgnoreCase("Zn")){
                    zn.callOnClick();
                }else if(elemento.equalsIgnoreCase("Galio")|| elemento.equalsIgnoreCase("Ga")){
                    ga.callOnClick();
                }else if(elemento.equalsIgnoreCase("Germanio")|| elemento.equalsIgnoreCase("Ge")){
                    ge.callOnClick();
                }else if(elemento.equalsIgnoreCase("Arsenico")|| elemento.equalsIgnoreCase("As")){
                    as.callOnClick();
                }else if(elemento.equalsIgnoreCase("Selenio")|| elemento.equalsIgnoreCase("Se")){
                    se.callOnClick();
                }else if(elemento.equalsIgnoreCase("Bromo")|| elemento.equalsIgnoreCase("Br")){
                    br.callOnClick();
                }else if(elemento.equalsIgnoreCase("Kripton")|| elemento.equalsIgnoreCase("Kr")){
                    kr.callOnClick();
                }else if(elemento.equalsIgnoreCase("Rubidio")|| elemento.equalsIgnoreCase("Rb")){
                    rb.callOnClick();
                }else if(elemento.equalsIgnoreCase("Estroncio")|| elemento.equalsIgnoreCase("Sr")){
                    sr.callOnClick();
                }else if(elemento.equalsIgnoreCase("Itrio")|| elemento.equalsIgnoreCase("Y")){
                    y.callOnClick();
                }else if(elemento.equalsIgnoreCase("Circonio")|| elemento.equalsIgnoreCase("Zr")){
                    zr.callOnClick();
                }else if(elemento.equalsIgnoreCase("Niobio")|| elemento.equalsIgnoreCase("Nb")){
                    nb.callOnClick();
                }else if(elemento.equalsIgnoreCase("Molibdeno")|| elemento.equalsIgnoreCase("Mo")){
                    mo.callOnClick();
                }else if(elemento.equalsIgnoreCase("Tecnecio")|| elemento.equalsIgnoreCase("Tc")){
                    tc.callOnClick();
                }else if(elemento.equalsIgnoreCase("Rutenio")|| elemento.equalsIgnoreCase("Ru")){
                    ru.callOnClick();
                }else if(elemento.equalsIgnoreCase("Rodio")|| elemento.equalsIgnoreCase("Rh")){
                    rh.callOnClick();
                }else if(elemento.equalsIgnoreCase("Paladio")|| elemento.equalsIgnoreCase("Pd")){
                    pd.callOnClick();
                }else if(elemento.equalsIgnoreCase("Plata")|| elemento.equalsIgnoreCase("Ag")){
                    ag.callOnClick();
                }else if(elemento.equalsIgnoreCase("Cadmio")|| elemento.equalsIgnoreCase("Cd")){
                    cd.callOnClick();
                }else if(elemento.equalsIgnoreCase("Indio")|| elemento.equalsIgnoreCase("In")){
                    in.callOnClick();
                }else if(elemento.equalsIgnoreCase("Estaño")|| elemento.equalsIgnoreCase("Sn")){
                    sn.callOnClick();
                }else if(elemento.equalsIgnoreCase("Antimonio")|| elemento.equalsIgnoreCase("Sb")){
                    sb.callOnClick();
                }else if(elemento.equalsIgnoreCase("Telurio")|| elemento.equalsIgnoreCase("Te")){
                    te.callOnClick();
                }else if(elemento.equalsIgnoreCase("Yodo")|| elemento.equalsIgnoreCase("I")){
                    i.callOnClick();
                }else if(elemento.equalsIgnoreCase("Xenon")|| elemento.equalsIgnoreCase("Xe")){
                    xe.callOnClick();
                }else if(elemento.equalsIgnoreCase("Cesio")|| elemento.equalsIgnoreCase("Cs")){
                    cs.callOnClick();
                }else if(elemento.equalsIgnoreCase("Bario")|| elemento.equalsIgnoreCase("Ba")){
                    ba.callOnClick();
                }else if(elemento.equalsIgnoreCase("Lutecio")|| elemento.equalsIgnoreCase("Lutecio")){
                    lu.callOnClick();
                }else if(elemento.equalsIgnoreCase("Hafnio")|| elemento.equalsIgnoreCase("Hf")){
                    hf.callOnClick();
                }else if(elemento.equalsIgnoreCase("Tantalio")|| elemento.equalsIgnoreCase("Ta")){
                    ta.callOnClick();
                }else if(elemento.equalsIgnoreCase("Wolframio")|| elemento.equalsIgnoreCase("W")){
                    w.callOnClick();
                }else if(elemento.equalsIgnoreCase("Renio")|| elemento.equalsIgnoreCase("Re")){
                    re.callOnClick();
                }else if(elemento.equalsIgnoreCase("Osmio")|| elemento.equalsIgnoreCase("Os")){
                    os.callOnClick();
                }else if(elemento.equalsIgnoreCase("Iridio")|| elemento.equalsIgnoreCase("Ir")){
                    ir.callOnClick();
                }else if(elemento.equalsIgnoreCase("Platino")|| elemento.equalsIgnoreCase("Pt")){
                    pt.callOnClick();
                }else if(elemento.equalsIgnoreCase("Oro")|| elemento.equalsIgnoreCase("Au")){
                    au.callOnClick();
                }else if(elemento.equalsIgnoreCase("Mercurio")|| elemento.equalsIgnoreCase("Hg")){
                    hg.callOnClick();
                }else if(elemento.equalsIgnoreCase("Talio")|| elemento.equalsIgnoreCase("Tl")){
                    tl.callOnClick();
                }else if(elemento.equalsIgnoreCase("Plomo")|| elemento.equalsIgnoreCase("Pb")){
                    pb.callOnClick();
                }else if(elemento.equalsIgnoreCase("Bismuto")|| elemento.equalsIgnoreCase("Bi")){
                    bi.callOnClick();
                }else if(elemento.equalsIgnoreCase("Polonio")|| elemento.equalsIgnoreCase("Po")){
                    po.callOnClick();
                }else if(elemento.equalsIgnoreCase("Astato")|| elemento.equalsIgnoreCase("Astato")){
                    at.callOnClick();
                }else if(elemento.equalsIgnoreCase("Radon")|| elemento.equalsIgnoreCase("Rn")){
                    rn.callOnClick();
                }else if(elemento.equalsIgnoreCase("Francio")|| elemento.equalsIgnoreCase("Fr")){
                    fr.callOnClick();
                }else if(elemento.equalsIgnoreCase("Radio")|| elemento.equalsIgnoreCase("Ra")){
                    ra.callOnClick();
                }else if(elemento.equalsIgnoreCase("Laurencio")|| elemento.equalsIgnoreCase("Lr")){
                    lr.callOnClick();
                }else if(elemento.equalsIgnoreCase("Rutherfordio")|| elemento.equalsIgnoreCase("Rf")){
                    rf.callOnClick();
                }else if(elemento.equalsIgnoreCase("Dubnio")|| elemento.equalsIgnoreCase("Db")){
                    db.callOnClick();
                }else if(elemento.equalsIgnoreCase("Seaborgio")|| elemento.equalsIgnoreCase("Sg")){
                    sg.callOnClick();
                }else if(elemento.equalsIgnoreCase("Bohrio")|| elemento.equalsIgnoreCase("Bh")){
                    bh.callOnClick();
                }else if(elemento.equalsIgnoreCase("Hassio")|| elemento.equalsIgnoreCase("Hs")){
                    hs.callOnClick();
                }else if(elemento.equalsIgnoreCase("Meitnerio")|| elemento.equalsIgnoreCase("Mt")){
                    mt.callOnClick();
                }else if(elemento.equalsIgnoreCase("Darmstadtio")|| elemento.equalsIgnoreCase("Ds")){
                    ds.callOnClick();
                }else if(elemento.equalsIgnoreCase("Roentgenio")|| elemento.equalsIgnoreCase("Rg")){
                    rg.callOnClick();
                }else if(elemento.equalsIgnoreCase("Ununbio")|| elemento.equalsIgnoreCase("Uub")){
                    uub.callOnClick();
                }else if(elemento.equalsIgnoreCase("Ununtrio")|| elemento.equalsIgnoreCase("Uut")){
                    uut.callOnClick();
                }else if(elemento.equalsIgnoreCase("Ununquadio")|| elemento.equalsIgnoreCase("Uuq")){
                    uuq.callOnClick();
                }else if(elemento.equalsIgnoreCase("Ununpentio")|| elemento.equalsIgnoreCase("Uup")){
                    uup.callOnClick();
                }else if(elemento.equalsIgnoreCase("Ununhexio")|| elemento.equalsIgnoreCase("Uuh")){
                    uuh.callOnClick();
                }else if(elemento.equalsIgnoreCase("Ununseptio")|| elemento.equalsIgnoreCase("Uus")){
                    uus.callOnClick();
                }else if(elemento.equalsIgnoreCase("Ununoctio")|| elemento.equalsIgnoreCase("Uuo")){
                    uuo.callOnClick();
                }else if(elemento.equalsIgnoreCase("Lantano")|| elemento.equalsIgnoreCase("La")){
                    la.callOnClick();
                }else if(elemento.equalsIgnoreCase("Cerio")|| elemento.equalsIgnoreCase("Ce")){
                    ce.callOnClick();
                }else if(elemento.equalsIgnoreCase("Praseodimio")|| elemento.equalsIgnoreCase("Pr")){
                    pr.callOnClick();
                }else if(elemento.equalsIgnoreCase("Neodimio")|| elemento.equalsIgnoreCase("Nd")){
                    nd.callOnClick();
                }else if(elemento.equalsIgnoreCase("Prometio")|| elemento.equalsIgnoreCase("Pm")){
                    pm.callOnClick();
                }else if(elemento.equalsIgnoreCase("Samario")|| elemento.equalsIgnoreCase("Sm")){
                    sm.callOnClick();
                }else if(elemento.equalsIgnoreCase("Europio")|| elemento.equalsIgnoreCase("Eu")){
                    eu.callOnClick();
                }else if(elemento.equalsIgnoreCase("Gadolinio")|| elemento.equalsIgnoreCase("Gd")){
                    gd.callOnClick();
                }else if(elemento.equalsIgnoreCase("Terbio")|| elemento.equalsIgnoreCase("Tb")){
                    tb.callOnClick();
                }else if(elemento.equalsIgnoreCase("Disprosio")|| elemento.equalsIgnoreCase("Dy")){
                    dy.callOnClick();
                }else if(elemento.equalsIgnoreCase("Holmio")|| elemento.equalsIgnoreCase("Ho")){
                    ho.callOnClick();
                }else if(elemento.equalsIgnoreCase("Erbio")|| elemento.equalsIgnoreCase("Er")){
                    er.callOnClick();
                }else if(elemento.equalsIgnoreCase("Tulio")|| elemento.equalsIgnoreCase("Tm")){
                    tm.callOnClick();
                }else if(elemento.equalsIgnoreCase("Iterbio")|| elemento.equalsIgnoreCase("Yb")){
                    yb.callOnClick();
                }else if(elemento.equalsIgnoreCase("Actinio")|| elemento.equalsIgnoreCase("Ac")){
                    ac.callOnClick();
                }else if(elemento.equalsIgnoreCase("Torio")|| elemento.equalsIgnoreCase("Th")){
                    th.callOnClick();
                }else if(elemento.equalsIgnoreCase("Protactinio")|| elemento.equalsIgnoreCase("Pa")){
                    pa.callOnClick();
                }else if(elemento.equalsIgnoreCase("Uranio")|| elemento.equalsIgnoreCase("Uranio")){
                    u.callOnClick();
                }else if(elemento.equalsIgnoreCase("Neptunio")|| elemento.equalsIgnoreCase("Np")){
                    np.callOnClick();
                }else if(elemento.equalsIgnoreCase("Plutonio")|| elemento.equalsIgnoreCase("Pu")){
                    pu.callOnClick();
                }else if(elemento.equalsIgnoreCase("Americio")|| elemento.equalsIgnoreCase("Am")){
                    am.callOnClick();
                }else if(elemento.equalsIgnoreCase("Curio")|| elemento.equalsIgnoreCase("Cm")){
                    cm.callOnClick();
                }else if(elemento.equalsIgnoreCase("Berkelio")|| elemento.equalsIgnoreCase("Bk")){
                    bk.callOnClick();
                }else if(elemento.equalsIgnoreCase("Californio")|| elemento.equalsIgnoreCase("Cf")){
                    cf.callOnClick();
                }else if(elemento.equalsIgnoreCase("Einstenio")|| elemento.equalsIgnoreCase("Es")){
                    es.callOnClick();
                }else if(elemento.equalsIgnoreCase("Fermio")|| elemento.equalsIgnoreCase("Fm")){
                    fm.callOnClick();
                }else if(elemento.equalsIgnoreCase("Mendelevio")|| elemento.equalsIgnoreCase("Md")){
                    md.callOnClick();
                }else if(elemento.equalsIgnoreCase("Nobelio")|| elemento.equalsIgnoreCase("No")){
                    no.callOnClick();
                }else{
                    txt_busq.setError("El elemento ingresado no existe, trate de nuevo");
                }
            }
        });
    }
}
