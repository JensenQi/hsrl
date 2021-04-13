package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BringItOn_43505 : Card() {
    override val id = 43505
    override val name = "放马过来"
    override val description = "获得10点护甲值。使你对手的手牌中所有随从牌的法力值消耗减少（2）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "啊，这里真冷。希望她没有带着加基森拍卖师。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/121b1561f86482cb3505c124630a0eebe9d22f31da81f2d7d57d4bc1f7d59c54.png"
}
