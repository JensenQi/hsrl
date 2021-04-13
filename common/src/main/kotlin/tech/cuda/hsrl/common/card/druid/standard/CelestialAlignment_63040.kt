package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CelestialAlignment_63040 : Card() {
    override val id = 63040
    override val name = "超凡之盟"
    override val description = "将双方玩家的法力水晶重置为零个。将所有手牌和牌库中的牌的法力值消耗变为（1）点。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "虚假的平衡德：超凡之盟 真正的平衡德：超凡之萌"
    override val artist = "Gustav Schmidt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/18a56e72ca757abffb6a80bf60125ceb94c5856d60c73e21fe2c99fa62dd6b1a.png"
}
