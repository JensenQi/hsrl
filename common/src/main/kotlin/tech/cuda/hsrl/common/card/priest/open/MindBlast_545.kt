package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindBlast_545 : Card() {
    override val id = 545
    override val name = "心灵震爆"
    override val description = "对敌方英雄造成 5点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy4
    override val background = "这个法术直接震爆你的心灵。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c62be46bc47453b5dfb0decdffe29273affec25117561ae5beee1b9e067e5d25.png"
}
