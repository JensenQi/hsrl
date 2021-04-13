package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvasiveChimaera_55416 : Card() {
    override val id = 55416
    override val name = "辟法奇美拉"
    override val description = "<b>剧毒</b> 无法成为法术或英雄技能的目标。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "一个头只说真话，另一个头只说假话。不过两个头都很毒舌。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/16f7894cffd03aadcad04051c8248bce1aa8b1e6717400fa64faa7a4ed4f1cc4.png"
}
