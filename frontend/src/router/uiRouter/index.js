import VueRouter from "vue-router";
import Vue from "vue";
import NavigationMenuPage from "@/views/rayout/navigation/NavigationMenuPage.vue";



Vue.use(VueRouter)
const uiRouter = [
    {
        path: "/navigation-menu-page",
        name: "NavigationMenuPage",
        component: NavigationMenuPage
    }
]

export default uiRouter