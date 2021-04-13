package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlotTwist_52698 : Card() {
    override val id = 52698
    override val name = "情势反转"
    override val description = "将你的手牌洗入牌库。抽取相同数量的牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "它们从牌库里出来了！"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/92a862734fd6da99b6ee973a1448a675e93a0058b67ee65834316c74fe3dba99.png"
}
