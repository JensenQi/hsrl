package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowWordDeath_68480 : Card() {
    override val id = 68480
    override val name = "暗言术：灭"
    override val description = "消灭一个攻击力大于或等于5的随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "如果你的法术没有命中，那么你的目标身上会留下一道闪电形状的伤疤。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/23c5df73573170801dfc32c65651e74c09628cf4aad8839ced6b8835f966b614.png"
}
