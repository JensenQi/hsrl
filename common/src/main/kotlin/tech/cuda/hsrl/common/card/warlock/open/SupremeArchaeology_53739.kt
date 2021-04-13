package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SupremeArchaeology_53739 : Card() {
    override val id = 53739
    override val name = "最最伟大的考古学"
    override val description = "<b>任务：</b>抽20张牌。 <b>奖励：</b>源生魔典。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "考古学是发现稀有且强大神器的过程。而最最伟大的考古学，则是将神器据为己有！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f8ae5dc6c19fb04a19f4d97b5a1b19e1dde491e74299e5d15d369c1b853dce7.png"
}
