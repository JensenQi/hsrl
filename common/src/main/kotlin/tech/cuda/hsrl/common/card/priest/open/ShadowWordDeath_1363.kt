package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowWordDeath_1363 : Card() {
    override val id = 1363
    override val name = "暗言术：灭"
    override val description = "消灭一个攻击力大于或等于5的随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "如果你的法术没有命中，那么你的目标身上会留下一道闪电形状的伤疤。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb20b5b05bba1228aea8087657f532a89155f74baaab9b0cbd4708c91127e398.png"
}
