package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Brawl_75 : Card() {
    override val id = 75
    override val name = "绝命乱斗"
    override val description = "随机选择一个随从，消灭除了该随从外的所有其他随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "你知道搏击俱乐部的第一守则吗？"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b6309588bd0ee64f6c330f780eefd3e5ba663341dceccfd6e9472175bd80e66f.png"
}
