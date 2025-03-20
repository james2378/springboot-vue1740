import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import xiaoqugonggao from '@/views/modules/xiaoqugonggao/list'
    import baoxiuxinxi from '@/views/modules/baoxiuxinxi/list'
    import yezhu from '@/views/modules/yezhu/list'
    import weixiuchuli from '@/views/modules/weixiuchuli/list'
    import tousuchuli from '@/views/modules/tousuchuli/list'
    import huodongxinxi from '@/views/modules/huodongxinxi/list'
    import fangchanxinxi from '@/views/modules/fangchanxinxi/list'
    import tousufenlei from '@/views/modules/tousufenlei/list'
    import wuyeguanli from '@/views/modules/wuyeguanli/list'
    import fuwupingjia from '@/views/modules/fuwupingjia/list'
    import tousuxinxi from '@/views/modules/tousuxinxi/list'
    import weixiuyuan from '@/views/modules/weixiuyuan/list'
    import cheweixinxi from '@/views/modules/cheweixinxi/list'
    import jiaofeixinxi from '@/views/modules/jiaofeixinxi/list'
    import tingchexinxi from '@/views/modules/tingchexinxi/list'
    import xiaoquxinxi from '@/views/modules/xiaoquxinxi/list'
    import tingchewei from '@/views/modules/tingchewei/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/xiaoqugonggao',
        name: '小区公告',
        component: xiaoqugonggao
      }
      ,{
	path: '/baoxiuxinxi',
        name: '报修信息',
        component: baoxiuxinxi
      }
      ,{
	path: '/yezhu',
        name: '业主',
        component: yezhu
      }
      ,{
	path: '/weixiuchuli',
        name: '维修处理',
        component: weixiuchuli
      }
      ,{
	path: '/tousuchuli',
        name: '投诉处理',
        component: tousuchuli
      }
      ,{
	path: '/huodongxinxi',
        name: '活动信息',
        component: huodongxinxi
      }
      ,{
	path: '/fangchanxinxi',
        name: '房产信息',
        component: fangchanxinxi
      }
      ,{
	path: '/tousufenlei',
        name: '投诉分类',
        component: tousufenlei
      }
      ,{
	path: '/wuyeguanli',
        name: '物业管理',
        component: wuyeguanli
      }
      ,{
	path: '/fuwupingjia',
        name: '服务评价',
        component: fuwupingjia
      }
      ,{
	path: '/tousuxinxi',
        name: '投诉信息',
        component: tousuxinxi
      }
      ,{
	path: '/weixiuyuan',
        name: '维修员',
        component: weixiuyuan
      }
      ,{
	path: '/cheweixinxi',
        name: '车位信息',
        component: cheweixinxi
      }
      ,{
	path: '/jiaofeixinxi',
        name: '缴费信息',
        component: jiaofeixinxi
      }
      ,{
	path: '/tingchexinxi',
        name: '停车信息',
        component: tingchexinxi
      }
      ,{
	path: '/xiaoquxinxi',
        name: '小区信息',
        component: xiaoquxinxi
      }
      ,{
	path: '/tingchewei',
        name: '停车位',
        component: tingchewei
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
