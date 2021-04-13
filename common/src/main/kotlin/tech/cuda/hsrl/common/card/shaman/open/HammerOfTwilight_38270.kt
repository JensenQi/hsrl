package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HammerOfTwilight_38270 : Card() {
    override val id = 38270
    override val name = "暮光神锤"
    override val description = "<b>亡语：</b>召唤一个4/2的元素。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Wotog
    override val background = "这把蕴含了元素之力的战锤散发出诡异的暮色光芒。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc2e7ca5f2ed00ede16154f69b595bc26654a842d373f4f207fb1f03be8303b9.png"
}
