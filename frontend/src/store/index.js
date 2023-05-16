import Vue from 'vue'
import Vuex from 'vuex'

import memberModule from "@/store/memberStore/MemberModule"

Vue.use(Vuex)

export default new Vuex.Store({
  modules: {
    memberModule: memberModule,
  }
})
