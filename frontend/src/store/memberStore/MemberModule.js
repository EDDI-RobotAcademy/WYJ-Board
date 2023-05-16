import Vue from "vue";
import Vuex from "vuex";

import actions from "@/store/memberStore/actions"
import states from "@/store/memberStore/states"
import mutations from "@/store/memberStore/mutations"


Vue.use(Vuex)

const MemberModule = {
    namespaced: true,
    states,
    actions,
    mutations,
}

export default MemberModule