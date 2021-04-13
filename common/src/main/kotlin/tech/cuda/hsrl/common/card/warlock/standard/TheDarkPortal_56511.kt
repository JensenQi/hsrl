package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheDarkPortal_56511 : Card() {
    override val id = 56511
    override val name = "黑暗之门"
    override val description = "抽一张随从牌。如果你拥有至少八张手牌，则使其法力值消耗减少（5）点。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "有人说它是艾泽拉斯最大的祸根——除了那些侏儒。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d515dca15d8a88b98ae72a1907feb41a6799170eda89ff7b927bdb728398760.png"
}
