package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bearshark_69694 : Card() {
    override val id = 69694
    override val name = "熊鲨"
    override val description = "无法成为法术或英雄技能的 目标。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "它的分类让生物学家很是头疼。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/86deff7ef115d6c1301168c71bac894da30cefd06186f7e1d7d2576b586a1c3b.png"
}
