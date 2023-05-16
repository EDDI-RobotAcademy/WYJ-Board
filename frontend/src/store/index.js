import Vue from 'vue'
import Vuex from 'vuex'
import memberModule from "@/store/memberStore/MemberModule"
import boardModule from '@/store/board/BoardModule.js'

Vue.use(Vuex)

const store = new Vuex.Store({
  modules: {
    memberModule: memberModule,
    boardModule: boardModule,
  }
})

export default store
