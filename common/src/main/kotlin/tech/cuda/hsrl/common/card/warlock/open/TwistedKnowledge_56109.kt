package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwistedKnowledge_56109 : Card() {
    override val id = 56109
    override val name = "扭曲学识"
    override val description = "<b>发现</b>两张术士牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "人每年平均会在睡觉时吃进去八个蜘蛛。半人马有两个胸腔。矮人其实只是泰坦的仿制品。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7939efc03b6f48d1eb7660cbbef63f39b572ccc3c14759ba7abee8f7d85a2414.png"
}
