package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vendetta_52606 : Card() {
    override val id = 52606
    override val name = "宿敌"
    override val description = "对一个随从造成 4点伤害。如果你的手牌中有另一职业的卡牌，则法力值消耗为（0）点。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "一位恨意满满的复仇老手，扮演着受害与加害者的双重角色。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e93c6b90b0e2e99c1a7976afe8cacf0f64314efb1d511857b416715fa1146a3.png"
}
