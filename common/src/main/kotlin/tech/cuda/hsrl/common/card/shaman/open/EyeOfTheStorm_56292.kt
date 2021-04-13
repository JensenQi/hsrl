package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EyeOfTheStorm_56292 : Card() {
    override val id = 56292
    override val name = "风暴之眼"
    override val description = "召唤三个5/6并具有<b>嘲讽</b>的元素。 <b>过载：</b>（3）"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "眼中窥暴，可知其全，剩下的部分我实在不想看了。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e29a28baa8be0e468af54720ecff91c0f3cf1b5ea2a377506bf3e2a0f5de1353.png"
}
