package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForbiddenWords_52632 : Card() {
    override val id = 52632
    override val name = "禁忌咒文"
    override val description = "消耗你所有的法力值。消灭一个攻击力小于或等于所消耗法力值的随从。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "请在阅读此条文本前确认您是否已满18周岁。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30a1cf759bf3e7990e97fa3035d3b841017326ef0aaa5eaf60a4d85c3a011ae4.png"
}
