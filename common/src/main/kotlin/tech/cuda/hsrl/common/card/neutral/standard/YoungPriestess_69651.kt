package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YoungPriestess_69651 : Card() {
    override val id = 69651
    override val name = "年轻的女祭司"
    override val description = "在你的回合结束时，随机使另一个友方随从获得+1生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "她已经等不及想要学习2级的真言术：韧了。"
    override val artist = "Vance Kovacs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b8820b34238ede5bb7c7301b23e9953c6a8546527942f4919a18d510974759a.png"
}
