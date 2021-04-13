package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowWordDeath_69569 : Card() {
    override val id = 69569
    override val name = "暗言术：灭"
    override val description = "消灭一个攻击力大于或等于5的随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "如果你的法术没有命中，那么你的目标身上会留下一道闪电形状的伤疤。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/080ef90534361d8b16d5559a772f656a62f225f3e2674126eeb99a6f6545f80c.png"
}
