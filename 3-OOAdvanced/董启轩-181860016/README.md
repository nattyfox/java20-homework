事先声明：由于作业是在单独的文件夹完成后复制进入3-OOAdvanced文件夹中，可能在该文件夹的工作路径中无法正常运行。
以下是数据结构：
Human类：
包含name变量

CalabashBrother类：
葫芦娃类，继承Human类，拥有priority用于排序，且拥有比较函数cmp、交换函数swap_with_next以及其他获取private数据的函数

GrandFather类：
爷爷类，继承Human类，拥有比较函数cmpCalabash和交换函数swapCalabash

Choreography类：
提供ChoreographySort函数，对外提供接口：Choreography_sort

Orchestration类：
提供OrchestrationSort函数，对外提供接口：Orchestration_sort

Init类：
包含用于排序的葫芦娃数组bro[]和爷爷类变量grandpa，其初始化函数Init()即对即将进行的排序做准备工作

Main类：
主函数入口，import上述的类，完成排序工作。

面向对象编程思想：
封装：
每一个类即可视为一个封装

继承与多态：
GrandFather和CalabashBrother类均继承于Human类

接口：
Choreography_sort和Orchestration_sort分别被用于Choreography类和Orchestration类

包：
Source.Creature包包含CalabashBrother类、GrandFather类和Human类
Source.SortMethod包包含Choreography类和Orchestration类及其对应接口。

静态变量和静态块：
Init类中包含静态变量NUM_OF_BROTHERS由之后的静态块：
    static{
        NUM_OF_BROTHERS=7;
    }
完成赋值。

修饰符：
public、private、static、final等均为修饰符

plantuml类图：
![plantuml类图](http://www.plantuml.com/plantuml/png/dLHFRzi-3BtxKn0zESWVeB_Bxv0EA1giQmzPXcGx5ON1E9ejp9OCIbvNUFdkaon7a5m3nUQJn4S-laTGlbKQIRTrbJIO_y22mTL1jfIprOOOwfROLPTiAbGADbZX4LLvHrANZBe4EbEiUNvUVlwspNRtsTr-z_NXu_xmuVy4bbneQ8XBulerWVceEhNmbrbtDf0z5andegtJcRaVD75Hk13MpCPypeMn3nwbh1WAoEic7V73aQHZ_odv2TGBDjaBrsKcs2yzJdvwjkcBNh5Kiouv3vO_4OhJFGvspJSF8kcWqshiMm54aYvDfgHTBoQ2_taMhtcQOwpu-dAm35xyGrkZCBBdWKvpwyEfIVJd07VrVHXkVY-NCEeRGi4eJCruVGwIz9RfKfxC0ZqApUWxvWmsfIGc2yAcVCsKoR5pjNOZn1PFMvwjlR-m85p6lP4bQx3gZCM_u7RctoWqRbUhY2893EqeBvdIP7fB4JcAeRvjC38exBd1nJisOvPtVFvhHsy-8WZSHt4lxL5mFRoBISwrmoOqECHRiUix-eV46T2z-SMitLkn6b8dtXxXngWTYV50jBA3Xoroyng2kRf9riZzmtXwHYgKws7JBPMbz9TmDtmm7jaj4wUshlu0)