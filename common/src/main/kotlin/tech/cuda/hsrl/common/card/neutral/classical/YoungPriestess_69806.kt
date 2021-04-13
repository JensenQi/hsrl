package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YoungPriestess_69806 : Card() {
    override val id = 69806
    override val name = "年轻的女祭司"
    override val description = "在你的回合结束时，随机使另一个友方随从获得+1生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她已经等不及想要学习2级的真言术：韧了。"
    override val artist = "Vance Kovacs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cbe71127b2f58aaf6ed102b52011374c8bb6347cac01f0902402c24c86d7ac38.png"
}
