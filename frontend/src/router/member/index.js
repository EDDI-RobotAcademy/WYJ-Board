import VueRouter from "vue-router";
import Vue from "vue";
import MemberSignUp from "@/views/member/MemberSignUp.vue";



Vue.use(VueRouter)
const uiRouter = [
    {
        path: "/member-sign-up",
        name: "MemberSignUp",
        component: MemberSignUp
    }
]

export default uiRouter