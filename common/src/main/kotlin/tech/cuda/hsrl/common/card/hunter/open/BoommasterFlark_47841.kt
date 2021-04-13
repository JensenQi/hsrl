package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoommasterFlark_47841 : Card() {
    override val id = 47841
    override val name = "爆破大师弗拉克"
    override val description = "<b>战吼：</b>召唤四个0/2的地精炸弹。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "一份好计划通常需要一些耐心……和成吨的炸弹。"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/99b1dec2d90da88cc34ad65cdfb5494755f09bb3c9b486d490cd58842bae6c81.png"
}
