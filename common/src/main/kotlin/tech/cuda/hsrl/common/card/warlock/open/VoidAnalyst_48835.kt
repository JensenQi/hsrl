package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoidAnalyst_48835 : Card() {
    override val id = 48835
    override val name = "虚空分析师"
    override val description = "<b>亡语：</b>使你手牌中的所有恶魔牌获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "分析结论：一片虚空。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f1c0cd4dac0963f40cc6f530a71976221ba7372ce2101a7faf321c289d6d25ea.png"
}
