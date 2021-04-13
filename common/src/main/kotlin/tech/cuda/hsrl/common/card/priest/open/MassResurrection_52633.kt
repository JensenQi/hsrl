package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MassResurrection_52633 : Card() {
    override val id = 52633
    override val name = "群体复活"
    override val description = "召唤三个在本局对战中死亡的友方随从。"
    override var cost: Int? = 9
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "'英雄……随从不朽！'"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d8624578bde0a0f3d6c25c70e858619914de60033d640fd7b0d80fd74f6f7e82.png"
}
