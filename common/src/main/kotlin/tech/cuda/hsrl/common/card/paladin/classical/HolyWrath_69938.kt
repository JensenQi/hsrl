package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyWrath_69938 : Card() {
    override val id = 69938
    override val name = "神圣愤怒"
    override val description = "抽一张牌，并造成等同于其法力值消耗的伤害。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "来个熔核巨人吧！！"
    override val artist = "Justin Sweet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e4614e7baa97f51460830d6b52e1130882aef3dbc53d9d3608208042bbaca5f.png"
}
