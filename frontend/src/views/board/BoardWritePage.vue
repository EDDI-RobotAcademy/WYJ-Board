<template>
    <div>
        <board-write-form @write="write"/>
    </div>
</template>
<script>
import BoardWriteForm from '@/components/BoardWriteForm.vue';
import { mapActions } from 'vuex';

const boardModule = 'boardModule'
export default {
    data() {
        return {
           
        }
    },
    components:{
        BoardWriteForm
    },
    methods:{
    ...mapActions(boardModule,['requestWriteBoardToSpring']),

     write(payload){
        console.log(payload)
 
        this.requestWriteBoardToSpring(payload)
    

    }
}}

</script>
<style>
    
</style>