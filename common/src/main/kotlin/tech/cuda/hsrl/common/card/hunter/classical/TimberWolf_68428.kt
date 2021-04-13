package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TimberWolf_68428 : Card() {
    override val id = 68428
    override val name = "森林狼"
    override val description = "你的其他野兽获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "其他野兽最喜欢和森林狼一起外出打猎了。"
    override val artist = "Malcolm Davis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/35e950d09cec503410664a315e087b7f72e40ddf50e977e57acd8c31b7b57266.png"
}
