package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OakenSummons_45828 : Card() {
    override val id = 45828
    override val name = "橡树的召唤"
    override val description = "获得6点护甲值。<b>招募</b>一个法力值消耗小于或等于（4）的随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "橡树代表着荣誉与力量，所以它们都被砍倒建房子了。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c0b79dbb73b84f843a0f5202d0b5fe38167dd7f3a35e9409318401fa42d86a7.png"
}
