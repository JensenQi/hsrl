package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TimberWolf_606 : Card() {
    override val id = 606
    override val name = "森林狼"
    override val description = "你的其他野兽获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "其他野兽最喜欢和森林狼一起外出打猎了。"
    override val artist = "Malcolm Davis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7aa5ac1da049d5e5ab15b43517cb19eb5b874c3929a95af5c8ffd69fabb37157.png"
}
