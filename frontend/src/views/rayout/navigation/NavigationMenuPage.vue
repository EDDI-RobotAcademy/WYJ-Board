<script>
import {defineComponent} from 'vue'
import router from "@/router";

export default defineComponent({
        name: "NavigationMenuPage",
    methods: {
            goToHome() {
                router.go('/')
            }
    }
    },

)
</script>

<template>
    <nav>
        <v-app-bar>
            <v-app-bar-nav-icon/>
            <v-btn @click="goToHome">
                <v-img class="mx-2" src="@/assets/logo.png"
                       max-height="40" max-width="40" contain>
                </v-img>
                <v-toolbar-title class="text-uppercase text--darken-4">
                    <span>WYJ-BOARD</span>
                </v-toolbar-title>
            </v-btn>
        </v-app-bar>
    </nav>
</template>

<style scoped>

</style>