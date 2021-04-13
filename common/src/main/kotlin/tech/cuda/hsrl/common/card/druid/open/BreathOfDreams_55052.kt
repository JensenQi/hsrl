package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BreathOfDreams_55052 : Card() {
    override val id = 55052
    override val name = "梦境吐息"
    override val description = "抽一张牌。如果你的手牌中有龙牌，便获得一个空的法力水晶。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "伊瑟拉初醒之时的口气非常可怕。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7fd6b32ddcc96307bc5bc15cc21762b3e3877f0fc6a672d858ae5ca5a6c04f9.png"
}
