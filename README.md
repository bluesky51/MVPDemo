# MVPDemo
使用本地和网络数据分别说明MVP模式


#####Model:负责存储，检索，操纵数据(有时也实现一个Model interface用来降低耦合)  
#####View:负责绘制UI元素，与用户进行交互(在Android中体现为Activity)  
#####View interface:需要View实现的接口，View通过View interface与Presenter进行交互，降低耦合，方便进行单元测试;
#####Presenter:作为View与Model交互的中间纽带，处理与用户交互的负责逻辑；

1.本地数据：  

	Model:IUserModel UserModel:设置数据(例如：保存用户密码)，读取数据(例如：读取一个用户)  
	
	View:IUserView :一般是Activity实现；接口中声明设置数据和取数据的方法(例如：set或者get()方法) 
	 
	Presenter:UserPresenter:协调UserModel和IUserView，使用UserModel保存,利用UserModel取出数据给IUserView  
2.网路数据：
  
	Model:IFirstActivityModel FirstActivityModel:使用retrofit加载网络数据(获取数据)  
	View: IFirstActivityView:一般是Activity实现:处理得到的结果交给IFirstActivityView  
	Presenter:FirstActivityPresenter:协调FirstActivityModel和IFirstActivityView,使用FirstActivityModel得到数据,交给接口暂存
	                利用暂存接口将数据给IFirstActivityView进行处理展示  
 * 优点：
 * (1)降低耦合度
 * (2)模块职责划分明显
 * (3)利于测试驱动开发
 * (4)代码复用
 * (5)隐藏数据
 * (6)代码灵活性
