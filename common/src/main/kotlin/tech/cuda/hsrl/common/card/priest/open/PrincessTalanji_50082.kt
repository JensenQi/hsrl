package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrincessTalanji_50082 : Card() {
    override val id = 50082
    override val name = "塔兰吉公主"
    override val description = "<b>战吼：</b> 召唤你的手牌中所有你的套牌之外的 随从。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "欲戴王冠，必承其重。"
    override val artist = "Alex Horley Ormandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0b2c90779cd0a8a8106d0610fddad5fdbb431caff9c309d348e35d16fdc8d3ad.png"
}
