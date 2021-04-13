package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowWordRuin_60070 : Card() {
    override val id = 60070
    override val name = "暗言术：毁"
    override val description = "消灭所有攻击力大于或等于5的随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "由一位狼人牧师发现。起因是一个巨人把饮料洒在了她全新的白袍上。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cfa55133ceb5c4de57bccb9fd4cc32fb90dbd6d57241e67b8a30fe1e39234549.png"
}
