package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoshoggAnnouncer_50430 : Card() {
    override val id = 50430
    override val name = "莫什奥格播报员"
    override val description = "攻击该随从的敌人有50%几率攻击其他角色。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“我觉得可以。”“我觉得不行。”"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f64243650d60dd61f3c0b0de71d636ef7c41861444f196f58fa6dd7fff3d11ee.png"
}
