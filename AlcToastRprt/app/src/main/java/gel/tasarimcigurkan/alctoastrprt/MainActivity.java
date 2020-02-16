package gel.tasarimcigurkan.alctoastrprt;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		/* Uygulama yaratıldığında
		 Uygulama aşağıdaki iki satır kod ile yaratılıyor.
		 Ayrıca uygulamanın yaratılması sırasında çalışması ve 
		 yapılması gerekenler buraya gereğince yazılır.*/
        super.onCreate(savedInstanceState); // dipnot 1
        setContentView(R.layout.main); // dipnot 2

		Toast.makeText(getApplicationContext(), "yaratıldı.", Toast.LENGTH_LONG).show();
    }

	@Override
	protected void onStart()
	{
		// Uygulama başladığında
		super.onStart();
		Toast.makeText(getApplicationContext(), "başlatıldı.", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onResume()
	{
 		// Uygulamaya devam edildiğinde
		super.onResume();
		Toast.makeText(getApplicationContext(), "devam ediliyor.", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onPause()
	{
		// Uygulamaya ara verildiğinde
		super.onPause();
		Toast.makeText(getApplicationContext(), "ara verildi.", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onStop()
	{
		// Uygulama durduğunda
		super.onStop();
		Toast.makeText(getApplicationContext(), "durdu.", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onRestart()
	{
		// Uygulama yeniden başladığında
		super.onRestart();
		Toast.makeText(getApplicationContext(), "yeniden başlıyor.", Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onDestroy()
	{
		// Uygulama kapatıldığında
		super.onDestroy();
		Toast.makeText(getApplicationContext(), "kapatıldı.", Toast.LENGTH_LONG).show();
	}

}

/************************** DİP NOTLAR ******************************************

	1. "super.onCreate(savedInstanceState);" 
	uygulama yaratıldığında bohçalanmış kayıtlı örnek durum bilgisi 
	'super' ile üst sınıfa bildiriliyor. 
	Burada üst sınıf bu MainActivity sınıfının 
	'extend' edilerek varisi olduğu bildirilen 'Activity' sınıfıdır.
	
	2. "setContentView(R.layout.main);" 
	ile de ilk sayfanın görünümünün tasarımı olan xml dosyası koda dahil ediliyor.
	'R.layout.main' daha çok bir yol adıdır ve 
	'res' dizininin altıda 'layout' dizininin içindeki 
	ana sayfa tasarımı olan xml dosyası anlamına gelir.
	
*********************************************************************************/
