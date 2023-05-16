import Vue from 'vue'
import Vuex from 'vuex'
import state from '@/store/board/states.js'
import mutations from './mutations'
import actions from './action.js'
Vue.use(Vuex)

const BoardModule={
  namespaced: true,
  state,
  mutations,
  actions
}

export default BoardModule
