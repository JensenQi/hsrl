package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Linecracker_50416 : Card() {
    override val id = 50416
    override val name = "阵线破坏者"
    override val description = "<b>超杀：</b>使该随从的攻击力翻倍。"
    override var cost: Int? = 7
    override var health: Int? = 10
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "哇喔，多么漂亮的一记挥杆！"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/851e800e79a0794fd3b0325c415d86930026db2ff2d860b2e323ec095ccd6975.png"
}
