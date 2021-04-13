package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImpSwarmRank1_63220 : Card() {
    override val id = 63220
    override val name = "小鬼集群（等级1）"
    override val description = "召唤一个3/2的小鬼。<i>（当你有5点法力值时升级。）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "不是一锅小鬼，也不是一窝，或者一帮小鬼。这是一群小鬼。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81bc4f282486ee0bebea62647d8fe7691d46b34272aef5428e53865d744e5c1c.png"
}
