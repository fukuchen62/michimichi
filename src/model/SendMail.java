package model;

public class SendMail {

	//お問い合わせ確認ページに飛ばす
	public  void inquiryToConfirm(String name, String email, String text) {



	}

	public  void send(String name, String email, String text){
//        //プロパティの設定
//        Properties properties = new Properties();
//
//        properties.setProperty("mail.smtp.host","localhost");
//        //セッションの取得
//        Session session = Session.getDefaultInstance(properties);
//        //MimeMessageの取得と設定
//        MimeMessage mimeMessage = new MimeMessage(session);
//
//        try {
//            //宛先の設定(ここを指定のString型でなく、入力画面に入力したメールアドレスを設定したい)
//            mimeMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail,false));
//            //送信元の設定
//            mimeMessage.setFrom(new InternetAddress("websys4.tunagu@gmail.com"));
//            //サブジェクトの設定
//            mimeMessage.setSubject("ご回答ありがとうございました。");
//            //本文の設定
//            mimeMessage.setText("貴重なご意見ありがとうございます。今後もユーザーが使いやすいサイトを目指すための参考にさせていただきます。","iso-2022-jp");
//            //設定の保存
//            mimeMessage.saveChanges();
//            //メールの送信
//            Transport.send(mimeMessage);
//        }catch(MessagingException e) {
//            e.printStackTrace();
//            return;
//        	}
		}

}
