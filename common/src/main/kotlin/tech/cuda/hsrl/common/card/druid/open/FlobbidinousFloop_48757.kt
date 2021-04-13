package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlobbidinousFloop_48757 : Card() {
    override val id = 48757
    override val name = "软泥教授弗洛普"
    override val description = "如果这张牌在你的手牌中，变成你使用的最后一张随从牌的3/4复制。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "实验室的所有科学家中，就数他的学问最深（可测情况下）。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/349180cd13141e40f7f40c2e0b94b41810e811d29fe362baad210f78b2b1f6ef.png"
}
