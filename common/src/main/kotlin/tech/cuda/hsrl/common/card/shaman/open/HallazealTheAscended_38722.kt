package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HallazealTheAscended_38722 : Card() {
    override val id = 38722
    override val name = "升腾者海纳泽尔"
    override val description = "每当你的法术造成伤害时，为你的英雄恢复等量的生命值。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Wotog
    override val background = "根据能量守恒定律，你损失的生命值最终会转移到我身上。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7d746e771d2587efc260672da5075d8548ad8b73a84bc42e39618b77f112fe8d.png"
}
