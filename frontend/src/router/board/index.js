import Vue from 'vue'
import VueRouter from 'vue-router'

import BoardWritePage from '@/views/board/BoardWritePage.vue'
Vue.use(VueRouter)

const BoardRoutes = [
  {
    path: '/board-write-page',
    name: 'BoardWritePage',
    component: BoardWritePage
  },
  

]

export default BoardRoutes
